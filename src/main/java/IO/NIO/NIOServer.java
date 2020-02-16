package IO.NIO;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

/**
 * NIO通信模型, 同步非阻塞, 可以在线程从通道中读取数据到Buffer时, 继续做别的事情, 当数据读取到Buffer中后, 再继续处理数据,
 * 同理写入数据到通道时, 不需要等待它完全写完也可以同时去做别的事
 */

public class NIOServer {

    public static void main(String[] args) throws IOException {
        //轮询是否有新的连接, 将新连接绑定到client上
        Selector server = Selector.open();
        //client负责读有数据可读的连接
        Selector client = Selector.open();

        new Thread(() -> {
            try {
                ServerSocketChannel socketChannel = ServerSocketChannel.open();
                socketChannel.socket().bind(new InetSocketAddress(3333));
                socketChannel.configureBlocking(false);
                socketChannel.register(server, SelectionKey.OP_ACCEPT);

                while (true) {
                    if (server.select(1) > 0) {
                        Set<SelectionKey> set = server.selectedKeys();
                        Iterator<SelectionKey> iterator = set.iterator();
                        while (iterator.hasNext()) {
                            SelectionKey key = iterator.next();
                            if (key.isAcceptable()) {
                                try {
                                    SocketChannel clientChannel = ((ServerSocketChannel) key.channel()).accept();
                                    clientChannel.configureBlocking(false);
                                    clientChannel.register(client, SelectionKey.OP_READ);
                                } finally {
                                    iterator.remove();
                                }
                            }
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                while (true) {
                    if (client.select(1) > 0) {
                        Set<SelectionKey> set = client.selectedKeys();
                        Iterator<SelectionKey> iterator = set.iterator();
                        while (iterator.hasNext()) {
                            SelectionKey key = iterator.next();
                            if (key.isReadable()) {
                                try {
                                    SocketChannel clientChannel = (SocketChannel) key.channel();
                                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                                    clientChannel.read(byteBuffer);
                                    byteBuffer.flip();
                                    System.out.println(Charset.defaultCharset().newDecoder().decode(byteBuffer).toString());
                                } finally {
                                    iterator.remove();
                                    key.interestOps(SelectionKey.OP_READ);
                                }
                            }
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

}

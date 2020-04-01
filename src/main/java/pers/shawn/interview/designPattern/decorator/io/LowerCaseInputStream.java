package pers.shawn.interview.designPattern.decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    protected LowerCaseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1?c:Character.toLowerCase(c));
    }

    @Override
    public int read(byte[] bytes, int i, int i1) throws IOException {
        int result = super.read(bytes, i, i1);
        for (int j = i; j < i+result; j++) {
            bytes[j] = (byte) Character.toLowerCase(bytes[i]);
        }
        return result;
    }
}

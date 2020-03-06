package JVM.GC;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * 强引用：即使程序异常中止， 对象也不会被回收， 只有和GC ROOTS断绝， 才会被回收
 * 软引用：内存足够时， 不会被回收， 内存不足时才会回收， 适合用于缓存技术
 * 弱引用：进行GC时， 无论内存是否充足，都会回收被弱引用关联的对象
 * 虚引用：虚引用必须和引用队列联合使用， 如果仅持有虚引用， 那就和没有引用一样， 任何时候都能被GC回收
 * 虚引用主要用来跟踪对象被垃圾回收的活动， 当垃圾回收器准备回收一个对象时， 如果发现它还有虚引用，
 * 就会在回收对象之前， 把这个虚引用加入到与之关联的引用队列中。
 * 程序如果发现某个虚引用已经被加入到引用队列， 那么就可以在所引用的对象的内存被回收之前采取必要的行动。
 */
public class MyReference {

    public static void main(String[] args) {
        Object object = new Object();

        SoftReference<Object> softReference = new SoftReference(object);

        WeakReference<Object> weakReference = new WeakReference(object);

        ReferenceQueue queue = new ReferenceQueue();
        //虚引用，必须与一个引用队列关联
        PhantomReference pr = new PhantomReference(object, queue);

    }

}

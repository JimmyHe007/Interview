package DesignPattern.Singleton;

/**
 * 多线程时存在刷新实例的隐患
 */
public class Singleton {

    private static Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private Singleton() {
    }
}

package DesignPattern.Singleton;

/**
 * 每次获取时都要经过同步, 降低性能
 */
public class SingletonSynchronized {

    private static SingletonSynchronized singleton;

    public static synchronized SingletonSynchronized getInstance() {
        if (singleton == null) {
            singleton = new SingletonSynchronized();
        }
        return singleton;
    }

    private SingletonSynchronized() {
    }

}

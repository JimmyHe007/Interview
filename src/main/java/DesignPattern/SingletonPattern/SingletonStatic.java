package DesignPattern.SingletonPattern;

/**
 * 静态初始化时创建实例, 缺点是无法延迟初始化
 */
public class SingletonStatic {

    private static SingletonStatic singleton = new SingletonStatic();

    public static SingletonStatic getInstance() {
        return singleton;
    }

    private SingletonStatic() {
    }

}

package DesignPattern.SingletonPattern;

/**
 * 双重检查加锁,volatile确保变量的值在多个线程里同步, 同步代码块只有实例对象为null时才会进入
 * 即只有第一次多个线程调用getInstance()方法时可能需要同步等待
 */
public class SingletonDoubleCheck {

    private static volatile SingletonDoubleCheck singleton;

    public static SingletonDoubleCheck getInstance() {
        if (singleton == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (singleton == null) {
                    singleton = new SingletonDoubleCheck();
                }
            }
        }
        return singleton;
    }

    private SingletonDoubleCheck() {
    }
}

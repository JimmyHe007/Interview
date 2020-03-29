package DesignPattern.ObserverPattern.Observable;

import DesignPattern.ObserverPattern.Observable.Interface.impl.CurrentConditionsDisplay;
import DesignPattern.ObserverPattern.Observable.Interface.impl.HeatIndexDisplay;
import DesignPattern.ObserverPattern.Observable.Interface.impl.WeatherData;

/**
 * JDK内置Observable类实现观察者模式, 注意此处notify的顺序和自己实现的不一样
 * Observable使用Vector存储观察者对象, 保证线程安全, notifyObservers方法通过倒序唤醒,
 *
 * 使用拉的方式, 观察者主动去拉取数据
 * 使用推的方式, 在WeatherData类中调用notifyObservers方法时可以传参, 这里的参数就是观察者的update方法中第二个参数Object
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.4f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

}

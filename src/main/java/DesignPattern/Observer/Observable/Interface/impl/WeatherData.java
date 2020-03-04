package DesignPattern.Observer.Observable.Interface.impl;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    //具体实现类的方法, 不需要在接口中定义
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    //手动触发change事件
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

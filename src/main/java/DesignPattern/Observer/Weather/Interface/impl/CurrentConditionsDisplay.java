package DesignPattern.Observer.Weather.Interface.impl;

import DesignPattern.Observer.Weather.Interface.DisplayElement;
import DesignPattern.Observer.Weather.Interface.Observer;
import DesignPattern.Observer.Weather.Interface.Subject;

/**
 * 展示温度和湿度
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        //实时更新展示内容
        display();
    }

}

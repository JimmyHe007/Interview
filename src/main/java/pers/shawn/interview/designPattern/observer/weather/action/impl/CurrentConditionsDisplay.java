package pers.shawn.interview.designPattern.observer.weather.action.impl;

import pers.shawn.interview.designPattern.observer.weather.action.DisplayElement;
import pers.shawn.interview.designPattern.observer.weather.action.Observer;
import pers.shawn.interview.designPattern.observer.weather.action.Subject;

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

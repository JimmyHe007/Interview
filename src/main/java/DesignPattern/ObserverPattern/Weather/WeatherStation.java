package DesignPattern.ObserverPattern.Weather;

import DesignPattern.ObserverPattern.Weather.Interface.impl.CurrentConditionsDisplay;
import DesignPattern.ObserverPattern.Weather.Interface.impl.HeatIndexDisplay;
import DesignPattern.ObserverPattern.Weather.Interface.impl.WeatherData;

/**
 * 数据发生变化时, 布告板实时更新显示
 * 需要新的布告板时添加一个新的实现类即可, 如酷热指数布告板
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

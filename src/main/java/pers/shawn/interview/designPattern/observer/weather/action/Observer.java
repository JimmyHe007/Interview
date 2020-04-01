package pers.shawn.interview.designPattern.observer.weather.action;

public interface Observer {

    public void update(float temp, float humidity, float pressure);

}

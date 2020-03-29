package DesignPattern.ObserverPattern.Weather.Interface;

public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();

}

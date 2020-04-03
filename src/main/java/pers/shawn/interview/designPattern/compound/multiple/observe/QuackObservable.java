package pers.shawn.interview.designPattern.compound.multiple.observe;

public interface QuackObservable {

    public void registerObserver(Observer observer);
    public void notifyObservers();

}

package pers.shawn.interview.designPattern.composite.menu;

import java.util.Iterator;

public abstract class MenuComponent {

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("getName");
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("getName");
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException("getName");
    }

    public void print() {
        throw new UnsupportedOperationException("getName");
    }

    public abstract Iterator createIterator();

    public String getName() {
        throw new UnsupportedOperationException("getName");
    }

    public String getDescription() {
        throw new UnsupportedOperationException("getDescription");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("getPrice");
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException("isVegetarian");
    }

}

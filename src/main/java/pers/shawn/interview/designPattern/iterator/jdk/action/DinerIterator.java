package pers.shawn.interview.designPattern.iterator.jdk.action;

import pers.shawn.interview.designPattern.iterator.jdk.restaurant.MenuItem;

import java.util.Iterator;

public class DinerIterator implements Iterator {

    MenuItem[] menuItems;
    int position = 0;

    public DinerIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return menuItems[position++];
    }

}

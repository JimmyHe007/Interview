package designPattern.iterator.my.action;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator {

    ArrayList menuItems;
    int position = 0;

    public PancakeHouseIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return menuItems.get(position++);
    }
}

package pers.shawn.interview.designPattern.iterator.my.restaurant;

import pers.shawn.interview.designPattern.iterator.my.action.Iterator;
import pers.shawn.interview.designPattern.iterator.my.action.PancakeHouseIterator;

import java.util.ArrayList;

public class PancakeHouseMenu {

    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true, 2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        menuItems.add(item);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}

package designPattern.iterator.jdk.restaurant;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {

    Hashtable menuItems;

    public CafeMenu() {
        menuItems = new Hashtable();
        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false,
                3.69);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        menuItems.put(item.getName(), item);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}

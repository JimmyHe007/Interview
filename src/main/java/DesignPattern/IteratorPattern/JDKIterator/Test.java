package DesignPattern.IteratorPattern.JDKIterator;

import DesignPattern.IteratorPattern.JDKIterator.Restaurant.DinerMenu;
import DesignPattern.IteratorPattern.JDKIterator.Restaurant.Menu;
import DesignPattern.IteratorPattern.JDKIterator.Restaurant.PancakeHouseMenu;
import DesignPattern.IteratorPattern.JDKIterator.Restaurant.Waitress;

public class Test {

    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }

}

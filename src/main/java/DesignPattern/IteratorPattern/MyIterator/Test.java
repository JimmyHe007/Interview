package DesignPattern.IteratorPattern.MyIterator;

import DesignPattern.IteratorPattern.MyIterator.Restaurant.DinerMenu;
import DesignPattern.IteratorPattern.MyIterator.Restaurant.PancakeHouseMenu;
import DesignPattern.IteratorPattern.MyIterator.Restaurant.Waitress;

public class Test {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }

}

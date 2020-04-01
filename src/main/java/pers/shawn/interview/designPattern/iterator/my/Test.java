package pers.shawn.interview.designPattern.iterator.my;

import pers.shawn.interview.designPattern.iterator.my.restaurant.DinerMenu;
import pers.shawn.interview.designPattern.iterator.my.restaurant.PancakeHouseMenu;
import pers.shawn.interview.designPattern.iterator.my.restaurant.Waitress;

public class Test {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }

}

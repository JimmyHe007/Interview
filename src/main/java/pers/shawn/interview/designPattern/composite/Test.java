package pers.shawn.interview.designPattern.composite;

import pers.shawn.interview.designPattern.composite.menu.Menu;
import pers.shawn.interview.designPattern.composite.menu.MenuComponent;
import pers.shawn.interview.designPattern.composite.menu.MenuItem;

public class Test {

    public static void main(String[] args) {

        Waitress waitress = new Waitress(getAllMenus());
        waitress.printMenu();
        System.out.println("------------------");
        waitress.printVegetarianMenu();

    }

    public static MenuComponent getAllMenus() {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                5.89
        ));

        allMenus.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla ice cream",
                false,
                1.99
        ));
        return allMenus;
    }

}

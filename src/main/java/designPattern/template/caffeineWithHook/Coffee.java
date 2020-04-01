package designPattern.template.caffeineWithHook;

import java.util.Scanner;

public class Coffee extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and Milk");
    }

    @Override
    boolean customWantsCondiments() {
        if (getUserInput().toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    public String getUserInput() {
        String result = null;
        System.out.println("Would you like milk and sugar with your coffee?(y/n)");
        Scanner scanner = new Scanner(System.in);
        result = scanner.nextLine();
        if (result == null) {
            return "no";
        }
        return result;
    }
}

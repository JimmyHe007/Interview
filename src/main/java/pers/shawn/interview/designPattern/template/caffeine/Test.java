package pers.shawn.interview.designPattern.template.caffeine;

public class Test {

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }

}

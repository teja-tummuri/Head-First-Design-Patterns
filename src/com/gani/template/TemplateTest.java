package com.gani.template;

/**
 * Created by Gani on 8/3/17.
 */
public class TemplateTest {

    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();

        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}

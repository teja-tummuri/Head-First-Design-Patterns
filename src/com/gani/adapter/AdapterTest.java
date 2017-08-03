package com.gani.adapter;

/**
 * Created by Gani on 8/3/17.
 */
public class AdapterTest {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Turkey wild = new WIldTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wild);
        Turkey duckAdapter = new DuckAdapter(mallard);

        System.out.println("The turkey says..");
        wild.gobble();

        System.out.println("The duck says..");
        mallard.quack();

        System.out.println("The turkeyAdapter says..");
        turkeyAdapter.quack();


    }
}

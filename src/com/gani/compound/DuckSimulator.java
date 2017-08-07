package com.gani.compound;


/**
 * Created by Gani on 8/6/17.
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }


    private void simulate() {

        Quackable mallard = new QuackCounter(new MallardDuck());
        Quackable redHead = new QuackCounter(new RedHeadDuck());
        Quackable rubber = new QuackCounter(new RubberDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("Duck Simulator");

        simulate(mallard);
        simulate(redHead);
        simulate(rubber);
        simulate(duckCall);
        simulate(gooseDuck);

        System.out.println(QuackCounter.getNumberOfQuacks());
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}

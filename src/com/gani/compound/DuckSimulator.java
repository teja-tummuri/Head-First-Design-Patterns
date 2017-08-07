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

        Quackable mallard = new MallardDuck();
        Quackable redHead = new RedHeadDuck();
        Quackable rubber = new RubberDuck();
        Quackable duckCall = new DuckCall();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("Duck Simulator");

        simulate(mallard);
        simulate(redHead);
        simulate(rubber);
        simulate(duckCall);
        simulate(gooseDuck);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}

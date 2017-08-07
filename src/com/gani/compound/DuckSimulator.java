package com.gani.compound;


/**
 * Created by Gani on 8/6/17.
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }


    private void simulate(AbstractDuckFactory duckFactory) {



        Quackable mallard = duckFactory.createMallardDuck();
        Quackable redHead = duckFactory.createRedHeadDuck();
        Quackable rubber = duckFactory.createRubberDuck();
        Quackable duckCall = duckFactory.createDuckCall();
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

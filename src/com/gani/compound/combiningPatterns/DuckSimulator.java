package com.gani.compound.combiningPatterns;


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

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallard);
        flockOfDucks.add(redHead);
        flockOfDucks.add(rubber);
        flockOfDucks.add(duckCall);

        Quackable mallard1 = duckFactory.createMallardDuck();
        Quackable mallard2 = duckFactory.createMallardDuck();
        Quackable mallard3 = duckFactory.createMallardDuck();
        Quackable mallard4 = duckFactory.createMallardDuck();

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallard1);
        flockOfMallards.add(mallard2);
        flockOfMallards.add(mallard3);
        flockOfMallards.add(mallard4);

        flockOfDucks.add(flockOfMallards);

        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("Duck Simulator");

        System.out.println("Simulating entire flock");
        simulate(flockOfDucks);
        System.out.println("Simulating only mallards");
        simulate(flockOfMallards);
        simulate(gooseDuck);

        System.out.println(QuackCounter.getNumberOfQuacks());


        Quackable mal = new MallardDuck();
        Quackologist quackologist = new Quackologist();
        flockOfMallards.registerObserver(quackologist);
        simulate(flockOfMallards);

    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}

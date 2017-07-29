package com.gani;

import com.gani.strategy.*;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck modelDuck = new ModelDuck();

        modelDuck.display();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

        Duck rubberDuck = new RubberDuck();

        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();

        Duck decoy = new DecoyDuck();

        decoy.display();
        decoy.performQuack();
        decoy.performFly();

        DuckCall duckcall = new DuckCall();
        System.out.println("Using duck call");
        duckcall.mimicQuack();
    }
}

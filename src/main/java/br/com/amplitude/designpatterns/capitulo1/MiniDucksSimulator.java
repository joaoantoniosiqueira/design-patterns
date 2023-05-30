package br.com.amplitude.designpatterns.capitulo1;

import br.com.amplitude.designpatterns.capitulo1.behavior.fly.FlyRocketPowered;
import br.com.amplitude.designpatterns.capitulo1.duck.Duck;
import br.com.amplitude.designpatterns.capitulo1.duck.MallardDuck;
import br.com.amplitude.designpatterns.capitulo1.duck.ModelDuck;
import br.com.amplitude.designpatterns.capitulo1.duck.RedHeadDuck;

public class MiniDucksSimulator {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("=================================================");

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

        System.out.println("=================================================");

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        System.out.println("Changing fly behavior of model duck dynamically");
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}

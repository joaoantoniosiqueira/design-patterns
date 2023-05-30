package br.com.amplitude.designpatterns.capitulo1.duck;

import br.com.amplitude.designpatterns.capitulo1.behavior.fly.FlyWithWings;
import br.com.amplitude.designpatterns.capitulo1.behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("Show Mallard Duck");
    }
}

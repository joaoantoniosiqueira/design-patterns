package br.com.amplitude.designpatterns.capitulo1.duck;

import br.com.amplitude.designpatterns.capitulo1.behavior.fly.FlyWithWings;
import br.com.amplitude.designpatterns.capitulo1.behavior.quack.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("Show Red Head Duck");
    }
}

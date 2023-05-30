package br.com.amplitude.designpatterns.capitulo1.duck;

import br.com.amplitude.designpatterns.capitulo1.behavior.fly.FlyNoWay;
import br.com.amplitude.designpatterns.capitulo1.behavior.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super(new FlyNoWay(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("Show Model Duck");
    }
}

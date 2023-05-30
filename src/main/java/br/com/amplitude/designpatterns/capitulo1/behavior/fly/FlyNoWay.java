package br.com.amplitude.designpatterns.capitulo1.behavior.fly;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly no way");
    }
}

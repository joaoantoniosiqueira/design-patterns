package br.com.amplitude.designpatterns.capitulo1.behavior.fly;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Fly with wings");
    }
}

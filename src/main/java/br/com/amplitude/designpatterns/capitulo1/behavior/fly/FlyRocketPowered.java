package br.com.amplitude.designpatterns.capitulo1.behavior.fly;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly With Rocket!!!!!!");
    }
}

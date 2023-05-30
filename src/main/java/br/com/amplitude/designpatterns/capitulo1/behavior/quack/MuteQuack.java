package br.com.amplitude.designpatterns.capitulo1.behavior.quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("...");
    }
}

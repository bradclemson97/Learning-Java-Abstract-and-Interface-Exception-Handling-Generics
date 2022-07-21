package com.bradclemson97;

//You can only extend by one abstract class
//You can implement as many interfaces as you like
public class Dog extends Animal implements AnimalStuff {

    //from the Animal abstract class
    @Override
    public void makeNoise() {
        System.out.println("Woof");
    }


    @Override
    public void poop() {
        System.out.println("Dogpoopnoise");
    }
}

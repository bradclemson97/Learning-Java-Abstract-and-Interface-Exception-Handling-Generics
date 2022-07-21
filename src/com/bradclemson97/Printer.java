package com.bradclemson97;

//<?> defines the type parameter, it represents the type of thing the printer is going to hold and print
public class Printer <T extends Animal & AnimalStuff>{

    //Any method defined in the animal class is available to us in our thingToPrint variable, type T is going to be some type of animal
    //instead of declaring a specific data type like an integer, we declare type T
    T thingToPrint;

    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        //makeNoise method is available in the animal class
        thingToPrint.makeNoise();
        System.out.println(thingToPrint);
    }
}
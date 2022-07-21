package com.bradclemson97;

public interface AnimalStuff {

    /*if you declare any fields (e.g. 'int age')
     every field that is declared is going to be static and final
     (have to instantiate it with a value, the same values apply to every class implementing this interface)
     this is why it is sometimes better to just use an abstract class
     */

    int age = 1;
    String name = "Larry";

    public void poop();

}

package com.bradclemson97;

/*An abstract class is a class you can't instantiate, you can't create objects from them
  but you can make sub-classes of an abstract class that can be instantiated
  the abstract class enforces and organises exactly what every sub-class of animal has to have (e.g. has to have an age, name and make noise)
 */
public abstract class Animal {
    int age;
    String name;

    //when we make a method abstract we don't specify a body for the method, just declare it and end it with a semi-colon
    public abstract void makeNoise();
    // but then in all the child classes of our abstract class, we have to create an implementation of this makeNoise method

    //now every sub-class of animal will have this method available to them but because it is not 'abstract' it is not enforced.
    public void printName() {
        System.out.println("My name is " + name);
    }


}

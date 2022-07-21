package com.bradclemson97;

import java.util.ArrayList;

public class Main {

    //public means it's accessible by other methods
    //static means it belongs to this class ('Main')
    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.getAge();
        myCat.getName();
        myCat.getWeight();

        myCat.makeNoise();
        myCat.poop();

        /*polymorphism means meany forms - means my classes can do the same thing in different ways
            make noise for cat returns 'meow' but for dog it returns 'woof'
         */

        Dog myDog = new Dog();
        myDog.makeNoise();

        //********Exception Handling******

        /*An exception is a generally unwanted event that interrupts the normal flow of your program
        e.g. int myInt = Integer.parseInt("pants"); would throw an exception when running because we can't make a number out of 'pants'
        instead of it interrupting the program when running, we can handle the exception with try-catch code blocks...
         */
        try {
            //Code that may cause an exception
            int myInt = Integer.parseInt("pants");
            //The code below will not be run if an exception is thrown
            System.out.println("After Parsing Pants");
        }
        catch (NumberFormatException | NullPointerException e) {
            //Code that we want to execute if this type of exception is caught
            //NumberFormatException will catch all number format exceptions
            //We can just use 'Exception' to catch any type of exception
            //use a bar '|' character to denote other additonal types of exception (e.g. null pointer) we want to use
            System.out.println("Hey dude you can't make an int from that");
        }
        finally {
            //contains we want to execute if there is an exception or not, it will ALWAYS execute
            System.out.println("in the finally block");
            //AVOID putting 'return' statements in your finally block
        }
        System.out.println("End here");

        //********GENERICS*******

        //This object (cat) is going to be used for the T type in the object that we are printing
        Printer<Cat> printer = new Printer<>(new Cat());
        printer.print();

        //This object (dog) is going to be used for the T type in the object that we are printing
        Printer<Dog> doublePrinter = new Printer<>(new Dog());
        printer.print();


        /*if we wanted to print an integer using a 'IntegerPrinter' class but do the same thing as above but for a double, string etc...
         we can make a copy of the integerPrinter class and replace everything integer with double, do the same for string etc...
         Generics offer the ability to have one class for this which is flexible for many different data types
         */






    }
}

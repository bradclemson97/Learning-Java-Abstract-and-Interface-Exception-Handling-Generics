package com.bradclemson97;

import lombok.Data;

@Data
/* The below annotations are all imported by just using the @Data annotation
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
*/


//You can only extend by one abstract class
//You can implement as many interfaces as you like
public class Cat extends Animal implements AnimalStuff {

    //from the Animal abstract class
    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    //from the AnimalStuff interface
    @Override
    public void poop() {
        System.out.println("Catpoopnoise");
    }

    //***** GETTERS AND SETTERS ******

    /* they allow us to encapsulate the fields in our class by making them private but making these fields accessible to
    outside classes through accessors (getter methods) or mutators (setter methods) but it takes time to create all these
    methods especially if your class has a whole-bunch of fields.
     */

    /*in intellij, right-click on the field ('weight') > refactor > encapsulate fields > select getters and setters
    this will automatically create your getters and setters
     */

    private String name;
    private float weight;
    private int age;

    /*
    getter returns name
    public String getName(){
        return this.name;
    }

    //setter passes in the name string and set it to what we want to
    public void setName(String name){
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

     */

    /*we can get rid of all-of-the above clutter but still have all the getter and setter methods available to us by using
    lombok, download lombok (projectlombok.org/download) - then add the @Getter annotation - now each of the fields in the class
    now has a getter method - when compiling the code the getters and setters will be in the byte code of this class but you
    will never actually see them in your .java file
     */

    //******* EQUALS METHOD *******

    /*This below method should be added to each of the classes that you create - tells you if this object is equal to some other
    object that is passed into this method. Instead of this being here though you can just add the annotation @EqualsAndHashCode - this
    will automatically add a full-featured equals method


    public boolean equals;
     */

    //****** TO STRING METHOD ******

    /* the To String method is supposed to be in all of your classes - creates a good string representation of your object -
    Lombok can automatically generate this method too with the @ToString annotation,
    this automatically prints out all the values of the private fields in your class

    public String toString(){
    }

     */

}

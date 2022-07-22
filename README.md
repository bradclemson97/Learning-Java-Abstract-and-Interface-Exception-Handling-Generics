# Learning-Java-Abstract-and-Interface-Exception-Handling-Generics

This application demonstrates how and why abstract, interface and generic classes and methoods can be used in java. 

An abstract class is a class you can't instantiate, you can't create objects from them but you can make sub-classes of an abstract class that can be instantiated. The abstract class enforces and organises exactly what every sub-class of animal has to have (e.g. has to have an age, name and make noise). 

An interface class is similiar to an abstratc class but if you declare any fields (e.g. 'int age') every field that is declared is going to be static and final (have to instantiate it with a value, the same values apply to every class implementing this interface). 

Generics offer the ability to have one class for this which is flexible for many different data types. <?> defines the type parameter, it represents the type of thing the generics (priner) class is going to hold (and print). In this case, type T is going to be some type of animal. 

The application also makes use of Lombok to add getters and setters, an equals method and string method to the main class. 

## Getting Started

### Dependencies

* Lombok

### Authors

Contributors names and contact info

ex. Bradley Clemson 
ex. [@bradclemson](https://twitter.com/bradclemson)

### Version History

* 0.1
    * Initial Release


<p align="right">(<a href="#top">back to top</a>)</p>



Coffee Cake
============

This project is a demonstration of the [Cake pattern](http://www.cakesolutions.net/teamblogs/2011/12/19/cake-pattern-in-depth) in Java.  It relies on Java 8 features: specifically default functions on interfaces which allow for the "mixin" behavior.

This is interoperable with other dependency injection mechanisms like Spring, but there is a lot of power in moving much of the configuration into code.  I also believe there is a significant advantage in the pattern for "default" or standard implementations, because it's possible to inject them without wiring.

Credit to [Kevin Kyyro](https://github.com/kevincairo) for the idea and for the functional programming and Scala teachings

![Coffee and cake](http://upload.wikimedia.org/wikipedia/commons/thumb/6/68/Coffee_and_cake_%288400386474%29.jpg/800px-Coffee_and_cake_%288400386474%29.jpg)

Project setup

    brew install gradle
    gradle idea

Run the tests
    
    gradle test

Run the main class
    
    gradle build && gradle run


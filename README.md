# Java-Design-Patterns

## Java Design Patterns are divided into three categories. 
1. Creational design patterns.
2. Structural design patterns. 
3. Behavioral design patterns.
 
**Total 23 design patterns are available.**
------------------------------------------------------------------------------------------------
### Creational Design Patterns
Creational design patterns provide solution to instantiate a object in the best possible way for 
specific situations.

- <b>Singleton Pattern : </b>
Singleton pattern restricts the instantiation of a class and ensures that only one instance of the 
class exists in the Java virtual machine.

- <b>Factory Pattern : </b>
The factory design pattern is used when we have a superclass with multiple sub-classes and based on 
input, we need to return one of the sub-class.

- <b>Abstract Factory Pattern : </b>
Abstract Factory pattern is similar to Factory pattern and it is a factory of factories.<br>
If you are familiar with the factory design pattern in java, you will notice that we have a 
single Factory class that returns the different sub-classes based on the input provided and 
the factory class uses if-else or switch statements to achieve this.<br>
In Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class 
and then an Abstract Factory class that will return the sub-class based on the input factory class.

- <b>Builder Pattern : </b>
This pattern was introduced to solve some of the problems with Factory and 
Abstract Factory design patterns when the Object contains a lot of attributes. 
Builder pattern solves the issue with a large number of optional parameters and inconsistent 
state by providing a way to build the object step-by-step and provide a method that will actually 
return the final Object.

### Structural Design Patterns
Structural patterns provide different ways to create a class structure, 
for example using inheritance and composition to create a large object from small objects.


- <b>Adapter Pattern : </b>
The adapter design pattern is one of the structural design pattern used in software design to allow two incampatible interface to work together.
It acts as a bridge between two classes for communication.

- <b>proxy pattern :</b>
Proxy Pattern "provides the control for accessing the original object".
So,we can perform many operations like hiding the information of original object, on demand loading etc.<br>
Proxy means ‘in place of’ or ‘on behalf of’ are literal meanings of proxy. <br>
Proxy design pattern provides the proxy object instead of original object.<br>
A real world example can be a cheque or credit card is a proxy for what is in our bank account. It can be used in place of cash, 
and provides a means of accessing that cash when required.<br>
<b>Advantage of Proxy Pattern, </b>
It provides the protection to the original object from the outside world.

- <b>Facade Pattern : </b>
Facade Pattern is used to help client applications to easily interact with the system.

### Behavioral Design Patterns
Behavioral patterns provide solution for the better interaction between objects and 
how to provide loose coupling and flexibility to extend easily.

- <b>Template method</b> defines the steps to execute an algorithm and it can provide default implementation 
that might be common for all or some of the subclasses.

- <b>Mediator Pattern : </b>
The mediator design pattern is used to provide a centralized communication medium between different 
objects in a system. The mediator design pattern is very helpful in an enterprise application where 
multiple objects are interacting with each other. If the objects interact with each other directly, 
the system components are tightly coupled with each other which makes maintainability cost higher 
and not flexible to extend easily. 
The mediator pattern focuses on to provide a mediator between objects for communication and help in 
implementing lose-coupling between objects.

- <b>Observer Pattern :</b>
An observer design pattern is useful when you are interested in the state of an object and want to 
get notified whenever there is any change. In observer pattern, the object that watches on the state 
of another object is called Observer and the object that is being watched is called Subject.

- <b>Iterator design pattern</b> It is one of the behavioral pattern. 
Iterator pattern is used to provide a standard way to traverse through a group of Objects. 
Iterator pattern is widely used in Java Collection Framework. 
Iterator interface provides methods for traversing through a collection.

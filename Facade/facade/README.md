# **Facade Design Pattern**
The Facade Design pattern is a structural design pattern that provides a simplified interface to a complex system of classes, hiding their internal complexity and details. The Facade pattern involves a single class called facade which is responsible for communication between the client and the subsystem classes.

## **Problem**
A complex system of classes has a hard-to-use interface for the client.

## **Solution**
The Facade Design pattern suggests that you create a new class, the facade, that has a simpler and easier-to-use interface. The facade class should implement the interface that the client expects and use the methods of the subsystem classes to accomplish the task. This way, the client doesn't need to know the complexity of the subsystem classes and how they work, the client just needs to know the methods that the facade class provides.

## **How to implement**
1) Identify the interface that the client expects and create a facade class with the same methods.
2) Create instances of the subsystem classes inside the facade class.
3) The facade class should delegate all of the methods from the interface to the subsystem classes.

## **Example**
In this example, we have a `BankAccountFacade` class that acts as a facade for the subsystem classes, which are `WelcomeToBank`, `AccountNumberCheck`, `SecurityCodeCheck`, and `FundsCheck`. The facade class has the methods `withdrawCash` and `depositCash` which are the only methods exposed to the client. These methods are simple and easy to use, but they internally use the methods of the subsystem classes to accomplish the task.

The subsystem classes perform more complex and low-level tasks such as checking the account number, security code, and funds available. The facade class acts as an interface between the client and the subsystem classes and provides a simple and easy-to-use interface for the client.

## **Conclusion**
The Facade Design pattern is a powerful and flexible way to provide a simple and easy-to-use interface for the client and hide the complexity of the subsystem classes. This makes the code easy to understand and maintain.
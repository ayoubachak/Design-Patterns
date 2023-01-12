# **Command Design Pattern**
The Command Design pattern is a behavioral pattern that encapsulates a request as an object, separating the command execution from the command sender. It allows you to add new commands to the system without affecting the existing classes and also it allows undo and redo operations.

## **Problem**
You need to add new functionality to an existing class, but you don't want to change its structure. You also want to be able to undo and redo the commands.

## **Solution**
The Command Design pattern suggests that you encapsulate a request as an object, separating the command execution from the command sender. The command objects can be stored in a stack, allowing undo and redo functionality.

## **How to implement**
1) Define an interface or an abstract class for the command, with a single method execute().
2) Create concrete command classes that implement the command interface and contain a reference to the object they operate on.
3) Create a class that contains a stack of command objects and methods for executing, undoing, and redoing commands.
4) Client code should work with the command objects through the common interface or abstract class.

Sure, here's an example of how a README.md file that explains the Command Design pattern might look like:

Command Design Pattern
The Command Design pattern is a behavioral pattern that encapsulates a request as an object, separating the command execution from the command sender. It allows you to add new commands to the system without affecting the existing classes and also it allows undo and redo operations.

Problem
You need to add new functionality to an existing class, but you don't want to change its structure. You also want to be able to undo and redo the commands.

Solution
The Command Design pattern suggests that you encapsulate a request as an object, separating the command execution from the command sender. The command objects can be stored in a stack, allowing undo and redo functionality.

## **How to implement**
* Define an interface or an abstract class for the command, with a single method `execute()`.
* Create concrete command classes that implement the command interface and contain a reference to the object they operate on.
* Create a class that contains a stack of command objects and methods for executing, undoing, and redoing commands.
* Client code should work with the command objects through the common interface or abstract class.
## **Advantages**
* The Command Design pattern allows you to add new functionality to a class without changing its structure.
* It allows you to add or remove functionality at run-time.
* It provides the ability to undo and redo operations.
* It decouples the objects that invoke the operations from the objects that perform these operations.
* It allows to parametrize objects with operations.
## **Disadvantages**
* The Command Design pattern can lead to a large number of small classes that can be difficult to understand.
* The command objects and invokers can have a high level of complexity which can make the code harder to understand and maintain.
* The Command Design pattern can lead to an increase in the number of objects in the system, which can lead to performance issues.

## **When to use**
* You need to add new functionality to a class without changing its structure.
* You want to be able to add or remove functionality at run-time.
* You want to provide undo and redo operations for a class.
* You want to decouple the objects that invoke the operations from the objects that perform these operations.
* You want to parametrize objects with operations.

## **Example**
An example of how the Command Design pattern might be implemented in Java is provided in the code above, where an interface `Command` is defined, with a single method `execute()`. The `Calculator` class is the receiver class that performs the operations, `AddCommand` and `SubstractCommand` are concrete command classes that implement the `Command` interface and contain a reference to the `Calculator` object they operate on. The `CalculatorInvoker` class contains a command object and methods for executing the command.

This example demonstrates how the Command Design pattern allows you to add new functionality to the Calculator class without changing its structure, and how it provides undo and redo functionality.

## **Conclusion**
The Command Design pattern is a powerful and flexible pattern that allows you to add new functionality to an existing class without changing its structure. It provides the ability to undo and redo operations, decouples the objects that invoke the operations from the objects that perform these operations and parametrize objects with operations. It is important to use it in the appropriate situation to keep the code simple and easy to understand.
# **Decorator Design Pattern**
The Decorator Design pattern is a structural design pattern that allows adding new functionality to an existing object without changing its structure. The pattern creates a decorator class which wraps the original class and provides additional functionality.

## **Problem**
You need to add new functionality to an existing object, but you don't want to change the object's structure.

## **Solution**
The Decorator Design pattern suggests that you extend the functionality of objects by wrapping them with a decorator class that implements the same interface as the original object and adds new behavior.

## **How to implement**
1) Define an interface or an abstract class for the original object.
2) Define a decorator class that implements the same interface or extends the same abstract class as the original object.
3) In the decorator class, define a field for storing a reference to the original object and pass it to the constructor.
4) In the decorator class, override the methods of the original object and add new behavior before or after calling the corresponding methods of the original object.
5) Client code should work with the original object and decorators through the common interface or abstract class.

## **Advantages**
* The Decorator Design pattern allows you to add new functionality to an object without changing its structure.
* It allows you to add behavior to individual objects at run-time, and it is more flexible than using inheritance.
* It allows you to create a flexible alternative to sub-classing for extending functionality.
## **Disadvantages**
* The Decorator Design pattern can lead to a large number of small classes that can be difficult to understand.
* Decorators and their wrappers can have a high level of complexity which can make the code harder to understand and maintain.
* The Decorator Design pattern can lead to an increase in the number of objects in the system, which can lead to performance issues.
## **When to use**
* You need to add new functionality to an existing object without changing its structure.
* You want to be able to add or remove functionality at run-time.
* You want to be able to create a flexible alternative to sub-classing for extending functionality.
## **When not to use**
* When you need to add functionality to an object that can be done by changing its structure.
* When you don't need to add or remove functionality at run-time.
* When you don't need to create a flexible alternative to sub-classing for extending functionality.

## **Real-world examples**
* The `InputStream` and `OutputStream` classes in Java, which are used to read and write data and can be decorated with additional functionality such as compression, encryption, and buffering.
* The `HttpServletRequestWrapper` and `HttpServletResponseWrapper` classes in Java Servlet API, which are used to add additional functionality to the request and response objects.
* The `Border` class in the Java Swing library, which is used to add borders to various components.

## **Conclusion**
The Decorator Design pattern is a powerful and flexible pattern that allows you to add new functionality to an existing object without changing its structure. It is important to use it in the appropriate situation to keep the code simple and easy to understand. It is a good alternative to using inheritance when you want to add behavior to individual objects at run-time.
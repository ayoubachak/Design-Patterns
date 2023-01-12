# Factory Design Pattern

The Factory Design pattern is a creational design pattern that provides an interface for creating objects in a super class, but allows subclasses to alter the type of objects that will be created.

## **Problem**
When creating an object, the client code should not be forced to know the specific class of the object that it needs to create. The client should only know the type of the object it needs, not the specific implementation.

## **Solution**
The Factory Design pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. The Factory method lets a class defer instantiation to subclasses.

## **How to implement**
* Define an interface for creating an object, but let subclasses decide which class to instantiate. The Factory method lets a class defer instantiation to subclasses.
* Create a factory class that will be responsible for creating objects, the factory class should have a method that takes the type of the object as a parameter and returns the object.
* The client should use the factory class to create objects instead of instantiating them directly.

## **Example**
Let's say we want to create a computer factory that can create two types of computers: PC and Server.

1) We will create an abstract class Computer that will have the common properties and methods for both PC and Server.
```java
public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}
```
2) We will create two concrete classes `PC` and `Server` that will extend the `Computer` class and provide the specific implementation for the properties and methods.
```java
public class PC extends Computer {
    private String ram;
    private String hdd;
    private String cpu;

    public PC(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}

public class Server extends Computer {
    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
```
3) We will create the factory class ComputerFactory that will have a method getComputer that takes the type of the computer and the properties as parameters, and returns the specific computer object.
```java
public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }
}
```
4) The client code should use the factory class to create the objects, it should not create the objects directly.
```java
Computer pc = ComputerFactory.getComputer("PC", "2 GB", "500 GB", "2.4 GHz");
Computer server = ComputerFactory.getComputer("Server", "16 GB", "1 TB", "2.9 GHz");
```
## **Advantages**
* The Factory Design pattern provides a way to encapsulate object creation.
* It allows the client code to be decoupled from the objects it creates.
* It allows to centralize the control of the object creation.
* It allows to add new types of objects without modifying the client code.
## **Disadvantages**
* The Factory Design pattern requires creating a separate class for creating objects, which can increase the complexity of the code.
* It may lead to an increase in the number of classes in the system.
* It may make the code more difficult to understand if not used appropriately.
## **Conclusion**
The Factory Design pattern is a powerful and flexible creational pattern that allows the client code to be decoupled from the objects it creates. It can be used to centralize the control of object creation and to add new types of objects without modifying the client code. However, it requires creating a separate class for creating objects, which can increase the complexity of the code. It is important to use it in the appropriate situation to keep the code simple and easy to understand and maintain.
## **When to use**
* When a class cannot anticipate the type of objects it needs to create.
* When a class wants its subclasses to specify the objects it creates.
* When a class delegates responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper subclass is the delegate.
## **When not to use**
* When creating an object doesn't have a significant amount of logic in the process.
* When you have to create only one instance of a class, use the Singleton pattern instead.
* When the client code needs to know the specific class of the object it is creating, use the Abstract Factory pattern instead.
## **Real-world examples**
* The `Calendar.getInstance()` method returns a Calendar object that represents the current date and time. It uses the Factory Design pattern to create the appropriate Calendar object for the current locale.
* The `DriverManager.getConnection()` method returns a Connection object that represents a connection to a database. It uses the Factory Design pattern to create the appropriate Connection object for the current database.

The Factory Design pattern is a powerful and flexible creational pattern that can be used to encapsulate object creation, centralize the control of object creation, and add new types of objects without modifying the client code. It is important to use it in the appropriate situation to keep the code simple and easy to understand.
# **Mediator Design Pattern**
The Mediator pattern is a behavioral design pattern that allows objects to communicate with each other without having to know about each other's identities. Instead of objects communicating directly with each other, they send messages to a mediator object, which then forwards the message to the appropriate object. This allows objects to be more loosely coupled, and it makes it easier to add new objects to the system.

## **Problem that the pattern is solving**
When objects communicate directly with each other, they become tightly coupled, and it can be difficult to add new objects to the system or to change the way that objects communicate. The Mediator pattern allows objects to communicate indirectly, through a mediator object, which makes it easier to add new objects to the system and to change the way that objects communicate.

## **Introducing the Solution**
The Mediator pattern consists of a mediator object, which is responsible for forwarding messages between objects, and a number of colleague objects, which send and receive messages through the mediator. The mediator acts as a hub, routing messages between objects, and it allows objects to be more loosely coupled.

## **Explanation with the code**
Here's an example of the Mediator pattern in a chat room application:
```java
class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}

class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
```
In this example, the ChatRoom class acts as the Mediator, it receives the message from the user and then it forwards the message to other users. The User class represents the colleague objects and it sends the message through the chat room. The Mediator pattern allows objects to communicate indirectly and it decouples the objects from each other, making it easier to add new objects to the system or to change the way that objects communicate.

## **Real-world applications**
The Mediator pattern is commonly used in user interface development, specifically in the Model-View-Controller (MVC) pattern. The Mediator acts as the Controller, which receives input from the View and updates the Model accordingly.

Another real-world example of this pattern is the Air Traffic Control system, where the Mediator is responsible for managing the communication between different planes, and it coordinates their take-off and landing schedules to ensure the safe operation of the airport.

## **Conclusion**
The Mediator pattern allows objects to communicate indirectly through a mediator object, which helps to decouple the objects from each other. This makes it easier to add new objects to the system, and it makes it easier to change the way that objects communicate. The Mediator pattern is a powerful tool for managing the communication between objects and it can help to make your code more flexible and maintainable.
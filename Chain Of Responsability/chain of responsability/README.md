# **Chain of Responsibility**
The Chain of Responsibility pattern is a behavioral design pattern that allows multiple objects to process a request, and the request is passed through a chain of objects until it is handled. Each object in the chain has the opportunity to process the request and decide whether or not to pass it on to the next object in the chain.

## **Problem that the pattern is solving**
When a request is sent to an object, it is not always clear which object should handle it. It could be handled by the object itself, or it could be passed on to other objects. The Chain of Responsibility pattern allows you to build a chain of objects that can handle the request, and the request is passed through the chain until it is handled.

## **Introducing the Solution**
The Chain of Responsibility pattern consists of a number of objects, each of which has a reference to the next object in the chain. Each object has the opportunity to handle the request, and if it cannot, it passes the request on to the next object in the chain. The pattern allows you to build a flexible chain of objects that can handle a request, without the need to hard-code the chain.

## **Explanation with the code**
Here is an example of the Chain of Responsibility pattern in a real-world use case:
```java
abstract class PurchasePower {
    protected static final double BASE = 500;
    protected PurchasePower successor;

    public void setSuccessor(PurchasePower successor) {
        this.successor = successor;
    }

    abstract public void processRequest(PurchaseRequest request);
}

class ManagerPower extends PurchasePower {
    protected double getAllowable(){
        return BASE * 10;
    }

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < getAllowable()) {
            System.out.println("Manager will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}

class DirectorPower extends PurchasePower {
    protected double getAllowable() {
        return BASE * 20;
    }

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < getAllowable()) {
            System.out.println("Director will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}

class PresidentPower extends PurchasePower {
    protected double getAllowable() {
        return BASE * 40;
    }

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < getAllowable()) {
            System.out.println("President will approve $" + request.getAmount());
        } else if (successor != null) {
            System.out.println( "Your request for $" + request.getAmount() + " needs a board meeting!");
        }
    }
}

class PurchaseRequest {
    private double amount;
    private String purpose;

    public PurchaseRequest(double amount, String purpose) {
        this.amount = amount;
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amt)  {
        amount = amt;
    }

    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String reason) {
        purpose = reason;
    }
}
```
In this example, we have three `PurchasePower` classes(`ManagerPower`, `DirectorPower`, `PresidentPower`) that represent different levels of authority in an organization and each one of them has a specific range of allowed amount to approve a purchase. Each class has a `processRequest` method that handles the purchase request by checking if the amount of the request is less than the allowable amount for its level, if the amount is less than the allowable amount the request will be approved, otherwise the request will be passed to the next level in the chain.

## **Real-world applications**
The Chain of Responsibility pattern is commonly used in event-driven systems, such as GUI frameworks, to handle events. Each object in the chain has the opportunity to handle the event, and if it cannot, it passes the event on to the next object in the chain.

Another common use case is in error handling, where different levels of error handlers are chained together. Each handler has the opportunity to handle the error, and if it cannot, it passes the error on to the next handler in the chain.

Additionally, the pattern is also used in the field of Object-Relational Mapping (ORM) libraries, where it is used to handle database operations and to propagate changes to the related objects.

## **Conclusion**
The Chain of Responsibility pattern is a powerful tool for handling requests, allowing multiple objects to process a request and giving each object the opportunity to handle the request. It allows for a flexible and maintainable design by decoupling the sender of a request from its receiver and allows the request to be handled by the object that is best suited to handle it.
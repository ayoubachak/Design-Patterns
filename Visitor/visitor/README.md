# **Visitor Design Pattern**
The Visitor design pattern is a pattern that allows adding new operations to classes of a system without changing their source code. It separates the operations from the object structure on which they operate. This pattern is also known as "double dispatch" as it allows dynamic dispatching of a method based on the type of two objects: the visitor and the element.

## **Problem**
The Visitor Design Pattern is a pattern that allows you to add new functionality to a set of classes without changing the classes themselves. In other words, it separates an algorithm from the object structure on which it operates.

One of the main use cases of this pattern is when you have a complex object structure, and you want to perform different operations on it. For example, you might have a shopping cart with multiple items, and you want to calculate the total cost of the items, the total weight of the items, and so on.

## **Solution**
The Visitor Design Pattern solves this problem by creating a separate Visitor class that contains the algorithm. This class is then passed to the objects in the structure, which then call the appropriate methods on the Visitor class to perform the desired operations.

This way, the objects in the structure don't have to know anything about the algorithm being performed, they just have to know how to accept the Visitor. The Visitor, in turn, doesn't have to know anything about the object structure, it just has to know how to perform the algorithm.

## **Example**
```java
interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}


interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
}

class Book implements ItemElement {
    private int price;
    private String isbnNumber;

    public Book(int cost, String isbn){
        this.price=cost;
        this.isbnNumber=isbn;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}

class Fruit implements ItemElement {
    private int pricePerKg;
    private int weight;
    private String name;

    public Fruit(int priceKg, int wt, String nm){
        this.pricePerKg=priceKg;
        this.weight=wt;
        this.name = nm;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public String getName(){
        return this.name;
    }

    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}

class PriceVisitor implements ShoppingCartVisitor {
    @Override
    public int visit(Book book) {
        int cost=0;
        if(book.getPrice()>50){
            cost = book.getPrice()-5;
        }else cost = book.getPrice();
        System.out.println("Book ISBN::"+book.getIsbnNumber() + " cost ="+cost);
        return cost;
    }
    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg()*fruit.getWeight();
        System.out.println(fruit.getName() + " cost = "+cost);
        return cost;
    }
}
```
This code defines an example of the Visitor pattern in Java. The Visitor pattern is a behavioral design pattern that allows for the separation of an algorithm from an object structure on which it operates. The example code defines the following classes:

* `ShoppingCartVisitor`: an interface that defines the `visit` method for visiting a `Book` or a `Fruit` object.
* `ItemElement`: an interface that defines the `accept` method, which is used to accept a `ShoppingCartVisitor` object.
* `Book`: a class that implements the `ItemElement` interface, representing a book object with a price and ISBN number. The `accept` method in this class calls the `visit` method on a `ShoppingCartVisitor` object and passes itself as an argument.
* `Fruit`: a class that also implements the `ItemElement` interface, representing a fruit object with a price per kg, weight, and name. The `accept` method in this class also calls the `visit` method on a `ShoppingCartVisitor` object and passes itself as an argument.
* `PriceVisitor`: a class that implements the `ShoppingCartVisitor` interface. This class has two visit methods, one for visiting a `Book` object and one for visiting a `Fruit` object. Each method calculates the cost of the item and prints it to the console.
In this example, the `ItemElement` interface and its implementing classes (`Book` and `Fruit`) define the object structure on which the algorithm (`PriceVisitor`) operates. The accept method in the `Book` and `Fruit` classes are used to call the visit method on the `PriceVisitor` object, passing the `Book` or `Fruit` object as an argument.

This example demonstrates how the Visitor pattern can be used to add new functionality to existing classes without modifying their source code. Additionally, it allows for a clear separation of concerns by keeping the algorithm and the object structure separate.

## **Conclusion**
In real-world applications, the Visitor pattern is commonly used in situations where you need to perform operations on a set of objects, but you don't want to modify the classes of those objects. For example, in a graphics editor, the Visitor pattern can be used to add new operations (such as rendering and hit-testing) to a set of existing shapes without modifying the classes of those shapes. Another example would be in a compiler, where a syntax tree is built from the source code and then different visitors can be applied to the tree to perform semantic analysis and code generation.
# **Proxy Design Pattern**
The proxy pattern is a structural design pattern that provides a surrogate object that controls access to another object. This pattern is used to:

* Control access to a remote object.
* Add or remove functionality.
* Add logging or other types of functionality.

## **When to use the Proxy pattern**
* When you need to provide controlled access to an object that is expensive to create or locate.
* When you need to add functionality to an object without changing its interface.
* When you need to temporarily hide the complexity of an object from the client.

## **Example**
In the provided example, we have the interface `RemoteServer` that's implemented by two classes, `RealRemoteServer` and `RemoteServerProxy`. The `RealRemoteServer` class represents the real subject, and the `RemoteServerProxy` class represents the proxy. The RemoteServer interface is implemented by both classes, so the client code can use either the proxy or the real subject without knowing the difference.

In the main method, we can see how this pattern works, where we create an instance of the `RemoteServerProxy` class and call its methods. The `RemoteServerProxy` class adds functionality to the `RealRemoteServer` class by ensuring that a connection is established before allowing tasks to be executed.

## **Advantages**
* It allows for a more flexible and dynamic way to control access to remote objects.
* It allows you to add or remove functionality without changing the client code.
* It allows you to temporarily hide the complexity of an object from the client.
## **Disadvantages**
* It can introduce an additional level of indirection, which can make the system harder to understand.
* It can lead to a proliferation of small proxy classes that can make the system more difficult to maintain.


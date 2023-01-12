# **Adapter Design Pattern**
The Adapter Design pattern is a structural design pattern that allows you to convert the interface of a class into another interface that the client expects. It allows classes to work together that couldn't otherwise because of incompatible interfaces. The Adapter pattern involves a single class called adapter which is responsible for communication between two independent or incompatible interfaces.
## **Problem**
You need to use an existing class, but its interface is not compatible with the rest of your code.

## **Solution**
The Adapter Design pattern suggests that you create a wrapper class that converts the interface of an existing class into the interface that you need. The wrapper class implements the interface that you need and contains an instance of the class that it wraps. The Adapter pattern allows otherwise incompatible classes to work together by wrapping an instance of one class with an adapter class that converts the interface of that class into another interface that is expected by the client.

## **How to implement**
1) Identify the interface that the client expects and create an interface with the same methods.
2) Create a wrapper class that implements the interface and contains an instance of the class that it wraps.
3) The wrapper class should delegate all of the methods from the interface to the wrapped class.

## **Example**
In this example, we have an AdvancedMediaPlayer interface that defines the advanced media player functionality that the client expects. The VlcPlayer and Mp4Player classes are the existing classes that need to be adapted. These classes have the functionality that is needed by the client but their interface is not compatible. The MediaAdapter class is the adapter class that implements the MediaPlayer interface and contains an instance of the AdvancedMediaPlayer class that it wraps. The AudioPlayer class is the client class that uses the MediaPlayer interface. The AudioPlayer class has a method play which takes the audio type and file name. If the audio type is mp3, it directly plays the mp3 file. If the audio type is vlc or mp4, it creates an instance of MediaAdapter which then delegates the call to the corresponding play method of VlcPlayer or Mp4Player class.

This example demonstrates the power and flexibility of the Adapter Design pattern. It allows you to adapt the interface of an existing class to the interface that the client expects, and it allows classes to work together that couldn't otherwise because of incompatible interfaces.
## **Conclusion**
The Adapter Design pattern is a powerful and flexible pattern that allows you to adapt the interface of an existing class to the interface that the client expects. It allows classes to work together that couldn't otherwise because of incompatible interfaces. It is important to use it in the appropriate situation to keep the code simple and easy to understand.

It's important to notice that the Adapter Design pattern is useful when you want to reuse existing classes that don't have the interface you need, and also when you want to change the interface of an existing class.
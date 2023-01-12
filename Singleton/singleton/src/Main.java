
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Run the SingletonTest
        SingletonTest singletonTest = new SingletonTest();
        singletonTest.simpleSingletonTest();
        singletonTest.simpleSingletonTest();
        singletonTest.multithreadedSingletonTest();
    }
}

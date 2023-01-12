import static org.junit.Assert.assertSame;
import org.junit.Test;
import java.util.concurrent.CountDownLatch;


public class SingletonTest {
    private static final int NUM_THREADS = 100;
    private static final CountDownLatch startLatch = new CountDownLatch(1);
    private static final CountDownLatch endLatch = new CountDownLatch(NUM_THREADS);
    @Test
    public void simpleSingletonTest() {
        // Get the first instance of the Singleton class
        Singleton instance1 = Singleton.getInstance();
        // Get the second instance of the Singleton class
        Singleton instance2 = Singleton.getInstance();

        // Check that the two instances are the same
        assertSame(instance1, instance2);
    }

    @Test
    public void multithreadedSingletonTest() throws InterruptedException {
        // Create an array to store the Singleton instances
        Singleton[] instances = new Singleton[NUM_THREADS];

        // Create a thread for each instance
        for (int i = 0; i < NUM_THREADS; i++) {
            int finalI = i;
            Thread thread = new Thread(() -> {
                try {
                    startLatch.await();
                    instances[finalI] = Singleton.getInstance();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    endLatch.countDown();
                }
            });
            thread.start();
        }

        startLatch.countDown();
        endLatch.await();

        // Check that all the instances are the same
        Singleton instance = instances[0];
        for (int i = 1; i < NUM_THREADS; i++) {
            assertSame(instance, instances[i]);
        }
    }
}

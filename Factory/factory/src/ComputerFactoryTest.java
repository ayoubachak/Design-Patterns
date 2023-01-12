import org.junit.Test;
import static org.junit.Assert.*;

public class ComputerFactoryTest {
    @Test
    public void testGetComputer() {
        Computer pc = ComputerFactory.getComputer("PC", "2 GB", "500 GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("Server", "16 GB", "1 TB", "2.9 GHz");

        assertEquals("RAM= 2 GB, HDD=500 GB, CPU=2.4 GHz", pc.toString());
        assertEquals("RAM= 16 GB, HDD=1 TB, CPU=2.9 GHz", server.toString());
    }
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("ComputerFactoryTest");
    }
}

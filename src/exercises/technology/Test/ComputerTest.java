package exercises.technology.Test;

import exercises.technology.Computer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComputerTest {

    Computer test_computer;

    @Before
    public void createComputerObject () {
        test_computer = new Computer("Windows 10");
    }

    @Test
    public void emptyTest() {
        assertEquals(10, 10);
    }

    @Test
    public void operatingSystemIsCorrect() {
        assertEquals("Windows 10", test_computer.getOperatingSystem());
    }

    @Test
    public void updatedSetCorrectly() {
        assertFalse(test_computer.isUpdated());
    }

    @Test
    public void defragWorks() {
        test_computer.defrag();
        assertTrue(test_computer.isDefragmented());
    }
}

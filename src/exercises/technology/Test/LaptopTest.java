package exercises.technology.Test;

import exercises.technology.Laptop;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LaptopTest {

    Laptop test_laptop;

    @Before
    public void createLaptopObject() {
        test_laptop = new Laptop("Windows 10", false);
    }

    @Test
    public void emptyTest() {
        assertEquals(10, 10);
    }

    @Test
    public void operatingSystemCorrect() {
        assertEquals("Windows 10", test_laptop.getOperatingSystem());
    }

    @Test
    public void notDefragmented() {
        assertFalse(test_laptop.isDefragmented());
    }

    @Test
    public void plugInWorks() {
        test_laptop.plugIn();
        assertTrue(test_laptop.isCharged());
    }

    @Test
    public void defragWorksForLaptop() {
        test_laptop.defrag();
        assertTrue(test_laptop.isDefragmented());
    }
}

package exercises.technology.Test;


import exercises.technology.SmartPhone;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SmartPhoneTest {

    SmartPhone test_smartPhone;

    @Before
    public void createSmartPhoneObject() {
        test_smartPhone = new SmartPhone("iOS", false);
    }

    @Test
    public void emptyTest() {
        assertEquals(10, 10);
    }

    @Test
    public void operatingSystemIsRight() {
        assertEquals("iOS", test_smartPhone.getOperatingSystem());
    }

    @Test
    public void caseCorrect() {
        assertFalse(test_smartPhone.isHasCase());
    }

    @Test
    public void addingCaseWorks() {
        test_smartPhone.addCase();
        assertTrue(test_smartPhone.isHasCase());
    }

    @Test
    public void updateWorksOnSmartPhone() {
        test_smartPhone.update();
        assertTrue(test_smartPhone.isUpdated());
    }
}

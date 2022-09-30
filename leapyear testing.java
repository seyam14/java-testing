import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class  leapYear {
    @Test
    public void TestcheckLeapYear() {
        LeapYear leapYear = new LeapYear();
        boolean rslt = leapYear.checkLeapYear(2001);
        assertEquals(false, rslt);
    }


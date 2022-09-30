import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class sum {
    @Test
    public void Testcalculatesum() {
        Sum sum = new Sum();
        double rslts = sum.calculatesum(4.00, 12.00);
        assertEquals(2.40, rslts, 2);
    }

}
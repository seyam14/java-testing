import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class  prime {
    @Test
    public void TestcheckForPrime() {
        PrimeNumberProgram primeNumberProgram = new PrimeNumberProgram();
        boolean results = primeNumberProgram.checkForPrime(7);
        assertEquals(true, results);
    }

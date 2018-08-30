package warmup1test;

import org.junit.Test;
import warmup1.Imp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Warmup1Test {



    @Test
    public void testSleepIn() {
        Imp testImp = new Imp();
        assertTrue(testImp.sleepIn(false, false));

    }
}

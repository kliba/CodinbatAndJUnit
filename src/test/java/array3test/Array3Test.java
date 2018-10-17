package array3test;

import array3.Array3;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class Array3Test {

    Array3 testArray3 = new Array3();
    //******https://codingbat.com/java/Array-3******first column

    //maxSpan
    @Test
    public void testMaxSpan() {
        int[] firstMaxSpan = {1, 2, 1, 1, 3};
        int[] secondMaxSpan = {1, 4, 2, 1, 4, 1, 4};
        int[] thirdMaxSpan = {1, 4, 2, 1, 4, 4, 4};
        int[] fourthMaxSpan = {3, 3, 3};
        int[] fifthMaxSpan = {3, 9, 3};
        int[] sixthMaxSpan = {3, 9, 9};
        int[] seventhMaxSpan = {3, 9};
        int[] eighthMaxSpan = {3, 3};
        int[] ninthMaxSpan = {};
        int[] tenthMaxSpan = {1};
        assertEquals(4, testArray3.maxSpan(firstMaxSpan));
        assertEquals(6, testArray3.maxSpan(secondMaxSpan));
        assertEquals(6, testArray3.maxSpan(thirdMaxSpan));
        assertEquals(3, testArray3.maxSpan(fourthMaxSpan));
        assertEquals(3, testArray3.maxSpan(fifthMaxSpan));
        assertEquals(2, testArray3.maxSpan(sixthMaxSpan));
        assertEquals(1, testArray3.maxSpan(seventhMaxSpan));
        assertEquals(2, testArray3.maxSpan(eighthMaxSpan));
        assertEquals(0, testArray3.maxSpan(ninthMaxSpan));
        assertEquals(1, testArray3.maxSpan(tenthMaxSpan));
    }
}

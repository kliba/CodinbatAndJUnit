package string3test;

import org.junit.Test;
import string3.String3;

import static org.junit.Assert.assertEquals;

public class String3Test {

    String3 testString3 = new String3();

    //******https://codingbat.com/java/String-3******first column

    //countYZ
    @Test
    public void testCountYZ() {
        assertEquals(2, testString3.countYZ("fez day"));
        assertEquals(2, testString3.countYZ("day fez"));
        assertEquals(2, testString3.countYZ("day fyyyz"));
        assertEquals(1, testString3.countYZ("day yak"));
        assertEquals(1, testString3.countYZ("day:yak"));
        assertEquals(2, testString3.countYZ("!!day--yaz!!"));
        assertEquals(0, testString3.countYZ("yak zak"));
        assertEquals(2, testString3.countYZ("DAY abc XYZ"));
        assertEquals(3, testString3.countYZ("aaz yyz my"));
        assertEquals(2, testString3.countYZ("y2bz"));
        assertEquals(0, testString3.countYZ("zxyx"));

    }
}

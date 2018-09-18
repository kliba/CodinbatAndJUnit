package string2test;

import org.junit.Test;
import string2.String2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class String2Test {

    String2 testString2 = new String2();

    //******https://codingbat.com/java/String-1******first column

    //doubleChar
    @Test
    public void testDoubleChar() {
        assertEquals("TThhee", testString2.doubleChar("The"));
        assertEquals("AAAAbbbb", testString2.doubleChar("AAbb"));
        assertEquals("HHii--TThheerree", testString2.doubleChar("Hi-There"));
        assertEquals("WWoorrdd!!", testString2.doubleChar("Word!"));
        assertEquals("!!!!", testString2.doubleChar("!!"));
        assertEquals("", testString2.doubleChar(""));
        assertEquals("aa", testString2.doubleChar("a"));
        assertEquals("..", testString2.doubleChar("."));
        assertEquals("aaaa", testString2.doubleChar("aa"));
    }

    //countCode
    @Test
    public void testCountCode() {
        assertEquals(1, testString2.countCode("aaacodebbb"));
        assertEquals(2, testString2.countCode("codexxcode"));
        assertEquals(2, testString2.countCode("cozexxcope"));
        assertEquals(1, testString2.countCode("cozfxxcope"));
        assertEquals(1, testString2.countCode("xxcozeyycop"));
        assertEquals(0, testString2.countCode("cozcop"));
        assertEquals(0, testString2.countCode("abcxyz"));
        assertEquals(1, testString2.countCode("code"));
        assertEquals(0, testString2.countCode("ode"));
        assertEquals(0, testString2.countCode("c"));
        assertEquals(0, testString2.countCode(""));
        assertEquals(3, testString2.countCode("AAcodeBBcoleCCccoreDD"));
        assertEquals(2, testString2.countCode("AAcodeBBcoleCCccorfDD"));
        assertEquals(3, testString2.countCode("coAcodeBcoleccoreDD"));
    }

    //bobThere
    @Test
    public void testBobThere() {
        assertTrue(testString2.bobThere("abcbob"));
        assertTrue(testString2.bobThere("b9b"));
        assertFalse(testString2.bobThere("bac"));
        assertTrue(testString2.bobThere("bbb"));
        assertFalse(testString2.bobThere("abcdefb"));
        assertTrue(testString2.bobThere("123abcbcdbabxyz"));
        assertFalse(testString2.bobThere("b12"));
        assertTrue(testString2.bobThere("b1b"));
        assertTrue(testString2.bobThere("b12b1b"));
        assertFalse(testString2.bobThere("bbc"));
        assertTrue(testString2.bobThere("bbb"));
        assertFalse(testString2.bobThere("bb"));
        assertFalse(testString2.bobThere("b"));
    }

    //repeatEnd
    @Test
    public void testRepeatEnd() {
        assertEquals("llollollo", testString2.repeatEnd("Hello", 3));
        assertEquals("lolo", testString2.repeatEnd("Hello", 2));
        assertEquals("o", testString2.repeatEnd("Hello", 1));
        assertEquals("", testString2.repeatEnd("Hello", 0));
        assertEquals("abcabcabc", testString2.repeatEnd("abc", 3));
        assertEquals("3434", testString2.repeatEnd("1234", 2));
        assertEquals("234234234", testString2.repeatEnd("1234", 3));
        assertEquals("", testString2.repeatEnd("", 0));
    }

    //prefixAgain
    @Test
    public void testPrefixAgain() {
        assertTrue(testString2.prefixAgain("abXYabc", 1));
        assertTrue(testString2.prefixAgain("abXYabc", 2));
        assertFalse(testString2.prefixAgain("abXYabc", 3));
        assertTrue(testString2.prefixAgain("xyzxyxyxy", 2));
        assertFalse(testString2.prefixAgain("xyzxyxyxy", 3));
        assertTrue(testString2.prefixAgain("Hi12345Hi6789Hi10", 1));
        assertTrue(testString2.prefixAgain("Hi12345Hi6789Hi10", 2));
        assertTrue(testString2.prefixAgain("Hi12345Hi6789Hi10", 3));
        assertFalse(testString2.prefixAgain("Hi12345Hi6789Hi10", 4));
        assertFalse(testString2.prefixAgain("a", 1));
        assertTrue(testString2.prefixAgain("aa", 1));
        assertFalse(testString2.prefixAgain("ab", 1));
    }

    //sameStarChar
    @Test
    public void testSameStarChar() {
        assertTrue(testString2.sameStarChar("xy*yzz"));
        assertFalse(testString2.sameStarChar("xy*zzz"));
        assertTrue(testString2.sameStarChar("*xa*az"));
        assertFalse(testString2.sameStarChar("*xa*bz"));
        assertTrue(testString2.sameStarChar("*xa*a*"));
        assertTrue(testString2.sameStarChar(""));
        assertTrue(testString2.sameStarChar("*xa*a*a"));
        assertFalse(testString2.sameStarChar("*xa*a*b"));
        assertTrue(testString2.sameStarChar("*12*2*2"));
        assertFalse(testString2.sameStarChar("12*2*3*"));
        assertTrue(testString2.sameStarChar("abcDEF"));
        assertFalse(testString2.sameStarChar("XY*YYYY*Z*"));
        assertTrue(testString2.sameStarChar("XY*YYYY*Y*"));
        assertFalse(testString2.sameStarChar("12*2*3*"));
        assertTrue(testString2.sameStarChar("*"));
        assertTrue(testString2.sameStarChar("**"));
    }

    //starOut
    @Test
    public void testStarOut() {
        assertEquals("ad", testString2.starOut("ab*cd"));
        assertEquals("ad", testString2.starOut("ab**cd"));
        assertEquals("silly", testString2.starOut("sm*eilly"));
        assertEquals("siy", testString2.starOut("sm*eil*ly"));
        assertEquals("siy", testString2.starOut("sm**eil*ly"));
        assertEquals("siy", testString2.starOut("sm***eil*ly"));
        assertEquals("string", testString2.starOut("stringy*"));
        assertEquals("tringy", testString2.starOut("*stringy"));
        assertEquals("ty", testString2.starOut("*str*in*gy"));
        assertEquals("abc", testString2.starOut("abc"));
        assertEquals("c", testString2.starOut("a*bc"));
        assertEquals("ab", testString2.starOut("ab"));
        assertEquals("", testString2.starOut("a*b"));
        assertEquals("a", testString2.starOut("a"));
        assertEquals("", testString2.starOut("a*"));
        assertEquals("", testString2.starOut("*a"));
        assertEquals("", testString2.starOut("*"));
        assertEquals("", testString2.starOut(""));
    }

    //******https://codingbat.com/java/String-1******second column

    //countHi
    @Test
    public void testCountHi() {
        assertEquals(1, testString2.countHi("abc hi ho"));
        assertEquals(2, testString2.countHi("ABChi hi"));
        assertEquals(2, testString2.countHi("hihi"));
        assertEquals(2, testString2.countHi("hiHIhi"));
        assertEquals(0, testString2.countHi(""));
        assertEquals(0, testString2.countHi("h"));
        assertEquals(1, testString2.countHi("hi"));
        assertEquals(0, testString2.countHi("Hi is no HI on ahI"));
        assertEquals(2, testString2.countHi("hiho not HOHIhi"));
    }

    //endOther
    @Test
    public void testEndOther() {
        assertTrue(testString2.endOther("Hiabc", "abc"));
        assertTrue(testString2.endOther("AbC", "HiaBc"));
        assertTrue(testString2.endOther("abc", "abXabc"));
        assertFalse(testString2.endOther("Hiabc", "abcd"));
        assertTrue(testString2.endOther("Hiabc", "bc"));
        assertFalse(testString2.endOther("Hiabcx", "bc"));
        assertTrue(testString2.endOther("abc", "abc"));
        assertTrue(testString2.endOther("xyz", "12xyz"));
        assertFalse(testString2.endOther("yz", "12xz"));
        assertTrue(testString2.endOther("Z", "12xz"));
        assertTrue(testString2.endOther("12", "12"));
        assertFalse(testString2.endOther("abcXYZ", "abcDEF"));
        assertFalse(testString2.endOther("ab", "ab12"));
        assertTrue(testString2.endOther("ab", "12ab"));
    }
}

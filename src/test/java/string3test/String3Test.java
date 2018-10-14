package string3test;

import org.junit.Test;
import string3.String3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    //gHappy
    @Test
    public void testGHappy() {
        assertTrue(testString3.gHappy("xxggxx"));
        assertFalse(testString3.gHappy("xxgxx"));
        assertFalse(testString3.gHappy("xxggyygxx"));
        assertFalse(testString3.gHappy("g"));
        assertTrue(testString3.gHappy("gg"));
        assertTrue(testString3.gHappy(""));
        assertTrue(testString3.gHappy("xxgggxyz"));
        assertFalse(testString3.gHappy("xxgggxyg"));
        assertTrue(testString3.gHappy("xxgggxygg"));
        assertFalse(testString3.gHappy("mgm"));
        assertTrue(testString3.gHappy("mggm"));
        assertTrue(testString3.gHappy("yyygggxyy"));
    }

    //sameEnds
    @Test
    public void testSameEnds() {
        assertEquals("ab", testString3.sameEnds("abXYab"));
        assertEquals("x", testString3.sameEnds("xx"));
        assertEquals("x", testString3.sameEnds("xxx"));
        assertEquals("xx", testString3.sameEnds("xxxx"));
        assertEquals("java", testString3.sameEnds("javaXYZjava"));
        assertEquals("java", testString3.sameEnds("javajava"));
        assertEquals("", testString3.sameEnds("xavaXYZjava"));
        assertEquals("Hello!", testString3.sameEnds("Hello! and Hello!"));
        assertEquals("", testString3.sameEnds("x"));
        assertEquals("", testString3.sameEnds(""));
        assertEquals("", testString3.sameEnds("abcb"));
        assertEquals("my", testString3.sameEnds("mymmy"));
    }

    //sumNumbers
    @Test
    public void testSumNumbers() {
        assertEquals(123, testString3.sumNumbers("abc123xyz"));
        assertEquals(44, testString3.sumNumbers("aa11b33"));
        assertEquals(18, testString3.sumNumbers("7 11"));
        assertEquals(0, testString3.sumNumbers("Chocolate"));
        assertEquals(7, testString3.sumNumbers("5hoco1a1e"));
        assertEquals(7, testString3.sumNumbers("5$$1;;1!!"));
        assertEquals(1245, testString3.sumNumbers("a1234bb11"));
        assertEquals(0, testString3.sumNumbers(""));
        assertEquals(25, testString3.sumNumbers("a22bbb3"));
    }

    //******https://codingbat.com/java/String-3******second column

    //withoutString
    @Test
    public void testWithoutString() {
        assertEquals("He there", testString3.withoutString("Hello there", "llo"));
        assertEquals("Hllo thr", testString3.withoutString("Hello there", "e"));
        assertEquals("Hello there", testString3.withoutString("Hello there", "x"));
        assertEquals("Th  a FH", testString3.withoutString("This is a FISH", "IS"));
        assertEquals("TH  a FH", testString3.withoutString("THIS is a FISH", "is"));
        assertEquals("TH  a FH", testString3.withoutString("THIS is a FISH", "iS"));
        assertEquals("abab", testString3.withoutString("abxxxxab", "xx"));
        assertEquals("abxab", testString3.withoutString("abxxxab", "xx"));
        assertEquals("abab", testString3.withoutString("abxxxab", "x"));
        assertEquals("", testString3.withoutString("xxx", "x"));
        assertEquals("x", testString3.withoutString("xxx", "xx"));
        assertEquals("xzz", testString3.withoutString("xyzzy", "Y"));
        assertEquals("", testString3.withoutString("", "x"));
        assertEquals("acac", testString3.withoutString("abcabc", "b"));
        assertEquals("AAbb", testString3.withoutString("AA22bb", "2"));
        assertEquals("", testString3.withoutString("1111", "1"));
        assertEquals("", testString3.withoutString("1111", "11"));
        assertEquals("jtx", testString3.withoutString("MkjtMkx", "Mk"));
        assertEquals("Hi ", testString3.withoutString("Hi HoHo", "Ho"));
    }

    //countTriple
    @Test
    public void testCountTriple() {
        assertEquals(1, testString3.countTriple("abcXXXabc"));
        assertEquals(3, testString3.countTriple("xxxabyyyycd"));
        assertEquals(0, testString3.countTriple("a"));
        assertEquals(0, testString3.countTriple(""));
        assertEquals(1, testString3.countTriple("XXXabc"));
        assertEquals(2, testString3.countTriple("XXXXabc"));
        assertEquals(3, testString3.countTriple("XXXXXabc"));
        assertEquals(3, testString3.countTriple("222abyyycdXXX"));
        assertEquals(4, testString3.countTriple("abYYYabXXXXXab"));
        assertEquals(0, testString3.countTriple("abYYXabXXYXXab"));
        assertEquals(0, testString3.countTriple("abYYXabXXYXXab"));
        assertEquals(1, testString3.countTriple("122abhhh2"));
    }

    //mirrorEnds
    @Test
    public void testMirrorEnds() {
        assertEquals("ab", testString3.mirrorEnds("abXYZba"));
        assertEquals("a", testString3.mirrorEnds("abca"));
        assertEquals("aba", testString3.mirrorEnds("aba"));
        assertEquals("", testString3.mirrorEnds("abab"));
        assertEquals("xxx", testString3.mirrorEnds("xxx"));
        assertEquals("xxYxx", testString3.mirrorEnds("xxYxx"));
        assertEquals("Hi ", testString3.mirrorEnds("Hi and iH"));
        assertEquals("x", testString3.mirrorEnds("x"));
        assertEquals("", testString3.mirrorEnds(""));
        assertEquals("123", testString3.mirrorEnds("123and then 321"));
        assertEquals("ba", testString3.mirrorEnds("band andab"));
    }

    //notReplace
    @Test
    public void testNotReplace() {
        assertEquals("is not test", testString3.notReplace("is test"));
        assertEquals("is not-is not", testString3.notReplace("is-is"));
        assertEquals("This is not right", testString3.notReplace("This is right"));
        assertEquals("This is not isabell", testString3.notReplace("This is isabell"));
        assertEquals("", testString3.notReplace(""));
        assertEquals("is not", testString3.notReplace("is"));
        assertEquals("isis", testString3.notReplace("isis"));
        assertEquals("Dis is not bliss is not", testString3.notReplace("Dis is bliss is"));
        assertEquals("is not his", testString3.notReplace("is his"));
        assertEquals("xis yis", testString3.notReplace("xis yis"));
        assertEquals("AAAis is not", testString3.notReplace("AAAis is"));
    }

    //******https://codingbat.com/java/String-3******third column

    //equalIsNot
    @Test
    public void testEqualIsNot() {
        assertFalse(testString3.equalIsNot("This is not"));
        assertTrue(testString3.equalIsNot("This is notnot"));
        assertTrue(testString3.equalIsNot("noisxxnotyynotxisi"));
        assertFalse(testString3.equalIsNot("noisxxnotyynotxsi"));
        assertTrue(testString3.equalIsNot("xxxyyyzzzintint"));
        assertTrue(testString3.equalIsNot(""));
        assertTrue(testString3.equalIsNot("isisnotnot"));
        assertFalse(testString3.equalIsNot("isisnotno7Not"));
        assertFalse(testString3.equalIsNot("isnotis"));
        assertFalse(testString3.equalIsNot("mis3notpotbotis"));
    }

    //sumDigits
    @Test
    public void testSumDigits() {
        assertEquals(6, testString3.sumDigits("aa1bc2d3"));
        assertEquals(8, testString3.sumDigits("aa11b33"));
        assertEquals(0, testString3.sumDigits("Chocolate"));
        assertEquals(7, testString3.sumDigits("5hoco1a1e"));
        assertEquals(12, testString3.sumDigits("123abc123"));
        assertEquals(0, testString3.sumDigits(""));
        assertEquals(0, testString3.sumDigits("Hello"));
        assertEquals(12, testString3.sumDigits("X1z9b2"));
        assertEquals(14, testString3.sumDigits("5432a"));
    }

    //maxBlock
    @Test
    public void testMaxBlock() {
        assertEquals(2, testString3.maxBlock("hoopla"));
        assertEquals(3, testString3.maxBlock("abbCCCddBBBxx"));
        assertEquals(0, testString3.maxBlock(""));
        assertEquals(1, testString3.maxBlock("xyz"));
        assertEquals(2, testString3.maxBlock("xxyz"));
        assertEquals(2, testString3.maxBlock("xyzz"));
        assertEquals(3, testString3.maxBlock("abbbcbbbxbbbx"));
        assertEquals(3, testString3.maxBlock("XXBBBbbxx"));
        assertEquals(4, testString3.maxBlock("XXBBBBbbxx"));
        assertEquals(4, testString3.maxBlock("XXBBBbbxxXXXX"));
        assertEquals(4, testString3.maxBlock("XX2222BBBbbXX2222"));
    }
}

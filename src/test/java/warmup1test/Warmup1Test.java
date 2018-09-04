package warmup1test;

import org.junit.Test;
import warmup1.Imp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Warmup1Test {

    Imp testImp = new Imp();

    //******https://codingbat.com/java/Warmup-1******first column


    @Test
    public void testSleepIn() {
        assertTrue(testImp.sleepIn(false, false));
        assertFalse(testImp.sleepIn(true, false));
        assertTrue(testImp.sleepIn(false, true));
        assertTrue(testImp.sleepIn(true, true));
    }

    @Test
    public void testDiff21() {
        assertEquals(2, testImp.diff21(19));
        assertEquals(11, testImp.diff21(10));
        assertEquals(0, testImp.diff21(21));
        assertEquals(2, testImp.diff21(22));
        assertEquals(8, testImp.diff21(25));
        assertEquals(18, testImp.diff21(30));
        assertEquals(21, testImp.diff21(0));
        assertEquals(20, testImp.diff21(1));
        assertEquals(19, testImp.diff21(2));
        assertEquals(22, testImp.diff21(-1));
        assertEquals(23, testImp.diff21(-2));
        assertEquals(58, testImp.diff21(50));
    }

    @Test
    public void testNearHundred() {
        assertTrue(testImp.nearHundred(93));
        assertTrue(testImp.nearHundred(90));
        assertFalse(testImp.nearHundred(89));
        assertTrue(testImp.nearHundred(110));
        assertFalse(testImp.nearHundred(111));
        assertFalse(testImp.nearHundred(121));
        assertFalse(testImp.nearHundred(-101));
        assertFalse(testImp.nearHundred(-209));
        assertTrue(testImp.nearHundred(190));
        assertTrue(testImp.nearHundred(209));
        assertFalse(testImp.nearHundred(0));
        assertFalse(testImp.nearHundred(5));
        assertFalse(testImp.nearHundred(-50));
        assertTrue(testImp.nearHundred(191));
        assertFalse(testImp.nearHundred(189));
        assertTrue(testImp.nearHundred(200));
        assertTrue(testImp.nearHundred(210));
        assertFalse(testImp.nearHundred(211));
        assertFalse(testImp.nearHundred(290));
    }

    @Test
    public void testMissingChar() {
        assertEquals("ktten", testImp.missingChar("kitten", 1));
        assertEquals("itten", testImp.missingChar("kitten", 0));
        assertEquals("kittn", testImp.missingChar("kitten", 4));
        assertEquals("i", testImp.missingChar("Hi", 0));
        assertEquals("H", testImp.missingChar("Hi", 1));
        assertEquals("ode", testImp.missingChar("code", 0));
        assertEquals("cde", testImp.missingChar("code", 1));
        assertEquals("coe", testImp.missingChar("code", 2));
        assertEquals("cod", testImp.missingChar("code", 3));
        assertEquals("chocolat", testImp.missingChar("chocolate", 8));
    }

    @Test
    public void testBackAround() {
        assertEquals("tcatt", testImp.backAround("cat"));
        assertEquals("oHelloo", testImp.backAround("Hello"));
        assertEquals("aaa", testImp.backAround("a"));
        assertEquals("cabcc", testImp.backAround("abc"));
        assertEquals("dreadd", testImp.backAround("read"));
        assertEquals("obooo", testImp.backAround("boo"));
    }

    @Test
    public void testStartHi() {
        assertTrue(testImp.startHi("hi there"));
        assertTrue(testImp.startHi("hi"));
        assertFalse(testImp.startHi("hello hi"));
        assertFalse(testImp.startHi("he"));
        assertFalse(testImp.startHi("h"));
        assertFalse(testImp.startHi(""));
        assertFalse(testImp.startHi("ho hi"));
        assertTrue(testImp.startHi("hi ho"));
    }

    @Test
    public void testHasTeen() {
        assertTrue(testImp.hasTeen(13, 20, 10));
        assertTrue(testImp.hasTeen(20, 19, 10));
        assertTrue(testImp.hasTeen(20, 10, 13));
        assertFalse(testImp.hasTeen(1, 20, 12));
        assertTrue(testImp.hasTeen(19, 20, 12));
        assertTrue(testImp.hasTeen(12, 20, 19));
        assertFalse(testImp.hasTeen(12, 9, 20));
        assertTrue(testImp.hasTeen(12, 18, 20));
        assertTrue(testImp.hasTeen(14, 2, 20));
        assertFalse(testImp.hasTeen(4, 2, 20));
        assertFalse(testImp.hasTeen(11, 22, 22));
    }

    @Test
    public void testMixStart() {
        assertTrue(testImp.mixStart("mix snacks"));
        assertTrue(testImp.mixStart("pix snacks"));
        assertFalse(testImp.mixStart("piz snacks"));
        assertTrue(testImp.mixStart("nix"));
        assertFalse(testImp.mixStart("ni"));
        assertFalse(testImp.mixStart("n"));
        assertFalse(testImp.mixStart(""));
    }

    @Test
    public void testClose10() {
        assertEquals(8, testImp.close10(8, 13));
        assertEquals(8, testImp.close10(13, 8));
        assertEquals(0, testImp.close10(13, 7));
        assertEquals(0, testImp.close10(7, 13));
        assertEquals(9, testImp.close10(9, 13));
        assertEquals(8, testImp.close10(13, 8));
        assertEquals(10, testImp.close10(10, 12));
        assertEquals(10, testImp.close10(11, 10));
        assertEquals(5, testImp.close10(5, 21));
        assertEquals(0, testImp.close10(0, 20));
        assertEquals(0, testImp.close10(10, 10));
    }

    @Test
    public void testStringE() {
        assertTrue(testImp.stringE("Hello"));
        assertTrue(testImp.stringE("Heelle"));
        assertFalse(testImp.stringE("Heelele"));
        assertFalse(testImp.stringE("Hll"));
        assertTrue(testImp.stringE("e"));
        assertFalse(testImp.stringE(""));
    }

    @Test
    public void testEveryNth() {
        assertEquals("Mrce", testImp.everyNth("Miracle", 2));
        assertEquals("aceg", testImp.everyNth("abcdefg", 2));
        assertEquals("adg", testImp.everyNth("abcdefg", 3));
        assertEquals("Cca", testImp.everyNth("Chocolate", 3));
        assertEquals("Ccas", testImp.everyNth("Chocolates", 3));
        assertEquals("Coe", testImp.everyNth("Chocolates", 4));
        assertEquals("C", testImp.everyNth("Chocolates", 100));
    }


    //******https://codingbat.com/java/Warmup-1******second column

    @Test
    public void testMonkeyTrouble() {
        assertTrue(testImp.monkeyTrouble(true, true));
        assertTrue(testImp.monkeyTrouble(false, false));
        assertFalse(testImp.monkeyTrouble(true, false));
        assertFalse(testImp.monkeyTrouble(false, true));
    }

    @Test
    public void testParrotTrouble() {
        assertTrue(testImp.parrotTrouble(true, 6));
        assertFalse(testImp.parrotTrouble(true, 7));
        assertFalse(testImp.parrotTrouble(false, 6));
        assertTrue(testImp.parrotTrouble(true, 21));
        assertFalse(testImp.parrotTrouble(false, 21));
        assertFalse(testImp.parrotTrouble(false, 20));
        assertTrue(testImp.parrotTrouble(true, 23));
        assertFalse(testImp.parrotTrouble(false, 23));
        assertFalse(testImp.parrotTrouble(true, 20));
        assertFalse(testImp.parrotTrouble(false, 12));
    }

    @Test
    public void testPosNeg() {
        assertTrue(testImp.posNeg(1, -1, false));
        assertTrue(testImp.posNeg(-1, 1, false));
        assertTrue(testImp.posNeg(-4, -5, true));
        assertFalse(testImp.posNeg(-4, -5, false));
        assertTrue(testImp.posNeg(-4, 5, false));
        assertFalse(testImp.posNeg(-4, 5, true));
        assertFalse(testImp.posNeg(1, 1, false));
        assertFalse(testImp.posNeg(-1, -1, false));
        assertFalse(testImp.posNeg(1, -1, true));
        assertFalse(testImp.posNeg(-1, 1, true));
        assertFalse(testImp.posNeg(1, 1, true));
        assertTrue(testImp.posNeg(-1, -1, true));
        assertTrue(testImp.posNeg(5, -5, false));
        assertTrue(testImp.posNeg(-6, 6, false));
        assertFalse(testImp.posNeg(-5, -6, false));
        assertFalse(testImp.posNeg(-2, -1, false));
        assertFalse(testImp.posNeg(1, 2, false));
        assertFalse(testImp.posNeg(-5, 6, true));
        assertTrue(testImp.posNeg(-5, -5, true));
    }

    @Test
    public void testFrontBack() {
        assertEquals("code", testImp.frontBack("eodc"));
        assertEquals("a", testImp.frontBack("a"));
        assertEquals("ab", testImp.frontBack("ba"));
        assertEquals("abc", testImp.frontBack("cba"));
        assertEquals("", testImp.frontBack(""));
        assertEquals("Chocolate", testImp.frontBack("ehocolatC"));
        assertEquals("aavJ", testImp.frontBack("Java"));
        assertEquals("hello", testImp.frontBack("oellh"));
    }

    @Test
    public void testOr35() {
        assertTrue(testImp.or35(3));
        assertTrue(testImp.or35(10));
        assertFalse(testImp.or35(8));
        assertTrue(testImp.or35(15));
        assertTrue(testImp.or35(5));
        assertTrue(testImp.or35(9));
        assertFalse(testImp.or35(4));
        assertFalse(testImp.or35(7));
        assertTrue(testImp.or35(6));
        assertFalse(testImp.or35(17));
        assertTrue(testImp.or35(18));
        assertFalse(testImp.or35(29));
        assertTrue(testImp.or35(20));
        assertTrue(testImp.or35(21));
        assertFalse(testImp.or35(22));
        assertTrue(testImp.or35(45));
        assertTrue(testImp.or35(99));
        assertTrue(testImp.or35(100));
        assertFalse(testImp.or35(101));
        assertFalse(testImp.or35(121));
        assertFalse(testImp.or35(122));
        assertTrue(testImp.or35(123));
    }

    @Test
    public void testIcyHot() {
        assertTrue(testImp.icyHot(120, -1));
        assertTrue(testImp.icyHot(-1, 120));
        assertFalse(testImp.icyHot(2, 120));
        assertFalse(testImp.icyHot(-1, 100));
        assertFalse(testImp.icyHot(-2, -2));
        assertFalse(testImp.icyHot(120, 120));
    }

    @Test
    public void testLoneTeen() {
        assertTrue(testImp.loneTeen(13, 99));
        assertTrue(testImp.loneTeen(21, 19));
        assertFalse(testImp.loneTeen(13, 13));
        assertTrue(testImp.loneTeen(14, 20));
        assertTrue(testImp.loneTeen(20, 15));
        assertFalse(testImp.loneTeen(16, 17));
        assertTrue(testImp.loneTeen(16, 9));
        assertFalse(testImp.loneTeen(16, 18));
        assertFalse(testImp.loneTeen(13, 19));
        assertTrue(testImp.loneTeen(13, 20));
        assertTrue(testImp.loneTeen(6, 18));
        assertTrue(testImp.loneTeen(99, 13));
        assertFalse(testImp.loneTeen(99, 99));
    }

    @Test
    public void testStartOz() {
        assertEquals("oz", testImp.startOz("ozymandias"));
        assertEquals("z", testImp.startOz("bzoo"));
        assertEquals("o", testImp.startOz("oxx"));
        assertEquals("oz", testImp.startOz("oz"));
        assertEquals("o", testImp.startOz("ounce"));
        assertEquals("o", testImp.startOz("o"));
        assertEquals("", testImp.startOz("abc"));
        assertEquals("", testImp.startOz(""));
        assertEquals("", testImp.startOz("zoo"));
        assertEquals("z", testImp.startOz("aztec"));
        assertEquals("z", testImp.startOz("zzzz"));
        assertEquals("oz", testImp.startOz("oznic"));
    }

    @Test
    public void testIn3050() {
        assertTrue(testImp.in3050(30, 31));
        assertFalse(testImp.in3050(30, 41));
        assertTrue(testImp.in3050(40, 50));
        assertFalse(testImp.in3050(40, 51));
        assertFalse(testImp.in3050(39, 50));
        assertFalse(testImp.in3050(50, 39));
        assertTrue(testImp.in3050(40, 39));
        assertTrue(testImp.in3050(49, 48));
        assertTrue(testImp.in3050(50, 40));
        assertFalse(testImp.in3050(50, 51));
        assertTrue(testImp.in3050(35, 36));
        assertFalse(testImp.in3050(35, 45));
    }

    @Test
    public void testLastDigit() {
        assertTrue(testImp.lastDigit(7, 17));
        assertFalse(testImp.lastDigit(6, 17));
        assertTrue(testImp.lastDigit(3, 113));
        assertFalse(testImp.lastDigit(114, 113));
        assertTrue(testImp.lastDigit(114, 4));
        assertTrue(testImp.lastDigit(10, 0));
        assertFalse(testImp.lastDigit(11, 0));
    }


    //******https://codingbat.com/java/Warmup-1******third column


    @Test
    public void testSumDouble() {
        assertEquals(3, testImp.sumDouble(1, 2));
        assertEquals(5, testImp.sumDouble(3, 2));
        assertEquals(8, testImp.sumDouble(2, 2));
        assertEquals(-1, testImp.sumDouble(-1, 0));
        assertEquals(12, testImp.sumDouble(3, 3));
        assertEquals(0, testImp.sumDouble(0, 0));
        assertEquals(1, testImp.sumDouble(0, 1));
        assertEquals(7, testImp.sumDouble(3, 4));
    }

    @Test
    public void testMakes10() {
        assertTrue(testImp.makes10(9, 10));
        assertFalse(testImp.makes10(9, 9));
        assertTrue(testImp.makes10(1, 9));
        assertTrue(testImp.makes10(10, 1));
        assertTrue(testImp.makes10(10, 10));
        assertTrue(testImp.makes10(8, 2));
        assertFalse(testImp.makes10(8, 3));
        assertTrue(testImp.makes10(10, 42));
        assertTrue(testImp.makes10(12, -2));
    }

    @Test
    public void testNotString() {
        assertEquals("not candy", testImp.notString("candy"));
        assertEquals("not x", testImp.notString("x"));
        assertEquals("not bad", testImp.notString("not bad"));
        assertEquals("not bad", testImp.notString("bad"));
        assertEquals("not", testImp.notString("not"));
        assertEquals("not is not", testImp.notString("is not"));
        assertEquals("not no", testImp.notString("no"));
    }

    @Test
    public void testFront3() {
        assertEquals("JavJavJav", testImp.front3("Java"));
        assertEquals("ChoChoCho", testImp.front3("Chocolate"));
        assertEquals("abcabcabc", testImp.front3("abc"));
        assertEquals("abcabcabc", testImp.front3("abcXYZ"));
        assertEquals("ababab", testImp.front3("ab"));
        assertEquals("aaa", testImp.front3("a"));
        assertEquals("", testImp.front3(""));
    }

    @Test
    public void testFront22() {
        assertEquals("kikittenki", testImp.front22("kitten"));
        assertEquals("HaHaHa", testImp.front22("Ha"));
        assertEquals("ababcab", testImp.front22("abc"));
        assertEquals("ababab", testImp.front22("ab"));
        assertEquals("aaa", testImp.front22("a"));
        assertEquals("", testImp.front22(""));
        assertEquals("LoLogicLo", testImp.front22("Logic"));
    }

    @Test
    public void testIn1020() {
        assertTrue(testImp.in1020(12, 99));
        assertTrue(testImp.in1020(21, 12));
        assertFalse(testImp.in1020(8, 99));
        assertTrue(testImp.in1020(99, 10));
        assertTrue(testImp.in1020(20, 20));
        assertFalse(testImp.in1020(21, 21));
        assertFalse(testImp.in1020(9, 9));
    }

    @Test
    public void testDelDel() {
        assertEquals("abc", testImp.delDel("adelbc"));
        assertEquals("aHello", testImp.delDel("adelHello"));
        assertEquals("adedbc", testImp.delDel("adedbc"));
        assertEquals("abcdel", testImp.delDel("abcdel"));
        assertEquals("add", testImp.delDel("add"));
        assertEquals("ad", testImp.delDel("ad"));
        assertEquals("a", testImp.delDel("a"));
        assertEquals("", testImp.delDel(""));
        assertEquals("del", testImp.delDel("del"));
        assertEquals("a", testImp.delDel("adel"));
        assertEquals("aadelbb", testImp.delDel("aadelbb"));
    }

    @Test
    public void testIntMax() {
        assertEquals(3, testImp.intMax(1, 2, 3));
        assertEquals(3, testImp.intMax(1, 3, 2));
        assertEquals(3, testImp.intMax(3, 2, 1));
        assertEquals(9, testImp.intMax(9, 3, 3));
        assertEquals(9, testImp.intMax(3, 9, 3));
        assertEquals(9, testImp.intMax(3, 3, 9));
        assertEquals(8, testImp.intMax(8, 2, 3));
        assertEquals(-1, testImp.intMax(-3, -1, -2));
        assertEquals(6, testImp.intMax(6, 2, 5));
        assertEquals(6, testImp.intMax(5, 6, 2));
        assertEquals(6, testImp.intMax(5, 2, 6));
    }

    @Test
    public void testMax1020() {
        assertEquals(19, testImp.max1020(11, 19));
        assertEquals(19, testImp.max1020(19, 11));
        assertEquals(11, testImp.max1020(11, 9));
        assertEquals(0, testImp.max1020(9, 21));
        assertEquals(10, testImp.max1020(10, 21));
        assertEquals(10, testImp.max1020(21, 10));
        assertEquals(11, testImp.max1020(9, 11));
        assertEquals(10, testImp.max1020(23, 10));
        assertEquals(20, testImp.max1020(20, 10));
        assertEquals(20, testImp.max1020(7, 20));
        assertEquals(17, testImp.max1020(17, 16));
    }

    @Test
    public void testEndUp() {
        assertEquals("HeLLO", testImp.endUp("Hello"));
        assertEquals("hi thERE", testImp.endUp("hi there"));
        assertEquals("HI", testImp.endUp("hi"));
        assertEquals("woo HOO", testImp.endUp("woo hoo"));
        assertEquals("xyZ12", testImp.endUp("xyz12"));
        assertEquals("X", testImp.endUp("x"));
        assertEquals("", testImp.endUp(""));
    }
}

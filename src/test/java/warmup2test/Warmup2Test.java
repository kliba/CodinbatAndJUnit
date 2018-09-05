package warmup2test;

import org.junit.Test;
import warmup2.Imp2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Warmup2Test {

    Imp2 testImp2 = new Imp2();

    //******https://codingbat.com/java/Warmup-2******first column

    @Test
    public void testStringTimes() {
        assertEquals("HiHi", testImp2.stringTimes("Hi", 2));
        assertEquals("HiHiHi", testImp2.stringTimes("Hi", 3));
        assertEquals("Hi", testImp2.stringTimes("Hi", 1));
        assertEquals("", testImp2.stringTimes("Hi", 0));
        assertEquals("HiHiHiHiHi", testImp2.stringTimes("Hi", 5));
        assertEquals("Oh Boy!Oh Boy!", testImp2.stringTimes("Oh Boy!", 2));
        assertEquals("xxxx", testImp2.stringTimes("x", 4));
        assertEquals("", testImp2.stringTimes("", 4));
        assertEquals("codecode", testImp2.stringTimes("code", 2));
        assertEquals("codecodecode", testImp2.stringTimes("code", 3));
    }

    @Test
    public void testDoubleX() {
        assertTrue(testImp2.doubleX("axxbb"));
        assertFalse(testImp2.doubleX("axaxax"));
        assertTrue(testImp2.doubleX("xxxxx"));
        assertFalse(testImp2.doubleX("xaxxx"));
        assertFalse(testImp2.doubleX("aaaax"));
        assertFalse(testImp2.doubleX(""));
        assertFalse(testImp2.doubleX("abc"));
        assertFalse(testImp2.doubleX("x"));
        assertTrue(testImp2.doubleX("xx"));
        assertFalse(testImp2.doubleX("xax"));
        assertFalse(testImp2.doubleX("xaxx"));
    }

    @Test
    public void testLast2() {
        assertEquals(1 ,testImp2.last2("hixxhi"));
        assertEquals(1 ,testImp2.last2("xaxxaxaxx"));
        assertEquals(2 ,testImp2.last2("axxxaaxx"));
        assertEquals(3 ,testImp2.last2("xxaxxaxxaxx"));
        assertEquals(0 ,testImp2.last2("xaxaxaxx"));
        assertEquals(2 ,testImp2.last2("xxxx"));
        assertEquals(1 ,testImp2.last2("13121312"));
        assertEquals(1 ,testImp2.last2("11212"));
        assertEquals(0 ,testImp2.last2("13121311"));
        assertEquals(2 ,testImp2.last2("1717171"));
        assertEquals(0 ,testImp2.last2("hi"));
        assertEquals(0 ,testImp2.last2("h"));
        assertEquals(0 ,testImp2.last2(""));
    }


    @Test
    public void testArray123() {
        int [] first = {1, 1, 2, 3, 1};
        int [] second = {1, 1, 2, 4, 1};
        int [] third = {1, 1, 2, 1, 2, 3};
        int [] fourth = {1, 1, 2, 1, 2, 1};
        int [] fifth = {1, 2, 3, 1, 2, 3};
        int [] sixth = {1, 2, 3};
        int [] seventh = {1, 1, 1};
        int [] eighth = {1, 2};
        int [] ninth = {1};
        int [] tenth = {};

        assertTrue(testImp2.array123(first));
        assertFalse(testImp2.array123(second));
        assertTrue(testImp2.array123(third));
        assertFalse(testImp2.array123(fourth));
        assertTrue(testImp2.array123(fifth));
        assertTrue(testImp2.array123(sixth));
        assertFalse(testImp2.array123(seventh));
        assertFalse(testImp2.array123(eighth));
        assertFalse(testImp2.array123(ninth));
        assertFalse(testImp2.array123(tenth));
    }

    @Test
    public void testAltPairs() {
        assertEquals("kien", testImp2.altPairs("kitten"));
        assertEquals("Chole", testImp2.altPairs("Chocolate"));
        assertEquals("Congrr", testImp2.altPairs("CodingHorror"));
        assertEquals("ya", testImp2.altPairs("yak"));
        assertEquals("ya", testImp2.altPairs("ya"));
        assertEquals("y", testImp2.altPairs("y"));
        assertEquals("", testImp2.altPairs(""));
        assertEquals("ThThThth", testImp2.altPairs("ThisThatTheOther"));
    }

    @Test
    public void testNoTriples() {
        int[] firstForNoTriples = {1, 1, 2, 2, 1};
        int[] secondForNoTriples = {1, 1, 2, 2, 2, 1};
        int[] thirdForNoTriples = {1, 1, 1, 2, 2, 2, 1};
        int[] fourthForNoTriples = {1, 1, 2, 2, 1, 2, 1};
        int[] fifthForNoTriples = {1, 2, 1};
        int[] sixthForNoTriples = {1, 1, 1};
        int[] seventhForNoTriples = {1, 1};
        int[] eighthForNoTriples = {1};
        int[] ninthForNoTriples = {};

        assertTrue(testImp2.noTriples(firstForNoTriples));
        assertFalse(testImp2.noTriples(secondForNoTriples));
        assertFalse(testImp2.noTriples(thirdForNoTriples));
        assertTrue(testImp2.noTriples(fourthForNoTriples));
        assertTrue(testImp2.noTriples(fifthForNoTriples));
        assertFalse(testImp2.noTriples(sixthForNoTriples));
        assertTrue(testImp2.noTriples(seventhForNoTriples));
        assertTrue(testImp2.noTriples(eighthForNoTriples));
        assertTrue(testImp2.noTriples(ninthForNoTriples));
    }


    //******https://codingbat.com/java/Warmup-2******second column

    @Test
    public void testFrontTimes() {
        assertEquals("ChoCho", testImp2.frontTimes("Chocolate", 2));
        assertEquals("ChoChoCho", testImp2.frontTimes("Chocolate", 3));
        assertEquals("AbcAbcAbc", testImp2.frontTimes("Abc", 3));
        assertEquals("AbAbAbAb", testImp2.frontTimes("Ab", 4));
        assertEquals("AAA", testImp2.frontTimes("A", 3));
        assertEquals("", testImp2.frontTimes("", 4));
        assertEquals("", testImp2.frontTimes("Abc", 0));
    }

    @Test
    public void testStringBits() {
        assertEquals("Hlo", testImp2.stringBits("Hello"));
        assertEquals("H", testImp2.stringBits("Hi"));
        assertEquals("Hello", testImp2.stringBits("Heeololeo"));
        assertEquals("HHH", testImp2.stringBits("HiHiHi"));
        assertEquals("", testImp2.stringBits(""));
        assertEquals("Getns", testImp2.stringBits("Greetings"));
        assertEquals("Coot", testImp2.stringBits("Chocoate"));
        assertEquals("p", testImp2.stringBits("pi"));
        assertEquals("HloKte", testImp2.stringBits("Hello Kitten"));
        assertEquals("happy", testImp2.stringBits("hxaxpxpxy"));
    }

    @Test
    public void testArraayCount9() {
        int[] firstForArrayCount9 = {1, 2, 9};
        int[] secondForArrayCount9 = {1, 9, 9};
        int[] thirdForArrayCount9 = {1, 9, 9, 3, 9};
        int[] fourthForArrayCount9 = {1, 2, 3};
        int[] fifthForArrayCount9 = {};
        int[] sixthForArrayCount9 = {4, 2, 4, 3, 1};
        int[] seventhForArrayCount9 = {9, 2, 4, 3, 1};

        assertEquals(1, testImp2.arrayCount9(firstForArrayCount9));
        assertEquals(2, testImp2.arrayCount9(secondForArrayCount9));
        assertEquals(3, testImp2.arrayCount9(thirdForArrayCount9));
        assertEquals(0, testImp2.arrayCount9(fourthForArrayCount9));
        assertEquals(0, testImp2.arrayCount9(fifthForArrayCount9));
        assertEquals(0, testImp2.arrayCount9(sixthForArrayCount9));
        assertEquals(1, testImp2.arrayCount9(seventhForArrayCount9));
    }

    @Test
    public void testStringMatch() {
        assertEquals(3, testImp2.stringMatch("xxcaazz", "xxbaaz"));
        assertEquals(2, testImp2.stringMatch("abc", "abc"));
        assertEquals(0, testImp2.stringMatch("abc", "axc"));
        assertEquals(1, testImp2.stringMatch("hello", "he"));
        assertEquals(1, testImp2.stringMatch("he", "hello"));
        assertEquals(0, testImp2.stringMatch("h", "hello"));
        assertEquals(0, testImp2.stringMatch("", "hello"));
        assertEquals(1, testImp2.stringMatch("aabbccdd", "abbbxxd"));
        assertEquals(3, testImp2.stringMatch("aaxxaaxx", "iaxxai"));
        assertEquals(3, testImp2.stringMatch("iaxxai", "aaxxaaxx"));
    }

    @Test
    public void testStringYak() {
        assertEquals("pak", testImp2.stringYak("yakpak"));
        assertEquals("pak", testImp2.stringYak("pakyak"));
        assertEquals("123ya", testImp2.stringYak("yak123ya"));
        assertEquals("", testImp2.stringYak("yak"));
        assertEquals("xxx", testImp2.stringYak("yakxxxyak"));
        assertEquals("HiHi", testImp2.stringYak("HiyakHi"));
        assertEquals("xxxyyzzz", testImp2.stringYak("xxxyakyyyakzzz"));
    }

    @Test
    public void testHas271() {
        int [] firstForHas271 = {1, 2, 7, 1};
        int [] secondForHas271 = {1, 2, 8, 1};
        int [] thirdForHas271 = {2, 7, 1};
        int [] fourthForHas271 = {3, 8, 2};
        int [] fifthForHas271 = {2, 7, 3};
        int [] sixthForHas271 = {2, 7, 4};
        int [] seventhForHas271 = {2, 7, -1};
        int [] eihgthForHas271 = {2, 7, -2};
        int [] ninthForHas271 = {4, 5, 3, 8, 0};
        int [] tenthForHas271 = {2, 7, 5, 10, 4};
        int [] eleventhForHas271 = {2, 7, -2, 4, 9, 3};
        int [] twelfthForHas271 = {2, 7, 5, 10, 1};
        int [] thirteenthForHas271 = {2, 7, -2, 4, 10, 2};
        int [] fourteenthForHas271 = {1, 1, 4, 9, 0};
        int [] fifteenthForHas271 = {1, 1, 4, 9, 4, 9, 2};

        assertTrue(testImp2.has271(firstForHas271));
        assertFalse(testImp2.has271(secondForHas271));
        assertTrue(testImp2.has271(thirdForHas271));
        assertTrue(testImp2.has271(fourthForHas271));
        assertTrue(testImp2.has271(fifthForHas271));
        assertFalse(testImp2.has271(sixthForHas271));
        assertTrue(testImp2.has271(seventhForHas271));
        assertFalse(testImp2.has271(eihgthForHas271));
        assertTrue(testImp2.has271(ninthForHas271));
        assertTrue(testImp2.has271(tenthForHas271));
        assertTrue(testImp2.has271(eleventhForHas271));
        assertFalse(testImp2.has271(twelfthForHas271));
        assertFalse(testImp2.has271(thirteenthForHas271));
        assertFalse(testImp2.has271(fourteenthForHas271));
        assertTrue(testImp2.has271(fifteenthForHas271));
    }


    //******https://codingbat.com/java/Warmup-2******third column

    @Test
    public void testCountXX() {
        assertEquals(1, testImp2.countXX("abcxx"));
        assertEquals(2, testImp2.countXX("xxx"));
        assertEquals(3, testImp2.countXX("xxxx"));
        assertEquals(0, testImp2.countXX("abc"));
        assertEquals(0, testImp2.countXX("Hello there"));
        assertEquals(2, testImp2.countXX("Hexxo thxxe"));
        assertEquals(0, testImp2.countXX(""));
        assertEquals(0, testImp2.countXX("Kittens"));
        assertEquals(2, testImp2.countXX("Kittensxxx"));
    }

    @Test
    public void testStringSplosion() {
        assertEquals("CCoCodCode", testImp2.stringSplosion("Code"));
        assertEquals("aababc", testImp2.stringSplosion("abc"));
        assertEquals("aab", testImp2.stringSplosion("ab"));
        assertEquals("x", testImp2.stringSplosion("x"));
        assertEquals("ffafadfade", testImp2.stringSplosion("fade"));
        assertEquals("TThTheTherThere", testImp2.stringSplosion("There"));
        assertEquals("KKiKitKittKitteKitten", testImp2.stringSplosion("Kitten"));
        assertEquals("BByBye", testImp2.stringSplosion("Bye"));
        assertEquals("GGoGooGood", testImp2.stringSplosion("Good"));
        assertEquals("BBaBad", testImp2.stringSplosion("Bad"));
    }

    @Test
    public void testArrayFront9() {
        int [] firstForArrayFront9 = {1, 2, 9, 3, 4};
        int [] secondForArrayFront9 = {1, 2, 3, 4, 9};
        int [] thirdForArrayFront9 = {1, 2, 3, 4, 5};
        int [] fourthForArrayFront9 = {9, 2, 3};
        int [] fifthForArrayFront9 = {1, 9, 9};
        int [] sixthForArrayFront9 = {1, 2, 3};
        int [] seventhForArrayFront9 = {1, 9};
        int [] eihghtForArrayFront9 = {5, 5};
        int [] ninthForArrayFront9 = {2};
        int [] tenthForArrayFront9 = {9};
        int [] eleventhForArrayFront9 = {};
        int [] twelfthForArrayFront9 = {3, 9, 2, 3, 3};
        assertTrue(testImp2.arrayFront9(firstForArrayFront9));
        assertFalse(testImp2.arrayFront9(secondForArrayFront9));
        assertFalse(testImp2.arrayFront9(thirdForArrayFront9));
        assertTrue(testImp2.arrayFront9(fourthForArrayFront9));
        assertTrue(testImp2.arrayFront9(fifthForArrayFront9));
        assertFalse(testImp2.arrayFront9(sixthForArrayFront9));
        assertTrue(testImp2.arrayFront9(seventhForArrayFront9));
        assertFalse(testImp2.arrayFront9(eihghtForArrayFront9));
        assertFalse(testImp2.arrayFront9(ninthForArrayFront9));
        assertTrue(testImp2.arrayFront9(tenthForArrayFront9));
        assertFalse(testImp2.arrayFront9(eleventhForArrayFront9));
        assertTrue(testImp2.arrayFront9(twelfthForArrayFront9));
    }

    @Test
    public void testStringX() {
        assertEquals("xHix", testImp2.stringX("xxHxix"));
        assertEquals("abcd", testImp2.stringX("abxxxcd"));
        assertEquals("xabcdx", testImp2.stringX("xabxxxcdx"));
        assertEquals("xKittenx", testImp2.stringX("xKittenx"));
        assertEquals("Hello", testImp2.stringX("Hello"));
        assertEquals("xx", testImp2.stringX("xx"));
        assertEquals("x", testImp2.stringX("x"));
        assertEquals("", testImp2.stringX(""));
    }

    @Test
    public void testArray667() {
        int[] firstForArray667 = {6, 6, 2};
        int[] secondForArray667 = {6, 6, 2, 6};
        int[] thirdForArray667 = {6, 7, 2, 6};
        int[] fourthForArray667 = {6, 6, 2, 6, 7};
        int[] fifthForArray667 = {1, 6, 3};
        int[] sixthFrArray667 = {6, 1};
        int[] seventhForArray667 = {};
        int[] eighthForArray667 = {3, 6, 7, 6};
        int[] ninthForArray667 = {3, 6, 6, 7};
        int[] tenthForArray667 = {6, 3, 6, 6};
        int[] eleventhForArray667 = {6, 7, 6, 6};
        int[] twelfthForArray667 = {1, 2, 3, 5, 6};
        int[] thirteenthForArray667 = {1, 2, 3, 6, 6};
        assertEquals(1, testImp2.array667(firstForArray667));
        assertEquals(1, testImp2.array667(secondForArray667));
        assertEquals(1, testImp2.array667(thirdForArray667));
        assertEquals(2, testImp2.array667(fourthForArray667));
        assertEquals(0, testImp2.array667(fifthForArray667));
        assertEquals(0, testImp2.array667(sixthFrArray667));
        assertEquals(0, testImp2.array667(seventhForArray667));
        assertEquals(1, testImp2.array667(eighthForArray667));
        assertEquals(2, testImp2.array667(ninthForArray667));
        assertEquals(1, testImp2.array667(tenthForArray667));
        assertEquals(2, testImp2.array667(eleventhForArray667));
        assertEquals(0, testImp2.array667(twelfthForArray667));
        assertEquals(1, testImp2.array667(thirteenthForArray667));
    }
}

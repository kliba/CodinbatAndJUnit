package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class String1Test {

    String1 stringToTest = new String1();

    //******https://codingbat.com/java/String-1******first column

    //helloName
    @Test
    public void testHelloName() {
        assertEquals("Hello Bob!",stringToTest.helloName("Bob"));
        assertEquals("Hello Alice!" ,stringToTest.helloName("Alice"));
        assertEquals("Hello X!" ,stringToTest.helloName("X"));
        assertEquals("Hello Dolly!" ,stringToTest.helloName("Dolly"));
        assertEquals("Hello Alpha!" ,stringToTest.helloName("Alpha"));
        assertEquals("Hello Omega!" ,stringToTest.helloName("Omega"));
        assertEquals("Hello Goodbye!" ,stringToTest.helloName("Goodbye"));
        assertEquals("Hello ho ho ho!" ,stringToTest.helloName("ho ho ho"));
        assertEquals("Hello xyz!!" ,stringToTest.helloName("xyz!"));
        assertEquals("Hello Hello!",stringToTest.helloName("Hello"));
    }

    //makeOutWord
    @Test
    public void testMakeOutWord() {
        assertEquals("<<Yay>>", stringToTest.makeOutWord("<<>>", "Yay"));
        assertEquals("<<WooHoo>>", stringToTest.makeOutWord("<<>>", "WooHoo"));
        assertEquals("[[word]]", stringToTest.makeOutWord("[[]]", "word"));
        assertEquals("HHHellooo", stringToTest.makeOutWord("HHoo", "Hello"));
        assertEquals("abYAYyz", stringToTest.makeOutWord("abyz", "YAY"));
    }

    //firstHalf
    @Test
    public void testFirstHalf() {
        assertEquals("Woo", stringToTest.firstHalf("WooHoo"));
        assertEquals("Hello", stringToTest.firstHalf("HelloThere"));
        assertEquals("abc", stringToTest.firstHalf("abcdef"));
        assertEquals("a", stringToTest.firstHalf("ab"));
        assertEquals("", stringToTest.firstHalf(""));
        assertEquals("01234", stringToTest.firstHalf("0123456789"));
        assertEquals("kit", stringToTest.firstHalf("kitten"));
    }

    //nonStart
    @Test
    public void testNonStart() {
        assertEquals("ellohere", stringToTest.nonStart("Hello", "There"));
        assertEquals("avaode", stringToTest.nonStart("java", "code"));
        assertEquals("hotlava", stringToTest.nonStart("shotl", "java"));
        assertEquals("by", stringToTest.nonStart("ab", "xy"));
        assertEquals("b", stringToTest.nonStart("ab", "x"));
        assertEquals("c", stringToTest.nonStart("x", "ac"));
        assertEquals("", stringToTest.nonStart("a", "x"));
        assertEquals("itat", stringToTest.nonStart("kit", "kat"));
        assertEquals("artart", stringToTest.nonStart("mart", "dart"));
    }

    //theEnd
    @Test
    public void testTheEnd() {
        assertEquals("H", stringToTest.theEnd("Hello", true));
        assertEquals("o", stringToTest.theEnd("Hello", false));
        assertEquals("o", stringToTest.theEnd("oh", true));
        assertEquals("h", stringToTest.theEnd("oh", false));
        assertEquals("x", stringToTest.theEnd("x", true));
        assertEquals("x", stringToTest.theEnd("x", false));
        assertEquals("j", stringToTest.theEnd("java", true));
        assertEquals("e", stringToTest.theEnd("chocolate", false));
        assertEquals("1", stringToTest.theEnd("1234", true));
        assertEquals("e", stringToTest.theEnd("code", false));
    }

    //endsLy
    @Test
    public void testEndLy() {
        assertTrue(stringToTest.endsLy("oddly"));
        assertFalse(stringToTest.endsLy("y"));
        assertFalse(stringToTest.endsLy("oddy"));
        assertFalse(stringToTest.endsLy("oddl"));
        assertFalse(stringToTest.endsLy("olydd"));
        assertTrue(stringToTest.endsLy("ly"));
        assertFalse(stringToTest.endsLy(""));
        assertFalse(stringToTest.endsLy("falsey"));
        assertTrue(stringToTest.endsLy("evenly"));
    }

    //middleThree
    @Test
    public void testMiddleThree() {
        assertEquals("and", stringToTest.middleThree("Candy"));
        assertEquals("and", stringToTest.middleThree("and"));
        assertEquals("lvi", stringToTest.middleThree("solving"));
        assertEquals("yet", stringToTest.middleThree("Hi yet Hi"));
        assertEquals("yet", stringToTest.middleThree("java yet java"));
        assertEquals("col", stringToTest.middleThree("Chocolate"));
        assertEquals("xyz", stringToTest.middleThree("XabcxyzabcX"));
    }

    //lastChars
    @Test
    public void testLastChars() {
        assertEquals("ls", stringToTest.lastChars("last", "chars"));
        assertEquals("ya", stringToTest.lastChars("yo", "java"));
        assertEquals("h@", stringToTest.lastChars("hi", ""));
        assertEquals("@o", stringToTest.lastChars("", "hello"));
        assertEquals("@@", stringToTest.lastChars("", ""));
        assertEquals("ki", stringToTest.lastChars("kitten", "hi"));
        assertEquals("kp", stringToTest.lastChars("k", "zip"));
        assertEquals("k@", stringToTest.lastChars("kitten", ""));
        assertEquals("kp", stringToTest.lastChars("kitten", "zip"));
    }

    //seeColor
    @Test
    public void testSeeColor() {
        assertEquals("red", stringToTest.seeColor("redxx"));
        assertEquals("", stringToTest.seeColor("xxred"));
        assertEquals("blue", stringToTest.seeColor("blueTimes"));
        assertEquals("", stringToTest.seeColor("NoColor"));
        assertEquals("red", stringToTest.seeColor("red"));
        assertEquals("", stringToTest.seeColor("re"));
        assertEquals("", stringToTest.seeColor("blu"));
        assertEquals("blue", stringToTest.seeColor("blue"));
        assertEquals("", stringToTest.seeColor("a"));
        assertEquals("", stringToTest.seeColor(""));
        assertEquals("", stringToTest.seeColor("xyzred"));
    }

    //extraFront
    @Test
    public void testExtraFront() {
        assertEquals("HeHeHe", stringToTest.extraFront("Hello"));
        assertEquals("ababab", stringToTest.extraFront("ab"));
        assertEquals("HHH", stringToTest.extraFront("H"));
        assertEquals("", stringToTest.extraFront(""));
        assertEquals("CaCaCa", stringToTest.extraFront("Candy"));
        assertEquals("CoCoCo", stringToTest.extraFront("Code"));
    }

    //startWord
    @Test
    public void testStartWord() {
        assertEquals("hi", stringToTest.startWord("hippo", "hi"));
        assertEquals("hip", stringToTest.startWord("hippo", "xip"));
        assertEquals("h", stringToTest.startWord("hippo", "i"));
        assertEquals("", stringToTest.startWord("hippo", "ix"));
        assertEquals("", stringToTest.startWord("h", "ix"));
        assertEquals("", stringToTest.startWord("", "i"));
        assertEquals("hi", stringToTest.startWord("hip", "zi"));
        assertEquals("hip", stringToTest.startWord("hip", "zip"));
        assertEquals("", stringToTest.startWord("hip", "zig"));
        assertEquals("h", stringToTest.startWord("h", "z"));
        assertEquals("hippo", stringToTest.startWord("hippo", "xippo"));
        assertEquals("", stringToTest.startWord("hippo", "xyz"));
        assertEquals("hip", stringToTest.startWord("hippo", "hip"));
        assertEquals("kit", stringToTest.startWord("kitten", "cit"));
        assertEquals("kit", stringToTest.startWord("kit", "cit"));
    }
    //******https://codingbat.com/java/String-1******second column
    //makeAbba
    @Test
    public void testMakeAbba() {
        assertEquals("HiByeByeHi", stringToTest.makeAbba("Hi", "Bye"));
        assertEquals("YoAliceAliceYo", stringToTest.makeAbba("Yo", "Alice"));
        assertEquals("WhatUpUpWhat", stringToTest.makeAbba("What", "Up"));
        assertEquals("aaabbbbbbaaa", stringToTest.makeAbba("aaa", "bbb"));
        assertEquals("xyyx", stringToTest.makeAbba("x", "y"));
        assertEquals("xx", stringToTest.makeAbba("x", ""));
        assertEquals("yy", stringToTest.makeAbba("", "y"));
        assertEquals("BoYaYaBo", stringToTest.makeAbba("Bo", "Ya"));
        assertEquals("YaYaYaYa", stringToTest.makeAbba("Ya", "Ya"));
    }

    //extraEnd
    @Test
    public void testExtraEnd() {
        assertEquals("lololo", stringToTest.extraEnd("Hello"));
        assertEquals("ababab", stringToTest.extraEnd("ab"));
        assertEquals("HiHiHi", stringToTest.extraEnd("Hi"));
        assertEquals("dydydy", stringToTest.extraEnd("Candy"));
        assertEquals("dedede", stringToTest.extraEnd("Code"));
    }

    //withoutEnd
    @Test
    public void testWithoutEnd() {
        assertEquals("ell", stringToTest.withoutEnd("Hello"));
        assertEquals("av", stringToTest.withoutEnd("java"));
        assertEquals("odin", stringToTest.withoutEnd("coding"));
        assertEquals("od", stringToTest.withoutEnd("code"));
        assertEquals("", stringToTest.withoutEnd("ab"));
        assertEquals("hocolate", stringToTest.withoutEnd("Chocolate!"));
        assertEquals("itte", stringToTest.withoutEnd("kitten"));
        assertEquals("ooho", stringToTest.withoutEnd("woohoo"));
    }

    //left2
    @Test
    public void testLeft2() {
        assertEquals("lloHe", stringToTest.left2("Hello"));
        assertEquals("vaja", stringToTest.left2("java"));
        assertEquals("Hi", stringToTest.left2("Hi"));
        assertEquals("deco", stringToTest.left2("code"));
        assertEquals("tca", stringToTest.left2("cat"));
        assertEquals("34512", stringToTest.left2("12345"));
        assertEquals("ocolateCh", stringToTest.left2("Chocolate"));
        assertEquals("icksbr", stringToTest.left2("bricks"));
    }


    //withoutEnd2
    @Test
    public void testWithoutEnd2() {
        assertEquals("ell", stringToTest.withouEnd2("Hello"));
        assertEquals("b", stringToTest.withouEnd2("abc"));
        assertEquals("", stringToTest.withouEnd2("ab"));
        assertEquals("", stringToTest.withouEnd2("a"));
        assertEquals("", stringToTest.withouEnd2(""));
        assertEquals("old", stringToTest.withouEnd2("coldy"));
        assertEquals("ava cod", stringToTest.withouEnd2("java code"));
    }

    //nTwice
    @Test
    public void testNTwice() {
        assertEquals("Helo", stringToTest.nTwice("Hello", 2));
        assertEquals("Choate", stringToTest.nTwice("Chocolate", 3));
        assertEquals("Ce", stringToTest.nTwice("Chocolate", 1));
        assertEquals("", stringToTest.nTwice("Chocolate", 0));
        assertEquals("Hellello", stringToTest.nTwice("Hello", 4));
        assertEquals("CodeCode", stringToTest.nTwice("Code", 4));
        assertEquals("Code", stringToTest.nTwice("Code", 2));
    }

    //hasBad
    @Test
    public void testHasBad() {
        assertTrue(stringToTest.hasBad("badxx"));
        assertTrue(stringToTest.hasBad("xbadxx"));
        assertFalse(stringToTest.hasBad("xxbadxx"));
        assertFalse(stringToTest.hasBad("code"));
        assertTrue(stringToTest.hasBad("bad"));
        assertFalse(stringToTest.hasBad("ba"));
        assertFalse(stringToTest.hasBad("xba"));
        assertTrue(stringToTest.hasBad("xbad"));
        assertFalse(stringToTest.hasBad(""));
        assertTrue(stringToTest.hasBad("badyy"));
    }

    //conCat
    @Test
    public void testConCat() {
        assertEquals("abcat", stringToTest.conCat("abc", "cat"));
        assertEquals("dogcat", stringToTest.conCat("dog", "cat"));
        assertEquals("abc", stringToTest.conCat("abc", ""));
        assertEquals("cat", stringToTest.conCat("", "cat"));
        assertEquals("pig", stringToTest.conCat("pig", "g"));
        assertEquals("pigdoggy", stringToTest.conCat("pig", "doggy"));
    }

    //frontAgain
    @Test
    public void testFrontAgain() {
        assertTrue(stringToTest.frontAgain("edited"));
        assertFalse(stringToTest.frontAgain("edit"));
        assertTrue(stringToTest.frontAgain("ed"));
        assertTrue(stringToTest.frontAgain("jj"));
        assertTrue(stringToTest.frontAgain("jjj"));
        assertTrue(stringToTest.frontAgain("jjjj"));
        assertFalse(stringToTest.frontAgain("jjjk"));
        assertFalse(stringToTest.frontAgain("x"));
        assertFalse(stringToTest.frontAgain(""));
        assertFalse(stringToTest.frontAgain("java"));
        assertTrue(stringToTest.frontAgain("javaja"));
    }

    //without2
    @Test
    public void testWithout2() {
        assertEquals("lloHe", stringToTest.without2("HelloHe"));
        assertEquals("HelloHi", stringToTest.without2("HelloHi"));
        assertEquals("", stringToTest.without2("Hi"));
        assertEquals("Chocolate", stringToTest.without2("Chocolate"));
        assertEquals("x", stringToTest.without2("xxx"));
        assertEquals("", stringToTest.without2("xx"));
        assertEquals("x", stringToTest.without2("x"));
        assertEquals("", stringToTest.without2(""));
        assertEquals("Fruits", stringToTest.without2("Fruits"));
    }

    //withoutX
    @Test
    public void testWithoutX() {
        assertEquals("Hi", stringToTest.withoutX("xHix"));
        assertEquals("Hi", stringToTest.withoutX("xHi"));
        assertEquals("Hxi", stringToTest.withoutX("Hxix"));
        assertEquals("Hi", stringToTest.withoutX("Hi"));
        assertEquals("xHi", stringToTest.withoutX("xxHi"));
        assertEquals("Hi", stringToTest.withoutX("Hix"));
        assertEquals("axb", stringToTest.withoutX("xaxbx"));
        assertEquals("", stringToTest.withoutX("xx"));
        assertEquals("", stringToTest.withoutX("x"));
        assertEquals("", stringToTest.withoutX(""));
        assertEquals("Hello", stringToTest.withoutX("Hello"));
        assertEquals("Hexllo", stringToTest.withoutX("Hexllo"));
    }

    //******https://codingbat.com/java/String-1******third column

    //makeTags
    @Test
    public void testMakeTags() {
        assertEquals("<i>Yay</i>", stringToTest.makeTags("i", "Yay"));
        assertEquals("<i>Hello</i>", stringToTest.makeTags("i", "Hello"));
        assertEquals("<cite>Yay</cite>", stringToTest.makeTags("cite", "Yay"));
        assertEquals("<address>here</address>", stringToTest.makeTags("address", "here"));
        assertEquals("<body>Heart</body>", stringToTest.makeTags("body", "Heart"));
        assertEquals("<i>i</i>", stringToTest.makeTags("i", "i"));
        assertEquals("<i></i>", stringToTest.makeTags("i", ""));
    }

    //firstTwo
    @Test
    public void testFirstTwo() {
        assertEquals("He", stringToTest.firstTwo("Hello"));
        assertEquals("ab", stringToTest.firstTwo("abcdefg"));
        assertEquals("ab", stringToTest.firstTwo("ab"));
        assertEquals("a", stringToTest.firstTwo("a"));
        assertEquals("", stringToTest.firstTwo(""));
        assertEquals("Ki", stringToTest.firstTwo("Kitten"));
        assertEquals("hi", stringToTest.firstTwo("hi"));
        assertEquals("hi", stringToTest.firstTwo("hiya"));
    }

    //comboString
    @Test
    public void testComboString() {
        assertEquals("hiHellohi", stringToTest.comboString("Hello", "hi"));
        assertEquals("hiHellohi", stringToTest.comboString("hi", "Hello"));
        assertEquals("baaab", stringToTest.comboString("aaa", "b"));
        assertEquals("baaab", stringToTest.comboString("b", "aaa"));
        assertEquals("aaa", stringToTest.comboString("aaa", ""));
        assertEquals("bb", stringToTest.comboString("", "bb"));
        assertEquals("aaa1234aaa", stringToTest.comboString("aaa", "1234"));
        assertEquals("bbaaabb", stringToTest.comboString("aaa", "bb"));
        assertEquals("abba", stringToTest.comboString("a", "bb"));
        assertEquals("abba", stringToTest.comboString("bb", "a"));
        assertEquals("abxyzab", stringToTest.comboString("xyz", "ab"));
    }

    //right2
    @Test
    public void testRight2() {
        assertEquals("loHel", stringToTest.right2("Hello"));
        assertEquals("vaja", stringToTest.right2("java"));
        assertEquals("Hi", stringToTest.right2("Hi"));
        assertEquals("deco", stringToTest.right2("code"));
        assertEquals("atc", stringToTest.right2("cat"));
        assertEquals("45123", stringToTest.right2("12345"));
    }

    //middleTwo
    @Test
    public void testMiddleTwo() {
        assertEquals("ri", stringToTest.middleTwo("string"));
        assertEquals("od", stringToTest.middleTwo("code"));
        assertEquals("ct", stringToTest.middleTwo("Practice"));
        assertEquals("ab", stringToTest.middleTwo("ab"));
        assertEquals("45", stringToTest.middleTwo("0123456789"));
    }

    //twoChar
    @Test
    public void testTwoChar() {
        assertEquals("ja", stringToTest.twoChar("java", 0));
        assertEquals("va", stringToTest.twoChar("java", 2));
        assertEquals("ja", stringToTest.twoChar("java", 3));
        assertEquals("ja", stringToTest.twoChar("java", 4));
        assertEquals("ja", stringToTest.twoChar("java", -1));
        assertEquals("He", stringToTest.twoChar("Hello", 0));
        assertEquals("el", stringToTest.twoChar("Hello", 1));
        assertEquals("He", stringToTest.twoChar("Hello", 99));
        assertEquals("lo", stringToTest.twoChar("Hello", 3));
        assertEquals("He", stringToTest.twoChar("Hello", 4));
        assertEquals("He", stringToTest.twoChar("Hello", 5));
        assertEquals("He", stringToTest.twoChar("Hello", -7));
        assertEquals("He", stringToTest.twoChar("Hello", 6));
        assertEquals("He", stringToTest.twoChar("Hello", -1));
        assertEquals("ya", stringToTest.twoChar("yay", 0));
    }

    //atFirst
    @Test
    public void testAtFirst() {
        assertEquals("he", stringToTest.atFirst("hello"));
        assertEquals("hi", stringToTest.atFirst("hi"));
        assertEquals("h@", stringToTest.atFirst("h"));
        assertEquals("@@", stringToTest.atFirst(""));
        assertEquals("ki", stringToTest.atFirst("kitten"));
        assertEquals("ja", stringToTest.atFirst("java"));
        assertEquals("j@", stringToTest.atFirst("j"));
    }

    //lastTwo
    @Test
    public void testLastTwo() {
        assertEquals("codign", stringToTest.lastTwo("coding"));
        assertEquals("cta", stringToTest.lastTwo("cat"));
        assertEquals("ba", stringToTest.lastTwo("ab"));
        assertEquals("a", stringToTest.lastTwo("a"));
        assertEquals("", stringToTest.lastTwo(""));
    }

    //minCat
    @Test
    public void testMinCat() {
        assertEquals("loHi", stringToTest.minCat("Hello", "Hi"));
        assertEquals("ellojava", stringToTest.minCat("Hello", "java"));
        assertEquals("javaello", stringToTest.minCat("java", "Hello"));
        assertEquals("cx", stringToTest.minCat("abc", "x"));
        assertEquals("xc", stringToTest.minCat("x", "abc"));
        assertEquals("", stringToTest.minCat("abc", ""));
    }

    //deFront
    @Test
    public void testDeFront() {
        assertEquals("llo", stringToTest.deFront("Hello"));
        assertEquals("va", stringToTest.deFront("java"));
        assertEquals("aay", stringToTest.deFront("away"));
        assertEquals("ay", stringToTest.deFront("axy"));
        assertEquals("abc", stringToTest.deFront("abc"));
        assertEquals("by", stringToTest.deFront("xby"));
        assertEquals("ab", stringToTest.deFront("ab"));
        assertEquals("a", stringToTest.deFront("ax"));
        assertEquals("ab", stringToTest.deFront("axb"));
        assertEquals("aa", stringToTest.deFront("aaa"));
        assertEquals("bc", stringToTest.deFront("xbc"));
        assertEquals("bb", stringToTest.deFront("bbb"));
        assertEquals("zz", stringToTest.deFront("bazz"));
        assertEquals("", stringToTest.deFront("ba"));
        assertEquals("abxyz", stringToTest.deFront("abxyz"));
        assertEquals("", stringToTest.deFront("hi"));
        assertEquals("s", stringToTest.deFront("his"));
        assertEquals("", stringToTest.deFront("xz"));
        assertEquals("z", stringToTest.deFront("zzz"));
    }

    //withoutX2
    @Test
    public void testWithoutX2() {
        assertEquals("Hi", stringToTest.withoutX2("xHi"));
        assertEquals("Hi", stringToTest.withoutX2("Hxi"));
        assertEquals("Hi", stringToTest.withoutX2("Hi"));
        assertEquals("Hi", stringToTest.withoutX2("xxHi"));
        assertEquals("Hix", stringToTest.withoutX2("Hix"));
        assertEquals("axb", stringToTest.withoutX2("xaxb"));
        assertEquals("", stringToTest.withoutX2("xx"));
        assertEquals("", stringToTest.withoutX2("x"));
        assertEquals("", stringToTest.withoutX2(""));
        assertEquals("Hello", stringToTest.withoutX2("Hello"));
        assertEquals("Hexllo", stringToTest.withoutX2("Hexllo"));
        assertEquals("Hxllo", stringToTest.withoutX2("xHxllo"));
    }
}

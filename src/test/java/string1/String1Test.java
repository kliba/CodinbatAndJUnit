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
}

package string1;

public class App {
    public static void main(String[] args) {

        String1 myString = new String1();

        //******https://codingbat.com/java/String-1******first column

        //helloName
        myString.helloName("Bob");
        myString.helloName("Alice");
        myString.helloName("X");
        myString.helloName("Dolly");
        myString.helloName("Alpha");
        myString.helloName("Omega");
        myString.helloName("Goodbye");
        myString.helloName("ho ho ho");
        myString.helloName("xyz!");
        myString.helloName("Hello");

        //makeOutWord
        myString.makeOutWord("<<>>", "Yay");
        myString.makeOutWord("<<>>", "WooHoo");
        myString.makeOutWord("[[]]", "word");
        myString.makeOutWord("HHoo", "Hello");
        myString.makeOutWord("abyz", "YAY");

        //firstHalf
        myString.firstHalf("WooHoo");
        myString.firstHalf("Hello");
        myString.firstHalf("abcdef");
        myString.firstHalf("ab");
        myString.firstHalf("");
        myString.firstHalf("0123456789");
        myString.firstHalf("kitten");

        //nonStart
        myString.nonStart("Hello", "There");
        myString.nonStart("java", "code");
        myString.nonStart("shotl", "java");
        myString.nonStart("ab", "xy");
        myString.nonStart("ab", "x");
        myString.nonStart("x", "ac");
        myString.nonStart("a", "x");
        myString.nonStart("kit", "kat");
        myString.nonStart("mart", "dart");

        //theEnd
        myString.theEnd("Hello", true);
        myString.theEnd("Hello", false);
        myString.theEnd("oh", true);
        myString.theEnd("oh", false);
        myString.theEnd("x", true);
        myString.theEnd("x", false);
        myString.theEnd("java", true);
        myString.theEnd("chocolate", false);
        myString.theEnd("1234", true);
        myString.theEnd("code", false);

        //endsLy
        myString.endsLy("oddly");
        myString.endsLy("y");
        myString.endsLy("oddy");
        myString.endsLy("oddl");
        myString.endsLy("olydd");
        myString.endsLy("ly");
        myString.endsLy("");
        myString.endsLy("falsey");
        myString.endsLy("evenly");

        //middleThree
        myString.middleThree("Candy");
        myString.middleThree("and");
        myString.middleThree("solving");
        myString.middleThree("Hi yet Hi");
        myString.middleThree("java yet java");
        myString.middleThree("Chocolate");
        myString.middleThree("XabcxyzabcX");

        //lastChars
        myString.lastChars("last", "chars");
        myString.lastChars("yo", "java");
        myString.lastChars("hi", "");
        myString.lastChars("", "hello");
        myString.lastChars("", "");
        myString.lastChars("kitten", "hi");
        myString.lastChars("k", "zip");
        myString.lastChars("kitten", "");
        myString.lastChars("kitten", "zip");

        //seeColor
        myString.seeColor("redxx");
        myString.seeColor("xxred");
        myString.seeColor("blueTimes");
        myString.seeColor("NoColor");
        myString.seeColor("red");
        myString.seeColor("re");
        myString.seeColor("blu");
        myString.seeColor("blue");
        myString.seeColor("a");
        myString.seeColor("");
        myString.seeColor("xyzred");

        //extraFront
        myString.extraFront("Hello");
        myString.extraFront("ab");
        myString.extraFront("H");
        myString.extraFront("");
        myString.extraFront("Candy");
        myString.extraFront("Code");

    }
}

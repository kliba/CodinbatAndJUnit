package string1test;

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

        //startWord
        myString.startWord("hippo", "hi");
        myString.startWord("hippo", "xip");
        myString.startWord("hippo", "i");
        myString.startWord("hippo", "ix");
        myString.startWord("h", "ix");
        myString.startWord("", "i");
        myString.startWord("hip", "zi");
        myString.startWord("hip", "zip");
        myString.startWord("hip", "zig");
        myString.startWord("h", "z");
        myString.startWord("hippo", "xippo");
        myString.startWord("hippo", "xyz");
        myString.startWord("hippo", "hip");
        myString.startWord("kitten", "cit");
        myString.startWord("kit", "cit");

        //******https://codingbat.com/java/String-1******second column
        //makeAbba
        myString.makeAbba("Hi", "Bye");
        myString.makeAbba("Yo", "Alice");
        myString.makeAbba("What", "Up");
        myString.makeAbba("aaa", "bbb");
        myString.makeAbba("x", "y");
        myString.makeAbba("x", "");
        myString.makeAbba("", "y");
        myString.makeAbba("Bo", "Ya");
        myString.makeAbba("Ya", "Ya");

        //extraEnd
        myString.extraEnd("Hello");
        myString.extraEnd("ab");
        myString.extraEnd("Hi");
        myString.extraEnd("Candy");
        myString.extraEnd("Code");

        //withoutEnd
        myString.withoutEnd("Hello");
        myString.withoutEnd("java");
        myString.withoutEnd("coding");
        myString.withoutEnd("code");
        myString.withoutEnd("ab");
        myString.withoutEnd("Chocolate!");
        myString.withoutEnd("kitten");
        myString.withoutEnd("woohoo");

        //left2
        myString.left2("Hello");
        myString.left2("java");
        myString.left2("Hi");
        myString.left2("code");
        myString.left2("cat");
        myString.left2("12345");
        myString.left2("Chocolate");
        myString.left2("bricks");

        //withoutEnd2
        myString.withouEnd2("Hello");
        myString.withouEnd2("abc");
        myString.withouEnd2("ab");
        myString.withouEnd2("a");
        myString.withouEnd2("");
        myString.withouEnd2("old");
        myString.withouEnd2("java code");

        //nTwice
        myString.nTwice("Hello", 2);
        myString.nTwice("Chocolate", 3);
        myString.nTwice("Chocolate", 1);
        myString.nTwice("Chocolate", 0);
        myString.nTwice("Hello", 4);
        myString.nTwice("Code", 4);
        myString.nTwice("Code", 2);

        //hasBad
        myString.hasBad("badxx");
        myString.hasBad("xbadxx");
        myString.hasBad("xxbadxx");
        myString.hasBad("code");
        myString.hasBad("bad");
        myString.hasBad("ba");
        myString.hasBad("xba");
        myString.hasBad("");
        myString.hasBad("badyy");

        //conCat
        myString.conCat("abc", "cat");
        myString.conCat("dog", "cat");
        myString.conCat("abc", "");
        myString.conCat("", "cat");
        myString.conCat("pig", "g");
        myString.conCat("pig", "doggy");

        //frontAgain
        myString.frontAgain("edited");
        myString.frontAgain("edit");
        myString.frontAgain("ed");
        myString.frontAgain("jj");
        myString.frontAgain("jjj");
        myString.frontAgain("jjjj");
        myString.frontAgain("jjjk");
        myString.frontAgain("x");
        myString.frontAgain("");
        myString.frontAgain("java");
        myString.frontAgain("javaja");

        //without2
        myString.without2("HelloHe");
        myString.without2("HelloHi");
        myString.without2("Hi");
        myString.without2("Chocolate");
        myString.without2("xxx");
        myString.without2("xx");
        myString.without2("x");
        myString.without2("");
        myString.without2("Fruits");

        //withoutX
        myString.withoutX("xHix");
        myString.withoutX("xHi");
        myString.withoutX("Hxix");
        myString.withoutX("Hi");
        myString.withoutX("xxHi");
        myString.withoutX("Hix");
        myString.withoutX("xaxbx");
        myString.withoutX("xx");
        myString.withoutX("x");
        myString.withoutX("");
        myString.withoutX("Hello");
        myString.withoutX("Hexllo");

        //******https://codingbat.com/java/String-1******third column
        //makeTags
        myString.makeTags("i", "Yay");
        myString.makeTags("i", "Hello");
        myString.makeTags("cite", "Yay");
        myString.makeTags("address", "here");
        myString.makeTags("body", "Heart");
        myString.makeTags("i", "i");
        myString.makeTags("i", "");

        //firstTwo
        myString.firstTwo("Hello");
        myString.firstTwo("abcdefg");
        myString.firstTwo("ab");
        myString.firstTwo("a");
        myString.firstTwo("");
        myString.firstTwo("Ki");
        myString.firstTwo("hi");
        myString.firstTwo("hiya");

        //comboString
        myString.comboString("Hello", "hi");
        myString.comboString("hi", "Hello");
        myString.comboString("aaa", "b");
        myString.comboString("b", "aaa");
        myString.comboString("aaa", "");
        myString.comboString("", "bb");
        myString.comboString("aaa", "1234");
        myString.comboString("aaa", "bb");
        myString.comboString("a", "bb");
        myString.comboString("bb", "a");
        myString.comboString("xyz", "ab");

        //right2
        myString.right2("Hello");
        myString.right2("java");
        myString.right2("Hi");
        myString.right2("code");
        myString.right2("cat");
        myString.right2("12345");

        //middleTwo
        myString.middleTwo("string");
        myString.middleTwo("code");
        myString.middleTwo("Practice");
        myString.middleTwo("ab");
        myString.middleTwo("0123456789");

        //twoChar
        myString.twoChar("java", 0);
        myString.twoChar("java", 2);
        myString.twoChar("java", 3);
        myString.twoChar("java", 4);
        myString.twoChar("java", -1);
        myString.twoChar("Hello", 0);
        myString.twoChar("Hello", 1);
        myString.twoChar("Hello", 99);
        myString.twoChar("Hello", 3);
        myString.twoChar("Hello", 4);
        myString.twoChar("Hello", 5);
        myString.twoChar("Hello", -7);
        myString.twoChar("Hello", 6);
        myString.twoChar("Hello", -1);
        myString.twoChar("yay", 0);

        //atFirst
        myString.atFirst("hello");
        myString.atFirst("hi");
        myString.atFirst("h");
        myString.atFirst("");
        myString.atFirst("kitten");
        myString.atFirst("java");
        myString.atFirst("j");

        //lastTwo
        myString.lastTwo("coding");
        myString.lastTwo("cat");
        myString.lastTwo("ba");
        myString.lastTwo("a");
        myString.lastTwo("");

        //minCat
        myString.minCat("Hello", "Hi");
        myString.minCat("Hello", "java");
        myString.minCat("java", "Hello");
        myString.minCat("abc", "x");
        myString.minCat("x", "abc");
        myString.minCat("abc", "");

        //deFront
        myString.deFront("Hello");
        myString.deFront("java");
        myString.deFront("away");
        myString.deFront("axy");
        myString.deFront("abc");
        myString.deFront("xby");
        myString.deFront("ab");
        myString.deFront("ax");
        myString.deFront("axb");
        myString.deFront("aaa");
        myString.deFront("xbc");
        myString.deFront("bbb");
        myString.deFront("bazz");
        myString.deFront("ba");
        myString.deFront("abxyz");
        myString.deFront("hi");
        myString.deFront("his");
        myString.deFront("xz");
        myString.deFront("zzz");

        //withoutX2
        myString.withoutX2("xHi");
        myString.withoutX2("Hxi");
        myString.withoutX2("Hi");
        myString.withoutX2("xxHi");
        myString.withoutX2("Hix");
        myString.withoutX2("xaxb");
        myString.withoutX2("xx");
        myString.withoutX2("x");
        myString.withoutX2("");
        myString.withoutX2("Hello");
        myString.withoutX2("Hexllo");
        myString.withoutX2("xHxllo");
    }
}

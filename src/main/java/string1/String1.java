package string1;

public class String1 {
    //******https://codingbat.com/java/String-1******first column

    /**
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     *   helloName("Bob") → "Hello Bob!"
     *   helloName("Alice") → "Hello Alice!"
     *   helloName("X") → "Hello X!"
     * @param name string
     * @return string, hello concatenates to the name param
     */

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    /**
     * Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word
     * is in the middle of the out string, e.g. "<<word>>".
     * Note: use str.substring(i, j) to extract the String starting
     * at index i and going up to but not including index j.
     *   makeOutWord("<<>>", "Yay") → "<<Yay>>"
     *   makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
     *   makeOutWord("[[]]", "word") → "[[word]]"
     * @param out string, its length is 4
     * @param word string, it is probably a meaningful word
     * @return string, where the word is in the middle of the out string
     */

    public String makeOutWord(String out, String word) {
        return "" + out.charAt(0) + out.charAt(1) + word + out.charAt(2) + out.charAt(3);
    }

    /**
     * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
     *   firstHalf("WooHoo") → "Woo"
     *   firstHalf("HelloThere") → "Hello"
     *   firstHalf("abcdef") → "abc"
     * @param str stirng, its length is even
     * @return string, it is the first half of the str param
     */

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    /**
     * Given 2 strings, return their concatenation, except omit the first char of each.
     * The strings will be at least length 1.
     *   nonStart("Hello", "There") → "ellohere"
     *   nonStart("java", "code") → "avaode"
     *   nonStart("shotl", "java") → "hotlava"
     * @param a string, its length at least 1
     * @param b string, its length at least 1
     * @return string, its a and b concatenation , except omit the first char of each
     */

    public String nonStart(String a, String b) {
        String firstPart = a.substring(1);
        String secondPart = b.substring(1);

        return firstPart + secondPart;
    }

    /**
     * Given a string, return a string length 1 from its front, unless front is false,
     * in which case return a string length 1 from its back. The string will be non-empty.
     *   theEnd("Hello", true) → "H"
     *   theEnd("Hello", false) → "o"
     *   theEnd("oh", true) → "o"
     * @param str string, its length min 1
     * @param front false, its true if we are interested by the first letter of the str param
     * @return string, its length is 1 from its front, unless front is false,
     * in which case return a string length 1 from its back
     */

    public String theEnd(String str, boolean front) {
        if (front)
            return "" + str.charAt(0);
        else
            return "" + str.charAt(str.length() - 1);
    }

    /**
     * Given a string, return true if it ends in "ly".
     *   endsLy("oddly") → true
     *   endsLy("y") → false
     *   endsLy("oddy") → false
     * @param str string
     * @return boolean, it is true if the end of the str param is "ly"
     */

    public boolean endsLy(String str) {
        if (str.length() < 2)
            return false;
        else if ("ly".equals(str.substring(str.length() - 2)))
            return true;
        else
            return false;
    }

    /**
     * Given a string of odd length, return the string length 3 from its middle,
     * so "Candy" yields "and". The string length will be at least 3.
     * middleThree("Candy") → "and"
     * middleThree("and") → "and"
     * middleThree("solving") → "lvi"
     * @param str string, its length is odd ans at least 3
     * @return string, its length 3 from its middle
     */

    public String middleThree(String str) {
        if (str.length() <= 3) {
            return str;
        }
        else {
            return str.substring((str.length() - 3) / 2, ((str.length() - 3) / 2) + 3);
        }
    }

    /**
     * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
     * so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
     *   lastChars("last", "chars") → "ls"
     *   lastChars("yo", "java") → "ya"
     *   lastChars("hi", "") → "h@"
     * @param a string
     * @param b string
     * @return string, its first char of a and the last char of b,
     * so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
     */

    public String lastChars(String a, String b) {
        String aFirst = "";
        String bLast = "";

        if (a.length() == 0)
            aFirst = "@";
        else
            aFirst = "" + a.charAt(0);

        if (b.length() == 0)
            bLast = "@";
        else
            bLast = "" + b.charAt(b.length() - 1);

        return aFirst + bLast;
    }

    /**
     * Given a string, if the string begins with "red" or "blue" return
     * that color string, otherwise return the empty string.
     *   seeColor("redxx") → "red"
     *   seeColor("xxred") → ""
     *   seeColor("blueTimes") → "blue"
     * @param str string
     * @return string, its "red" or "blue" if the str param starts any of those key word
     */

    public String seeColor(String str) {
        if (str.startsWith("red"))
            return "red";
        else if (str.startsWith("blue"))
            return "blue";
        else
            return "";
    }

    /**
     * Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
     * The string may be any length. If there are fewer than 2 chars, use whatever is there.
     *   extraFront("Hello") → "HeHeHe"
     *   extraFront("ab") → "ababab"
     *   extraFront("H") → "HHH"
     * @param str string
     * @return string, its made of 3 copies of the first 2 chars of the original string.
     * The string may be any length. If there are fewer than 2 chars, use whatever is there.
     */

    public String extraFront(String str) {
        if (str.length() < 2)
            return str + str + str;
        else
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }

    /**
     * Given a string and a second "word" string, we'll say that the word matches the string
     * if it appears at the front of the string, except its first char does not need to match exactly.
     * On a match, return the front of the string, or otherwise return the empty string.
     * So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
     * The word will be at least length 1.
     *   startWord("hippo", "hi") → "hi"
     *   startWord("hippo", "xip") → "hip"
     *   startWord("hippo", "i") → "h"
     * @param str string
     * @param word string
     * @return string, its the word matches the string if it appears at the front of the string, except its first char
     * does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string.
     */

    public String startWord(String str, String word) {
        if (str.length() < word.length()) {
            return "";
        } else if (word.substring(1).equals(str.substring(1, word.length()))) {
            return str.substring(0, word.length());
        } else {
            return "";
        }
    }


    //******https://codingbat.com/java/String-1******second column

    /**
     * Given two strings, a and b, return the result of putting them together in the order abba,
     * e.g. "Hi" and "Bye" returns "HiByeByeHi".
     *   makeAbba("Hi", "Bye") → "HiByeByeHi"
     *   makeAbba("Yo", "Alice") → "YoAliceAliceYo"
     *   makeAbba("What", "Up") → "WhatUpUpWhat"
     * @param a string
     * @param b string
     * @return string, it concats a to b to b to a
     */

    public String makeAbba(String a, String b) {
        return  a + b + b + a;
    }

    /**
     * Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
     * The string length will be at least 2.
     *   extraEnd("Hello") → "lololo"
     *   extraEnd("ab") → "ababab"
     *   extraEnd("Hi") → "HiHiHi"
     * @param str string, its length at least 2
     * @return string, its mafe of 3 copies of str param last 2 chars
     */

    public String extraEnd(String str) {
        return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
    }

    /**
     * Given a string, return a version without the first and last char, so "Hello" yields "ell".
     * The string length will be at least 2.
     *   withoutEnd("Hello") → "ell"
     *   withoutEnd("java") → "av"
     *   withoutEnd("coding") → "odin"
     * @param str string, ist length at least 2
     * @return string, str param without the first and last chars
     */

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    /**
     * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
     * The string length will be at least 2.
     *   left2("Hello") → "lloHe"
     *   left2("java") → "vaja"
     *   left2("Hi") → "Hi"
     * @param str string, its length min 2
     * @return string, its version of rotated left 2 indexes of str param
     */

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    /**
     * Given a string, return a version without both the first and last char of the string.
     * The string may be any length, including 0.
     *   withouEnd2("Hello") → "ell"
     *   withouEnd2("abc") → "b"
     *   withouEnd2("ab") → ""
     * @param str string, could be any length
     * @return string, its version without both the first and last char of the string
     */

    public String withouEnd2(String str) {
        if (str.length() < 3) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }
    }

    /**
     * Given a string and an int n, return a string made of the first and last n chars from the string.
     * The string length will be at least n.
     *   nTwice("Hello", 2) → "Helo"
     *   nTwice("Chocolate", 3) → "Choate"
     *   nTwice("Chocolate", 1) → "Ce"
     * @param str string, its length az least n
     * @param n int, non-negative number
     * @return string, its made of the first and last n chars from the string
     */

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    /**
     * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such
     * as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
     * Note: use .equals() to compare 2 strings.
     *   hasBad("badxx") → true
     *   hasBad("xbadxx") → true
     *   hasBad("xxbadxx") → false
     * @param str string
     * @return boolean, it is true if "bad" appears starting at index 0 or 1 in the srt param
     */

    public boolean hasBad(String str) {
        if (str.length() < "bad".length())
            return false;
        else if (str.startsWith("bad"))
            return true;
        else if ((str.substring(1)).startsWith("bad"))
            return true;
        else
            return false;
    }

    /**
     * Given two strings, append them together (known as "concatenation") and return the result.
     * However, if the concatenation creates a double-char, then omit one of the chars,
     * so "abc" and "cat" yields "abcat".
     *   conCat("abc", "cat") → "abcat"
     *   conCat("dog", "cat") → "dogcat"
     *   conCat("abc", "") → "abc"
     * @param a string
     * @param b string
     * @return string, it appends a and b params together. However, if the concatenation creates a double-char,
     * then omit one of the chars.
     */

    public String conCat(String a, String b) {
        if (a.length() < 1 || b.length() < 1) {
            return a + b;
        }else if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        } else {
            return a + b;
        }
    }

    /**
     * Given a string, return true if the first 2 chars in the string also appear at the end of the string,
     * such as with "edited".
     *   frontAgain("edited") → true
     *   frontAgain("edit") → false
     *   frontAgain("ed") → true
     * @param str string
     * @return boolean, its true if the first 2 chars in the string also appear at the end of the string
     */

    public boolean frontAgain(String str) {
        if (str.length() < 2)
            return false;
        else if (str.length() == 2 || str.substring(0, 2).equals(str.substring(str.length() - 2)))
            return true;
        else
            return false;
    }

    /**
     * Given a string, if a length 2 substring appears at both its beginning and end, return a string without
     * the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself,
     * so "Hi" yields "". Otherwise, return the original string unchanged.
     *   without2("HelloHe") → "lloHe"
     *   without2("HelloHi") → "HelloHi"
     *   without2("Hi") → ""
     * @param str string, can be any length
     * @return string, its if length 2 substring appears at both its beginning and end, return a string without
     * the substring at the beginning. Otherwise, return the original string unchanged.
     */

    public String without2(String str) {
        if (str.length() < 2)
            return str;
        else if (str.substring(0, 2).equals(str.substring(str.length() - 2)))
            return str.substring(2);
        else
            return str;
    }

    /**
     * Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
     * and otherwise return the string unchanged.
     *   withoutX("xHix") → "Hi"
     *   withoutX("xHi") → "Hi"
     *   withoutX("Hxix") → "Hxi"
     * @param str string, can has any length
     * @return string, its if the first or last chars are 'x', return the string without those 'x' chars,
     * and otherwise return the string unchanged
     */

    public String withoutX(String str) {
        String result = str;

        if (result.startsWith("x"))
            result = result.substring(1);

        if (result.endsWith("x"))
            result = result.substring(0, result.length() - 1);

        return result;
    }


    //******https://codingbat.com/java/String-1******third column

    /**
     * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
     * In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
     * Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
     *   makeTags("i", "Yay") → "<i>Yay</i>"
     *   makeTags("i", "Hello") → "<i>Hello</i>"
     *   makeTags("cite", "Yay") → "<cite>Yay</cite>"
     * @param tag string, its an html tag
     * @param word string, it can have any length
     * @return string, it concats tag to word to escape tag as the html temp allows
     */

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    /**
     * Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
     * If the string is shorter than length 2, return whatever there is, so "X" yields "X",
     * and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
     *   firstTwo("Hello") → "He"
     *   firstTwo("abcdefg") → "ab"
     *   firstTwo("ab") → "ab"
     * @param str string, can be any length
     * @return string, its made of its first two chars or
     * if the string is shorter than length 2, return whatever there is
     */

    public String firstTwo(String str) {
        if (str.length() < 1)
            return "";
        else if (str.length() == 1)
            return str;
        else
            return str.substring(0, 2);
    }

    /**
     * Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the
     * outside and the longer string on the inside. The strings will not be the same length,
     * but they may be empty (length 0).
     *   comboString("Hello", "hi") → "hiHellohi"
     *   comboString("hi", "Hello") → "hiHellohi"
     *   comboString("aaa", "b") → "baaab"
     * @param a string, can be any length
     * @param b string, can be any length
     * @return string, concats the shortest param to longest param to shortest param
     */

    public String comboString(String a, String b) {
        if (a.length() > b.length())
            return b + a + b;
        else
            return a + b + a;
    }

    /**
     * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
     * The string length will be at least 2.
     *   right2("Hello") → "loHel"
     *   right2("java") → "vaja"
     *   right2("Hi") → "Hi"
     * @param str string, its length min 2
     * @return string, str param is rotated by right 2
     */

    public String right2(String str) {
        if (str.length() <= 2)
            return str;
        else
            return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    /**
     * Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
     * The string length will be at least 2.
     *   middleTwo("string") → "ri"
     *   middleTwo("code") → "od"
     *   middleTwo("Practice") → "ct"
     * @param str string, its length is even and ate least 2
     * @return string, its made of the middle two chars
     */

    public String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1 );
    }

    /**
     * Given a string and an index, return a string length 2 starting at the given index. If the index is too big
     * or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
     *   twoChar("java", 0) → "ja"
     *   twoChar("java", 2) → "va"
     *   twoChar("java", 3) → "ja"
     * @param str string, its length min 2
     * @param index int, can be any int number
     * @return string, its length 2 starting at the given index. If the index is too big or too small to define a string
     * length 2, use the first 2 chars. The string length will be at least 2.
     */

    public String twoChar(String str, int index) {
        if (index + 2 > str.length() || index < 0)
            return str.substring(0, 2);
        else
            return str.substring(index, index + 2);
    }

    /**
     * Given a string, return a string length 2 made of its first 2 chars. If the string length is less
     * than 2, use '@' for the missing chars.
     *   atFirst("hello") → "he"
     *   atFirst("hi") → "hi"
     *   atFirst("h") → "h@"
     * @param str string, can be any length
     * @return string, its length 2 made of its first 2 chars. If the string length is less than 2, use '@'
     * for the missing chars.
     */

    public String atFirst(String str) {
        if (str.length() == 0)
            return "@@";
        else if (str.length() == 1)
            return str + "@";
        else
            return str.substring(0, 2);
    }

    /**
     * Given a string of any length, return a new string where the last 2 chars, if present, are swapped,
     * so "coding" yields "codign".
     *   lastTwo("coding") → "codign"
     *   lastTwo("cat") → "cta"
     *   lastTwo("ab") → "ba"
     * @param str string, can be any length
     * @return string, its where the last 2 chars, if present, are swapped
     */

    public String lastTwo(String str) {
        if (str.length() < 2)
            return str;
        else
            return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }

    /**
     * Given two strings, append them together (known as "concatenation") and return the result. However, if the
     * strings are different lengths, omit chars from the longer string so it is the same length as the shorter
     * string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
     *   minCat("Hello", "Hi") → "loHi"
     *   minCat("Hello", "java") → "ellojava"
     *   minCat("java", "Hello") → "javaello"
     * @param a string ,may be any length
     * @param b string ,may be any length
     * @return string, its append a and b param together. However, if the strings are different lengths, omit chars from
     * the longer string so it is the same length as the shorter string.
     */

    public String minCat(String a, String b) {
        if (a.length() < b.length())
            return a + b.substring(b.length() - a.length());
        else
            return a.substring(a.length() - b.length()) + b;
    }

    /**
     * Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and
     * keep the second char if it is 'b'. The string may be any length. Harder than it looks.
     *   deFront("Hello") → "llo"
     *   deFront("java") → "va"
     *   deFront("away") → "aay"
     * @param str string, may be any length
     * @return string, its a version without the first 2 chars. Except keep the first char if it is 'a' and
     * keep the second char if it is 'b'.
     */

    public String deFront(String str) {
        String a = "a";
        String b = "b";

        if (str.charAt(0) == 'a' && str.charAt(1) == 'b')
            return str;
        else if (str.charAt(0) == 'a')
            return a + str.substring(2);
        else if (str.charAt(1) == 'b')
            return b + str.substring(2);
        else
            return str.substring(2);
    }

    /**
     * Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
     * and otherwise return the string unchanged. This is a little harder than it looks.
     *   withoutX2("xHi") → "Hi"
     *   withoutX2("Hxi") → "Hi"
     *   withoutX2("Hi") → "Hi"
     * @param str string, may be any length
     * @return string, its without those 'x' chars, and otherwise return the string unchanged
     */

    public String withoutX2(String str) {
        if (str.length() == 0) //if the str parameter is empty it returns en empty string
            return "";
        else if (str.length() < 2 && str.charAt(0) == 'x')
            //if the str less than 2 characters and that character is 'x' returns the empty string
            return "";
        else if (str.length() < 2)
            //if the str less than 2 characters and that character is 'x' returns the str itself
            return str;
        else if (str.startsWith("xx"))
            //if the str starts with xx characters returns the str without the first two chars
            return str.substring(2);
        else if (str.startsWith("x"))
            //if the str starts only one x character returns without the first char
            return str.substring(1);
        else if (str.charAt(1) == 'x')
            //if the str second char is x returns without the second char
            return "" + str.charAt(0) + str.substring(2);
        else
            return str;
    }
}

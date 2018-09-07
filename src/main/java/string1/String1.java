package string1;

public class String1 {
    //******https://codingbat.com/java/String-1******first column

    //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
      //helloName("Bob") → "Hello Bob!"
      //helloName("Alice") → "Hello Alice!"
      //helloName("X") → "Hello X!"

    public String helloName(String name) {
        return "Hello " + name + "!";
    }


    //Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word
    //is in the middle of the out string, e.g. "<<word>>".
    //Note: use str.substring(i, j) to extract the String starting
    //at index i and going up to but not including index j.
      //makeOutWord("<<>>", "Yay") → "<<Yay>>"
      //makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
      //makeOutWord("[[]]", "word") → "[[word]]"

    public String makeOutWord(String out, String word) {
        return "" + out.charAt(0) + out.charAt(1) + word + out.charAt(2) + out.charAt(3);
    }


    //Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
      //firstHalf("WooHoo") → "Woo"
      //firstHalf("HelloThere") → "Hello"
      //firstHalf("abcdef") → "abc"

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }


    //Given 2 strings, return their concatenation, except omit the first char of each.
    //The strings will be at least length 1.
      //nonStart("Hello", "There") → "ellohere"
      //nonStart("java", "code") → "avaode"
      //nonStart("shotl", "java") → "hotlava"

    public String nonStart(String a, String b) {
        String firstPart = a.substring(1);
        String secondPart = b.substring(1);

        return firstPart + secondPart;
    }


    //Given a string, return a string length 1 from its front, unless front is false,
    //in which case return a string length 1 from its back. The string will be non-empty.
      //theEnd("Hello", true) → "H"
      //theEnd("Hello", false) → "o"
      //theEnd("oh", true) → "o"

    public String theEnd(String str, boolean front) {
        if (front)
            return "" + str.charAt(0);
        else
            return "" + str.charAt(str.length() - 1);
    }


    //Given a string, return true if it ends in "ly".
      //endsLy("oddly") → true
      //endsLy("y") → false
      //endsLy("oddy") → false

    public boolean endsLy(String str) {
        if (str.length() < 2)
            return false;
        else if ("ly".equals(str.substring(str.length() - 2)))
            return true;
        else
            return false;
    }


    //Given a string of odd length, return the string length 3 from its middle,
    //so "Candy" yields "and". The string length will be at least 3.
      //middleThree("Candy") → "and"
      //middleThree("and") → "and"
      //middleThree("solving") → "lvi"

    public String middleThree(String str) {
        if (str.length() <= 3) {
            return str;
        }
        else {
            return str.substring((str.length() - 3) / 2, ((str.length() - 3) / 2) + 3);
        }
    }


    //Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
    //so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
      //lastChars("last", "chars") → "ls"
      //lastChars("yo", "java") → "ya"
      //lastChars("hi", "") → "h@"

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


    //Given a string, if the string begins with "red" or "blue" return
    //that color string, otherwise return the empty string.
      //seeColor("redxx") → "red"
      //seeColor("xxred") → ""
      //seeColor("blueTimes") → "blue"

    public String seeColor(String str) {
        if (str.startsWith("red"))
            return "red";
        else if (str.startsWith("blue"))
            return "blue";
        else
            return "";
    }


    //Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
    //The string may be any length. If there are fewer than 2 chars, use whatever is there.
      //extraFront("Hello") → "HeHeHe"
      //extraFront("ab") → "ababab"
      //extraFront("H") → "HHH"

    public String extraFront(String str) {
        if (str.length() < 2)
            return str + str + str;
        else
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }


    //Given a string and a second "word" string, we'll say that the word matches the string
    //if it appears at the front of the string, except its first char does not need to match exactly.
    //On a match, return the front of the string, or otherwise return the empty string.
    //So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
    //The word will be at least length 1.
      //startWord("hippo", "hi") → "hi"
      //startWord("hippo", "xip") → "hip"
      //startWord("hippo", "i") → "h"

    public String startWord(String str, String word) {
        if (str.startsWith(word)) {
            return word;
        } else if (str.charAt(1) == word.charAt(1) &&  str.charAt(2) == word.charAt(2)) {
            return "" + str.charAt(0) + str.charAt(1) + str.charAt(2);
        } else {
            return "";
        }

    }
}

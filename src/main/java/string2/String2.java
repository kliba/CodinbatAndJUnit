package string2;

import java.util.ArrayList;
import java.util.List;

public class String2 {

    //******https://codingbat.com/java/String-1******first column

    //Given a string, return a string where for every char in the original, there are two chars.
    //doubleChar("The") → "TThhee"
    //doubleChar("AAbb") → "AAAAbbbb"
    //doubleChar("Hi-There") → "HHii--TThheerree"

    public String doubleChar(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i) + str.charAt(i);
        }

        return result;
    }


    //Return the number of times that the string "code" appears anywhere in the given string,
    //except we'll accept any letter for the 'd', so "cope" and "cooe" count.
    //countCode("aaacodebbb") → 1
    //countCode("codexxcode") → 2
    //countCode("cozexxcope") → 2

    public int countCode(String str) {
        int counter = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                counter++;
            }
        }

        return counter;
    }


    //Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
    //bobThere("abcbob") → true
    //bobThere("b9b") → true
    //bobThere("bac") → false

    public boolean bobThere(String str) {

        for(int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
                return true;
        }

        return false;
    }


    //Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
    //You may assume that n is between 0 and the length of the string, inclusive.
    //repeatEnd("Hello", 3) → "llollollo"
    //repeatEnd("Hello", 2) → "lolo"
    //repeatEnd("Hello", 1) → "o"

    public String repeatEnd(String str, int n) {
        String result = str.substring(str.length() - n);

        for (int i = 0; i < n - 1; i++) {
            result += str.substring(str.length() - n);
        }

        return result;
    }


    //Given a string, consider the prefix string made of the first N chars of the string.
    //Does that prefix string appear somewhere else in the string?
    //Assume that the string is not empty and that N is in the range 1..str.length().
    //prefixAgain("abXYabc", 1) → true
    //prefixAgain("abXYabc", 2) → true
    //prefixAgain("abXYabc", 3) → false

    public boolean prefixAgain(String str, int n) {
        String part = str.substring(0, n);

        if (str.length() == 2 && part.equals("" + str.charAt(1)) && n == 1)
            return true;

        for (int i = 1; i < str.length() - n; i++) {

            if (part.equals(str.substring(i, i + n))) {
                return true;
            }
        }

        return false;
    }


    //Returns true if for every '*' (star) in the string, if there are chars both
    //immediately before and after the star, they are the same.
      //sameStarChar("xy*yzz") → true
      //sameStarChar("xy*zzz") → false
      //sameStarChar("*xa*az") → true

    public boolean sameStarChar(String str) {
        int starCounter = 0;
        int sameLetterCounter = 0;

        if (str.length() == 0)
            return true;
        else if (str.length() == 1)
            return true;
        else if (str.length() == 2)
            return true;

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                starCounter++;

              if (str.charAt(i - 1) == str.charAt(i + 1)) {
                  sameLetterCounter++;
              }
            }
        }

        if (starCounter == sameLetterCounter) {
            return true;
        } else {
            return false;
        }
    }


    //Return a version of the given string, where for every star (*) in the string the star and
    //the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
      //starOut("ab*cd") → "ad"
      //starOut("ab**cd") → "ad"
      //starOut("sm*eilly") → "silly"

    public String starOut(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            //if the measured char of the string is star OR this is not on the 0 index AND
            //right before of the star is * then jump to the next iteration
            if (str.charAt(i) == '*' || (i > 0 && str.charAt(i - 1) == '*')) continue;

            //if the index is smaller than the parameter length - 1 AND index + 1 is a star
            //jumps to the next iteration
            if (i < str.length() - 1 && str.charAt(i + 1) == '*') continue;

            result = result + str.charAt(i);
        }

        return result;
    }


    //******https://codingbat.com/java/String-1******second column

    //Return the number of times that the string "hi" appears anywhere in the given string.
    //countHi("abc hi ho") → 1
    //countHi("ABChi hi") → 2
    //countHi("hihi") → 2

    public int countHi(String str) {
        int counter = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if ("hi".equals(str.substring(i, i + 2))) {
                counter++;
            }
        }
        return counter;
    }


    //Given two strings, return true if either of the strings appears at the very end of the other string,
    //ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
    //Note: str.toLowerCase() returns the lowercase version of a string.
      //endOther("Hiabc", "abc") → true
      //endOther("AbC", "HiaBc") → true
      //endOther("abc", "abXabc") → true

    public boolean endOther(String a, String b) {
        String lowerCaseA = a.toLowerCase();
        String lowerCaseB = b.toLowerCase();

        if (lowerCaseA.endsWith(lowerCaseB) || lowerCaseB.endsWith(lowerCaseA))
            return true;
        else
            return false;
    }


    //We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char
    //somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
    //Return true if the given string is xy-balanced.
      //xyBalance("aaxbby") → true
      //xyBalance("aaxbb") → false
      //xyBalance("yaaxbb") → false

    public boolean xyBalance(String str) {

        List<Integer> listOfX = new ArrayList<>();
        List<Integer> listOfY = new ArrayList<>();

        //collects the position of x and y then add them to the relevant list object
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                listOfX.add(i);
            } else if (str.charAt(i) == 'y') {
                listOfY.add(i);
            }
        }

        if (listOfX.size() == 0 && listOfY.size() == 0) {
            return true;
        } else if (listOfX.size() == 0) {
            return true;
        } else if (listOfY.size() == 0) {
            return false;
        } else if ( listOfX.get(listOfX.size() - 1) > listOfY.get(listOfY.size() - 1)) {
            return false;
        } else {
            return true;
        }
    }



    //Given a string and an int n, return a string made of the first n characters of the string,
    //followed by the first n-1 characters of the string, and so on.
    //You may assume that n is between 0 and the length of the string, inclusive
    //(i.e. n >= 0 and n <= str.length()).
      //repeatFront("Chocolate", 4) → "ChocChoChC"
      //repeatFront("Chocolate", 3) → "ChoChC"
      //repeatFront("Ice Cream", 2) → "IcI"

    public String repeatFront(String str, int n) {
        String returnValue = str.substring(0, n);

        for (int i = n - 1; i > 0; i--) {
            returnValue += returnValue.substring(0, i);
        }

        return returnValue;
    }


    //Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that
    //the number of chars to the left and right of the "xyz" must differ by at most one.
    //This problem is harder than it looks.
      //xyzMiddle("AAxyzBB") → true
      //xyzMiddle("AxyzBB") → true
      //xyzMiddle("AxyzBBB") → false

    public boolean xyzMiddle(String str) {
        String xyz = "xyz";
        int length = str.length();
        int beforeCount = 0;
        int afterCount = 0;

        if (length < 3) {
            return false;
        }

        if (xyz.equals(str)) {
            return true;
        }

        for (int i = 0; i < length - 3; i++) {

            if (xyz.equals(str.substring(i, i + 3))) {
                afterCount = length - (i + 3);
                beforeCount = length - afterCount - xyz.length();

                if (afterCount == beforeCount ||
                        afterCount == beforeCount - 1 ||
                        afterCount - 1 == beforeCount) {
                    return true;
                }
            }
        }

        return false;
    }


    //Given a string, compute a new string by moving the first char to come after the next two chars,
    //so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars,
    //so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
      //oneTwo("abc") → "bca"
      //oneTwo("tca") → "cat"
      //oneTwo("tcagdo") → "catdog"

    public String oneTwo(String str) {
        String result = "";

        for (int i = 0; i < str.length() - 2; i = i + 3) {
            result = result + str.charAt(i + 1) + str.charAt(i + 2) + str.charAt(i);
        }

        return result;
    }

}

package string2;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.ArrayList;
import java.util.List;

public class String2 {

    //******https://codingbat.com/java/String-2******first column

    /**
     * Given a string, return a string where for every char in the original, there are two chars.
     *   doubleChar("The") → "TThhee"
     *   doubleChar("AAbb") → "AAAAbbbb"
     *   doubleChar("Hi-There") → "HHii--TThheerree"
     * @param str string, may be any length
     * @return string, where for every char in the original, there are two chars
     */

    public String doubleChar(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i) + str.charAt(i);
        }

        return result;
    }

    /**
     * Return the number of times that the string "code" appears anywhere in the given string,
     * except we'll accept any letter for the 'd', so "cope" and "cooe" count.
     *   countCode("aaacodebbb") → 1
     *   countCode("codexxcode") → 2
     *   countCode("cozexxcope") → 2
     * @param str string, may be any length
     * @return int, counting the number of times that the string "code" appears anywhere in the given string,
     * except we'll accept any letter for the 'd', so "cope" and "cooe" count.
     */

    public int countCode(String str) {
        int counter = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                counter++;
            }
        }

        return counter;
    }

    /**
     * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
     *   bobThere("abcbob") → true
     *   bobThere("b9b") → true
     *   bobThere("bac") → false
     * @param str string, may be any length
     * @return boolean, its true if the str param contains "bob"
     */

    public boolean bobThere(String str) {

        for(int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
                return true;
        }

        return false;
    }

    /**
     * Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
     * You may assume that n is between 0 and the length of the string, inclusive.
     *   repeatEnd("Hello", 3) → "llollollo"
     *   repeatEnd("Hello", 2) → "lolo"
     *   repeatEnd("Hello", 1) → "o"
     * @param str string
     * @param n int
     * @return string, its made of n repetitions of the last n characters of the string
     */

    public String repeatEnd(String str, int n) {
        String result = str.substring(str.length() - n);

        for (int i = 0; i < n - 1; i++) {
            result += str.substring(str.length() - n);
        }

        return result;
    }

    /**
     * Given a string, consider the prefix string made of the first N chars of the string.
     * Does that prefix string appear somewhere else in the string?
     * Assume that the string is not empty and that N is in the range 1..str.length().
     *   prefixAgain("abXYabc", 1) → true
     *   prefixAgain("abXYabc", 2) → true
     *   prefixAgain("abXYabc", 3) → false
     * @param str string, non.empty
     * @param n int, range in 1..str.length()
     * @return boolean, its true if prefix string appear somewhere else in the string
     */

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

    /**
     * Returns true if for every '*' (star) in the string, if there are chars both
     * immediately before and after the star, they are the same.
     *   sameStarChar("xy*yzz") → true
     *   sameStarChar("xy*zzz") → false
     *   sameStarChar("*xa*az") → true
     * @param str string, may be any length
     * @return boolean, its true if for every '*' (star) in the string, if there are chars both
     * immediately before and after the star, they are the same
     */

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

    /**
     * Return a version of the given string, where for every star (*) in the string the star and
     * the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
     *   starOut("ab*cd") → "ad"
     *   starOut("ab**cd") → "ad"
     *   starOut("sm*eilly") → "silly"
     * @param str string, may be any length
     * @return string, its version of the given string, where for every star (*) in the string the star and the chars
     * immediately to its left and right are gone
     */

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


    //******https://codingbat.com/java/String-2******second column

    /**
     * Return the number of times that the string "hi" appears anywhere in the given string.
     *   countHi("abc hi ho") → 1
     *   countHi("ABChi hi") → 2
     *   countHi("hihi") → 2
     * @param str string, may be any length
     * @return int, that calculates number of times that the string "hi"
     */

    public int countHi(String str) {
        int counter = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if ("hi".equals(str.substring(i, i + 2))) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Given two strings, return true if either of the strings appears at the very end of the other string,
     * ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
     * Note: str.toLowerCase() returns the lowercase version of a string.
     *   endOther("Hiabc", "abc") → true
     *   endOther("AbC", "HiaBc") → true
     *   endOther("abc", "abXabc") → true
     * @param a string, may be any length
     * @param b string, may be any length
     * @return boolean, its true if if either of the strings appears at the very end of the other string,
     * ignoring upper/lower case differences
     */

    public boolean endOther(String a, String b) {
        String lowerCaseA = a.toLowerCase();
        String lowerCaseB = b.toLowerCase();

        if (lowerCaseA.endsWith(lowerCaseB) || lowerCaseB.endsWith(lowerCaseA))
            return true;
        else
            return false;
    }

    /**
     * We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char
     * somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
     * Return true if the given string is xy-balanced.
     *   xyBalance("aaxbby") → true
     *   xyBalance("aaxbb") → false
     *   xyBalance("yaaxbb") → false
     * @param str string, may be any length
     * @return boolean, its true if if the given string is xy-balanced
     */

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

    /**
     * Given a string and an int n, return a string made of the first n characters of the string,
     * followed by the first n-1 characters of the string, and so on.
     * You may assume that n is between 0 and the length of the string, inclusive
     * (i.e. n >= 0 and n <= str.length()).
     *   repeatFront("Chocolate", 4) → "ChocChoChC"
     *   repeatFront("Chocolate", 3) → "ChoChC"
     *   repeatFront("Ice Cream", 2) → "IcI"
     * @param str string, its not empty
     * @param n int, its non-negative number is between 0 and str.length()
     * @return string, its made of the first n characters of the string
     */

    public String repeatFront(String str, int n) {
        String returnValue = str.substring(0, n);

        for (int i = n - 1; i > 0; i--) {
            returnValue += returnValue.substring(0, i);
        }

        return returnValue;
    }

    /**
     * Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that
     * the number of chars to the left and right of the "xyz" must differ by at most one.
     * This problem is harder than it looks.
     *   xyzMiddle("AAxyzBB") → true
     *   xyzMiddle("AxyzBB") → true
     *   xyzMiddle("AxyzBBB") → false
     * @param str string, may be any length
     * @return boolean, its true if "xyz" appears in the middle of the string
     */

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

    /**
     * Given a string, compute a new string by moving the first char to come after the next two chars,
     * so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars,
     * so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
     *   oneTwo("abc") → "bca"
     *   oneTwo("tca") → "cat"
     *   oneTwo("tcagdo") → "catdog"
     * @param str string, may be any length
     * @return string, its moving the first char to come after the next two chars, then repeat this process for each
     * subsequent group of 3 chars and ignore any group of fewer than 3 chars at the end
     */

    public String oneTwo(String str) {
        String result = "";

        for (int i = 0; i < str.length() - 2; i = i + 3) {
            result = result + str.charAt(i + 1) + str.charAt(i + 2) + str.charAt(i);
        }

        return result;
    }

    /**
     * Given a string and a non-empty word string, return a version of the original String
     * where all chars have been replaced by pluses ("+"), except for appearances of the word string
     * which are preserved unchanged.
     * plusOut("12xy34", "xy") → "++xy++"
     * plusOut("12xy34", "1") → "1+++++"
     * plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
     * @param str string, may be any length
     * @param word string, its a non-empty one
     * @return string, its a version of the original String where all chars have been replaced by pluses ("+"), except
     * for appearances of the word string which are preserved unchanged
     */

    public String plusOut(String str, String word) {
        int lengthOfStr = str.length();
        int lengthOfWord = word.length();
        String out = "";

        for (int i = 0; i < lengthOfStr; i++) {

            if (i <= lengthOfStr - lengthOfWord) {
                String tmp = str.substring(i, i + lengthOfWord);

                if (tmp.equals(word)) {
                    out += word;
                    i += lengthOfWord - 1;
                } else
                    out += "+";
            } else
                out += "+";
        }
        return out;
    }


    //******https://codingbat.com/java/String-2******third column

    /**
     * Return true if the string "cat" and "dog" appear the same number of times in the given string.
     *   catDog("catdog") → true
     *   catDog("catcat") → false
     *   catDog("1cat1cadodog") → true
     * @param str string, may be any length
     * @return boolean, its true if the string "cat" and "dog" appear the same number of times in the given string
     */

    public boolean catDog(String str) {
        int dogCounter = 0;
        int catCounter = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                catCounter++;
            } else if (str.substring(i, i + 3).equals("dog")) {
                dogCounter++;
            }
        }

        if (catCounter == dogCounter) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Return true if the given string contains an appearance of "xyz" where the xyz is not directly
     * preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
     *   xyzThere("abcxyz") → true
     *   xyzThere("abc.xyz") → false
     *   xyzThere("xyz.abc") → true
     * @param str string, may be any length
     * @return boolean, its true if if the given string contains an appearance of "xyz" where the xyz is not directly
     * preceeded by a period (.)
     */

    public boolean xyzThere(String str) {
        String xyz = "xyz";

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith(xyz)) {
                return true;
            } else if (xyz.equals(str.substring(i, i + 3)) && str.charAt(i - 1) != '.') {
                return true;
            }
        }

        return false;
    }

    /**
     * Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
     * the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
     *   mixString("abc", "xyz") → "axbycz"
     *   mixString("Hi", "There") → "HTihere"
     *   mixString("xxxx", "There") → "xTxhxexre"
     * @param a string, may be any length
     * @param b string, may be any length
     * @return string, it creates a bigger string made of the first char of a, the first char of b, the second char
     * of a, the second char of b, and so on. Any leftover chars go at the end of the result.
     */

    public String mixString(String a, String b) {
        String out = "";
        int shorterString;

        //adding value for shorter parameter
        if (a.length() > b.length()) {
            shorterString = b.length();
        } else {
            shorterString = a.length();
        }

        //doing it if one of the params is empty at least
        if (a.length() == 0 && b.length() == 0) {
            return "";
        } else if (a.length() != 0 && b.length() == 0) {
            return a;
        } else if (a.length() == 0) {
            return b;
        }

        //mixing the strings if the params are not empties
        for (int i = 0; i < shorterString; i++) {

            if (b.length() >= a.length() && i == shorterString - 1) {
                out = out + a.substring(i) + b.substring(i);
            } else if (a.length() > b.length() && i == shorterString - 1) {
                out = out + a.charAt(i) + b.substring(i) + a.substring(i + 1);
            } else {
                out = out + a.charAt(i) + b.charAt(i);
            }
        }

        return out;
    }

    /**
     * Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
     * separated by the separator string.
     *   repeatSeparator("Word", "X", 3) → "WordXWordXWord"
     *   repeatSeparator("This", "And", 2) → "ThisAndThis"
     *   repeatSeparator("This", "And", 1) → "This"
     * @param word string, my be any length
     * @param sep string, my be any length
     * @param count int, defines how many repeats there are
     * @return string, its a big string made of count occurrences of the word, separated by the separator string
     */

    public String repeatSeparator(String word, String sep, int count) {
        String bigString = word;

        if (count == 0) {
            return "";
        } else if (count == 1) {
            return bigString;
        } else {
            for (int i = 1; i < count; i++) {
                bigString = bigString + sep + word;
            }
        }

        return bigString;
    }

    /**
     * A sandwich is two pieces of bread with something in between. Return the string that is
     * between the first and last appearance of "bread" in the given string, or return the empty string ""
     * if there are not two pieces of bread.
     *   getSandwich("breadjambread") → "jam"
     *   getSandwich("xxbreadjambreadyy") → "jam"
     *   getSandwich("xxbreadyy") → ""
     * @param str string, may be any length
     * @return string, its between the first and last appearance of "bread" in the given string, or return the empty
     * string "" if there are not two pieces of bread
     */

    public String getSandwich(String str) {
        String bread = "bread";
        int coordinateOfFirstBread = 0;
        int coordinateOfSecondBread = 0;

        if (str.length() <= bread.length() * 2) {
            return "";
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (bread.equals(str.substring(i, i + bread.length()))) {
                    coordinateOfFirstBread = i + bread.length();
                    //System.out.println("coordinateOfFirstBread = " + coordinateOfFirstBread);
                    break;
                }
            }

            for (int i = str.length() - bread.length(); i > -1; i--) {
                if (bread.equals(str.substring(i, i + bread.length()))) {
                    coordinateOfSecondBread = i;
                    //System.out.println("coordinateOfSecondBread = " + coordinateOfSecondBread);
                    break;
                }
            }

            if (coordinateOfFirstBread != coordinateOfSecondBread) {
                return str.substring(coordinateOfFirstBread, coordinateOfSecondBread);
            }
        }

        return "";
    }

    /**
     * Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
     * Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
     *   zipZap("zipXzap") → "zpXzp"
     *   zipZap("zopzop") → "zpzp"
     *   zipZap("zzzopzop") → "zzzpzp"
     * @param str string, may be any length
     * @return string, that is where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp"
     */

    public String zipZap(String str) {
        String out = "";

        if (str.length() < 3) {
            return str;
        }

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                out = out + "zp";
                i = i + 2;
            } else {
                out = out + str.charAt(i);
            }
        }
        return out;
    }

    /**
     * Given a string and a non-empty word string, return a string made of each char just before and
     * just after every appearance of the word in the string.
     * Ignore cases where there is no char before or after the word,
     * and a char may be included twice if it is between two words.
     *   wordEnds("abcXY123XYijk", "XY") → "c13i"
     *   wordEnds("XY123XY", "XY") → "13"
     *   wordEnds("XY1XY", "XY") → "11
     * @param str string, may be any length
     * @param word string, non-empty string
     * @return string, made of each char just before and just after every appearance of the word in the string.
     * Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
     */

    public String wordEnds(String str, String word) {
        String out = "";

        //if the string is not longer than word we return an empty string
        if (word.length() >= str.length()) {
            return "";
        } else {
            //when the  str starts with the value word we concatenate out and first char after the word
            if (str.startsWith(word)) {
                out = out + str.charAt(word.length());
            }
            //iterate in the str and if it found a word in the str we concatenate the before and after chars to the out
            for (int i = 1; i < str.length() - word.length(); i++) {
                if (word.equals(str.substring(i, i + word.length()))) {
                    out = out + str.charAt(i - 1) + str.charAt(i + word.length());
                }
            }
            //when the end of the str is the word we concatenate the before char of the end of the word
            if (str.endsWith(word)) {
                out = out + str.charAt(str.length() - word.length() - 1);
            }
        }

        return out;
    }
}

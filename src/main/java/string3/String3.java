package string3;

public class String3 {

    //******https://codingbat.com/java/String-3******first column

    /**
     * Given a string, count the number of words ending in 'y' or 'z'
     * -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
     * We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
     * (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     *   countYZ("fez day") → 2
     *   countYZ("day fez") → 2
     *   countYZ("day fyyyz") → 2
     * @param str string, may be any length
     * @return itn, calculating the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez"
     * count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there
     * is not an alphabetic letter immediately following it.
     */

    public int countYZ(String str) {
        int len = str.length();
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < len; i++) {
            //if the actual char is y or z we can go ahead
            if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {
                //if the index nr is smaller than str.length() - 1 AND index nr + 1 is not a letter we can go ahead
                if (i < len-1 && !Character.isLetter(str.charAt(i+1)))
                    count++;
                //if index nr = str.length() we can add one to the count variable
                else if (i == len-1)
                    count++;
            }
        }

        return count;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     *   gHappy("xxggxx") → true
     *   gHappy("xxgxx") → false
     *   gHappy("xxggyygxx") → false
     * @param str string, may be any length
     * @return boolean, it is true if all the g's in the given string are happy
     */

    public boolean gHappy(String str) {
        if (str.length() == 0) {
            return true;
        }

        if(str.startsWith("g") && (str.length() == 1 || str.charAt(1) != 'g'))  {
            return false;
        } else if (str.endsWith("g") && str.charAt(str.length() - 2) != 'g') {
            return false;
        }

        for (int i = 1; i < str.length() - 1; i++) {

            if (str.charAt(i) == 'g' && str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g') {
                return false;
            }
        }

        for (int i = 0; i < str.length() - 1; i++) {
            if ("gg".equals(str.substring(i, i + 2))) {
                return true;
            }
        }

        return false;
    }

    /**
     * Given a string, return the longest substring that appears at both the beginning and end of the string
     * without overlapping. For example, sameEnds("abXab") is "ab".
     *   sameEnds("abXYab") → "ab"
     *   sameEnds("xx") → "x"
     *   sameEnds("xxx") → "x"
     * @param string string, may be any length
     * @return string, it is the longest substring that appears at both the beginning and end of the string without
     * overlapping
     */

    public String sameEnds(String string) {
        String samePart = "";
        int length = string.length();

        //if the parameter length is even nr
        if (length % 2 == 0) {
            for (int i = 0; i < length; i++) {
                for (int j = length / 2; j < length; j++) {
                    if (string.substring(0, i).equals(string.substring(j))) {
                        samePart = string.substring(j);
                    }
                }
            }
        } else {
            //if the parameter length is odd the j variable in the 2nd for cycle must be assigned ti start
            //from another index
            for (int i = 0; i < length; i++) {
                for (int j = length / 2 + 1; j < length; j++) {
                    if (string.substring(0, i).equals(string.substring(j))) {
                        samePart = string.substring(j);
                    }
                }
            }
        }

        return samePart;
    }

    /**
     * Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
     * A number is a series of 1 or more digit chars in a row.
     * (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
     * Integer.parseInt(string) converts a string to an int.)
     *   sumNumbers("abc123xyz") → 123
     *   sumNumbers("aa11b33") → 44
     *   sumNumbers("7 11") → 18
     * @param str string, may be any length
     * @return int, the sum of the numbers appearing in the string, ignoring all other characters
     */

    public int sumNumbers(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int count = 0;
                for (int j = i; j < str.length(); j++) {
                    if (Character.isDigit(str.charAt(j))) count++;
                    else break;
                }
                sum += Integer.parseInt(str.substring(i, i + count));
                i += count;
            }
        }
        return sum;
    }


    //******https://codingbat.com/java/String-3******second column

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove
     * string have been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *   withoutString("Hello there", "llo") → "He there"
     *   withoutString("Hello there", "e") → "Hllo thr"
     *   withoutString("Hello there", "x") → "Hello there"
     * @param base string, may be any length
     * @param remove string, is length 1 or more
     * @return string, its a version of the base string where all instances of the remove string have been removed
     * (not case sensitive)
     */

    public String withoutString(String base, String remove) {
        base=base.replace(remove.toUpperCase(),"");
        base=base.replace(remove.toLowerCase(),"");

        return base.replace(remove,"");
    }

    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     *   countTriple("abcXXXabc") → 1
     *   countTriple("xxxabyyyycd") → 3
     *   countTriple("a") → 0
     * @param str string, may be any length
     * @return int, calculating the number of triples in the given string
     */

    public int countTriple(String str) {
        int counter = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
     * In other words, zero or more characters at the very begining of the given string,
     * and at the very end of the string in reverse order (possibly overlapping).
     * For example, the string "abXYZba" has the mirror end "ab".
     *   mirrorEnds("abXYZba") → "ab"
     *   mirrorEnds("abca") → "a"
     *   mirrorEnds("aba") → "aba"
     * @param string string, may be any length
     * @return string, it is a mirror image (backwards) string at both the beginning and end of the given string
     */


    public String mirrorEnds(String string) {
        if (string.length() == 0) {
            return "";
        }

        String start = "" ;

        int index = 0;
        int indexBackward = string.length() - 1;

        for (; index < string.length();) {
            if (string.charAt(index) == string.charAt(indexBackward)) {
                start += string.charAt(index);
            } else {
                break;
            }
            index++;
            indexBackward--;
        }

        return start;
    }

    /**
     * Given a string, return a string where every appearance of the lowercase word "is" has been replaced
     * with "is not". The word "is" should not be immediately preceeded or followed by a letter
     * -- so for example the "is" in "this" does not count.
     * (Note: Character.isLetter(char) tests if a char is a letter.)
     *   notReplace("is test") → "is not test"
     *   notReplace("is-is") → "is not-is not"
     *   notReplace("This is right") → "This is not right"
     * @param str string, may be any length
     * @return string, it is where every appearance of the lowercase word "is" has been replaced with "is not". The word
     * "is" should not be immediately preceeded or followed by a letter
     */

    public String notReplace(String str) {
        String result = "";
        result = str.replaceAll("\\s+?is\\s+?", " is not ");
        result = result.replaceAll("^is\\s+?", "is not ");
        result = result.replaceAll("^is(\\S+?)is$", "is not$1is not");
        result = result.replaceAll("\\s+?is$", " is not");
        result = result.replaceAll("^is$", "is not");

        return result;
    }

    //******https://codingbat.com/java/String-3******third column

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the
     * number of appearances of "not" anywhere in the string (case sensitive).
     *   equalIsNot("This is not") → false
     *   equalIsNot("This is notnot") → true
     *   equalIsNot("noisxxnotyynotxisi") → true
     * @param str string, may be any length
     * @return boolean, it is true if the number of appearances of "is" anywhere in the string is equal to the number of
     * appearances of "not" anywhere in the string (case sensitive)
     */

    public boolean equalIsNot(String str) {
        int isCount = 0;
        int notCount = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if ("is".equals(str.substring(i, i + 2))) {
                isCount++;
            }
        }

        for (int i = 0; i < str.length() - 2; i++) {
            if ("not".equals(str.substring(i, i + 3))) {
                notCount++;
            }
        }

        if (isCount == notCount) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
     * Return 0 if there are no digits in the string.
     * (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
     * Integer.parseInt(string) converts a string to an int.)
     *   sumDigits("aa1bc2d3") → 6
     *   sumDigits("aa11b33") → 8
     *   sumDigits("Chocolate") → 0
     * @param str string, may be any length
     * @return int, calculating the sum of the digits 0-9 that appear in the string, ignoring all other characters.
     * Return 0 if there are no digits in the string.
     */

    public int sumDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt("" + str.charAt(i));
            }
        }

        return sum;
    }

    /**
     * Given a string, return the length of the largest "block" in the string.
     * A block is a run of adjacent chars that are the same.
     *   maxBlock("hoopla") → 2
     *   maxBlock("abbCCCddBBBxx") → 3
     *   maxBlock("") → 0
     * @param str string, may be any length
     * @return int, calculates the length of the largest "block" in the string.
     * A block is a run of adjacent chars that are the same.
     */


    public int maxBlock(String str) {
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > max) max = count;
        }
        return max;
    }
}

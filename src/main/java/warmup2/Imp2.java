package warmup2;

public class Imp2 {

    //******https://codingbat.com/java/Warmup-2******first column

    /**
     * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
     *   stringTimes("Hi", 2) → "HiHi"
     *   stringTimes("Hi", 3) → "HiHiHi"
     *   stringTimes("Hi", 1) → "Hi"
     * @param str string, can be any length
     * @param n int, its a non-negative number
     * @return string, it is n copies of the original string
     */

    public String stringTimes(String str, int n) {
        String result = "";

        for (int i = 0; i < n; i++) {
            result += str;
        }

        return result;
    }

    /**
     * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
     *   doubleX("axxbb") → true
     *   doubleX("axaxax") → false
     *   doubleX("xxxxx") → true
     * @param str string, may be any length
     * @return boolean, it is true if the first instance of "x" in the string is immediately followed by another "x"
     */

    public boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i+1, i+2).equals("x");
    }

    /**
     * Given a string, return the count of the number of times that a substring length 2 appears in the string and
     * also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
     *   last2("hixxhi") → 1
     *   last2("xaxxaxaxx") → 1
     *   last2("axxxaaxx") → 2
     * @param str string, may be any length
     * @return int, it is the count of the number of times that a substring length 2 appears in the string and
     * also as the last 2 chars of the string
     */

    public int last2(String str) {

        if (str.length() > 1) {
            String last2Chars = str.substring(str.length() - 2);
            int counter = 0;

            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 2).equals(last2Chars)) {
                    counter++;
                }
            }
            return counter;
        } else {
            return 0;
        }
    }

    /**
     * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
     *   array123([1, 1, 2, 3, 1]) → true
     *   array123([1, 1, 2, 4, 1]) → false
     *   array123([1, 1, 2, 1, 2, 3]) → true
     * @param nums int array, may be any length
     * @return boolean, it is true if the sequence of numbers 1, 2, 3 appears in the array somewhere
     */

    public boolean array123(int[] nums) {
        if (nums.length > 2) {
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                    return true;
                }
            }
        } else {
            return false;
        }
        return false;
    }

    /**
     * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
     *   altPairs("kitten") → "kien"
     *   altPairs("Chocolate") → "Chole"
     *   altPairs("CodingHorror") → "Congrr"
     * @param str string, may be any length
     * @return string, made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien"
     */

    public String altPairs(String str) {
        String solution = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == 1 || i == 4 || i == 5 || i == 8 || i == 9 || i == 12 || i == 13) {
                solution += str.charAt(i);
            }
        }
        return solution;

        //Better solution without hard coding!!
        //  String result = "";
        //
        //  // Run i by 4 to hit 0, 4, 8, ...
        //  for (int i=0; i<str.length(); i += 4) {
        //    // Append the chars between i and i+2
        //    int end = i + 2;
        //    if (end > str.length()) {
        //      end = str.length();
        //    }
        //    result = result + str.substring(i, end);
        //  }
        //
        //  return result;
    }

    /**
     * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
     * Return true if the array does not contain any triples.
     *   noTriples([1, 1, 2, 2, 1]) → true
     *   noTriples([1, 1, 2, 2, 2, 1]) → false
     *   noTriples([1, 1, 1, 2, 2, 2, 1]) → false
     * @param nums int array, may be any length
     * @return boolean, it is true if the array does not contain any triples
     */

    public boolean noTriples(int[] nums) {

        if (nums.length < 3) {
            return true;
        } else {
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                    return false;
                }
            }
        }
        return true;
    }

//******https://codingbat.com/java/Warmup-2******second column

    /**
     * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
     * or whatever is there if the string is less than length 3. Return n copies of the front;
     *   frontTimes("Chocolate", 2) → "ChoCho"
     *   frontTimes("Chocolate", 3) → "ChoChoCho"
     *   frontTimes("Abc", 3) → "AbcAbcAbc
     * @param str string, may be any length
     * @param n int, non-negative
     * @return string, that the front of the string is the first 3 chars,
     * or whatever is there if the string is less than length 3. Return n copies of the front
     */

    public String frontTimes(String str, int n) {
        String result = "";

        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                result += str;
            }
        } else {
            String first3Chars = str.substring(0, 3);

            for (int i = 0; i < n; i++) {
                result += first3Chars;
            }
        }
        return result;
    }

    /**
     * Given a string, return a new string made of every other char starting with the first,
     * so "Hello" yields "Hlo".
     *   stringBits("Hello") → "Hlo"
     *   stringBits("Hi") → "H"
     *   stringBits("Heeololeo") → "Hello"
     * @param str string, may be any length
     * @return string, it made of every other char starting with the first
     */

    public String stringBits(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        return result;
    }

    /**
     * Given an array of ints, return the number of 9's in the array.
     *   arrayCount9([1, 2, 9]) → 1
     *   arrayCount9([1, 9, 9]) → 2
     *   arrayCount9([1, 9, 9, 3, 9]) → 3
     * @param nums int array, may be any length
     * @return int, it is the number of 9's in the array
     */

    public int arrayCount9(int[] nums) {
        int nine = 9;
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nine) counter++;
        }
        return counter;
    }

    /**
     * Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
     * So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear
     * in the same place in both strings.
     *   stringMatch("xxcaazz", "xxbaaz") → 3
     *   stringMatch("abc", "abc") → 2
     *   stringMatch("abc", "axc") → 0
     * @param a string, may be any length
     * @param b string, may be any length
     * @return int, it is the number of the positions where they contain the same length 2 substring
     */

    public int stringMatch(String a, String b) {
        // Figure which string is shorter.
        int len = Math.min(a.length(), b.length());
        int count = 0;

        // Look at both substrings starting at i
        for (int i=0; i<len-1; i++) {
            String aSub = a.substring(i, i+2);
            String bSub = b.substring(i, i+2);
            if (aSub.equals(bSub)) {  // Use .equals() with strings
                count++;
            }
        }
        return count;
    }

    /**
     * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
     * but the "a" can be any char. The "yak" strings will not overlap.
     *   stringYak("yakpak") → "pak"
     *   stringYak("pakyak") → "pak"
     *   stringYak("yak123ya") → "123ya"
     * @param str string, can be any length
     * @return string, it is where all the "yak" are removed, but the "a" can be any char
     */

    public String stringYak(String str) {
        String yak = "yak";
        String result = "";

        for (String parts: str.split(yak)) {
            result += parts;
        }

        return result;
    }

    /**
     * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5,
     * followed by the value minus 1. Additionally the 271 counts even if the "1" differs
     * by 2 or less from the correct value.
     *   has271([1, 2, 7, 1]) → true
     *   has271([1, 2, 8, 1]) → false
     *   has271([2, 7, 1]) → true
     * @param nums int array, may be any length
     * @return boolean, it is true if it contains a 2, 7, 1 pattern
     */

    public boolean has271(int[] nums) {
        if (nums.length < 3)
            return false;

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 5 &&
                    Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2)
                return true;
        }
        return false;
    }


//******https://codingbat.com/java/Warmup-2******third column

    /**
     * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
     *   countXX("abcxx") → 1
     *   countXX("xxx") → 2
     *   countXX("xxxx") → 3
     * @param str string, may be any length
     * @return int, it counts the "xx" in the given string, overlapping is allowed
     */

    public int countXX(String str) {
        String xx = "xx";
        int counter = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals(xx))
                counter++;
        }

        return counter;
    }

    /**
     * Given a non-empty string like "Code" return a string like "CCoCodCode".
     *   stringSplosion("Code") → "CCoCodCode"
     *   stringSplosion("abc") → "aababc"
     *   stringSplosion("ab") → "aab"
     * @param str string, non-empty
     * @return string, (eg: "Code" return a string like "CCoCodCode")
     */

    public String stringSplosion(String str) {
        String result = str.charAt(0) + "";

        for (int i = 1; i < str.length(); i++) {
            result += str.substring(0, i + 1);
        }
        return result;
    }

    /**
     * Given an array of ints, return true if one of the first 4 elements in the array is a 9.
     * The array length may be less than 4.
     *   arrayFront9([1, 2, 9, 3, 4]) → true
     *   arrayFront9([1, 2, 3, 4, 9]) → false
     *   arrayFront9([1, 2, 3, 4, 5]) → false
     * @param nums int array, may be any length
     * @return boolean, it is true if one of the first 4 elements in the array is a 9
     */

    public boolean arrayFront9(int[] nums) {
        int nine = 9;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nine && i <= 3) return true;
        }
        return false;
    }

    /**
     * Given a string, return a version where all the "x" have been removed.
     * Except an "x" at the very start or end should not be removed.
     *   stringX("xxHxix") → "xHix"
     *   stringX("abxxxcd") → "abcd"
     *   stringX("xabxxxcdx") → "xabcdx"
     * @param str string, may be any length
     * @return string, it is where all the "x" have been removed from the original string.
     * Except an "x" at the very start or end should not be removed.
     */

    public String stringX(String str) {
        if (str.length() > 2) {
            String x = "x";
            String result = "" + str.charAt(0);

            for (int i = 1; i < str.length() - 1; i++) {
                if (!(x.equals(str.charAt(i) + "")))
                    result += str.charAt(i);
            }
            return result + str.charAt(str.length() - 1);
        } else {
            return str;
        }
    }

    /**
     * Given an array of ints, return the number of times that two 6's are next to each other in the array.
     * Also count instances where the second "6" is actually a 7.
     *   array667([6, 6, 2]) → 1
     *   array667([6, 6, 2, 6]) → 1
     *   array667([6, 7, 2, 6]) → 1
     * @param nums int array, may be any length
     * @return int, it counts the number of times that two 6's are next to each other in the array.
     * Also count instances where the second "6" is actually a 7.
     */

    public int array667(int[] nums) {
        int counter = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] == 6 && nums[i + 1] == 6) ||
                    nums[i] == 6 && nums[i + 1] == 7)
                counter++;
        }

        return counter;
    }
}

package ap1;
import java.util.ArrayList;
import java.util.List;

public class AP1 {

    //******https://codingbat.com/java/AP-1******first column

    /**
     * Given an array of scores, return true if each score is equal or greater than the one before.
     * The array will be length 2 or more.
     *  scoresIncreasing([1, 3, 4]) → true
     *  scoresIncreasing([1, 3, 2]) → false
     *  scoresIncreasing([1, 1, 4]) → true
     * @param scores int Array what length is 2 ate least
     * @return true if each score is equal or greater than the one before
     */

    public boolean scoresIncreasing(int[] scores) {

        for (int i = 0; i < scores.length - 1; i++) {

            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Given an array of scores, compute the int average of the first half and the second half,
     * and return whichever is larger. We'll say that the second half begins at index length/2.
     * The array length will be at least 2. To practice decomposition, write a separate helper method
     * int average(int[] scores, int start, int end)
     * which computes the average of the elements between indexes start..end.
     * Call your helper method twice to implement scoresAverage().
     * Write your helper method after your scoresAverage() method in the JavaBat text area.
     * Normally you would compute averages with doubles, but here we use ints so the expected results are exact.
     *   scoresAverage([2, 2, 4, 4]) → 4
     *   scoresAverage([4, 4, 4, 2, 2, 2]) → 4
     *   scoresAverage([3, 4, 5, 1, 2, 3]) → 4
     * @param scores int Array, length will be at least 2.
     * @return An int, if the first half average is bigger than the second half average returns average of first half
     * on the other hand second half of average value.
     */

    public int scoresAverage(int[] scores) {
        int firstAvStart = 0;
        int firstAvEnd = scores.length / 2;
        int secondAvStart = scores.length / 2;
        int secondAvEnd = scores.length;

        return Math.max(average(scores, firstAvStart, firstAvEnd), average(scores, secondAvStart, secondAvEnd));
    }

    /**
     * It is a helper method of scoresAverage(); Calculates the input half average value.
     *
     * @param scores int Array, length will be at least 2.
     * @param start int, from index where starts calculate the average
     * @param end int, to index where starts calculate the average
     * @return int, what is the average value between the start index and end index parameters
     */
    public int average(int[] scores, int start, int end) {
        int average = 0;

        for (int i = start; i < end; i++) {
            average += scores[i];
        }

        return average / (end - start);
    }


    /**
     * Given an array of strings, return a new List (e.g. an ArrayList)
     * where all the strings of the given length are omitted.
     * See wordsWithout() below which is more difficult because it uses arrays.
     *   wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
     *   wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
     *   wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
     * @param words is a string array that, contains strings
     * @param len is an int that shows length of the String[] elements should be missed from the return List
     * @return List of Strings contains different length strings than len param.
     */

    public List wordsWithoutList(String[] words, int len) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                result.add(words[i]);
            }
        }

        return result;
    }


    /**
     * Given an array of positive ints, return a new array of length "count" containing the first even numbers
     * from the original array. The original array will contain at least "count" even numbers.
     *  copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
     *  copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
     *  copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
     * @param nums is an int array that, contains positive ints, at least "count" even numbers
     * @param count is an int that, shows the return array length
     * @return is an int array that, contains the first count numbered even numbers
    */

    public int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        int counter = 0;

        for (int i = 0; counter < count; i++) {
            if (nums[i] % 2 == 0) {
                result[counter] = nums[i];
                counter++;
            }
        }

        return result;
    }


    /**The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}.
     * the "answers" array contains a student's answers, with "?" representing a question left blank.
     * The two arrays are not empty and are the same length.
     * Return the score for this array of answers, giving +4 for each correct answer,
     * -1 for each incorrect answer, and +0 for each blank answer.
     *   scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
     *   scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
     *   scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16
     * @param key is a string array that containing the correct answers to an exam, like {"a", "a", "b", "b"}
     * @param answers is a string array that contains a student's answers, with "?" representing a question left blank
     * @return the score for this array of answers, giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer
     */

    public int scoreUp(String[] key, String[] answers) {
        int score = 0;

        for (int i = 0; i < key.length; i++) {
            if (key[i].equals(answers[i]) ) {
                score += 4;
            }else if (!key[i].equals(answers[i]) && Character.isLetter(answers[i].charAt(0))) {
                score -= 1;
            }
        }

        return score;
    }


    /**
     * We have an array of heights, representing the altitude along a walking trail.
     * Given start/end indexes into the array, return the sum of the changes for
     * a walk beginning at the start index and ending at the end index.
     * For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6.
     * The start end end index will both be valid indexes into the array with start <= end.
     *  sumHeights([5, 3, 6, 7, 2], 2, 4) → 6
     *  sumHeights([5, 3, 6, 7, 2], 0, 1) → 2
     *  sumHeights([5, 3, 6, 7, 2], 0, 4) → 11
     * @param heights is an int array that is representing the altitude along a walking trail
     * @param start is an int that means an index into the array where the iterate starts
     * @param end is an int that means an index into the array where the iterate ends
     * @return int that the sum of the changes for a walk beginning at the start index and ending at the end index
     */

    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;

        for (int i = start; i < end; i++) {
            sum += Math.abs(heights[i] - heights[i + 1]);
        }

        return sum;
    }


    /**
     * We have data for two users, A and B, each with a String name and an int id.
     *The goal is to order the users such as for sorting.
     *Return -1 if A comes before B, 1 if A comes after B, and 0 if they are the same.
     *Order first by the string names, and then by the id numbers if the names are the same.
     *Note: with Strings str1.compareTo(str2) returns an int value which is negative/0/positive
     *to indicate how str1 is ordered to str2 (the value is not limited to -1/0/1).
     *(On the AP, there would be two User objects, but here the code simply takes the two strings
     *and two ints directly. The code logic is the same.)
     *  userCompare("bb", 1, "zz", 2) → -1
     *  userCompare("bb", 1, "aa", 2) → 1
     *  userCompare("bb", 1, "bb", 1) → 0
     * @param aName is a string that contains A user name
     * @param aId is an int that contains id of the A user
     * @param bName is a string that contains B user name
     * @param bId is an int that contains id of the B user
     * @return is an int that -1 if A comes before B, 1 if A comes after B, and 0 if they are the same
     */

    public int userCompare(String aName, int aId, String bName, int bId) {

        if (aName.equals(bName) && aId == bId) {
            return 0;
        }

        int temp = aName.compareTo(bName);
        if (temp < 0) {
            return -1;
        } else if (temp > 0) {
            return 1;
        } else if (aId > bId) {
            return 1;
        } else {
            return -1;
        }
    }

    //******https://codingbat.com/java/AP-1******second column

    /**
     * Given an array of scores, return true if there are scores of 100 next to each other in the array.
     * The array length will be at least 2.
     *   scores100([1, 100, 100]) → true
     *   scores100([1, 100, 99, 100]) → false
     *   scores100([100, 1, 100, 100]) → true
     * @param scores is an int array that length is at least 2
     * @return a boolean that is true if there are scores of 100 next to each other in the array
     */

    public boolean scores100(int[] scores) {

        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) {
                return true;
            }
        }

        return false;
    }


    /**
     * Given an array of strings, return the count of the number of strings with the given length.
     *   wordsCount(["a", "bb", "b", "ccc"], 1) → 2
     *   wordsCount(["a", "bb", "b", "ccc"], 3) → 1
     *   wordsCount(["a", "bb", "b", "ccc"], 4) → 0
     * @param words is a string array
     * @param len shows what length of string has to be counted from the words param
     * @return is an int that counts of the number of strings with the given length
     */
    public int wordsCount(String[] words, int len) {
        int counter = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                counter++;
            }
        }

        return counter;
    }


    /**
     * Given a positive int n, return true if it contains a 1 digit.
     * Note: use % to get the rightmost digit, and / to discard the rightmost digit.
     *  hasOne(10) → true
     *  hasOne(22) → false
     *  hasOne(220) → false
     * @param n is an int that is a positive number
     * @return true if it contains a 1 digit
     */

    public boolean hasOne(int n) {
        String number = "" + n;

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '1') {
                return true;
            }
        }

        return false;
    }


    /**
     * We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive).
     * Given an array of positive ints, return a new array of length "count" containing
     * the first endy numbers from the original array.
     * Decompose out a separate isEndy(int n) method to test if a number is endy.
     * The original array will contain at least "count" endy numbers.
     *   copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
     *   copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
     *   copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]
     * @param nums is an int array that contains only positive numbers
     * @param count is an int that defines the lengths of the return array
     * @return new int array that containing the first endy numbers from the original array.
     */

    public int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];
        int resultIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] >= 0 && nums[i] <= 10) ||
                    (nums[i] >= 90 && nums[i] <= 100)) {
                result[resultIndex] = nums[i];
                ++resultIndex;

                if (resultIndex == count) {
                    break;
                }
            }
        }

        return result;
    }


    /**
     * Given an array of strings, return a new array without the strings that are equal to the target string.
     * One approach is to count the occurrences of the target string, make a new array of the correct length,
     * and then copy over the correct strings.
     *   wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
     *   wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
     *   wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
     * @param words is a string array
     * @param target is a string
     * @return string array that contains every words array element what is not same as the target
     */

    public String[] wordsWithout(String[] words, String target) {
        int resultLengthCount = 0;

        //calculate the return array length
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                resultLengthCount++;
            }
        }

        //creating the result array
        String[] result = new String[resultLengthCount];
        int resultIndex = resultLengthCount - 1;

        //upload relevant return array with the relevant strings
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].equals(target)) {
                result[resultIndex] = words[i];
                resultIndex--;
            }
        }

        return result;
    }


    /**
     * (A variation on the sumHeights problem.)
     * We have an array of heights, representing the altitude along a walking trail.
     * Given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index
     * and ending at the end index, however increases in height count double.
     * For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7.
     * The start end end index will both be valid indexes into the array with start <= end.
     *   sumHeights2([5, 3, 6, 7, 2], 2, 4) → 7
     *   sumHeights2([5, 3, 6, 7, 2], 0, 1) → 2
     *   sumHeights2([5, 3, 6, 7, 2], 0, 4) → 15
     * @param heights is an int array that representing the altitude along a walking trail
     * @param start is an int that means the start index if the iterating
     * @param end is am int that means the end index if the iterating
     * @return is an int that value increases in height count double
     */

    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;

        for (int i = start; i < end; i++) {
            if (heights[i] < heights[i + 1]) {
                sum += (Math.abs(heights[i] - heights[i + 1])) * 2;
            } else {
                sum += Math.abs(heights[i] - heights[i + 1]);
            }
        }

        return sum;
    }


    //******https://codingbat.com/java/AP-1******third column


    /**
     * Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
     * Return a new array containing the first N elements from the two arrays.
     * The result array should be in alphabetical order and without duplicates.
     * A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B,
     * taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.
     *   mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
     *   mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
     *   mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
     * @param a string array, its elements in alphabetical order and without duplicates
     * @param b string array, its elements in alphabetical order and without duplicates
     * @param n int, its define the return array length
     * @return string array that "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order
     */

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int indexOfA = 0;
        int indexOfB = 0;

        for (int i = 0; i < n; i++) {
            int temp = a[indexOfA].compareTo(b[indexOfB]);

            if (temp <= 0) {
                result[i] = a[indexOfA++];

                if (temp == 0) {
                    indexOfB++;
                }
            } else {
                result[i] = b[indexOfB++];
            }
        }

        return result;
    }


    /**
     * Given an array of scores sorted in increasing order, return true
     * if the array contains 3 adjacent scores that differ from each other by at most 2,
     * such as with {3, 4, 5} or {3, 5, 5}.
     *   scoresClump([3, 4, 5]) → true
     *   scoresClump([3, 4, 6]) → false
     *   scoresClump([1, 3, 5, 5]) → true
     * @param scores is an int array
     * @return boolean, its true if the array contains 3 adjacent scores that differ from each other by at most 2
     */

    public boolean scoresClump(int[] scores) {
        if (scores.length < 3) {
            return false;
        }

        for (int i = 0; i < scores.length - 2; i++) {
            if (scores[i + 2] - scores[i + 1] <= 2 && scores[i + 2] - scores[i] <= 2) {
                return true;
            }
        }

        return false;
    }


    /**
     * Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.wordsFront(["a", "b", "c", "d"], 1) → ["a"]
     *  wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
     *  wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]
     * @param words string array
     * @param n is an int that define the range of the iteration
     * @return string array that containing the first N strings
     */

    public String[] wordsFront(String[] words, int n) {
        String[] resultArray = new String[n];

        for (int i = 0; i < n; i++) {
            resultArray[i] = words[i];
        }

        return resultArray;
    }


    /**
     * We'll say that a positive int divides itself if every digit in the number divides into the number evenly.
     * So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly.
     * We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself.
     * Note: use % to get the rightmost digit, and / to discard the rightmost digit.
     *   dividesSelf(128) → true
     *   dividesSelf(12) → true
     *   dividesSelf(120) → false
     * @param n int, its number what measured by the definition
     * @return boolean so it is true if every digit in the number divides into the number evenly
     */

    public boolean dividesSelf(int n) {
        String number = "" + n;

        for (int i = 0; i < number.length(); i++) {
            if ( Integer.parseInt("" + number.charAt(i)) == 0||
                    n % Integer.parseInt("" + number.charAt(i)) != 0  ) {
                return false;
            }
        }

        return true;
    }


    /**
     * Given 2 arrays that are the same length containing strings, compare the 1st string in one array
     * to the 1st string in the other array, the 2nd to the 2nd and so on.
     * Count the number of times that the 2 strings are non-empty and start with the same char.
     * The strings may be any length, including 0.
     *   matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) → 1
     *   matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) → 2
     *   matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) → 1
     * @param a string array that length same as the other param
     * @param b string array that length same as the other param
     * @return int, what contain ount the number of times that the 2 strings are non-empty and start with the same char
     */

    public int matchUp(String[] a, String[] b) {
        int counter = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i].length() != 0 && b[i].length() != 0) {
                if (a[i].charAt(0) == b[i].charAt(0)) {
                    counter++;
                }
            }
        }

        return counter;
    }


    /**
     * Given two arrays, A and B, of non-negative int scores. A "special"
     * score is one which is a multiple of 10, such as 40 or 90.
     * Return the sum of largest special score in A and the largest special score in B.
     * To practice decomposition, write a separate helper method which finds the largest special score in an array.
     * Write your helper method after your scoresSpecial() method in the JavaBat text area.
     *   scoresSpecial([12, 10, 4], [2, 20, 30]) → 40
     *   scoresSpecial([20, 10, 4], [2, 20, 10]) → 40
     *   scoresSpecial([12, 11, 4], [2, 20, 31]) → 20
     * @param a int array contains only non-negative int scores
     * @param b int array contains only non-negative int scores
     * @return int that is the sum of largest special score in A and the largest special score in B.
     */

    public int scoresSpecial(int[] a, int[] b) {

        return helpScoresSpecial(a) + helpScoresSpecial(b);
    }

    /**
     * It is a helper method what finds the largest special score in an array
     * @param inputArray int array what is same as the one of the params of the scoresSpecial()
     * @return int where the values is the biggest element of the param if the element is dividable with ten
     */

    public int helpScoresSpecial(int[] inputArray) {
        int result = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 10 == 0 && inputArray[i] > result) {
                result = inputArray[i];
            }
        }

        return result;
    }


    /**
     * (A variation on the sumHeights problem.) We have an array of heights,
     * representing the altitude along a walking trail. Given start/end indexes into the array,
     * return the number of "big" steps for a walk starting at the start index and ending at the end index.
     * We'll say that step is big if it is 5 or more up or down. The start end end index will both be valid indexes
     * into the array with start <= end.
     *   bigHeights([5, 3, 6, 7, 2], 2, 4) → 1
     *   bigHeights([5, 3, 6, 7, 2], 0, 1) → 0
     *   bigHeights([5, 3, 6, 7, 2], 0, 4) → 1
     * @param heights int array what is a walking trail
     * @param start int, its index number what is the first index that should be iterating from
     * @param end int, its index number what is the last index that should be iterating to
     * @return the number of "big" steps for a walk starting at the start index and ending at the end index
     */

    public int bigHeights(int[] heights, int start, int end) {
        int countBig = 0;

        for (int i = start; i < end; i++) {
            if (heights[i] - 5 >= heights[i + 1] ||
                    heights[i] + 5 <= heights[i + 1]) {
                countBig++;
            }
        }

        return countBig;
    }


    /**
     * Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates.
     * Return the count of the number of strings which appear in both arrays.
     * The best "linear" solution makes a single pass over both arrays,
     * taking advantage of the fact that they are in alphabetical order.
     *   commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
     *   commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
     *   commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
     * @param a string array what contains strings in alphabetical order, possibly with duplicates
     * @param b string array what contains strings in alphabetical order, possibly with duplicates
     * @return int that counts of the number of strings which appear in both arrays
     */

    public int commonTwo(String[] a, String[] b) {
        int counter = 0;
        String lastChecked = null;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(lastChecked)) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i].equals(b[j])) {
                        lastChecked = a[i];
                        counter++;
                        break;
                    }
                }
            }
        }
        return counter;

    }

}

package ap1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AP1Test {

    AP1 testAP1 = new AP1();

    //******https://codingbat.com/java/AP-1******first column

    //scoresIncreasing
    @Test
    public void testScoresIncreasing() {
        int[] firstScoresIncreasing = {1, 3, 4};
        int[] secondScoresIncreasing = {1, 3, 2};
        int[] thirdScoresIncreasing = {1, 1, 4};
        int[] fifthScoresIncreasing = {1, 1, 2, 4, 4, 7};
        int[] sixthScoresIncreasing = {1, 1, 2, 4, 3, 7};
        int[] seventhScoresIncreasing = {-5, 4, 11};
        assertTrue(testAP1.scoresIncreasing(firstScoresIncreasing));
        assertFalse(testAP1.scoresIncreasing(secondScoresIncreasing));
        assertTrue(testAP1.scoresIncreasing(thirdScoresIncreasing));
        assertTrue(testAP1.scoresIncreasing(fifthScoresIncreasing));
        assertFalse(testAP1.scoresIncreasing(sixthScoresIncreasing));
        assertTrue(testAP1.scoresIncreasing(seventhScoresIncreasing));
    }

    //average
    @Test
    public void testAverage() {
        int[] firstAverage = {2, 2, 4, 4};
        int[] secondAverage = {4, 4, 4, 2, 2, 2};
        int[] thirdAverage = {3, 4, 5, 1, 2, 3};
        int[] fourthAverage = {5, 6};
        int[] fifthAverage = {5, 4};
        int[] sixthAverage = {5, 4, 5, 6, 2, 1, 2, 3};
        assertEquals(2, testAP1.average(firstAverage, 0, 1));
        assertEquals(4, testAP1.average(firstAverage, 2, 3));
        assertEquals(4, testAP1.average(secondAverage, 0, 2 ));
        assertEquals(4, testAP1.average(thirdAverage, 0, 3));
        assertEquals(3, testAP1.average(thirdAverage, 0, 6));
        assertEquals(2, testAP1.average(sixthAverage, 5, 8));
    }

    //scoresAverage
    @Test
    public void testScoresAverage() {
        int[] firstAverage = {2, 2, 4, 4};
        int[] secondAverage = {4, 4, 4, 2, 2, 2};
        int[] thirdAverage = {3, 4, 5, 1, 2, 3};
        int[] fourthAverage = {5, 6};
        int[] fifthAverage = {5, 4};
        int[] sixthAverage = {5, 4, 5, 6, 2, 1, 2, 3};
        assertEquals(4, testAP1.scoresAverage(firstAverage));
        assertEquals(4, testAP1.scoresAverage(secondAverage));
        assertEquals(4, testAP1.scoresAverage(thirdAverage));
        assertEquals(6, testAP1.scoresAverage(fourthAverage));
        assertEquals(5, testAP1.scoresAverage(fifthAverage));
        assertEquals(5, testAP1.scoresAverage(sixthAverage));
    }

    //wordsWithoutList
    @Test
    public void testWordsWithoutList() {
        String[] firstWordsWithoutList = {"a", "bb", "b", "ccc"};
        String[] secondWordsWithoutList = {"a", "bb", "b", "ccc"};
        String[] thirdWordsWithoutList = {"a", "bb", "b", "ccc"};
        String[] fourthWordsWithoutList = {"xx", "yyy", "x", "yy", "z"};
        String[] fifthWordsWithoutList = {"xx", "yyy", "x", "yy", "z"};

        List<String> firstWordsWithoutListSolution = Arrays.asList("bb", "ccc");
        List<String> secondWordsWithoutListSolution = Arrays.asList("a", "bb", "b");
        List<String> thirdWordsWithoutListSolution = Arrays.asList("a", "bb", "b", "ccc");
        List<String> fourthWordsWithoutListSolution = Arrays.asList("xx", "yyy", "yy");
        List<String> fifthWordsWithoutListSolution = Arrays.asList("yyy", "x", "z");

        assertEquals(firstWordsWithoutListSolution, testAP1.wordsWithoutList(firstWordsWithoutList, 1));
        assertEquals(secondWordsWithoutListSolution, testAP1.wordsWithoutList(secondWordsWithoutList, 3));
        assertEquals(thirdWordsWithoutListSolution, testAP1.wordsWithoutList(thirdWordsWithoutList, 4));
        assertEquals(fourthWordsWithoutListSolution, testAP1.wordsWithoutList(fourthWordsWithoutList, 1));
        assertEquals(fifthWordsWithoutListSolution, testAP1.wordsWithoutList(fifthWordsWithoutList, 2));
    }

    //copyEvens
    @Test
    public void testCopyEven() {
        int[] firstCopyEvens = {3, 2, 4, 5, 8};
        int[] secondCopyEvens = {3, 2, 4, 5, 8};
        int[] thirdCopyEvens = {6, 1, 2, 4, 5, 8};
        int[] fourthCopyEvens = {6, 1, 2, 4, 5, 8};
        int[] fifthCopyEvens = {3, 1, 4, 1, 5};
        int[] sixthCopyEvens = {2};
        int[] seventhCopyEvens = {6, 2, 4, 8};
        int[] eighthCopyEvens = {6, 2, 4, 8};
        int[] ninthCopyEvens = {6, 2, 4, 8};
        int[] tenthCopyEvens = {1, 8, 4};
        int[] eleventhCopyEvens = {1, 8, 4};
        int[] twelfthCopyEvens = {2, 8, 4};

        int[] firstCopyEvensSolution = {2, 4};
        int[] secondCopyEvensSolution = {2, 4, 8};
        int[] thirdCopyEvensSolution= {6, 2, 4};
        int[] fourthCopyEvensSolution = {6, 2, 4, 8};
        int[] fifthCopyEvensSolution = {4};
        int[] sixthCopyEvensSolution = {2};
        int[] seventhCopyEvensSolution = {6, 2};
        int[] eighthCopyEvensSolution = {6, 2, 4};
        int[] ninthCopyEvensSolution = {6, 2, 4, 8};
        int[] tenthCopyEvensSolution = {8};
        int[] eleventhCopyEvensSolution = {8, 4};
        int[] twelfthCopyEvensSolution = {2, 8};

        assertEquals(Arrays.toString(firstCopyEvensSolution), Arrays.toString(testAP1.copyEvens(firstCopyEvens, 2)));
        assertEquals(Arrays.toString(secondCopyEvensSolution), Arrays.toString(testAP1.copyEvens(secondCopyEvens, 3)));
        assertEquals(Arrays.toString(thirdCopyEvensSolution), Arrays.toString(testAP1.copyEvens(thirdCopyEvens, 3)));
        assertEquals(Arrays.toString(fourthCopyEvensSolution), Arrays.toString(testAP1.copyEvens(fourthCopyEvens, 4)));
        assertEquals(Arrays.toString(fifthCopyEvensSolution), Arrays.toString(testAP1.copyEvens(fifthCopyEvens, 1)));
        assertEquals(Arrays.toString(sixthCopyEvensSolution), Arrays.toString(testAP1.copyEvens(sixthCopyEvens, 1)));
        assertEquals(Arrays.toString(seventhCopyEvensSolution), Arrays.toString(testAP1.copyEvens(seventhCopyEvens, 2)));
        assertEquals(Arrays.toString(eighthCopyEvensSolution), Arrays.toString(testAP1.copyEvens(eighthCopyEvens, 3)));
        assertEquals(Arrays.toString(ninthCopyEvensSolution), Arrays.toString(testAP1.copyEvens(ninthCopyEvens, 4)));
        assertEquals(Arrays.toString(tenthCopyEvensSolution), Arrays.toString(testAP1.copyEvens(tenthCopyEvens, 1)));
        assertEquals(Arrays.toString(eleventhCopyEvensSolution), Arrays.toString(testAP1.copyEvens(eleventhCopyEvens, 2)));
        assertEquals(Arrays.toString(twelfthCopyEvensSolution), Arrays.toString(testAP1.copyEvens(twelfthCopyEvens, 2)));
    }

    //scoreUp
    @Test
    public void testScoreUp() {
        String[] keyA = {"a", "a", "b", "b"};
        String[] keyB = {"a", "b", "c"};
        String[] keyC = {"a", "a", "b", "b", "c", "c"};

        String[] firstAnswers = {"a", "c", "b", "c"};
        String[] secondAnswers = {"a", "a", "b", "c"};
        String[] thirdAnswers = {"a", "a", "b", "b"};
        String[] fourthAnswers = {"?", "c", "b", "?"};
        String[] fifthAnswers = {"?", "c", "?", "?"};
        String[] sixthAnswers = {"c", "?", "b", "b"};
        String[] seventh = {"c", "?", "b", "?"};
        String[] eighthAnswers = {"a", "c", "b"};
        String[] ninthAnswers = {"a", "c", "a", "c", "a", "c"};
        String[] tenthAnswers = {"a", "c", "?", "?", "a", "c"};
        String[] eleventhAnswers = {"a", "c", "?", "?", "c", "c"};
        String[] twelfthAnswers = {"a", "b", "c"};

        assertEquals(6, testAP1.scoreUp(keyA, firstAnswers));
        assertEquals(11, testAP1.scoreUp(keyA, secondAnswers));
        assertEquals(16, testAP1.scoreUp(keyA, thirdAnswers));
        assertEquals(3, testAP1.scoreUp(keyA, fourthAnswers));
        assertEquals(-1, testAP1.scoreUp(keyA, fifthAnswers));
        assertEquals(7, testAP1.scoreUp(keyA, sixthAnswers));
        assertEquals(3, testAP1.scoreUp(keyA, seventh));
        assertEquals(2, testAP1.scoreUp(keyB, eighthAnswers));
        assertEquals(4, testAP1.scoreUp(keyC, ninthAnswers));
        assertEquals(6, testAP1.scoreUp(keyC, tenthAnswers));
        assertEquals(11, testAP1.scoreUp(keyC, eleventhAnswers));
        assertEquals(12, testAP1.scoreUp(keyB, twelfthAnswers));
    }

    //sumHeights
    @Test
    public void testSumHeights() {
        int[] sumHeightsA = {5, 3, 6, 7, 2};
        int[] sumHeightsB = {1, 2, 3, 4, 5, 4, 3, 2, 10};
        int[] sumHeightsC = {10, 8, 7, 7, 7, 6, 7};

        assertEquals(6, testAP1.sumHeights(sumHeightsA, 2, 4));
        assertEquals(2, testAP1.sumHeights(sumHeightsA, 0, 1));
        assertEquals(11, testAP1.sumHeights(sumHeightsA, 0, 4));
        assertEquals(0, testAP1.sumHeights(sumHeightsA, 1, 1));
        assertEquals(3, testAP1.sumHeights(sumHeightsB, 0, 3));
        assertEquals(11, testAP1.sumHeights(sumHeightsB, 4, 8));
        assertEquals(8, testAP1.sumHeights(sumHeightsB, 7, 8));
        assertEquals(0, testAP1.sumHeights(sumHeightsB, 8, 8));
        assertEquals(0, testAP1.sumHeights(sumHeightsB, 2, 2));
        assertEquals(3, testAP1.sumHeights(sumHeightsB, 3, 6));
        assertEquals(1, testAP1.sumHeights(sumHeightsC, 1, 4));
        assertEquals(2, testAP1.sumHeights(sumHeightsC, 1, 5));
    }

    //userCompare
    @Test
    public void testUserCompare() {
        assertEquals(-1, testAP1.userCompare("bb", 1, "zz", 2));
        assertEquals(1, testAP1.userCompare("bb", 1, "aa", 2));
        assertEquals(0, testAP1.userCompare("bb", 1, "bb", 1));
        assertEquals(1, testAP1.userCompare("bb", 5, "bb", 1));
        assertEquals(-1, testAP1.userCompare("bb", 5, "bb", 10));
        assertEquals(-1, testAP1.userCompare("adam", 1, "bob", 2));
        assertEquals(-1, testAP1.userCompare("bob", 1, "bob", 2));
        assertEquals(1, testAP1.userCompare("bzb", 1, "bob", 2));
    }

    //scores100
    @Test
    public void testScores100() {
        int[] firstScores100 = {1, 100, 100};
        int[] secondScores100 = {1, 100, 99, 100};
        int[] thirdScores100 = {100, 1, 100, 100};
        int[] fourthScores100 = {100, 1, 100, 1};
        int[] fifthScores100 = {1, 2, 3, 4, 5};
        int[] sixthScores100 = {1, 2, 100, 4, 5};
        assertTrue(testAP1.scores100(firstScores100));
        assertFalse(testAP1.scores100(secondScores100));
        assertTrue(testAP1.scores100(thirdScores100));
        assertFalse(testAP1.scores100(fourthScores100));
        assertFalse(testAP1.scores100(fifthScores100));
        assertFalse(testAP1.scores100(sixthScores100));
    }

    //wordsCount
    @Test
    public void testWordsCount() {
        String[] wordsCountA = {"a", "bb", "b", "ccc"};
        String[] wordsCountB = {"xx", "yyy", "x", "yy", "z"};
        assertEquals(2, testAP1.wordsCount(wordsCountA, 1));
        assertEquals(1, testAP1.wordsCount(wordsCountA, 3));
        assertEquals(0, testAP1.wordsCount(wordsCountA, 4));
        assertEquals(2, testAP1.wordsCount(wordsCountB, 1));
        assertEquals(2, testAP1.wordsCount(wordsCountB, 2));
        assertEquals(1, testAP1.wordsCount(wordsCountB, 3));
    }

    //hasOne
    @Test
    public void testHasOne() {
        assertTrue(testAP1.hasOne(10));
        assertFalse(testAP1.hasOne(22));
        assertFalse(testAP1.hasOne(220));
        assertTrue(testAP1.hasOne(212));
        assertTrue(testAP1.hasOne(1));
        assertFalse(testAP1.hasOne(9));
        assertTrue(testAP1.hasOne(211112));
        assertTrue(testAP1.hasOne(121121));
        assertFalse(testAP1.hasOne(222222));
        assertTrue(testAP1.hasOne(56156));
        assertFalse(testAP1.hasOne(56556));
    }

    //copyEndy
    @Test
    public void testCopyEndy() {
        int[] firstCopyEndy = {9, 11, 90, 22, 6};
        int[] secondCopyEndy = {9, 11, 90, 22, 6};
        int[] thirdCopyEndy = {12, 1, 1, 13, 0, 20};
        int[] fourthCopyEndy = {12, 1, 1, 13, 0, 20};
        int[] fifthCopyEndy = {0};
        int[] sixthCopyEndy = {10, 11, 90};
        int[] seventhCopyEndy = {90, 22, 100};
        int[] eighthCopyEndy = {12, 11, 10, 89, 101, 4};
        int[] ninthCopyEndy = {13, 2, 2, 0};
        int[] tenthCopyEndy = {13, 2, 2, 0};
        int[] eleventhCopyEndy = {13, 2, 13, 2, 0, 30};
        int[] twelfthCopyEndy = {13, 2, 13, 2, 0, 30};

        int[] firstCopyEndySolution = {9, 90};
        int[] secondCopyEndySolution = {9, 90, 6};
        int[] thirdCopyEndySolution = {1, 1};
        int[] fourthCopyEndySolution = {1, 1, 0};
        int[] fifthCopyEndySolution = {0};
        int[] sixthCopyEndySolution = {10, 90};
        int[] seventhCopyEndySolution = {90, 100};
        int[] eighthCopyEndySolution = {10};
        int[] ninthCopyEndySolution = {2, 2};
        int[] tenthCopyEndySolution = {2, 2, 0};
        int[] eleventhCopyEndySolution = {2, 2};
        int[] twelfthCopyEndySolution = {2, 2, 0};

        assertEquals(Arrays.toString(firstCopyEndySolution), Arrays.toString(testAP1.copyEndy(firstCopyEndy, 2)));
        assertEquals(Arrays.toString(secondCopyEndySolution), Arrays.toString(testAP1.copyEndy(secondCopyEndy, 3)));
        assertEquals(Arrays.toString(thirdCopyEndySolution), Arrays.toString(testAP1.copyEndy(thirdCopyEndy, 2)));
        assertEquals(Arrays.toString(fourthCopyEndySolution), Arrays.toString(testAP1.copyEndy(fourthCopyEndy, 3)));
        assertEquals(Arrays.toString(fifthCopyEndySolution), Arrays.toString(testAP1.copyEndy(fifthCopyEndy, 1)));
        assertEquals(Arrays.toString(sixthCopyEndySolution), Arrays.toString(testAP1.copyEndy(sixthCopyEndy, 2)));
        assertEquals(Arrays.toString(seventhCopyEndySolution), Arrays.toString(testAP1.copyEndy(seventhCopyEndy, 2)));
        assertEquals(Arrays.toString(eighthCopyEndySolution), Arrays.toString(testAP1.copyEndy(eighthCopyEndy, 1)));
        assertEquals(Arrays.toString(ninthCopyEndySolution), Arrays.toString(testAP1.copyEndy(ninthCopyEndy, 2)));
        assertEquals(Arrays.toString(tenthCopyEndySolution), Arrays.toString(testAP1.copyEndy(tenthCopyEndy, 3)));
        assertEquals(Arrays.toString(eleventhCopyEndySolution), Arrays.toString(testAP1.copyEndy(eleventhCopyEndy, 2)));
        assertEquals(Arrays.toString(twelfthCopyEndySolution), Arrays.toString(testAP1.copyEndy(twelfthCopyEndy, 3)));
    }

    //wordsWithout
    @Test
    public void testWordsWithout() {
        String[] firstWordsWithout = {"a", "b", "c", "a"};
        String[] secondWordsWithout = {"a", "b", "c", "a"};
        String[] thirdWordsWithout = {"a", "b", "c", "a"};
        String[] fourthWordsWithout = {"b", "c", "a", "a"};
        String[] fifthWordsWithout = {"xx", "yyy", "x", "yy", "x"};
        String[] sixthWordsWithout = {"xx", "yyy", "x", "yy", "x"};
        String[] seventhWordsWithout = {"aa", "ab", "ac", "aa", "aa"};

        String[] firstWordsWithoutSolution = {"b", "c"};
        String[] secondWordsWithoutSolution = {"a", "c", "a"};
        String[] thirdWordsWithoutSolution = {"a", "b", "a"};
        String[] fourthWordsWithoutSolution = {"b", "c", "a", "a"};
        String[] fifthWordsWithoutSolution = {"xx", "yyy", "yy"};
        String[] sixthWordsWithoutSolution = {"xx", "yyy", "x", "x"};
        String[] seventhWordsWithoutSolution = {"ab", "ac"};

        assertEquals(Arrays.toString(firstWordsWithoutSolution), Arrays.toString(testAP1.wordsWithout(firstWordsWithout, "a")));
        assertEquals(Arrays.toString(secondWordsWithoutSolution), Arrays.toString(testAP1.wordsWithout(secondWordsWithout, "b")));
        assertEquals(Arrays.toString(thirdWordsWithoutSolution), Arrays.toString(testAP1.wordsWithout(thirdWordsWithout, "c")));
        assertEquals(Arrays.toString(fourthWordsWithoutSolution), Arrays.toString(testAP1.wordsWithout(fourthWordsWithout, "d")));
        assertEquals(Arrays.toString(fifthWordsWithoutSolution), Arrays.toString(testAP1.wordsWithout(fifthWordsWithout, "x")));
        assertEquals(Arrays.toString(sixthWordsWithoutSolution), Arrays.toString(testAP1.wordsWithout(sixthWordsWithout, "yy")));
        assertEquals(Arrays.toString(seventhWordsWithoutSolution), Arrays.toString(testAP1.wordsWithout(seventhWordsWithout, "aa")));
    }

    //sumHeights2
    @Test
    public void testSumHeights2() {
        int[] firstSumHeights2 = {5, 3, 6, 7, 2};
        int[] secondSumHeights2 = {1, 2, 3, 4, 5, 4, 3, 2, 10};
        int[] thirdSumHeights2 = {10, 8, 7, 7, 7, 6, 7};

        assertEquals(7, testAP1.sumHeights2(firstSumHeights2, 2, 4));
        assertEquals(2, testAP1.sumHeights2(firstSumHeights2, 0, 1));
        assertEquals(15, testAP1.sumHeights2(firstSumHeights2, 0, 4));
        assertEquals(0, testAP1.sumHeights2(firstSumHeights2, 1, 1));
        assertEquals(6, testAP1.sumHeights2(secondSumHeights2, 0, 3));
        assertEquals(19, testAP1.sumHeights2(secondSumHeights2, 4, 8));
        assertEquals(16, testAP1.sumHeights2(secondSumHeights2, 7, 8));
        assertEquals(0, testAP1.sumHeights2(secondSumHeights2, 8, 8));
        assertEquals(0, testAP1.sumHeights2(secondSumHeights2, 2, 2));
        assertEquals(4, testAP1.sumHeights2(secondSumHeights2, 3, 6));
        assertEquals(1, testAP1.sumHeights2(thirdSumHeights2, 1, 4));
        assertEquals(2, testAP1.sumHeights2(thirdSumHeights2, 1, 5));
    }

    //mergeTwo
    @Test
    public void testMergeTwo() {
        String[] firstMergeTwoA = {"a", "c", "z"};
        String[] firstMergeTwoB = {"b", "f", "z"};
        String[] firstMergeTwoSolution = {"a", "b", "c"};
        String[] secondMergeTwoA = {"a", "c", "z"};
        String[] secondMergeTwoB = {"c", "f", "z"};
        String[] secondMergeTwoSolution = {"a", "c", "f"};
        String[] thirdMergeTwoA = {"f", "g", "z"};
        String[] thirdMergeTwoB = {"c", "f", "g"};
        String[] thirdMergeTwoSolution = {"c", "f", "g"};
        String[] fourthMergeTwoA = {"a", "c", "z"};
        String[] fourthMergeTwoB = {"a", "c", "z"};
        String[] fourthMergeTwoSolution = {"a", "c", "z"};
        String[] fifthMergeTwoA = {"a", "b", "c", "z"};
        String[] fifthMergeTwoB = {"a", "c", "z"};
        String[] fifthMergeTwoSolution = {"a", "b", "c"};
        String[] sixthMergeTwoA = {"a", "c", "z"};
        String[] sixthMergeTwoB = {"a", "b", "c", "z"};
        String[] sixthMergeTwoSolution = {"a", "b", "c"};
        String[] seventhMergeTwoA = {"a", "c", "z"};
        String[] seventhMergeTwoB = {"a", "c", "z"};
        String[] seventhMergeTwoSolution = {"a", "c"};
        String[] eighthMergeTwoA = {"a", "c", "z"};
        String[] eighthMergeTwoB = {"a", "c", "y", "z"};
        String[] eighthMergeTwoSolution = {"a", "c", "y"};
        String[] ninthMergeTwoA = {"x", "y", "z"};
        String[] ninthMergeTwoB = {"a", "b", "z"};
        String[] ninthMergeTwoSolution = {"a", "b", "x"};
        assertEquals(Arrays.toString(firstMergeTwoSolution), Arrays.toString(testAP1.mergeTwo(firstMergeTwoA, firstMergeTwoB, 3)));
        assertEquals(Arrays.toString(secondMergeTwoSolution), Arrays.toString(testAP1.mergeTwo(secondMergeTwoA, secondMergeTwoB, 3)));
        assertEquals(Arrays.toString(thirdMergeTwoSolution), Arrays.toString(testAP1.mergeTwo(thirdMergeTwoA, thirdMergeTwoB, 3)));
        assertEquals(Arrays.toString(fourthMergeTwoSolution), Arrays.toString(testAP1.mergeTwo(fourthMergeTwoA, fourthMergeTwoB, 3)));
        assertEquals(Arrays.toString(fifthMergeTwoSolution), Arrays.toString(testAP1.mergeTwo(fifthMergeTwoA, fifthMergeTwoB, 3)));
        assertEquals(Arrays.toString(sixthMergeTwoSolution), Arrays.toString(testAP1.mergeTwo(sixthMergeTwoA, sixthMergeTwoB, 3)));
        assertEquals(Arrays.toString(seventhMergeTwoSolution), Arrays.toString(testAP1.mergeTwo(seventhMergeTwoA, seventhMergeTwoB, 2)));
        assertEquals(Arrays.toString(eighthMergeTwoSolution), Arrays.toString(testAP1.mergeTwo(eighthMergeTwoA, eighthMergeTwoB, 3)));
        assertEquals(Arrays.toString(ninthMergeTwoSolution), Arrays.toString(testAP1.mergeTwo(ninthMergeTwoA, ninthMergeTwoB, 3)));
    }

    //scoresClump
    @Test
    public void testScoresClump() {
        int[] firstScoresClump = {3, 4, 5};
        int[] secondScoresClump = {3, 4, 6};
        int[] thirdScoresClump = {1, 3, 5, 5};
        int[] fourthScoresClump = {2, 4, 5, 6};
        int[] fifthScoresClump = {2, 4, 5, 7};
        int[] sixthScoresClump = {2, 4, 4, 7};
        int[] seventhScoresClump = {3, 3, 6, 7, 9};
        int[] eighthScoresClump = {3, 3, 7, 7, 9};
        int[] ninthScoresClump = {4, 5, 8};
        assertTrue(testAP1.scoresClump(firstScoresClump));
        assertFalse(testAP1.scoresClump(secondScoresClump));
        assertTrue(testAP1.scoresClump(thirdScoresClump));
        assertTrue(testAP1.scoresClump(fourthScoresClump));
        assertFalse(testAP1.scoresClump(fifthScoresClump));
        assertTrue(testAP1.scoresClump(sixthScoresClump));
        assertFalse(testAP1.scoresClump(seventhScoresClump));
        assertTrue(testAP1.scoresClump(eighthScoresClump));
        assertFalse(testAP1.scoresClump(ninthScoresClump));
    }

    //wordsFronts
    @Test
    public void testWordsFront() {
        String[] wordsFrontA = {"a", "b", "c", "d"};
        String[] wordsFrontB = {"Hi", "There"};

        String[] firstWordsFrontSolution = {"a"};
        String[] secondWordsFrontSolution = {"a", "b"};
        String[] thirdWordsFrontSolution = {"a", "b", "c"};
        String[] fourthWordsFrontSolution = {"a", "b", "c", "d"};
        String[] fifthWordsFrontSolution = {"Hi"};
        String[] sixthWordsFrontSolution = {"Hi", "There"};

        assertEquals(Arrays.toString(firstWordsFrontSolution), Arrays.toString(testAP1.wordsFront(wordsFrontA, 1)));
        assertEquals(Arrays.toString(secondWordsFrontSolution), Arrays.toString(testAP1.wordsFront(wordsFrontA, 2)));
        assertEquals(Arrays.toString(thirdWordsFrontSolution), Arrays.toString(testAP1.wordsFront(wordsFrontA, 3)));
        assertEquals(Arrays.toString(fourthWordsFrontSolution), Arrays.toString(testAP1.wordsFront(wordsFrontA, 4)));
        assertEquals(Arrays.toString(fifthWordsFrontSolution), Arrays.toString(testAP1.wordsFront(wordsFrontB, 1)));
        assertEquals(Arrays.toString(sixthWordsFrontSolution), Arrays.toString(testAP1.wordsFront(wordsFrontB, 2)));
    }

    //divideSelf
    @Test
    public void testDivideSelf() {
        assertTrue(testAP1.dividesSelf(128));
        assertTrue(testAP1.dividesSelf(12));
        assertFalse(testAP1.dividesSelf(120));
        assertTrue(testAP1.dividesSelf(122));
        assertFalse(testAP1.dividesSelf(13));
        assertFalse(testAP1.dividesSelf(32));
        assertTrue(testAP1.dividesSelf(22));
        assertFalse(testAP1.dividesSelf(42));
        assertTrue(testAP1.dividesSelf(212));
        assertFalse(testAP1.dividesSelf(213));
        assertTrue(testAP1.dividesSelf(162));
    }

    //matchUp
    @Test
    public void testMatchUp() {
        String[] firstMatchUpA = {"aa", "bb", "cc"};
        String[] secondMatchUpA = {"aa", "bb", "cc"};
        String[] thirdMatchUpA = {"aa", "bb", "cc"};
        String[] fourthMatchUpA = {"", "", "ccc"};
        String[] fifthMatchUpA = {"", "", ""};
        String[] sixthMatchUpA = {"aa", "bb", "cc"};
        String[] seventhMatchUpA = {"aa", "", "ccc"};
        String[] eighthMatchUpA = {"x", "y", "z"};
        String[] ninthMatchUpA = {"", "y", "z"};
        String[] tenthMatchUpA = {"x", "y", "z"};
        String[] eleventhMatchUpA = {"x", "y", "z"};
        String[] twelfthMatchUpA = {"b", "x", "y", "z"};
        String[] thirteenthMatchUpA = {"aaa", "bb", "c"};

        String[] firstMatchUpB = {"aaa", "xx", "bb"};
        String[] secondMatchUpB = {"aaa", "b", "bb"};
        String[] thirdMatchUpB = {"", "", "ccc"};
        String[] fourthMatchUpB = {"aa", "bb", "cc"};
        String[] fifthMatchUpB = {"", "bb", "cc"};
        String[] sixthMatchUpB = {"", "", ""};
        String[] seventhMatchUpB = {"", "bb", "cc"};
        String[] eighthMatchUpB = {"y", "z", "x"};
        String[] ninthMatchUpB = {"", "y", "x"};
        String[] tenthMatchUpB = {"xx", "yyy", "zzz"};
        String[] eleventhMatchUpB = {"xx", "yyy", ""};
        String[] twelfthMatchUpB = {"a", "xx", "yyy", "zzz"};
        String[] thirteenMatchUpB = {"aaa", "xx", "bb"};

        assertEquals(1, testAP1.matchUp(firstMatchUpA, firstMatchUpB));
        assertEquals(2, testAP1.matchUp(secondMatchUpA, secondMatchUpB));
        assertEquals(1, testAP1.matchUp(thirdMatchUpA, thirdMatchUpB));
        assertEquals(1, testAP1.matchUp(fourthMatchUpA, fourthMatchUpB));
        assertEquals(0, testAP1.matchUp(fifthMatchUpA, fifthMatchUpB));
        assertEquals(0, testAP1.matchUp(sixthMatchUpA, sixthMatchUpB));
        assertEquals(1, testAP1.matchUp(seventhMatchUpA, seventhMatchUpB));
        assertEquals(0, testAP1.matchUp(eighthMatchUpA, eighthMatchUpB));
        assertEquals(1, testAP1.matchUp(ninthMatchUpA, ninthMatchUpB));
        assertEquals(3, testAP1.matchUp(tenthMatchUpA, tenthMatchUpB));
        assertEquals(2, testAP1.matchUp(eleventhMatchUpA, eleventhMatchUpB));
        assertEquals(3, testAP1.matchUp(twelfthMatchUpA, twelfthMatchUpB));
        assertEquals(1, testAP1.matchUp(thirteenthMatchUpA, thirteenMatchUpB));
    }


}


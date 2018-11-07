package ap1test;


public class App {
    public static void main(String[] args) {

        AP1 myAP1 = new AP1();

        //******https://codingbat.com/java/AP-1******first column

        //scoresIncreasing
        int[] firstScoresIncreasing = {1, 3, 4};
        int[] secondScoresIncreasing = {1, 3, 2};
        int[] fourththirdScoresIncreasing = {1, 1, 4};
        int[] fifthScoresIncreasing = {1, 1, 2, 4, 4, 7};
        int[] sixthScoresIncreasing = {1, 1, 2, 4, 3, 7};
        int[] seventhScoresIncreasing = {-5, 4, 11};
        myAP1.scoresIncreasing(firstScoresIncreasing);
        myAP1.scoresIncreasing(secondScoresIncreasing);
        myAP1.scoresIncreasing(fourththirdScoresIncreasing);
        myAP1.scoresIncreasing(fifthScoresIncreasing);
        myAP1.scoresIncreasing(sixthScoresIncreasing);
        myAP1.scoresIncreasing(seventhScoresIncreasing);

        //scoreAverage
        int[] firstAverage = {2, 2, 4, 4};
        int[] secondAverage = {4, 4, 4, 2, 2, 2};
        int[] thirdAverage = {3, 4, 5, 1, 2, 3};
        int[] fourthAverage = {5, 6};
        int[] fifthAverage = {5, 4};
        int[] sixthAverage = {5, 4, 5, 6, 2, 1, 2, 3};
        myAP1.scoresAverage(firstAverage);
        myAP1.scoresAverage(secondAverage);
        myAP1.scoresAverage(thirdAverage);
        myAP1.scoresAverage(fourthAverage);
        myAP1.scoresAverage(fifthAverage);
        myAP1.scoresAverage(sixthAverage);

        //wordsWithoutList
        String[] firstWordsWithoutList = {"a", "bb", "b", "ccc"};
        String[] secondWordsWithoutList = {"a", "bb", "b", "ccc"};
        String[] thirdWordsWithoutList = {"a", "bb", "b", "ccc"};
        String[] fourthWordsWithoutList = {"xx", "yyy", "x", "yy", "z"};
        String[] fifthWordsWithoutList = {"xx", "yyy", "x", "yy", "z"};
        myAP1.wordsWithoutList(firstWordsWithoutList, 1);
        myAP1.wordsWithoutList(secondWordsWithoutList, 3);
        myAP1.wordsWithoutList(thirdWordsWithoutList, 4);
        myAP1.wordsWithoutList(fourthWordsWithoutList, 1);
        myAP1.wordsWithoutList(fifthWordsWithoutList, 2);

        //copyEvens
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
        myAP1.copyEvens(firstCopyEvens, 2);
        myAP1.copyEvens(secondCopyEvens, 3);
        myAP1.copyEvens(thirdCopyEvens, 3);
        myAP1.copyEvens(fourthCopyEvens, 4);
        myAP1.copyEvens(fifthCopyEvens, 1);
        myAP1.copyEvens(sixthCopyEvens, 1);
        myAP1.copyEvens(seventhCopyEvens, 2);
        myAP1.copyEvens(eighthCopyEvens, 3);
        myAP1.copyEvens(ninthCopyEvens, 4);
        myAP1.copyEvens(tenthCopyEvens, 1);
        myAP1.copyEvens(eleventhCopyEvens, 2);
        myAP1.copyEvens(twelfthCopyEvens, 2);

        //scoreUp
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

        myAP1.scoreUp(keyA, firstAnswers);
        myAP1.scoreUp(keyA, secondAnswers);
        myAP1.scoreUp(keyA, thirdAnswers);
        myAP1.scoreUp(keyA, fourthAnswers);
        myAP1.scoreUp(keyA, fifthAnswers);
        myAP1.scoreUp(keyA, sixthAnswers);
        myAP1.scoreUp(keyA, seventh);
        myAP1.scoreUp(keyB, eighthAnswers);
        myAP1.scoreUp(keyC, ninthAnswers);
        myAP1.scoreUp(keyC, tenthAnswers);
        myAP1.scoreUp(keyC, eleventhAnswers);
        myAP1.scoreUp(keyB, twelfthAnswers);

        //sumHeights
        int[] sumHeightsA = {5, 3, 6, 7, 2};
        int[] sumHeightsB = {1, 2, 3, 4, 5, 4, 3, 2, 10};
        int[] sumHeightsC = {10, 8, 7, 7, 7, 6, 7};

        myAP1.sumHeights(sumHeightsA, 2, 4);
        myAP1.sumHeights(sumHeightsA, 0, 1);
        myAP1.sumHeights(sumHeightsA, 0, 4);
        myAP1.sumHeights(sumHeightsA, 1, 1);
        myAP1.sumHeights(sumHeightsB, 0, 3);
        myAP1.sumHeights(sumHeightsB, 4, 8);
        myAP1.sumHeights(sumHeightsB, 7, 8);
        myAP1.sumHeights(sumHeightsB, 8, 8);
        myAP1.sumHeights(sumHeightsB, 2, 2);
        myAP1.sumHeights(sumHeightsB, 3, 6);
        myAP1.sumHeights(sumHeightsC, 1, 4);
        myAP1.sumHeights(sumHeightsC, 1, 5);

        //userCompare
        myAP1.userCompare("bb", 1, "zz", 2);
        myAP1.userCompare("bb", 1, "aa", 2);
        myAP1.userCompare("bb", 1, "bb", 1);
        myAP1.userCompare("bb", 5, "bb", 1);
        myAP1.userCompare("bb", 5, "bb", 10);
        myAP1.userCompare("adam", 1, "bob", 2);
        myAP1.userCompare("bob", 1, "bob", 2);
        myAP1.userCompare("bzb", 1, "bob", 2);

        //******https://codingbat.com/java/AP-1******second column

        //scores100
        int[] firstScores100 = {1, 100, 100};
        int[] secondScores100 = {1, 100, 99, 100};
        int[] thirdScores100 = {100, 1, 100, 100};
        int[] fourthScores100 = {100, 1, 100, 1};
        int[] fifthScores100 = {1, 2, 3, 4, 5};
        int[] sixthScores100 = {1, 2, 100, 4, 5};
        myAP1.scores100(firstScores100);
        myAP1.scores100(secondScores100);
        myAP1.scores100(thirdScores100);
        myAP1.scores100(fourthScores100);
        myAP1.scores100(fifthScores100);
        myAP1.scores100(sixthScores100);

        //wordsCount
        String[] wordsCountA = {"a", "bb", "b", "ccc"};
        String[] wordsCountB = {"xx", "yyy", "x", "yy", "z"};
        myAP1.wordsCount(wordsCountA, 1);
        myAP1.wordsCount(wordsCountA, 3);
        myAP1.wordsCount(wordsCountA, 4);
        myAP1.wordsCount(wordsCountB, 1);
        myAP1.wordsCount(wordsCountB, 2);
        myAP1.wordsCount(wordsCountB, 3);

        //hasOne
        myAP1.hasOne(10);
        myAP1.hasOne(22);
        myAP1.hasOne(220);
        myAP1.hasOne(212);
        myAP1.hasOne(1);
        myAP1.hasOne(9);
        myAP1.hasOne(211112);
        myAP1.hasOne(121121);
        myAP1.hasOne(222222);
        myAP1.hasOne(56156);
        myAP1.hasOne(56556);

        //copyEndy
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
        myAP1.copyEndy(firstCopyEndy, 2);
        myAP1.copyEndy(secondCopyEndy, 3);
        myAP1.copyEndy(thirdCopyEndy, 2);
        myAP1.copyEndy(fourthCopyEndy, 3);
        myAP1.copyEndy(fifthCopyEndy, 1);
        myAP1.copyEndy(sixthCopyEndy, 2);
        myAP1.copyEndy(seventhCopyEndy, 2);
        myAP1.copyEndy(eighthCopyEndy, 1);
        myAP1.copyEndy(ninthCopyEndy, 2);
        myAP1.copyEndy(tenthCopyEndy, 3);
        myAP1.copyEndy(eleventhCopyEndy, 2);
        myAP1.copyEndy(twelfthCopyEndy, 3);

        //wordsWithout
        String[] firstWordsWithout = {"a", "b", "c", "a"};
        String[] secondWordsWithout = {"a", "b", "c", "a"};
        String[] thirdWordsWithout = {"a", "b", "c", "a"};
        String[] fourthWordsWithout = {"b", "c", "a", "a"};
        String[] fifthWordsWithout = {"xx", "yyy", "x", "yy", "x"};
        String[] sixthWordsWithout = {"xx", "yyy", "x", "yy", "x"};
        String[] seventhWordsWithout = {"aa", "ab", "ac", "aa", "aa"};

        myAP1.wordsWithout(firstWordsWithout, "a");
        myAP1.wordsWithout(secondWordsWithout, "b");
        myAP1.wordsWithout(thirdWordsWithout, "c");
        myAP1.wordsWithout(fourthWordsWithout, "b");
        myAP1.wordsWithout(fifthWordsWithout, "x");
        myAP1.wordsWithout(sixthWordsWithout, "yy");
        myAP1.wordsWithout(seventhWordsWithout, "aa");

        //sumHeights2
        int[] firstSumHeights2 = {5, 3, 6, 7, 2};
        int[] secondSumHeights2 = {1, 2, 3, 4, 5, 4, 3, 2, 10};
        int[] thirdSumHeights2 = {10, 8, 7, 7, 7, 6, 7};
        myAP1.sumHeights2(firstSumHeights2, 2,4);
        myAP1.sumHeights2(firstSumHeights2, 0,1);
        myAP1.sumHeights2(firstSumHeights2, 0,4);
        myAP1.sumHeights2(firstSumHeights2, 1,1);
        myAP1.sumHeights2(secondSumHeights2, 0,3);
        myAP1.sumHeights2(secondSumHeights2, 4,8);
        myAP1.sumHeights2(secondSumHeights2, 7,8);
        myAP1.sumHeights2(secondSumHeights2, 8,8);
        myAP1.sumHeights2(secondSumHeights2, 2,2);
        myAP1.sumHeights2(secondSumHeights2, 3,6);
        myAP1.sumHeights2(thirdSumHeights2, 1,4);
        myAP1.sumHeights2(thirdSumHeights2, 1,5);

        //mergeTwo
        String[] firstMergeTwoA = {"a", "c", "z"};
        String[] firstMergeTwoB = {"b", "f", "z"};
        String[] secondMergeTwoA = {"a", "c", "z"};
        String[] secondMergeTwoB = {"c", "f", "z"};
        String[] thirdMergeTwoA = {"f", "g", "z"};
        String[] thirdMergeTwoB = {"c", "f", "g"};
        String[] fourthMergeTwoA = {"a", "c", "z"};
        String[] fourthMergeTwoB = {"a", "c", "z"};
        String[] fifthMergeTwoA = {"a", "b", "c", "z"};
        String[] fifthMergeTwoB = {"a", "c", "z"};
        String[] sixthMergeTwoA = {"a", "c", "z"};
        String[] sixthMergeTwoB = {"a", "b", "c", "z"};
        String[] seventhMergeTwoA = {"a", "c", "z"};
        String[] seventhMergeTwoB = {"a", "c", "z"};
        String[] eighthMergeTwoA = {"a", "c", "z"};
        String[] eighthMergeTwoB = {"a", "c", "y", "z"};
        String[] ninthMergeTwoA = {"x", "y", "z"};
        String[] ninthMergeTwoB = {"a", "b", "z"};
        myAP1.mergeTwo(firstMergeTwoA, firstMergeTwoB, 3);
        myAP1.mergeTwo(secondMergeTwoA, secondMergeTwoB, 3);
        myAP1.mergeTwo(thirdMergeTwoA, thirdMergeTwoB, 3);
        myAP1.mergeTwo(fourthMergeTwoA, fourthMergeTwoB, 3);
        myAP1.mergeTwo(fifthMergeTwoA, fifthMergeTwoB, 3);
        myAP1.mergeTwo(sixthMergeTwoA, sixthMergeTwoB, 3);
        myAP1.mergeTwo(seventhMergeTwoA, seventhMergeTwoB, 2);
        myAP1.mergeTwo(eighthMergeTwoA, eighthMergeTwoB, 3);
        myAP1.mergeTwo(ninthMergeTwoA, ninthMergeTwoB, 3);

        //******https://codingbat.com/java/AP-1******third column

        //scoresClump
        int[] firstScoresClump = {3, 4, 5};
        int[] secondScoresClump = {3, 4, 6};
        int[] thirdScoresClump = {1, 3, 5, 5};
        int[] fourthScoresClump = {2, 4, 5, 6};
        int[] fifthScoresClump = {2, 4, 5, 7};
        int[] sixthScoresClump = {2, 4, 4, 7};
        int[] seventhScoresClump = {3, 3, 6, 7, 9};
        int[] eighthScoresClump = {3, 3, 7, 7, 9};
        int[] ninthScoresClump = {4, 5, 8};
        myAP1.scoresClump(firstScoresClump);
        myAP1.scoresClump(secondScoresClump);
        myAP1.scoresClump(thirdScoresClump);
        myAP1.scoresClump(fourthScoresClump);
        myAP1.scoresClump(fifthScoresClump);
        myAP1.scoresClump(sixthScoresClump);
        myAP1.scoresClump(seventhScoresClump);
        myAP1.scoresClump(eighthScoresClump);
        myAP1.scoresClump(ninthScoresClump);

        //wordsFront
        String[] wordsFrontA = {"a", "b", "c", "d"};
        String[] wordsFrontB = {"Hi", "There"};
        myAP1.wordsFront(wordsFrontA, 1);
        myAP1.wordsFront(wordsFrontA, 2);
        myAP1.wordsFront(wordsFrontA, 3);
        myAP1.wordsFront(wordsFrontA, 4);
        myAP1.wordsFront(wordsFrontB, 1);
        myAP1.wordsFront(wordsFrontB, 2);

        //divideSelf
        myAP1.dividesSelf(128);
        myAP1.dividesSelf(12);
        myAP1.dividesSelf(120);
        myAP1.dividesSelf(122);
        myAP1.dividesSelf(13);
        myAP1.dividesSelf(32);
        myAP1.dividesSelf(22);
        myAP1.dividesSelf(42);
        myAP1.dividesSelf(212);
        myAP1.dividesSelf(213);
        myAP1.dividesSelf(162);

        //matchUp
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

        myAP1.matchUp(firstMatchUpA, firstMatchUpB);
        myAP1.matchUp(secondMatchUpA, secondMatchUpB);
        myAP1.matchUp(thirdMatchUpA, thirdMatchUpB);
        myAP1.matchUp(fourthMatchUpA, fourthMatchUpB);
        myAP1.matchUp(fifthMatchUpA, fifthMatchUpB);
        myAP1.matchUp(sixthMatchUpA, sixthMatchUpB);
        myAP1.matchUp(seventhMatchUpA, seventhMatchUpB);
        myAP1.matchUp(eighthMatchUpA, eighthMatchUpB);
        myAP1.matchUp(ninthMatchUpA, ninthMatchUpB);
        myAP1.matchUp(tenthMatchUpA, tenthMatchUpB);
        myAP1.matchUp(eleventhMatchUpA, eleventhMatchUpB);
        myAP1.matchUp(twelfthMatchUpA, twelfthMatchUpB);
        myAP1.matchUp(thirteenthMatchUpA, thirteenMatchUpB);

        //scoresSpecial
        int[] firstScoresSpecialA = {12, 10, 30};
        int[] secondScoresSpecialA = {20, 10, 4};
        int[] thirdScoresSpecialA = {12, 11, 4};
        int[] fourthScoresSpecialA = {1, 20, 2, 50};
        int[] fifthScoresSpecialA = {3, 4, 5};
        int[] sixthScoresSpecialA = {10, 4, 20, 30};
        int[] seventhScoresSpecialA = {10, 4, 20, 30};
        int[] eighthScoresSpecialA = {10, 4, 20, 30};
        int[] ninthScoresSpecialA = {10, 4, 20, 30};
        int[] tenthScoresSpecialA = {};
        int[] eleventhScoresSpecialA = {};
        int[] twelfthScoresSpecialA = {14, 10,4};

        int[] firstScoresSpecialB = {2, 20, 30};
        int[] secondScoresSpecialB = {2, 20, 10};
        int[] thirdScoresSpecialB = {2, 20, 31};
        int[] fourthScoresSpecialB = {3, 4, 5};
        int[] fifthScoresSpecialB = {1, 50, 2, 20};
        int[] sixthScoresSpecialB = {20};
        int[] seventhScoresSpecialB = {20};
        int[] eighthScoresSpecialB = {3, 20, 99};
        int[] ninthScoresSpecialB = {30, 20, 99};
        int[] tenthScoresSpecialB = {2};
        int[] eleventhScoresSpecialB = {20};
        int[] twelfthScoresSpecialB = {4, 20, 30};

        myAP1.scoresSpecial(firstScoresSpecialA, firstScoresSpecialB);
        myAP1.scoresSpecial(secondScoresSpecialA, secondScoresSpecialB);
        myAP1.scoresSpecial(thirdScoresSpecialA, thirdScoresSpecialB);
        myAP1.scoresSpecial(fourthScoresSpecialA, fourthScoresSpecialB);
        myAP1.scoresSpecial(fifthScoresSpecialA, fifthScoresSpecialB);
        myAP1.scoresSpecial(sixthScoresSpecialA, sixthScoresSpecialB);
        myAP1.scoresSpecial(seventhScoresSpecialA, seventhScoresSpecialB);
        myAP1.scoresSpecial(eighthScoresSpecialA, eighthScoresSpecialB);
        myAP1.scoresSpecial(ninthScoresSpecialA, ninthScoresSpecialB);
        myAP1.scoresSpecial(tenthScoresSpecialA, tenthScoresSpecialB);
        myAP1.scoresSpecial(eleventhScoresSpecialA, eleventhScoresSpecialB);
        myAP1.scoresSpecial(twelfthScoresSpecialA, twelfthScoresSpecialB);

        //bigHeights
        int[] firstBigHeights = {5, 3, 6, 7, 2};
        int[] secondBigHeights = {5, 3, 6, 7, 2};
        int[] thirdBigHeights = {5, 3, 6, 7, 2};
        int[] fourthBigHeights = {5, 3, 6, 7, 3};
        int[] fifthBigHeights = {5, 3, 6, 7, 2};
        int[] sixthBigHeights = {5, 13, 6, 7, 2};
        int[] seventhBigHeights = {5, 13, 6, 7, 2};
        int[] eighthBigHeights = {5, 13, 6, 7, 2};
        int[] ninthBigHeights = {5, 13, 6, 7, 2};
        int[] tenthBigHeights = {5, 13, 6, 7, 2};
        int[] eleventhBigHeights = {1, 2, 3, 4, 5, 4, 3, 2, 10};
        int[] twelfthBigHeights = {1, 2, 3, 4, 5, 4, 3, 2, 10};
        int[] thirteenthBigHeights = {1, 2, 3, 14, 5, 4, 3, 2, 10};
        int[] fourteenthBigHeights = {1, 2, 3, 14, 5, 4, 3, 2, 10};
        int[] fifteenthBigHeights = {1, 2, 3, 14, 5, 4, 3, 2, 10};
        int[] sixteenthBigHeights = {1, 2, 3, 14, 5, 4, 3, 2, 10};

        myAP1.bigHeights(firstBigHeights, 2, 4);
        myAP1.bigHeights(secondBigHeights, 0, 1);
        myAP1.bigHeights(thirdBigHeights, 0, 4);
        myAP1.bigHeights(fourthBigHeights, 0, 4);
        myAP1.bigHeights(fifthBigHeights, 1, 1);
        myAP1.bigHeights(sixthBigHeights, 1, 2);
        myAP1.bigHeights(seventhBigHeights, 0, 2);
        myAP1.bigHeights(eighthBigHeights, 1, 4);
        myAP1.bigHeights(ninthBigHeights, 0, 4);
        myAP1.bigHeights(tenthBigHeights, 0, 3);
        myAP1.bigHeights(eleventhBigHeights, 0, 3);
        myAP1.bigHeights(twelfthBigHeights, 4, 8);
        myAP1.bigHeights(thirteenthBigHeights, 0, 3);
        myAP1.bigHeights(fourteenthBigHeights, 7, 8);
        myAP1.bigHeights(fifteenthBigHeights, 3, 8);
        myAP1.bigHeights(sixteenthBigHeights, 2, 8);

        //commonTwo
        String[] firstCommonTwoA = {"a", "c", "x"};
        String[] secondCommonTwoA = {"a", "c", "x"};
        String[] thirdCommonTwoA = {"a", "b", "c"};
        String[] fourthCommonTwoA = {"a", "a", "b", "b", "c"};
        String[] fifthCommonTwoA = {"a", "a", "b", "b", "c"};
        String[] sixthCommonTwoA = {"a", "a", "b", "b", "c"};
        String[] seventhCommonTwoA = {"b", "b", "b", "b", "c"};
        String[] eighthCommonTwoA = {"a", "b", "c", "c", "d"};
        String[] ninthCommonTwoA = {"a", "a", "b", "b", "c"};
        String[] tenthCommonTwoA = {"a", "a", "b", "b", "c"};
        String[] eleventhCommonTwoA = {"a", "a", "b", "b", "c"};
        String[] twelfthCommonTwoA = {"a", "a", "b", "b", "c"};
        String[] thirteenthCommonTwoA = {"a"};
        String[] fourteenthCommonTwoA = {"a"};
        String[] fifteenthCommonTwoA = {"a", "a"};
        String[] sixteenthCommonTwoA = {"a", "b"};

        String[] firstCommonTwoB = {"b", "c", "d", "x"};
        String[] secondCommonTwoB = {"a", "b", "c", "x", "z"};
        String[] thirdCommonTwoB = {"a", "b", "c"};
        String[] fourthCommonTwoB = {"a", "b", "c"};
        String[] fifthCommonTwoB = {"a", "b", "b", "b", "c"};
        String[] sixthCommonTwoB = {"a", "b", "b", "c", "c"};
        String[] seventhCommonTwoB = {"a", "b", "b", "b", "c"};
        String[] eighthCommonTwoB = {"a", "b", "b", "c", "d", "d"};
        String[] ninthCommonTwoB = {"b", "b", "b"};
        String[] tenthCommonTwoB = {"c", "c"};
        String[] eleventhCommonTwoB = {"b", "b", "b", "x"};
        String[] twelfthCommonTwoB = {"b", "b"};
        String[] thirteenthCommonTwoB = {"a", "b"};
        String[] fourteenthCommonTwoB = {"b"};
        String[] fifteenthCommonTwoB = {"b", "b"};
        String[] sixteenthCommonTwoB = {"a", "b"};

        myAP1.commonTwo(firstCommonTwoA, firstCommonTwoB);
        myAP1.commonTwo(secondCommonTwoA, secondCommonTwoB);
        myAP1.commonTwo(thirdCommonTwoA, thirdCommonTwoB);
        myAP1.commonTwo(fourthCommonTwoA, fourthCommonTwoB);
        myAP1.commonTwo(fifthCommonTwoA, fifthCommonTwoB);
        myAP1.commonTwo(sixthCommonTwoA, sixthCommonTwoB);
        myAP1.commonTwo(seventhCommonTwoA, seventhCommonTwoB);
        myAP1.commonTwo(eighthCommonTwoA, eighthCommonTwoB);
        myAP1.commonTwo(ninthCommonTwoA, ninthCommonTwoB);
        myAP1.commonTwo(tenthCommonTwoA, tenthCommonTwoB);
        myAP1.commonTwo(eleventhCommonTwoA, eleventhCommonTwoB);
        myAP1.commonTwo(twelfthCommonTwoA, twelfthCommonTwoB);
        myAP1.commonTwo(thirteenthCommonTwoA, thirteenthCommonTwoB);
        myAP1.commonTwo(fourteenthCommonTwoA, fourteenthCommonTwoB);
        myAP1.commonTwo(fifteenthCommonTwoA, fifteenthCommonTwoB);
        myAP1.commonTwo(sixteenthCommonTwoA, sixteenthCommonTwoB);



    }
}

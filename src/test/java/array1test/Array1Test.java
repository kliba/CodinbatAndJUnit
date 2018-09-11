package array1test;

import array1.Array1;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Array1Test {

    Array1 testArray = new Array1();

    //******https://codingbat.com/java/Array-1******first column

    //firstLast6
    @Test
    public void testFirstLast6() {
        int[] firstFirstLast6 = {1, 2, 6};
        int[] secondFirstLast6 = {6, 1, 2, 3};
        int[] thirdFirstLast6 = {13, 6, 1, 2, 3};
        int[] fourthFirstLast6 = {13, 6, 1, 2, 6};
        int[] fifthFirstLast6 = {3, 2, 1};
        int[] sixthFirstLast6 = {3, 6, 1};
        int[] seventhFirstLast6 = {3, 6};
        int[] eighthFirstLast6 = {6};
        int[] ninthFirstLast6 = {3};
        int[] tenthFirstLast6 = {5, 6};
        int[] eleventhFirstLast6 = {5, 5};
        int[] twelfthFirstLast6 = {1, 2, 3, 4, 6};
        int[] thirteenthFirstLast6 = {1, 2, 3, 4};
        assertTrue(testArray.firstLast6(firstFirstLast6));
        assertTrue(testArray.firstLast6(secondFirstLast6));
        assertFalse(testArray.firstLast6(thirdFirstLast6));
        assertTrue(testArray.firstLast6(fourthFirstLast6));
        assertFalse(testArray.firstLast6(fifthFirstLast6));
        assertFalse(testArray.firstLast6(sixthFirstLast6));
        assertTrue(testArray.firstLast6(seventhFirstLast6));
        assertTrue(testArray.firstLast6(eighthFirstLast6));
        assertFalse(testArray.firstLast6(ninthFirstLast6));
        assertTrue(testArray.firstLast6(tenthFirstLast6));
        assertFalse(testArray.firstLast6(eleventhFirstLast6));
        assertTrue(testArray.firstLast6(twelfthFirstLast6));
        assertFalse(testArray.firstLast6(thirteenthFirstLast6));
    }

    //commonEnd
    @Test
    public void testCommonEnd() {
        int[] firstCommonEndA = {1, 2, 3};
        int[] firstCommonEndB = {7, 3};
        int[] secondCommonEndA = {1, 2, 3};
        int[] secondCommonEndB = {7, 3, 2};
        int[] thirdCommonEndA = {1, 2, 3};
        int[] thirdCommonEndB = {1, 3};
        int[] fourthCommonEndA = {1, 2, 3};
        int[] fourthCommonEndB = {1};
        int[] fifthCommonEndA = {1, 2, 3};
        int[] fifthCommonEndB = {2};
        assertTrue(testArray.commonEnd(firstCommonEndA, firstCommonEndB));
        assertFalse(testArray.commonEnd(secondCommonEndA, secondCommonEndB));
        assertTrue(testArray.commonEnd(thirdCommonEndA, thirdCommonEndB));
        assertTrue(testArray.commonEnd(fourthCommonEndA, fourthCommonEndB));
        assertFalse(testArray.commonEnd(fifthCommonEndA, fifthCommonEndB));
    }

    //reverse3
    @Test
    public void testReverse3() {
        int[] firstReverse3 = {1, 2, 3};
        int[] firstReverse3Excepted = {3, 2, 1};
        int[] secondReverse3 = {5, 11, 9};
        int[] secondReverseExcepted = {9, 11, 5};
        int[] thirdReverse3 = {7, 0, 0};
        int[] thirdReverse3Excepted = {0, 0, 7};
        int[] fourthReverse3 = {2, 1, 2};
        int[] fourthReverse3Excepted = {2, 1, 2};
        int[] fifthReverse3 = {1, 2, 1};
        int[] fifthReverse3Excepted = {1, 2, 1};
        int[] sixthReverse3 = {2, 11, 3};
        int[] sixthReverse3Excepted = {3, 11, 2};
        int[] seventhReverse3 = {0, 6, 5};
        int[] seventhReverse3Excepted = {5, 6, 0};
        int[] eighthReverse3 = {7, 2, 3};
        int[] eighthReverse3Excepted = {3, 2, 7};

        assertEquals(Arrays.toString(firstReverse3Excepted), Arrays.toString(testArray.reverse3(firstReverse3)));
        assertEquals(Arrays.toString(secondReverseExcepted), Arrays.toString(testArray.reverse3(secondReverse3)));
        assertEquals(Arrays.toString(thirdReverse3Excepted), Arrays.toString(testArray.reverse3(thirdReverse3)));
        assertEquals(Arrays.toString(fourthReverse3Excepted), Arrays.toString(testArray.reverse3(fourthReverse3)));
        assertEquals(Arrays.toString(fifthReverse3Excepted), Arrays.toString(testArray.reverse3(fifthReverse3)));
        assertEquals(Arrays.toString(sixthReverse3Excepted), Arrays.toString(testArray.reverse3(sixthReverse3)));
        assertEquals(Arrays.toString(seventhReverse3Excepted), Arrays.toString(testArray.reverse3(seventhReverse3)));
        assertEquals(Arrays.toString(eighthReverse3Excepted), Arrays.toString(testArray.reverse3(eighthReverse3)));
    }

    //middleWay
    @Test
    public void testMiddleWay() {
        int[] firstMiddleWayA = {1, 2, 3};
        int[] firstMiddleWayB = {4, 5, 6};
        int[] firstMiddleWayExcepted = {2, 5};
        int[] secondMiddleWayA = {7, 7, 7};
        int[] secondMiddleWayB = {3, 8, 0};
        int[] secondMiddleWayExcepted = {7, 8};
        int[] thirdMiddleWayA = {5, 2, 9};
        int[] thirdMiddleWayB = {1, 4, 5};
        int[] thirdMiddleWayExcepted = {2, 4};
        int[] fourthMiddleWayA = {1, 9, 7};
        int[] fourthMiddleWayB = {4, 8, 8};
        int[] fourthMiddleWayExcepted = {9, 8};
        int[] fifthMiddleWayA = {1, 2, 3};
        int[] fifthMiddleWayB = {3, 1, 4};
        int[] fifthMiddleWayExcepted = {2, 1};
        int[] sixthMiddleWayA = {1, 2, 3};
        int[] sixthMiddleWayB = {4, 1, 1};
        int[] sixthMiddleWayExcepted = {2, 1};
        assertEquals(Arrays.toString(firstMiddleWayExcepted), Arrays.toString(testArray.middleWay(firstMiddleWayA, firstMiddleWayB)));
        assertEquals(Arrays.toString(secondMiddleWayExcepted), Arrays.toString(testArray.middleWay(secondMiddleWayA, secondMiddleWayB)));
        assertEquals(Arrays.toString(thirdMiddleWayExcepted), Arrays.toString(testArray.middleWay(thirdMiddleWayA, thirdMiddleWayB)));
        assertEquals(Arrays.toString(fourthMiddleWayExcepted), Arrays.toString(testArray.middleWay(fourthMiddleWayA, fourthMiddleWayB)));
        assertEquals(Arrays.toString(fifthMiddleWayExcepted), Arrays.toString(testArray.middleWay(fifthMiddleWayA, fifthMiddleWayB)));
        assertEquals(Arrays.toString(sixthMiddleWayExcepted), Arrays.toString(testArray.middleWay(sixthMiddleWayA, sixthMiddleWayB)));
    }

    //no23
    @Test
    public void testNo23() {
        int[] firstNo23 = {4, 5};
        int[] secondNo23 = {4, 2};
        int[] thirdNo23 = {3, 5};
        int[] fourthNo23 = {1, 9};
        int[] fifthNo23 = {2, 9};
        int[] sixthNo23 = {1, 3};
        int[] eighthNo23 = {1, 1};
        int[] ninthNo23 = {2, 2};
        int[] tenthNo23 = {3, 3};
        int[] eleventhNo23 = {7, 8};
        int[] twelfthNo23 = {8, 7};
        assertTrue(testArray.no23(firstNo23));
        assertFalse(testArray.no23(secondNo23));
        assertFalse(testArray.no23(thirdNo23));
        assertTrue(testArray.no23(fourthNo23));
        assertFalse(testArray.no23(fifthNo23));
        assertFalse(testArray.no23(sixthNo23));
        assertTrue(testArray.no23(eighthNo23));
        assertFalse(testArray.no23(ninthNo23));
        assertFalse(testArray.no23(tenthNo23));
        assertTrue(testArray.no23(eleventhNo23));
        assertTrue(testArray.no23(twelfthNo23));
    }

    //fix23
    @Test
    public void testFix23() {
        int[] firstFix23 = {1, 2, 3};
        int[] firstFix23Excepted = {1, 2, 0};
        int[] secondFix23 = {2, 3, 5};
        int[] secondFix23Excepted = {2, 0, 5};
        int[] thirdFix23 = {1, 2, 1};
        int[] thirdFix23Excepted = {1, 2, 1};
        int[] fourthFix23 = {3, 2, 1};
        int[] fourthFix23Excepted = {3, 2, 1};
        int[] fifthFix23 = {2, 2, 3};
        int[] fifthFix23Excepted = {2, 2, 0};
        int[] sixthFix23 = {2, 3, 3};
        int[] sixthFix23Excepted = {2, 0, 3};
        assertEquals(Arrays.toString(firstFix23Excepted), Arrays.toString(testArray.fix23(firstFix23)));
        assertEquals(Arrays.toString(secondFix23Excepted), Arrays.toString(testArray.fix23(secondFix23)));
        assertEquals(Arrays.toString(thirdFix23Excepted), Arrays.toString(testArray.fix23(thirdFix23)));
        assertEquals(Arrays.toString(fourthFix23Excepted), Arrays.toString(testArray.fix23(fourthFix23)));
        assertEquals(Arrays.toString(fifthFix23Excepted), Arrays.toString(testArray.fix23(fifthFix23)));
        assertEquals(Arrays.toString(sixthFix23Excepted), Arrays.toString(testArray.fix23(sixthFix23)));
    }

    //makeMiddle
    @Test
    public void testMakeMiddle() {
        int[] firstMakeMiddle = {1, 2, 3, 4};
        int[] firstMakeMiddleExcepted = {2, 3};
        int[] secondMakeMiddle = {7, 1, 2, 3, 4, 9};
        int[] secondMakeMiddleExcepted = {2, 3};
        int[] thirdMakeMiddle = {1, 2};
        int[] thirdMakeMiddleExcepted = {1, 2};
        int[] fourthMakeMiddle = {5, 2, 4, 7};
        int[] fourthMakeMiddleExcepted = {2, 4};
        int[] fifthMakeMiddle = {9, 0, 4, 3, 9, 1};
        int[] fifthMakeMiddleExcepted = {4, 3};
        assertEquals(Arrays.toString(firstMakeMiddleExcepted), Arrays.toString(testArray.makeMiddle(firstMakeMiddle)));
        assertEquals(Arrays.toString(secondMakeMiddleExcepted), Arrays.toString(testArray.makeMiddle(secondMakeMiddle)));
        assertEquals(Arrays.toString(thirdMakeMiddleExcepted), Arrays.toString(testArray.makeMiddle(thirdMakeMiddle)));
        assertEquals(Arrays.toString(fourthMakeMiddleExcepted), Arrays.toString(testArray.makeMiddle(fourthMakeMiddle)));
        assertEquals(Arrays.toString(fifthMakeMiddleExcepted), Arrays.toString(testArray.makeMiddle(fifthMakeMiddle)));
    }

    //midThree
    @Test
    public void testMidThree() {
        int[] firstMidThree = {1, 2, 3, 4, 5};
        int[] firstMidThreeExcepted = {2, 3, 4};
        int[] secondMidThree = {8, 6, 7, 5, 3, 0, 9};
        int[] secondMidThreeExcepted = {7, 5, 3};
        int[] thirdMidThree = {1, 2, 3};
        int[] thirdMidThreeExcepted = {1, 2, 3};
        assertEquals(Arrays.toString(firstMidThreeExcepted), Arrays.toString(testArray.midThree(firstMidThree)));
        assertEquals(Arrays.toString(secondMidThreeExcepted), Arrays.toString(testArray.midThree(secondMidThree)));
        assertEquals(Arrays.toString(thirdMidThreeExcepted), Arrays.toString(testArray.midThree(thirdMidThree)));
    }

    //unlucky1
    @Test
    public void testUnlucky1() {
        int[] firstUnlucky1 = {1, 3, 4, 5};
        int[] secondUnlucky1 = {2, 1, 3, 4, 5};
        int[] thirdUnlucky1 = {1, 1, 1};
        int[] fourthUnlucky1 = {1, 3, 1};
        int[] fifthUnlucky1 = {1, 1, 3};
        int[] sixthUnlucky1 = {1, 2, 3};
        int[] seventhUnlucky1 = {3, 3, 3};
        int[] eighthUnlucky1 = {1, 3};
        int[] ninthUnlucky1 = {1, 4};
        int[] tenthUnlucky1 = {1};
        int[] eleventhUnlucky1 = {};
        int[] twelfthUnlucky1 = {1, 1, 1, 3, 1};
        int[] thirteenthUnlucky1 = {1, 1, 3, 1, 1};
        int[] fourteenthUnlucky1 = {1, 1, 1, 1, 3};
        int[] fifteenthUnlucky1 = {1, 4, 1, 5};
        int[] sixteenthUnlucky1 = {1, 1, 2, 3};
        int[] eighteenthUnlucky1 = {2, 3, 2, 1};
        int[] nineteenthUnlucky1 = {2, 3, 1, 3};
        int[] twentiethUnlucky1 = {1, 2, 3, 4, 1, 3};
        assertTrue(testArray.unlucky1(firstUnlucky1));
        assertTrue(testArray.unlucky1(secondUnlucky1));
        assertFalse(testArray.unlucky1(thirdUnlucky1));
        assertTrue(testArray.unlucky1(fourthUnlucky1));
        assertTrue(testArray.unlucky1(fifthUnlucky1));
        assertFalse(testArray.unlucky1(sixthUnlucky1));
        assertFalse(testArray.unlucky1(seventhUnlucky1));
        assertTrue(testArray.unlucky1(eighthUnlucky1));
        assertFalse(testArray.unlucky1(ninthUnlucky1));
        assertFalse(testArray.unlucky1(tenthUnlucky1));
        assertFalse(testArray.unlucky1(eleventhUnlucky1));
        assertFalse(testArray.unlucky1(twelfthUnlucky1));
        assertTrue(testArray.unlucky1(thirteenthUnlucky1));
        assertTrue(testArray.unlucky1(fourteenthUnlucky1));
        assertFalse(testArray.unlucky1(fifteenthUnlucky1));
        assertFalse(testArray.unlucky1(sixteenthUnlucky1));
        assertFalse(testArray.unlucky1(eighteenthUnlucky1));
        assertTrue(testArray.unlucky1(nineteenthUnlucky1));
        assertTrue(testArray.unlucky1(twentiethUnlucky1));
    }

    //sameFirstLast
    @Test
    public void testSameFirstLast() {
        int[] firstSameFirstLast = {1, 2, 3};
        int[] secondSameFirstLast = {1, 2, 3, 1};
        int[] thirdSameFirstLast = {1, 2, 1};
        int[] fourthSameFirstLast = {7};
        int[] fifthSameFirstLast = {};
        int[] sixthSameFirstLast = {1, 2, 3, 4, 5, 1};
        int[] seventhSameFirstLast = {1, 2, 3, 4, 5, 13};
        int[] eighthSameFirstLast = {13, 2, 3, 4, 5, 13};
        int[] ninthSameFirstLast = {7, 7};

        assertFalse(testArray.sameFirstLast(firstSameFirstLast));
        assertTrue(testArray.sameFirstLast(secondSameFirstLast));
        assertTrue(testArray.sameFirstLast(thirdSameFirstLast));
        assertTrue(testArray.sameFirstLast(fourthSameFirstLast));
        assertFalse(testArray.sameFirstLast(fifthSameFirstLast));
        assertTrue(testArray.sameFirstLast(sixthSameFirstLast));
        assertFalse(testArray.sameFirstLast(seventhSameFirstLast));
        assertTrue(testArray.sameFirstLast(eighthSameFirstLast));
        assertTrue(testArray.sameFirstLast(ninthSameFirstLast));
    }

    //sum3
    @Test
    public void testSum3() {
        int[] firstSum3 = {1, 2, 3};
        int[] secondSum3 = {5, 11, 2};
        int[] thirdSum3 = {7, 0, 0};
        int[] fourthSum3 = {1, 2, 1};
        int[] fifthSum3 = {1, 1, 1};
        int[] sixthSum3 = {2, 7, 2};
        assertEquals(6, testArray.sum3(firstSum3));
        assertEquals(18, testArray.sum3(secondSum3));
        assertEquals(7, testArray.sum3(thirdSum3));
        assertEquals(4, testArray.sum3(fourthSum3));
        assertEquals(3, testArray.sum3(fifthSum3));
        assertEquals(11, testArray.sum3(sixthSum3));
    }

    //maxEnd3
    @Test
    public void testMax3() {
        int[] firstMaxEnd3 = {1, 2, 3};
        int[] firstMaxEnd3Excepted = {3, 3, 3};
        int[] secondMaxEnd3 = {11, 5, 9};
        int[] secondMaxEnd3Excepted  = {11, 11, 11};
        int[] thirdMaxEnd3 = {2, 11, 3};
        int[] thirdMaxEnd3Excepted  = {3, 3, 3};
        int[] fourthMaxEnd3 = {11, 3, 3};
        int[] fourthMaxEnd3Excepted  = {11, 11, 11};
        int[] fifthMaxEnd3 = {3, 11, 11};
        int[] fifthMaxEnd3Excepted  = {11, 11, 11};
        int[] sixthMaxEnd3 = {2, 2, 2};
        int[] sixthMaxEnd3Excepted  = {2, 2, 2};
        int[] eighthMaxEnd3 = {2, 11, 2};
        int[] eighthMaxEnd3Excepted  = {2, 2, 2};
        int[] ninthMaxEnd3 = {0, 0, 1};
        int[] ninthMaxEnd3Excepted  = {1, 1, 1};
        assertEquals(Arrays.toString(firstMaxEnd3Excepted), Arrays.toString(testArray.maxEnd3(firstMaxEnd3)));
        assertEquals(Arrays.toString(secondMaxEnd3Excepted), Arrays.toString(testArray.maxEnd3(secondMaxEnd3)));
        assertEquals(Arrays.toString(thirdMaxEnd3Excepted), Arrays.toString(testArray.maxEnd3(thirdMaxEnd3)));
        assertEquals(Arrays.toString(fourthMaxEnd3Excepted), Arrays.toString(testArray.maxEnd3(fourthMaxEnd3)));
        assertEquals(Arrays.toString(fifthMaxEnd3Excepted), Arrays.toString(testArray.maxEnd3(fifthMaxEnd3)));
        assertEquals(Arrays.toString(eighthMaxEnd3Excepted), Arrays.toString(testArray.maxEnd3(eighthMaxEnd3)));
        assertEquals(Arrays.toString(ninthMaxEnd3Excepted), Arrays.toString(testArray.maxEnd3(ninthMaxEnd3)));
        assertEquals(Arrays.toString(sixthMaxEnd3Excepted), Arrays.toString(testArray.maxEnd3(sixthMaxEnd3)));
    }

    //makeEnds
    @Test
    public void testMakeEnds() {
        int[] firstMakeEnds = {1, 2, 3};
        int[] firstMakeEndsExcepted = {1, 3};
        int[] secondMakeEnds = {1, 4};
        int[] secondMakeEndsExcepted = {1, 4};
        int[] thirdMakeEnds = {7, 4, 6, 2};
        int[] thirdMakeEndsExcepted = {7, 2};
        int[] fourthMakeEnds = {1, 2, 2, 2, 2, 2, 2, 3};
        int[] fourthMakeEndsExcepted = {1, 3};
        int[] fifthMakeEnds = {7, 4};
        int[] fifthMakeEndsExcepted = {7, 4};
        int[] sixthMakeEnds = {7};
        int[] sixthMakeEndsExcepted = {7, 7};
        int[] seventhMakeEnds = {5, 2, 9};
        int[] seventhMakeEndsExcepted = {5, 9};
        int[] eighthMakeEnds = {2, 3, 4, 1};
        int[] eighthMakeEndsExcepted = {2, 1};
        assertEquals(Arrays.toString(firstMakeEndsExcepted), Arrays.toString(testArray.makeEnds(firstMakeEnds)));
        assertEquals(Arrays.toString(secondMakeEndsExcepted), Arrays.toString(testArray.makeEnds(secondMakeEnds)));
        assertEquals(Arrays.toString(thirdMakeEndsExcepted), Arrays.toString(testArray.makeEnds(thirdMakeEnds)));
        assertEquals(Arrays.toString(fourthMakeEndsExcepted), Arrays.toString(testArray.makeEnds(fourthMakeEnds)));
        assertEquals(Arrays.toString(fifthMakeEndsExcepted), Arrays.toString(testArray.makeEnds(fifthMakeEnds)));
        assertEquals(Arrays.toString(sixthMakeEndsExcepted), Arrays.toString(testArray.makeEnds(sixthMakeEnds)));
        assertEquals(Arrays.toString(seventhMakeEndsExcepted), Arrays.toString(testArray.makeEnds(seventhMakeEnds)));
        assertEquals(Arrays.toString(eighthMakeEndsExcepted), Arrays.toString(testArray.makeEnds(eighthMakeEnds)));
    }

    //makeLast
    @Test
    public void testMakeLast() {
        int[] firstMakeLast = {4, 5, 6};
        int[] firstMakeLastExcepted = {0, 0, 0, 0, 0, 6};
        int[] secondMakeLast = {1, 2};
        int[] secondMakeLastExcepted = {0, 0, 0, 2};
        int[] thirdMakeLast = {3};
        int[] thirdMakeLastExcepted = {0, 3};
        int[] fourthMakeLast = {0};
        int[] fourthMakeLastExcepted = {0, 0};
        int[] fifthMakeLast = {7, 7, 7};
        int[] fifthMakeLastExcepted = {0, 0, 0, 0, 0, 7};
        int[] sixthMakeLast = {3, 1, 4};
        int[] sixthMakeLastExcepted = {0, 0, 0, 0, 0, 4};
        int[] seventhMakeLast = {1, 2, 3, 4};
        int[] seventhMakeLastExcepted = {0, 0, 0, 0, 0, 0, 0, 4};
        int[] eighthMakeLast = {1, 2, 3, 0};
        int[] eighthMakeLastExcepted = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] ninthMakeLast = {2, 4};
        int[] ninthMakeLastExcepted = {0, 0, 0, 4};

        assertEquals(Arrays.toString(firstMakeLastExcepted), Arrays.toString(testArray.makeLast(firstMakeLast)));
        assertEquals(Arrays.toString(secondMakeLastExcepted), Arrays.toString(testArray.makeLast(secondMakeLast)));
        assertEquals(Arrays.toString(thirdMakeLastExcepted), Arrays.toString(testArray.makeLast(thirdMakeLast)));
        assertEquals(Arrays.toString(fourthMakeLastExcepted), Arrays.toString(testArray.makeLast(fourthMakeLast)));
        assertEquals(Arrays.toString(fifthMakeLastExcepted), Arrays.toString(testArray.makeLast(fifthMakeLast)));
        assertEquals(Arrays.toString(sixthMakeLastExcepted), Arrays.toString(testArray.makeLast(sixthMakeLast)));
        assertEquals(Arrays.toString(seventhMakeLastExcepted), Arrays.toString(testArray.makeLast(seventhMakeLast)));
        assertEquals(Arrays.toString(eighthMakeLastExcepted), Arrays.toString(testArray.makeLast(eighthMakeLast)));
        assertEquals(Arrays.toString(ninthMakeLastExcepted), Arrays.toString(testArray.makeLast(ninthMakeLast)));
    }

    //start1
    @Test
    public void testStart1() {
        int[] firstStartA = {1, 2, 3};
        int[] firstStartB = {1, 3};
        int[] secondStartA = {7, 2, 3};
        int[] secondStartB = {1};
        int[] thirdStartA = {1, 2};
        int[] thirdStartB = {};
        int[] fourthStartA = {};
        int[] fourthStartB = {1, 2};
        int[] fifthStartA = {7};
        int[] fifthStartB = {};
        int[] sixthStartA = {7};
        int[] sixthStartB = {1};
        int[] seventhStartA = {1};
        int[] seventhStartB = {1};
        int[] eighthStartA = {7};
        int[] eighthStartB = {8};
        int[] ninthStartA = {};
        int[] ninthStartB = {};
        int[] tenthStartA = {1, 3};
        int[] tenthStartB = {1};
        assertEquals(2, testArray.start1(firstStartA, firstStartB));
        assertEquals(1, testArray.start1(secondStartA, secondStartB));
        assertEquals(1, testArray.start1(thirdStartA, thirdStartB));
        assertEquals(1, testArray.start1(fourthStartA, fourthStartB));
        assertEquals(0, testArray.start1(fifthStartA, fifthStartB));
        assertEquals(1, testArray.start1(sixthStartA, sixthStartB));
        assertEquals(2, testArray.start1(seventhStartA, seventhStartB));
        assertEquals(0, testArray.start1(eighthStartA, eighthStartB));
        assertEquals(0, testArray.start1(ninthStartA, ninthStartB));
        assertEquals(2, testArray.start1(tenthStartA, tenthStartB));
    }

    //plusTwo
    @Test
    public void testPlusTwo() {
        int[] firstPlusTwoA = {1, 2};
        int[] firstPlusTwoB = {3, 4};
        int[] firstPlusTwoExpected = {1, 2, 3, 4};
        int[] secondPlusTwoA = {4, 4};
        int[] secondPlusTwoB = {2, 2};
        int[] secondPlusTwoExpected  = {4, 4, 2, 2};
        int[] thirdPlusTwoA = {9, 2};
        int[] thirdPlusTwoB = {3, 4};
        int[] thirdPlusTwoExpected  = {9, 2, 3, 4};
        assertEquals(Arrays.toString(firstPlusTwoExpected), Arrays.toString(testArray.plusTwo(firstPlusTwoA, firstPlusTwoB)));
        assertEquals(Arrays.toString(secondPlusTwoExpected), Arrays.toString(testArray.plusTwo(secondPlusTwoA, secondPlusTwoB)));
        assertEquals(Arrays.toString(thirdPlusTwoExpected), Arrays.toString(testArray.plusTwo(thirdPlusTwoA, thirdPlusTwoB)));
    }

    //maxTriple
    @Test
    public void testMaxTriple() {
        int[] firstMaxTriple = {1, 2, 3};
        int[] secondMaxTriple = {1, 5, 3};
        int[] thirdMaxTriple = {5, 2, 3};
        int[] fourthMaxTriple = {1, 2, 3, 1, 1};
        int[] fifthMaxTriple = {1, 7, 3, 1, 5};
        int[] sixthMaxTriple = {5, 1, 3, 7, 1};
        int[] seventhMaxTriple = {5, 1, 7, 3, 7, 8, 1};
        int[] eighthMaxTriple = {5, 1, 7, 9, 7, 8, 1};
        int[] ninthMaxTriple = {5, 1, 7, 3, 7, 8, 9};
        int[] tenthMaxTriple = {2, 2, 5, 1, 1};
        assertEquals(3, testArray.maxTriple(firstMaxTriple));
        assertEquals(5, testArray.maxTriple(secondMaxTriple));
        assertEquals(5, testArray.maxTriple(thirdMaxTriple));
        assertEquals(3, testArray.maxTriple(fourthMaxTriple));
        assertEquals(5, testArray.maxTriple(fifthMaxTriple));
        assertEquals(5, testArray.maxTriple(sixthMaxTriple));
        assertEquals(5, testArray.maxTriple(seventhMaxTriple));
        assertEquals(9, testArray.maxTriple(eighthMaxTriple));
        assertEquals(9, testArray.maxTriple(ninthMaxTriple));
        assertEquals(5, testArray.maxTriple(tenthMaxTriple));
    }

    //make2
    @Test
    public void testMake2() {
        int[] firstMake2A = {4, 5};
        int[] firstMake2B = {1, 2, 3};
        int[] firstMake2Expected = {4, 5};
        int[] secondMake2A = {4};
        int[] secondMake2B = {1, 2, 3};
        int[] secondMake2Expected = {4, 1};
        int[] thirdMake2A = {};
        int[] thirdMake2B = {1, 2};
        int[] thirdMake2Expected = {1, 2};
        int[] fourthMake2A = {1, 2};
        int[] fourthMake2B = {};
        int[] fourthMake2Expected = {1, 2};
        int[] fifthMake2A = {3};
        int[] fifthMake2B = {1, 2, 3};
        int[] fifthMake2Expected = {3, 1};
        int[] sixthMake2A = {3};
        int[] sixthMake2B = {1};
        int[] sixthMake2Expected = {3, 1};
        int[] seventhMake2A = {3, 1, 4};
        int[] seventhMake2B = {};
        int[] seventhMake2Expected = {3, 1};
        int[] eighthMake2A = {1};
        int[] eighthMake2B = {1};
        int[] eighthMake2Expected = {1, 1};
        int[] ninthMake2A = {1, 2, 3};
        int[] ninthMake2B = {7, 8};
        int[] ninthMake2Expected = {1, 2};
        int[] tenthMake2A = {7, 8};
        int[] tenthMake2B = {1, 2, 3};
        int[] tenthMake2Expected = {7, 8};
        int[] eleventhMake2A = {7};
        int[] eleventhMake2B = {1, 2, 3};
        int[] eleventhMake2Expected = {7, 1};
        int[] twelfthMake2A = {5, 4};
        int[] twelfthMake2B = {2, 3, 7};
        int[] twelfthMake2Expected = {5, 4};
        assertEquals(Arrays.toString(firstMake2Expected), Arrays.toString(testArray.make2(firstMake2A, firstMake2B)));
        assertEquals(Arrays.toString(secondMake2Expected), Arrays.toString(testArray.make2(secondMake2A, secondMake2B)));
        assertEquals(Arrays.toString(thirdMake2Expected), Arrays.toString(testArray.make2(thirdMake2A, thirdMake2B)));
        assertEquals(Arrays.toString(fourthMake2Expected), Arrays.toString(testArray.make2(fourthMake2A, fourthMake2B)));
        assertEquals(Arrays.toString(fifthMake2Expected), Arrays.toString(testArray.make2(fifthMake2A, fifthMake2B)));
        assertEquals(Arrays.toString(sixthMake2Expected), Arrays.toString(testArray.make2(sixthMake2A, sixthMake2B)));
        assertEquals(Arrays.toString(seventhMake2Expected), Arrays.toString(testArray.make2(seventhMake2A, seventhMake2B)));
        assertEquals(Arrays.toString(eighthMake2Expected), Arrays.toString(testArray.make2(eighthMake2A, eighthMake2B)));
        assertEquals(Arrays.toString(ninthMake2Expected), Arrays.toString(testArray.make2(ninthMake2A, ninthMake2B)));
        assertEquals(Arrays.toString(tenthMake2Expected), Arrays.toString(testArray.make2(tenthMake2A, tenthMake2B)));
        assertEquals(Arrays.toString(eleventhMake2Expected), Arrays.toString(testArray.make2(eleventhMake2A, eleventhMake2B)));
        assertEquals(Arrays.toString(twelfthMake2Expected), Arrays.toString(testArray.make2(twelfthMake2A, twelfthMake2B)));
    }

    //makePi
    @Test
    public void testMakePi() {
        int[] makePi = {3, 1, 4};
        assertEquals(Arrays.toString(makePi), Arrays.toString(testArray.makePi()));
    }

    //rotateLeft3
    @Test
    public void testRotateLeft3() {
        int[] firstRotateLeft3 = {1, 2, 3};
        int[] firstRotateLeft3Expected = {2, 3, 1};
        int[] secondRotateLeft3 = {5, 11, 9};
        int[] secondRotateLeft3Expected = {11, 9, 5};
        int[] thirdRotateLeft3 = {7, 0, 0};
        int[] thirdRotateLeft3Expected = {0, 0, 7};
        int[] fourthRotateLeft3 = {1, 2, 1};
        int[] fourthRotateLeft3Expected = {2, 1, 1};
        int[] fifthRotateLeft3 = {0, 0, 1};
        int[] fifthRotateLeft3Expected = {0, 1, 0};

        assertEquals(Arrays.toString(firstRotateLeft3Expected), Arrays.toString(testArray.rotateLeft3(firstRotateLeft3)));
        assertEquals(Arrays.toString(secondRotateLeft3Expected), Arrays.toString(testArray.rotateLeft3(secondRotateLeft3)));
        assertEquals(Arrays.toString(thirdRotateLeft3Expected), Arrays.toString(testArray.rotateLeft3(thirdRotateLeft3)));
        assertEquals(Arrays.toString(fourthRotateLeft3Expected), Arrays.toString(testArray.rotateLeft3(fourthRotateLeft3)));
        assertEquals(Arrays.toString(fifthRotateLeft3Expected), Arrays.toString(testArray.rotateLeft3(fifthRotateLeft3)));
    }

    //sum2
    @Test
    public void testSum2() {
        int[] firstSum2 = {1, 2, 3};
        int[] secondSum2 = {1, 1};
        int[] thirdSum2 = {1, 1, 1, 1};
        int[] fourthSum2 = {1, 2};
        int[] fifthSum2 = {1};
        int[] sixthSum2 = {};
        int[] seventhSum2 = {4, 5, 6};
        int[] eighthSum2 = {4};
        assertEquals(3, testArray.sum2(firstSum2));
        assertEquals(2, testArray.sum2(secondSum2));
        assertEquals(2, testArray.sum2(thirdSum2));
        assertEquals(3, testArray.sum2(fourthSum2));
        assertEquals(1, testArray.sum2(fifthSum2));
        assertEquals(0, testArray.sum2(sixthSum2));
        assertEquals(9, testArray.sum2(seventhSum2));
        assertEquals(4, testArray.sum2(eighthSum2));
    }

    //has23
    @Test
    public void testHas23() {
        int[] firstHas23 = {2, 5};
        int[] secondHas23 = {4, 3};
        int[] thirdHas23 = {4, 5};
        int[] fourthHas23 = {2, 2};
        int[] fifthHas23 = {3, 2};
        int[] sixthHas23 = {3, 3};
        int[] seventhHas23 = {7, 7};
        int[] eighthHas23 = {3, 9};
        int[] ninthHas23 = {9, 5};
        assertTrue(testArray.has23(firstHas23));
        assertTrue(testArray.has23(secondHas23));
        assertFalse(testArray.has23(thirdHas23));
        assertTrue(testArray.has23(fourthHas23));
        assertTrue(testArray.has23(fifthHas23));
        assertTrue(testArray.has23(sixthHas23));
        assertFalse(testArray.has23(seventhHas23));
        assertTrue(testArray.has23(eighthHas23));
        assertFalse(testArray.has23(ninthHas23));
    }

    //double23
    @Test
    public void testDouble23() {
        int[] firstDouble23 = {2, 2};
        int[] secondDouble23 = {3, 3};
        int[] thirdDouble23 = {2, 3};
        int[] fourthDouble23 = {3, 2};
        int[] fifthDouble23 = {4, 5};
        int[] sixthDouble23 = {2};
        int[] seventhDouble23 = {3};
        int[] eighthDouble23 = {};
        int[] ninthDouble23 = {3, 4};
        assertTrue(testArray.double23(firstDouble23));
        assertTrue(testArray.double23(secondDouble23));
        assertFalse(testArray.double23(thirdDouble23));
        assertFalse(testArray.double23(fourthDouble23));
        assertFalse(testArray.double23(fifthDouble23));
        assertFalse(testArray.double23(sixthDouble23));
        assertFalse(testArray.double23(seventhDouble23));
        assertFalse(testArray.double23(eighthDouble23));
        assertFalse(testArray.double23(ninthDouble23));
    }

    //biggerTwo
    @Test
    public void testBiggerTwo() {
        int[] firstBiggerTwoA = {1, 2};
        int[] firstBiggerTwoB = {3, 4};
        int[] firstBiggerTwoExpected = {3, 4};
        int[] secondBiggerTwoA = {3, 4};
        int[] secondBiggerTwoB = {1, 2};
        int[] secondBiggerTwoExpected  = {3, 4};
        int[] thirdBiggerTwoA = {1, 1};
        int[] thirdBiggerTwoB = {1, 2};
        int[] thirdBiggerTwoExpected  = {1, 2};
        int[] fourthBiggerTwoA = {2, 1};
        int[] fourthBiggerTwoB = {1, 1};
        int[] fourthBiggerTwoExpected  = {2, 1};
        int[] sixthBiggerTwoA = {2, 2};
        int[] sixthBiggerTwoB = {1, 3};
        int[] sixthBiggerTwoExpected  = {2, 2};
        int[] seventhBiggerTwoA = {1, 3};
        int[] seventhBiggerTwoB = {2, 2};
        int[] seventhBiggerTwoExpected  = {1, 3};
        int[] eighthBiggerTwoA = {6, 7};
        int[] eighthBiggerTwoB = {3, 1};
        int[] eighthBiggerTwoExpected  = {6, 7};
        assertEquals(Arrays.toString(firstBiggerTwoExpected), Arrays.toString(testArray.biggerTwo(firstBiggerTwoA, firstBiggerTwoB)));
        assertEquals(Arrays.toString(secondBiggerTwoExpected), Arrays.toString(testArray.biggerTwo(secondBiggerTwoA, secondBiggerTwoB)));
        assertEquals(Arrays.toString(thirdBiggerTwoExpected), Arrays.toString(testArray.biggerTwo(thirdBiggerTwoA, thirdBiggerTwoB)));
        assertEquals(Arrays.toString(fourthBiggerTwoExpected), Arrays.toString(testArray.biggerTwo(fourthBiggerTwoA, fourthBiggerTwoB)));
        assertEquals(Arrays.toString(sixthBiggerTwoExpected), Arrays.toString(testArray.biggerTwo(sixthBiggerTwoA, sixthBiggerTwoB)));
        assertEquals(Arrays.toString(seventhBiggerTwoExpected), Arrays.toString(testArray.biggerTwo(seventhBiggerTwoA, seventhBiggerTwoB)));
        assertEquals(Arrays.toString(eighthBiggerTwoExpected), Arrays.toString(testArray.biggerTwo(eighthBiggerTwoA, eighthBiggerTwoB)));
    }

    //swapEnds
    @Test
    public void testSwapEnds() {
        int[] firstSwapEnds = {1, 2, 3, 4};
        int[] firstSwapEndsExpected = {4, 2, 3, 1};
        int[] secondSwapEnds = {1, 2, 3};
        int[] secondSwapEndsExpected = {3, 2, 1};
        int[] thirdSwapEnds = {8, 6, 7, 9, 5};
        int[] thirdSwapEndsExpected = {5, 6, 7, 9, 8};
        int[] fourthSwapEnds = {3, 1, 4, 1, 5, 9};
        int[] fourthSwapEndsExpected = {9, 1, 4, 1, 5, 3};
        int[] fifthSwapEnds = {1, 2};
        int[] fifthSwapEndsExpected = {2, 1};
        int[] sixthSwapEnds = {1};
        int[] sixthSwapEndsExpected = {1};
        assertEquals(Arrays.toString(firstSwapEndsExpected), Arrays.toString(testArray.swapEnds(firstSwapEnds)));
        assertEquals(Arrays.toString(secondSwapEndsExpected), Arrays.toString(testArray.swapEnds(secondSwapEnds)));
        assertEquals(Arrays.toString(thirdSwapEndsExpected), Arrays.toString(testArray.swapEnds(thirdSwapEnds)));
        assertEquals(Arrays.toString(fourthSwapEndsExpected), Arrays.toString(testArray.swapEnds(fourthSwapEnds)));
        assertEquals(Arrays.toString(fifthSwapEndsExpected), Arrays.toString(testArray.swapEnds(fifthSwapEnds)));
        assertEquals(Arrays.toString(sixthSwapEndsExpected), Arrays.toString(testArray.swapEnds(sixthSwapEnds)));
    }

    //frontPiece
    @Test
    public void testFrontPiece() {
        int[] firstFrontPiece = {1, 2, 3};
        int[] firstFrontPieceExpected = {1, 2};
        int[] secondFrontPiece = {1, 2};
        int[] secondFrontPieceExpected = {1, 2};
        int[] thirdFrontPiece = {1};
        int[] thirdFrontPieceExpected = {1};
        int[] fourthFrontPiece = {};
        int[] fourthFrontPieceExpected = {};
        int[] fifthFrontPiece = {6, 5, 0};
        int[] fifthFrontPieceExpected = {6, 5};
        int[] sixthFrontPiece = {6, 5};
        int[] sixthFrontPieceExpected = {6, 5};
        int[] seventhFrontPiece = {3, 1, 4, 1, 5};
        int[] seventhFrontPieceExpected = {3, 1};
        int[] eighthFrontPiece = {6};
        int[] eighthFrontPieceExpected = {6};
        assertEquals(Arrays.toString(firstFrontPieceExpected), Arrays.toString(testArray.frontPiece(firstFrontPiece)));
        assertEquals(Arrays.toString(secondFrontPieceExpected), Arrays.toString(testArray.frontPiece(secondFrontPiece)));
        assertEquals(Arrays.toString(thirdFrontPieceExpected), Arrays.toString(testArray.frontPiece(thirdFrontPiece)));
        assertEquals(Arrays.toString(fourthFrontPieceExpected), Arrays.toString(testArray.frontPiece(fourthFrontPiece)));
        assertEquals(Arrays.toString(fifthFrontPieceExpected), Arrays.toString(testArray.frontPiece(fifthFrontPiece)));
        assertEquals(Arrays.toString(sixthFrontPieceExpected), Arrays.toString(testArray.frontPiece(sixthFrontPiece)));
        assertEquals(Arrays.toString(seventhFrontPieceExpected), Arrays.toString(testArray.frontPiece(seventhFrontPiece)));
        assertEquals(Arrays.toString(eighthFrontPieceExpected), Arrays.toString(testArray.frontPiece(eighthFrontPiece)));
    }

    //front11
    @Test
    public void testFront11() {
        int[] firstFront11A = {1, 2, 3};
        int[] firstFront11B = {7, 9, 8};
        int[] firstFront11BExpected = {1, 7};
        int[] secondFront11A = {1};
        int[] secondFront11B = {2};
        int[] secondFront11BExpected = {1, 2};
        int[] thirdFront11A = {1, 7};
        int[] thirdFront11B = {};
        int[] thirdFront11BExpected = {1};
        int[] fourthFront11A = {};
        int[] fourthFront11B = {2, 8};
        int[] fourthFront11BExpected = {2};
        int[] fifthFront11A = {};
        int[] fifthFront11B = {};
        int[] fifthFront11BExpected = {};
        int[] sixthFront11A = {3};
        int[] sixthFront11B = {1, 4, 1, 9};
        int[] sixthFront11BExpected = {3, 1};
        int[] seventhFront11A = {1, 4, 1, 9};
        int[] seventhFront11B = {};
        int[] seventhFront11BExpected = {1};
        assertEquals(Arrays.toString(firstFront11BExpected), Arrays.toString(testArray.front11(firstFront11A, firstFront11B)));
        assertEquals(Arrays.toString(secondFront11BExpected), Arrays.toString(testArray.front11(secondFront11A, secondFront11B)));
        assertEquals(Arrays.toString(thirdFront11BExpected), Arrays.toString(testArray.front11(thirdFront11A, thirdFront11B)));
        assertEquals(Arrays.toString(fourthFront11BExpected), Arrays.toString(testArray.front11(fourthFront11A, fourthFront11B)));
        assertEquals(Arrays.toString(fifthFront11BExpected), Arrays.toString(testArray.front11(fifthFront11A, fifthFront11B)));
        assertEquals(Arrays.toString(sixthFront11BExpected), Arrays.toString(testArray.front11(sixthFront11A, sixthFront11B)));
        assertEquals(Arrays.toString(seventhFront11BExpected), Arrays.toString(testArray.front11(seventhFront11A, seventhFront11B)));
    }
}

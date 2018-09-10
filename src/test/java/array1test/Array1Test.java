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
}

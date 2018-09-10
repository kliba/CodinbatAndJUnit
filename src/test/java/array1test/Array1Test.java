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
        int[] firstReverse3Exception = {3, 2, 1};
        int[] secondReverse3 = {5, 11, 9};
        int[] secondReverse3Exception = {9, 11, 5};
        int[] thirdReverse3 = {7, 0, 0};
        int[] thirdReverse3Exception = {0, 0, 7};
        int[] fourthReverse3 = {2, 1, 2};
        int[] fourthReverse3Exception = {2, 1, 2};
        int[] fifthReverse3 = {1, 2, 1};
        int[] fifthReverse3Exception = {1, 2, 1};
        int[] sixthReverse3 = {2, 11, 3};
        int[] sixthReverse3Exception = {3, 11, 2};
        int[] seventhReverse3 = {0, 6, 5};
        int[] seventhReverse3Exception = {5, 6, 0};
        int[] eighthReverse3 = {7, 2, 3};
        int[] eighthReverse3Exception = {3, 2, 7};

        assertEquals(Arrays.toString(firstReverse3Exception), Arrays.toString(testArray.reverse3(firstReverse3)));
        assertEquals(Arrays.toString(secondReverse3Exception), Arrays.toString(testArray.reverse3(secondReverse3)));
        assertEquals(Arrays.toString(thirdReverse3Exception), Arrays.toString(testArray.reverse3(thirdReverse3)));
        assertEquals(Arrays.toString(fourthReverse3Exception), Arrays.toString(testArray.reverse3(fourthReverse3)));
        assertEquals(Arrays.toString(fifthReverse3Exception), Arrays.toString(testArray.reverse3(fifthReverse3)));
        assertEquals(Arrays.toString(sixthReverse3Exception), Arrays.toString(testArray.reverse3(sixthReverse3)));
        assertEquals(Arrays.toString(seventhReverse3Exception), Arrays.toString(testArray.reverse3(seventhReverse3)));
        assertEquals(Arrays.toString(eighthReverse3Exception), Arrays.toString(testArray.reverse3(eighthReverse3)));
    }

    //middleWay
    @Test
    public void testMiddleWay() {
        int[] firstMiddleWayA = {1, 2, 3};
        int[] firstMiddleWayB = {4, 5, 6};
        int[] firstMiddleWayException = {2, 5};
        int[] secondMiddleWayA = {7, 7, 7};
        int[] secondMiddleWayB = {3, 8, 0};
        int[] secondMiddleWayException = {7, 8};
        int[] thirdMiddleWayA = {5, 2, 9};
        int[] thirdMiddleWayB = {1, 4, 5};
        int[] thirdMiddleWayException = {2, 4};
        int[] fourthMiddleWayA = {1, 9, 7};
        int[] fourthMiddleWayB = {4, 8, 8};
        int[] fourthMiddleWayException = {9, 8};
        int[] fifthMiddleWayA = {1, 2, 3};
        int[] fifthMiddleWayB = {3, 1, 4};
        int[] fifthMiddleWayException = {2, 1};
        int[] sixthMiddleWayA = {1, 2, 3};
        int[] sixthMiddleWayB = {4, 1, 1};
        int[] sixthMiddleWayException = {2, 1};
        assertEquals(Arrays.toString(firstMiddleWayException), Arrays.toString(testArray.middleWay(firstMiddleWayA, firstMiddleWayB)));
        assertEquals(Arrays.toString(secondMiddleWayException), Arrays.toString(testArray.middleWay(secondMiddleWayA, secondMiddleWayB)));
        assertEquals(Arrays.toString(thirdMiddleWayException), Arrays.toString(testArray.middleWay(thirdMiddleWayA, thirdMiddleWayB)));
        assertEquals(Arrays.toString(fourthMiddleWayException), Arrays.toString(testArray.middleWay(fourthMiddleWayA, fourthMiddleWayB)));
        assertEquals(Arrays.toString(fifthMiddleWayException), Arrays.toString(testArray.middleWay(fifthMiddleWayA, fifthMiddleWayB)));
        assertEquals(Arrays.toString(sixthMiddleWayException), Arrays.toString(testArray.middleWay(sixthMiddleWayA, sixthMiddleWayB)));
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
        int[] firstFix23Exception = {1, 2, 0};
        int[] secondFix23 = {2, 3, 5};
        int[] secondFix23Exception = {2, 0, 5};
        int[] thirdFix23 = {1, 2, 1};
        int[] thirdFix23Exception = {1, 2, 1};
        int[] fourthFix23 = {3, 2, 1};
        int[] fourthFix23Exception = {3, 2, 1};
        int[] fifthFix23 = {2, 2, 3};
        int[] fifthFix23Exception = {2, 2, 0};
        int[] sixthFix23 = {2, 3, 3};
        int[] sixthFix23Exception = {2, 0, 3};
        assertEquals(Arrays.toString(firstFix23Exception), Arrays.toString(testArray.fix23(firstFix23)));
        assertEquals(Arrays.toString(secondFix23Exception), Arrays.toString(testArray.fix23(secondFix23)));
        assertEquals(Arrays.toString(thirdFix23Exception), Arrays.toString(testArray.fix23(thirdFix23)));
        assertEquals(Arrays.toString(fourthFix23Exception), Arrays.toString(testArray.fix23(fourthFix23)));
        assertEquals(Arrays.toString(fifthFix23Exception), Arrays.toString(testArray.fix23(fifthFix23)));
        assertEquals(Arrays.toString(sixthFix23Exception), Arrays.toString(testArray.fix23(sixthFix23)));
    }

    //makeMiddle
    @Test
    public void testMakeMiddle() {
        int[] firstMakeMiddle = {1, 2, 3, 4};
        int[] firstMakeMiddleException = {2, 3};
        int[] secondMakeMiddle = {7, 1, 2, 3, 4, 9};
        int[] secondMakeMiddleException = {2, 3};
        int[] thirdMakeMiddle = {1, 2};
        int[] thirdMakeMiddleException = {1, 2};
        int[] fourthMakeMiddle = {5, 2, 4, 7};
        int[] fourthMakeMiddleException = {2, 4};
        int[] fifthMakeMiddle = {9, 0, 4, 3, 9, 1};
        int[] fifthMakeMiddleException = {4, 3};
        assertEquals(Arrays.toString(firstMakeMiddleException), Arrays.toString(testArray.makeMiddle(firstMakeMiddle)));
        assertEquals(Arrays.toString(secondMakeMiddleException), Arrays.toString(testArray.makeMiddle(secondMakeMiddle)));
        assertEquals(Arrays.toString(thirdMakeMiddleException), Arrays.toString(testArray.makeMiddle(thirdMakeMiddle)));
        assertEquals(Arrays.toString(fourthMakeMiddleException), Arrays.toString(testArray.makeMiddle(fourthMakeMiddle)));
        assertEquals(Arrays.toString(fifthMakeMiddleException), Arrays.toString(testArray.makeMiddle(fifthMakeMiddle)));
    }
}

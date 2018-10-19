package array3test;

import array3.Array3;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class Array3Test {

    Array3 testArray3 = new Array3();
    //******https://codingbat.com/java/Array-3******first column

    //maxSpan
    @Test
    public void testMaxSpan() {
        int[] firstMaxSpan = {1, 2, 1, 1, 3};
        int[] secondMaxSpan = {1, 4, 2, 1, 4, 1, 4};
        int[] thirdMaxSpan = {1, 4, 2, 1, 4, 4, 4};
        int[] fourthMaxSpan = {3, 3, 3};
        int[] fifthMaxSpan = {3, 9, 3};
        int[] sixthMaxSpan = {3, 9, 9};
        int[] seventhMaxSpan = {3, 9};
        int[] eighthMaxSpan = {3, 3};
        int[] ninthMaxSpan = {};
        int[] tenthMaxSpan = {1};
        assertEquals(4, testArray3.maxSpan(firstMaxSpan));
        assertEquals(6, testArray3.maxSpan(secondMaxSpan));
        assertEquals(6, testArray3.maxSpan(thirdMaxSpan));
        assertEquals(3, testArray3.maxSpan(fourthMaxSpan));
        assertEquals(3, testArray3.maxSpan(fifthMaxSpan));
        assertEquals(2, testArray3.maxSpan(sixthMaxSpan));
        assertEquals(1, testArray3.maxSpan(seventhMaxSpan));
        assertEquals(2, testArray3.maxSpan(eighthMaxSpan));
        assertEquals(0, testArray3.maxSpan(ninthMaxSpan));
        assertEquals(1, testArray3.maxSpan(tenthMaxSpan));
    }

    //canBalance
    @Test
    public void testCanBalance() {
        int[] firstCanBalance = {1, 1, 1, 2, 1};
        int[] secondCanBalance = {2, 1, 1, 2, 1};
        int[] thirdCanBalance = {10, 10};
        int[] fourthCanBalance = {10, 0, 1, -1, 10};
        int[] fifthCanBalance = {1, 1, 1, 1, 4};
        int[] sixthCanBalance = {2, 1, 1, 1, 4};
        int[] seventhCanBalance = {2, 3, 4, 1, 2};
        int[] eighthCanBalance = {1, 2, 3, 1, 0, 2, 3};
        int[] ninthCanBalance = {1, 2, 3, 1, 0, 1, 3};
        int[] tenthCanBalance = {1};
        int[] eleventhCanBalance = {1, 1, 1, 2, 1};
        assertTrue(testArray3.canBalance(firstCanBalance));
        assertFalse(testArray3.canBalance(secondCanBalance));
        assertTrue(testArray3.canBalance(thirdCanBalance));
        assertTrue(testArray3.canBalance(fourthCanBalance));
        assertTrue(testArray3.canBalance(fifthCanBalance));
        assertFalse(testArray3.canBalance(sixthCanBalance));
        assertFalse(testArray3.canBalance(seventhCanBalance));
        assertTrue(testArray3.canBalance(eighthCanBalance));
        assertFalse(testArray3.canBalance(ninthCanBalance));
        assertFalse(testArray3.canBalance(tenthCanBalance));
        assertTrue(testArray3.canBalance(eleventhCanBalance));
    }

    //seriesUp
    @Test
    public void testSeriesUp() {
        int[] firstSeriesUpSolution = {1, 1, 2, 1, 2, 3};
        int[] secondSeriesUpSolution = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4};
        int[] thirdSeriesUpSolution = {1, 1, 2};
        int[] fourthSeriesUpSolution = {1};
        int[] fifthSeriesUpSolution = {};
        int[] sixthSeriesUpSolution = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6};
        assertEquals(Arrays.toString(firstSeriesUpSolution), Arrays.toString(testArray3.seriesUp(3)));
        assertEquals(Arrays.toString(secondSeriesUpSolution), Arrays.toString(testArray3.seriesUp(4)));
        assertEquals(Arrays.toString(thirdSeriesUpSolution), Arrays.toString(testArray3.seriesUp(2)));
        assertEquals(Arrays.toString(fourthSeriesUpSolution), Arrays.toString(testArray3.seriesUp(1)));
        assertEquals(Arrays.toString(fifthSeriesUpSolution), Arrays.toString(testArray3.seriesUp(0)));
        assertEquals(Arrays.toString(sixthSeriesUpSolution), Arrays.toString(testArray3.seriesUp(6)));
    }

    //******https://codingbat.com/java/Array-3******second column

    //fix34
    @Test
    public void testFix34() {
        int[] firstFix34 = {1, 3, 1, 4};
        int[] firstFix34Solution = {1, 3, 4, 1};
        int[] secondFix34 = {1, 3, 1, 4, 4, 3, 1};
        int[] secondFix34Solution = {1, 3, 4, 1, 1, 3, 4};
        int[] thirdFix34 = {3, 2, 2, 4};
        int[] thirdFix34Solution = {3, 4, 2, 2};
        int[] fourthFix34 = {3, 2, 3, 2, 4, 4};
        int[] fourthFix34Solution = {3, 4, 3, 4, 2, 2};
        int[] fifthFix34 = {2, 3, 2, 3, 2, 4, 4};
        int[] fifthFix34Solution = {2, 3, 4, 3, 4, 2, 2};
        int[] sixthFix34 = {5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5};
        int[] sixthFix34Solution = {5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4};
        int[] seventhFix34 = {3, 1, 4};
        int[] seventhFix34Solution = {3, 4, 1};
        int[] eighthFix34 = {3, 4, 1};
        int[] eighthFix34Solution = {3, 4, 1};
        int[] ninthFix34 = {1, 1, 1};
        int[] ninthFix34Solution = {1, 1, 1};
        int[] tenthFix34 = {1};
        int[] tenthFix34Solution = {1};
        int[] eleventhFix34 = {};
        int[] eleventhFix34Solution = {};
        int[] twelfthFix34 = {7, 3, 7, 7, 4};
        int[] twelfthFix34Solution = {7, 3, 4, 7, 7};
        int[] thirteenthFix34 = {3, 1, 4, 3, 1, 4};
        int[] thirteenthFix34Solution = {3, 4, 1, 3, 4, 1};
        int[] fourteenthFix34 = {3, 1, 1, 3, 4, 4};
        int[] fourteenthFix34Solution = {3, 4, 1, 3, 4, 1};
        assertEquals(Arrays.toString(firstFix34Solution), Arrays.toString(testArray3.fix34(firstFix34)));
        assertEquals(Arrays.toString(secondFix34Solution), Arrays.toString(testArray3.fix34(secondFix34)));
        assertEquals(Arrays.toString(thirdFix34Solution), Arrays.toString(testArray3.fix34(thirdFix34)));
        assertEquals(Arrays.toString(fourthFix34Solution), Arrays.toString(testArray3.fix34(fourthFix34)));
        assertEquals(Arrays.toString(fifthFix34Solution), Arrays.toString(testArray3.fix34(fifthFix34)));
        assertEquals(Arrays.toString(sixthFix34Solution), Arrays.toString(testArray3.fix34(sixthFix34)));
        assertEquals(Arrays.toString(seventhFix34Solution), Arrays.toString(testArray3.fix34(seventhFix34)));
        assertEquals(Arrays.toString(eighthFix34Solution), Arrays.toString(testArray3.fix34(eighthFix34)));
        assertEquals(Arrays.toString(ninthFix34Solution), Arrays.toString(testArray3.fix34(ninthFix34)));
        assertEquals(Arrays.toString(tenthFix34Solution), Arrays.toString(testArray3.fix34(tenthFix34)));
        assertEquals(Arrays.toString(eleventhFix34Solution), Arrays.toString(testArray3.fix34(eleventhFix34)));
        assertEquals(Arrays.toString(twelfthFix34Solution), Arrays.toString(testArray3.fix34(twelfthFix34)));
        assertEquals(Arrays.toString(thirteenthFix34Solution), Arrays.toString(testArray3.fix34(thirteenthFix34)));
        assertEquals(Arrays.toString(fourteenthFix34Solution), Arrays.toString(testArray3.fix34(fourteenthFix34)));
    }

    //linearIn
    @Test
    public void testLinearIn() {
        int[] firstLinearInOuter = {1, 2, 4, 6}; int[] firstLinearInInner = {2, 4};
        int[] secondLinearInOuter = {1, 2, 4, 6}; int[] secondLinearInInner = {2, 3, 4};
        int[] thirdLinearInOuter = {1, 2, 4, 4, 6}; int[] thirdLinearInInner = {2, 4};
        int[] fourthLinearInOuter = {2, 2, 4, 4, 6, 6}; int[] fourthLinearInInner = {2, 4};
        int[] fifthLinearInOuter = {2, 2, 2, 2, 2}; int[] fifthLinearInInner = {2, 2};
        int[] sixthLinearInOuter = {2, 2, 2, 2, 2}; int[] sixthLinearInInner = {2, 4};
        int[] seventhLinearInOuter = {2, 2, 2, 2, 4}; int[] seventhLinearInInner = {2, 4};
        int[] eighthLinearInOuter = {1, 2, 3}; int[] eighthLinearInInner = {2};
        int[] ninthLinearInOuter = {1, 2, 3}; int[] ninthLinearInInner = {-1};
        int[] tenthLinearInOuter = {1, 2, 3}; int[] tenthLinearInInner = {};
        int[] eleventhLinearInOuter = {-1, 0, 3, 3, 3, 10, 12}; int[] eleventhLinearInInner = {-1, 0, 3, 12};
        int[] twelfthLinearInOuter = {-1, 0, 3, 3, 3, 10, 12}; int[] twelfthLinearInInner = {0, 3, 12, 14};
        int[] thirteenthLinearInOuter = {-1, 0, 3, 3, 3, 10, 12}; int[] thirteenthLinearInInner = {-1, 10, 11};
        assertTrue(testArray3.linearIn(firstLinearInOuter, firstLinearInInner));
        assertFalse(testArray3.linearIn(secondLinearInOuter, secondLinearInInner));
        assertTrue(testArray3.linearIn(thirdLinearInOuter, thirdLinearInInner));
        assertTrue(testArray3.linearIn(fourthLinearInOuter, fourthLinearInInner));
        assertTrue(testArray3.linearIn(fifthLinearInOuter, fifthLinearInInner));
        assertFalse(testArray3.linearIn(sixthLinearInOuter, sixthLinearInInner));
        assertTrue(testArray3.linearIn(seventhLinearInOuter, seventhLinearInInner));
        assertTrue(testArray3.linearIn(eighthLinearInOuter, eighthLinearInInner));
        assertFalse(testArray3.linearIn(ninthLinearInOuter, ninthLinearInInner));
        assertTrue(testArray3.linearIn(tenthLinearInOuter, tenthLinearInInner));
        assertTrue(testArray3.linearIn(eleventhLinearInOuter, eleventhLinearInInner));
        assertFalse(testArray3.linearIn(twelfthLinearInOuter, twelfthLinearInInner));
        assertFalse(testArray3.linearIn(thirteenthLinearInOuter, thirteenthLinearInInner));
    }

    //maxMirror
    @Test
    public void testMaxMirror() {
        int[] firstMaxMirror = {1, 2, 3, 8, 9, 3, 2, 1};
        int[] secondMaxMirror = {1, 2, 1, 4};
        int[] thirdMaxMirror = {7, 1, 2, 9, 7, 2, 1};
        int[] fourthMaxMirror = {21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9};
        int[] fifthMaxMirror = {1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25};
        int[] sixthMaxMirror = {1, 2, 3, 2, 1};
        int[] seventhMaxMirror = {1, 2, 3, 3, 8};
        int[] eighthMaxMirror = {1, 2, 7, 8, 1, 7, 2};
        int[] ninthMaxMirror = {1, 1, 1};
        int[] tenthMaxMirror = {1};
        int[] eleventhMaxMirror = {};
        int[] twelfthMaxMirror = {9, 1, 1, 4, 2, 1, 1, 1};
        int[] thirteenthMaxMirror = {5, 9, 9, 4, 5, 4, 9, 9, 2};
        int[] fourteenthMaxMirror = {5, 9, 9, 6, 5, 4, 9, 9, 2};
        int[] fifteenthMaxMirror = {5, 9, 1, 6, 5, 4, 1, 9, 5};
        assertEquals(3, testArray3.maxMirror(firstMaxMirror));
        assertEquals(3, testArray3.maxMirror(secondMaxMirror));
        assertEquals(2, testArray3.maxMirror(thirdMaxMirror));
        assertEquals(4, testArray3.maxMirror(fourthMaxMirror));
        assertEquals(4, testArray3.maxMirror(fifthMaxMirror));
        assertEquals(5, testArray3.maxMirror(sixthMaxMirror));
        assertEquals(2, testArray3.maxMirror(seventhMaxMirror));
        assertEquals(2, testArray3.maxMirror(eighthMaxMirror));
        assertEquals(3, testArray3.maxMirror(ninthMaxMirror));
        assertEquals(1, testArray3.maxMirror(tenthMaxMirror));
        assertEquals(0, testArray3.maxMirror(eleventhMaxMirror));
        assertEquals(3, testArray3.maxMirror(twelfthMaxMirror));
        assertEquals(7, testArray3.maxMirror(thirteenthMaxMirror));
        assertEquals(2, testArray3.maxMirror(fourteenthMaxMirror));
        assertEquals(3, testArray3.maxMirror(fifteenthMaxMirror));
    }

    //******https://codingbat.com/java/Array-3******third column

    //fix45
    @Test
    public void testFix45() {
        int[] firstFix45 = {5, 4, 9, 4, 9, 5};
        int[] firstFix45Solution = {9, 4, 5, 4, 5, 9};
        int[] secondFix45 = {1, 4, 1, 5};
        int[] secondFix45Solution = {1, 4, 5, 1};
        int[] thirdFix45 = {1, 4, 1, 5, 5, 4, 1};
        int[] thirdFix45Solution = {1, 4, 5, 1, 1, 4, 5};
        int[] fourthFix45 = {4, 9, 4, 9, 5, 5, 4, 9, 5};
        int[] fourthFix45Solution = {4, 5, 4, 5, 9, 9, 4, 5, 9};
        int[] fifthFix45 = {5, 5, 4, 1, 4, 1};
        int[] fifthFix45Solution = {1, 1, 4, 5, 4, 5};
        int[] sixthFix45 = {4, 2, 2, 5};
        int[] sixthFix45Solution = {4, 5, 2, 2};
        int[] seventhFix45 = {4, 2, 4, 2, 5, 5};
        int[] seventhFix45Solution = {4, 5, 4, 5, 2, 2};
        int[] eighthFix45 = {4, 2, 4, 5, 5};
        int[] eighthFix45Solution = {4, 5, 4, 5, 2};
        int[] ninthFix45 = {1, 1, 1};
        int[] ninthFix45Solution = {1, 1, 1};
        int[] tenthFix45 = {4, 5};
        int[] tenthFix45Solution = {4, 5};
        int[] eleventhFix45 = {5, 4, 1};
        int[] eleventhFix45Solution = {1, 4, 5};
        int[] twelfthFix45 = {};
        int[] twelfthFix45Solution = {};
        int[] thirteenthFix45 = {5, 4, 5, 4, 1};
        int[] thirteenthFix45Solution = {1, 4, 5, 4, 5};
        int[] fourteenthFix45 = {4, 5, 4, 1, 5};
        int[] fourteenthFix45Solution = {4, 5, 4, 5, 1};
        int[] fifteenthFix45 = {3, 4, 5};
        int[] fifteenthFix45Solution = {3, 4, 5};
        int[] sixteenthFix45 = {4, 1, 5};
        int[] sixteenthFix45Solution = {4, 5, 1};
        int[] seventeenthFix45 = {5, 4, 1};
        int[] seventeenthFix45Solution = {1, 4, 5};
        int[] eighteenthFix45 = {2, 4, 2, 5};
        int[] eighteenthFix45Solution = {2, 4, 5, 2};
        assertEquals(Arrays.toString(firstFix45Solution), Arrays.toString(testArray3.fix45(firstFix45)));
        assertEquals(Arrays.toString(secondFix45Solution), Arrays.toString(testArray3.fix45(secondFix45)));
        assertEquals(Arrays.toString(thirdFix45Solution), Arrays.toString(testArray3.fix45(thirdFix45)));
        assertEquals(Arrays.toString(fourthFix45Solution), Arrays.toString(testArray3.fix45(fourthFix45)));
        assertEquals(Arrays.toString(fifthFix45Solution), Arrays.toString(testArray3.fix45(fifthFix45)));
        assertEquals(Arrays.toString(sixthFix45Solution), Arrays.toString(testArray3.fix45(sixthFix45)));
        assertEquals(Arrays.toString(seventhFix45Solution), Arrays.toString(testArray3.fix45(seventhFix45)));
        assertEquals(Arrays.toString(eighthFix45Solution), Arrays.toString(testArray3.fix45(eighthFix45)));
        assertEquals(Arrays.toString(ninthFix45Solution), Arrays.toString(testArray3.fix45(ninthFix45)));
        assertEquals(Arrays.toString(tenthFix45Solution), Arrays.toString(testArray3.fix45(tenthFix45)));
        assertEquals(Arrays.toString(eleventhFix45Solution), Arrays.toString(testArray3.fix45(eleventhFix45)));
        assertEquals(Arrays.toString(twelfthFix45Solution), Arrays.toString(testArray3.fix45(twelfthFix45)));
        assertEquals(Arrays.toString(thirteenthFix45Solution), Arrays.toString(testArray3.fix45(thirteenthFix45)));
        assertEquals(Arrays.toString(fourteenthFix45Solution), Arrays.toString(testArray3.fix45(fourteenthFix45)));
        assertEquals(Arrays.toString(fifteenthFix45Solution), Arrays.toString(testArray3.fix45(fifteenthFix45)));
        assertEquals(Arrays.toString(sixteenthFix45Solution), Arrays.toString(testArray3.fix45(sixteenthFix45)));
        assertEquals(Arrays.toString(seventeenthFix45Solution), Arrays.toString(testArray3.fix45(seventeenthFix45)));
        assertEquals(Arrays.toString(eighteenthFix45Solution), Arrays.toString(testArray3.fix45(eighteenthFix45)));
    }

    //squareUp
    @Test
    public void testSquareUp() {
        int[] firstSquareUpSolution = {0, 0, 1, 0, 2, 1, 3, 2, 1};
        int[] secondSquareUpSolution = {0, 1, 2, 1};
        int[] thirdSquareUpSolution = {0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1};
        int[] fourthSquareUpSolution = {1};
        int[] fifthSquareUpSolution = {};
        int[] sixthSquareUpSolution = {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 1, 0, 0, 0, 3, 2, 1, 0, 0, 4, 3, 2, 1, 0, 5, 4, 3, 2, 1, 6, 5, 4, 3, 2, 1};
        assertEquals(Arrays.toString(firstSquareUpSolution), Arrays.toString(testArray3.squareUp(3)));
        assertEquals(Arrays.toString(secondSquareUpSolution), Arrays.toString(testArray3.squareUp(2)));
        assertEquals(Arrays.toString(thirdSquareUpSolution), Arrays.toString(testArray3.squareUp(4)));
        assertEquals(Arrays.toString(fourthSquareUpSolution), Arrays.toString(testArray3.squareUp(1)));
        assertEquals(Arrays.toString(fifthSquareUpSolution), Arrays.toString(testArray3.squareUp(0)));
        assertEquals(Arrays.toString(sixthSquareUpSolution), Arrays.toString(testArray3.squareUp(6)));
    }

    //countClumps
    @Test
    public void testCountClumps() {
        int[] firstCountClumps = {1, 2, 2, 3, 4, 4};
        int[] secondCountClumps = {1, 1, 2, 1, 1};
        int[] thirdCountClumps = {1, 1, 1, 1, 1};
        int[] fourthCountClumps = {1, 2, 3};
        int[] fifthCountClumps = {2, 2, 1, 1, 1, 2, 1, 1, 2, 2};
        int[] sixthCountClumps = {0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2};
        int[] seventhCountClumps = {0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2};
        int[] eighthCountClumps = {0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2};
        int[] ninthCountClumps = {};
        assertEquals(2, testArray3.countClumps(firstCountClumps));
        assertEquals(2, testArray3.countClumps(secondCountClumps));
        assertEquals(1, testArray3.countClumps(thirdCountClumps));
        assertEquals(0, testArray3.countClumps(fourthCountClumps));
        assertEquals(4, testArray3.countClumps(fifthCountClumps));
        assertEquals(4, testArray3.countClumps(sixthCountClumps));
        assertEquals(5, testArray3.countClumps(seventhCountClumps));
        assertEquals(5, testArray3.countClumps(eighthCountClumps));
        assertEquals(0, testArray3.countClumps(ninthCountClumps));
    }
}

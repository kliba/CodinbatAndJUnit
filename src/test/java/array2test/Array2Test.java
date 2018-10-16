package array2test;

import array1.Array1;
import array2.Array2;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Array2Test {

    Array2 testArray2 = new Array2();

    //******https://codingbat.com/java/Array-2******first column

    //countEvens
    @Test
    public void testCountEvens() {
        int[] firstCountEvens = {2, 1, 2, 3, 4};
        int[] secondCountEvens = {2, 2, 0};
        int[] thirdCountEvens = {1, 3, 5};
        int[] fourthCountEvens = {};
        int[] fifthCountEvens = {11, 9, 0, 1};
        int[] sixthCountEvens = {2, 11, 9, 0};
        int[] seventhCountEvens = {2};
        int[] eighthCountEvens = {2, 5, 12};

        assertEquals(3, testArray2.countEvens(firstCountEvens));
        assertEquals(3, testArray2.countEvens(secondCountEvens));
        assertEquals(0, testArray2.countEvens(thirdCountEvens));
        assertEquals(0, testArray2.countEvens(fourthCountEvens));
        assertEquals(1, testArray2.countEvens(fifthCountEvens));
        assertEquals(2, testArray2.countEvens(sixthCountEvens));
        assertEquals(1, testArray2.countEvens(seventhCountEvens));
        assertEquals(2, testArray2.countEvens(eighthCountEvens));
    }

    //sum13
    @Test
    public void testSum13() {
        int[] firstSum13 = {1, 2, 2, 1};
        int[] secondSum13 = {1, 1};
        int[] thirdSum13 = {1, 2, 2, 1, 13};
        int[] fourthSum13 = {1, 2, 13, 2, 1, 13};
        int[] sixthSum13 = {13, 1, 2, 13, 2, 1, 13};
        int[] seventhSum13 = {};
        int[] eighthSum13 = {13};
        int[] ninthSum13 = {13, 13};
        int[] tenthSum13 = {13, 0, 13};
        int[] eleventhSum13 = {13, 1, 13};
        int[] twelfthSum13 = {5, 7, 2};
        int[] thirteenthSum13 = {5, 13, 2};
        int[] fourteenthSum13 = {0};
        int[] sixteenthSum13 = {13, 0};
        assertEquals(6, testArray2.sum13(firstSum13));
        assertEquals(2, testArray2.sum13(secondSum13));
        assertEquals(6, testArray2.sum13(thirdSum13));
        assertEquals(4, testArray2.sum13(fourthSum13));
        assertEquals(3, testArray2.sum13(sixthSum13));
        assertEquals(0, testArray2.sum13(seventhSum13));
        assertEquals(0, testArray2.sum13(eighthSum13));
        assertEquals(0, testArray2.sum13(ninthSum13));
        assertEquals(0, testArray2.sum13(tenthSum13));
        assertEquals(0, testArray2.sum13(eleventhSum13));
        assertEquals(14, testArray2.sum13(twelfthSum13));
        assertEquals(5, testArray2.sum13(thirteenthSum13));
        assertEquals(0, testArray2.sum13(fourteenthSum13));
        assertEquals(0, testArray2.sum13(sixteenthSum13));
    }

    //lucky13
    @Test
    public void testLucky13() {
        int[] firstLucky13 = {0, 2, 4};
        int[] secondLucky13 = {1, 2, 3};
        int[] thirdLucky13 = {1, 2, 4};
        int[] fourthLucky13 = {2, 7, 2, 8};
        int[] fifthLucky13 = {2, 7, 1, 8};
        int[] sixthLucky13 = {3, 7, 2, 8};
        int[] seventhLucky13 = {2, 7, 2, 1};
        int[] eighthLucky13 = {1, 2};
        int[] ninthLucky13 = {2, 2};
        int[] tenthLucky13 = {2};
        int[] eleventhLucky13 = {3};
        int[] twelfthLucky13 = {};

        assertTrue(testArray2.lucky13(firstLucky13));
        assertFalse(testArray2.lucky13(secondLucky13));
        assertFalse(testArray2.lucky13(thirdLucky13));
        assertTrue(testArray2.lucky13(fourthLucky13));
        assertFalse(testArray2.lucky13(fifthLucky13));
        assertFalse(testArray2.lucky13(sixthLucky13));
        assertFalse(testArray2.lucky13(seventhLucky13));
        assertFalse(testArray2.lucky13(eighthLucky13));
        assertTrue(testArray2.lucky13(ninthLucky13));
        assertTrue(testArray2.lucky13(tenthLucky13));
        assertFalse(testArray2.lucky13(eleventhLucky13));
        assertTrue(testArray2.lucky13(twelfthLucky13));
    }

    //fizzArray
    @Test
    public void testFizzArray() {
        int[] firstResult = {0, 1, 2, 3};
        int[] secondResult = {0};
        int[] thirdResult = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] fourthResult = {};
        int[] fifthResult = {0, 1};
        int[] sixthResult = {0, 1, 2, 3, 4, 5, 6};
        assertEquals(Arrays.toString(firstResult), Arrays.toString(testArray2.fizzArray(4)));
        assertEquals(Arrays.toString(secondResult), Arrays.toString( testArray2.fizzArray(1)));
        assertEquals(Arrays.toString(thirdResult), Arrays.toString(testArray2.fizzArray(10)));
        assertEquals(Arrays.toString(fourthResult), Arrays.toString(testArray2.fizzArray(0)));
        assertEquals(Arrays.toString(fifthResult), Arrays.toString(testArray2.fizzArray(2)));
        assertEquals(Arrays.toString(sixthResult), Arrays.toString(testArray2.fizzArray(7)));
    }

    //no14
    @Test
    public void testNo14() {
        int[] firstNot14 = {1, 2, 3};
        int[] secondNot14 = {1, 2, 3, 4};
        int[] thirdNot14 = {2, 3, 4};
        int[] fourthNot14 = {1, 1, 4, 4};
        int[] fifthNot14 = {2, 2, 4, 4};
        int[] sixthNot14 = {2, 3, 4, 1};
        int[] seventhNot14 = {2, 1, 1};
        int[] eighthNot14 = {1, 4};
        int[] ninthNot14 = {2};
        int[] tenthNot14 = {2, 1};
        int[] eleventhNot14 = {1};
        int[] twelfthNot14 = {4};
        int[] thirteenthNot14 = {};
        int[] fourteenthNot14 = {1, 1, 1, 1};
        int[] fifteenthNot14 = {9, 4, 4, 1};
        int[] sixteenthNot14 = {4, 2, 3, 1};
        int[] seventeenthNot14 = {4, 2, 3, 5};
        int[] eighteenthNot14 = {4, 4, 2};
        int[] nineteenthNot14 = {1, 4, 4};

        assertTrue(testArray2.no14(firstNot14));
        assertFalse(testArray2.no14(secondNot14));
        assertTrue(testArray2.no14(thirdNot14));
        assertFalse(testArray2.no14(fourthNot14));
        assertTrue(testArray2.no14(fifthNot14));
        assertFalse(testArray2.no14(sixthNot14));
        assertTrue(testArray2.no14(seventhNot14));
        assertFalse(testArray2.no14(eighthNot14));
        assertTrue(testArray2.no14(ninthNot14));
        assertTrue(testArray2.no14(tenthNot14));
        assertTrue(testArray2.no14(eleventhNot14));
        assertTrue(testArray2.no14(twelfthNot14));
        assertTrue(testArray2.no14(thirteenthNot14));
        assertTrue(testArray2.no14(fourteenthNot14));
        assertFalse(testArray2.no14(fifteenthNot14));
        assertFalse(testArray2.no14(sixteenthNot14));
        assertTrue(testArray2.no14(seventeenthNot14));
        assertTrue(testArray2.no14(eighteenthNot14));
        assertFalse(testArray2.no14(nineteenthNot14));
    }

    //matchUp
    @Test
    public void testMatchUp() {
        int[] firstMatchUp1 = {1, 2, 3};
        int[] firstMatchUp2 = {2, 3, 10};
        int[] secondMatchUp1 = {1, 2, 3};
        int[] secondMatchUp2 = {2, 3, 5};
        int[] thirdMatchUp1 = {1, 2, 3};
        int[] thirdMatchUp2 = {2, 3, 3};
        int[] fourthMatchUp1 = {5, 3};
        int[] fourthMatchUp2 = {5, 5};
        int[] fifthMatchUp1 = {5, 3};
        int[] fifthMatchUp2 = {4, 4};
        int[] sixthMatchUp1 = {5, 3};
        int[] sixthMatchUp2 = {3, 3};
        int[] seventhMatchUp1 = {5, 3};
        int[] seventhMatchUp2 = {2, 2};
        int[] eighthMatchUp1 = {5, 3};
        int[] eighthMatchUp2 = {1, 1};
        int[] ninthMatchUp1 = {5, 3};
        int[] ninthMatchUp2 = {0, 0};
        int[] tenthMatchUp1 = {4};
        int[] tenthMatchUp2 = {4};
        int[] eleventhMatchUp1 = {4};
        int[] eleventhMatchUp2 = {5};
        assertEquals(2, testArray2.matchUp(firstMatchUp1, firstMatchUp2));
        assertEquals(3, testArray2.matchUp(secondMatchUp1, secondMatchUp2));
        assertEquals(2, testArray2.matchUp(thirdMatchUp1, thirdMatchUp2));
        assertEquals(1, testArray2.matchUp(fourthMatchUp1, fourthMatchUp2));
        assertEquals(2, testArray2.matchUp(fifthMatchUp1, fifthMatchUp2));
        assertEquals(1, testArray2.matchUp(sixthMatchUp1, sixthMatchUp2));
        assertEquals(1, testArray2.matchUp(seventhMatchUp1, seventhMatchUp2));
        assertEquals(1, testArray2.matchUp(eighthMatchUp1, eighthMatchUp2));
        assertEquals(0, testArray2.matchUp(ninthMatchUp1, ninthMatchUp2));
        assertEquals(0, testArray2.matchUp(tenthMatchUp1, tenthMatchUp2));
        assertEquals(1, testArray2.matchUp(eleventhMatchUp1, eleventhMatchUp2));
    }

    //modThree
    @Test
    public void testModThree() {
        int[] firstModThree = {2, 1, 3, 5};
        int[] secondModThree = {2, 1, 2, 5};
        int[] thirdModThree = {2, 4, 2, 5};
        int[] fourthModThree = {1, 2, 1, 2, 1};
        int[] fifthModThree = {9, 9, 9};
        int[] sixthModThree = {1, 2, 1};
        int[] seventhModThree = {1, 2};
        int[] eighthModThree = {1};
        int[] ninthModThree = {};
        int[] tenthModThree = {9, 7, 2, 9};
        int[] eleventhModThree = {9, 7, 2, 9, 2, 2};
        int[] twelfthModThree = {9, 7, 2, 9, 2, 2, 6};
        assertTrue(testArray2.modThree(firstModThree));
        assertFalse(testArray2.modThree(secondModThree));
        assertTrue(testArray2.modThree(thirdModThree));
        assertFalse(testArray2.modThree(fourthModThree));
        assertTrue(testArray2.modThree(fifthModThree));
        assertFalse(testArray2.modThree(sixthModThree));
        assertFalse(testArray2.modThree(seventhModThree));
        assertFalse(testArray2.modThree(eighthModThree));
        assertFalse(testArray2.modThree(ninthModThree));
        assertFalse(testArray2.modThree(tenthModThree));
        assertFalse(testArray2.modThree(eleventhModThree));
        assertTrue(testArray2.modThree(twelfthModThree));
    }

    //sameEnds
    @Test
    public void testSameEnds() {
        int[] firstSameEnds = {5, 6, 45, 99, 13, 5, 6};
        int[] secondSameEnds = {5, 6, 45, 99, 13, 5, 6};
        int[] thirdSameEnds = {5, 6, 45, 99, 13, 5, 6};
        int[] fourthSameEnds = {1, 2, 5, 2, 1};
        int[] fifthSameEnds = {1, 2, 5, 2, 1};
        int[] sixthSameEnds = {1, 2, 5, 2, 1};
        int[] seventhSameEnds = {1, 2, 5, 2, 1};
        int[] eighthSameEnds = {1, 1, 1};
        int[] ninthSameEnds = {1, 1, 1};
        int[] tenthSameEnds = {1, 1, 1};
        int[] eleventhSameEnds = {1, 1, 1};
        int[] twelfthSameEnds = {1};
        int[] thirteenthSameEnds = {};
        int[] fourteenthSameEnds = {4, 2, 4, 5};
        assertFalse(testArray2.sameEnds(firstSameEnds, 1));
        assertTrue(testArray2.sameEnds(secondSameEnds, 2));
        assertFalse(testArray2.sameEnds(thirdSameEnds, 3));
        assertTrue(testArray2.sameEnds(fourthSameEnds, 1));
        assertFalse(testArray2.sameEnds(fifthSameEnds, 2));
        assertTrue(testArray2.sameEnds(sixthSameEnds, 0));
        assertTrue(testArray2.sameEnds(seventhSameEnds, 5));
        assertTrue(testArray2.sameEnds(eighthSameEnds, 0));
        assertTrue(testArray2.sameEnds(ninthSameEnds, 1));
        assertTrue(testArray2.sameEnds(tenthSameEnds, 2));
        assertTrue(testArray2.sameEnds(eleventhSameEnds, 3));
        assertTrue(testArray2.sameEnds(twelfthSameEnds, 1));
        assertTrue(testArray2.sameEnds(thirteenthSameEnds, 0));
        assertFalse(testArray2.sameEnds(fourteenthSameEnds, 1));
    }

    //shiftLeft
    @Test
    public void testShiftLeft() {
        int[] firstShiftLeft = {6, 2, 5, 3};
        int[] firstShiftLeftSolution = {2, 5, 3, 6};
        int[] secondShiftLeft = {1, 2};
        int[] secondShiftLeftSolution = {2, 1};
        int[] thirdShiftLeft = {1};
        int[] thirdShiftLeftSolution = {1};
        int[] fourthShiftLeft = {};
        int[] fourthShiftLeftSolution = {};
        int[] fifthShiftLeft = {1, 1, 2, 2, 4};
        int[] fifthShiftLeftSolution = {1, 2, 2, 4, 1};
        int[] sixthShiftLeft = {1, 1, 1};
        int[] sixthShiftLeftSolution = {1, 1, 1};
        int[] seventhShiftLeft = {1, 2, 3};
        int[] seventhShiftLeftSolution = {2, 3, 1};
        assertEquals(Arrays.toString(firstShiftLeftSolution), Arrays.toString(testArray2.shiftLeft(firstShiftLeft)));
        assertEquals(Arrays.toString(secondShiftLeftSolution), Arrays.toString(testArray2.shiftLeft(secondShiftLeft)));
        assertEquals(Arrays.toString(thirdShiftLeftSolution), Arrays.toString(testArray2.shiftLeft(thirdShiftLeft)));
        assertEquals(Arrays.toString(fourthShiftLeftSolution), Arrays.toString(testArray2.shiftLeft(fourthShiftLeft)));
        assertEquals(Arrays.toString(fifthShiftLeftSolution), Arrays.toString(testArray2.shiftLeft(fifthShiftLeft)));
        assertEquals(Arrays.toString(sixthShiftLeftSolution), Arrays.toString(testArray2.shiftLeft(sixthShiftLeft)));
        assertEquals(Arrays.toString(seventhShiftLeftSolution), Arrays.toString(testArray2.shiftLeft(seventhShiftLeft)));
    }

    //post4
    @Test
    public void testPost4() {
        int[] firstPost4 = {2, 4, 1, 2};
        int[] firstPost4Solution = {1, 2};
        int[] secondPost4 = {4, 1, 4, 2};
        int[] secondPost4Solution = {2};
        int[] thirdPost4 = {4, 4, 1, 2, 3};
        int[] thirdPost4Solution = {1, 2, 3};
        int[] fourthPost4 = {4, 2};
        int[] fourthPost4Solution = {2};
        int[] fifthPost4 = {4, 4, 3};
        int[] fifthPost4Solution = {3};
        int[] sixthPost4 = {4, 4};
        int[] sixthPost4Solution = {};
        int[] seventhPost4 = {4};
        int[] seventhPost4Solution = {};
        int[] eighthPost4 = {2, 4, 1, 4, 3, 2};
        int[] eighthPost4Solution = {3, 2};
        int[] ninthPost4 = {4, 1, 4, 2, 2, 2};
        int[] ninthPost4Solution = {2, 2, 2};
        int[] tenthPost4 = {3, 4, 3, 2};
        int[] tenthPost4Solution = {3, 2};

        assertEquals(Arrays.toString(firstPost4Solution), Arrays.toString(testArray2.post4(firstPost4)));
        assertEquals(Arrays.toString(secondPost4Solution), Arrays.toString(testArray2.post4(secondPost4)));
        assertEquals(Arrays.toString(thirdPost4Solution), Arrays.toString(testArray2.post4(thirdPost4)));
        assertEquals(Arrays.toString(fourthPost4Solution), Arrays.toString(testArray2.post4(fourthPost4)));
        assertEquals(Arrays.toString(fifthPost4Solution), Arrays.toString(testArray2.post4(fifthPost4)));
        assertEquals(Arrays.toString(sixthPost4Solution), Arrays.toString(testArray2.post4(sixthPost4)));
        assertEquals(Arrays.toString(seventhPost4Solution), Arrays.toString(testArray2.post4(seventhPost4)));
        assertEquals(Arrays.toString(eighthPost4Solution), Arrays.toString(testArray2.post4(eighthPost4)));
        assertEquals(Arrays.toString(ninthPost4Solution), Arrays.toString(testArray2.post4(ninthPost4)));
        assertEquals(Arrays.toString(tenthPost4Solution), Arrays.toString(testArray2.post4(tenthPost4)));
    }

    //withoutTen
    @Test
    public void testWithoutTen() {
        int[] firstWithoutTen = {1, 10, 10, 2};
        int[] firstWithoutTenSolution = {1, 2, 0, 0};
        int[] secondWithoutTen = {10, 2, 10};
        int[] secondWithoutTenSolution = {2, 0, 0};
        int[] thirdWithoutTen = {1, 99, 10};
        int[] thirdWithoutTenSolution = {1, 99, 0};
        int[] fourthWithoutTen = {10, 13, 10, 14};
        int[] fourthWithoutTenSolution = {13, 14, 0, 0};
        int[] fifthWithoutTen = {10, 13, 10, 14, 10};
        int[] fifthWithoutTenSolution = {13, 14, 0, 0, 0};
        int[] sixthWithoutTen = {10, 10, 3};
        int[] sixthWithoutTenSolution = {3, 0, 0};
        int[] seventhWithoutTen = {1};
        int[] seventhWithoutTenSolution = {1};
        int[] eighthWithoutTen = {13, 1};
        int[] eighthWithoutTenSolution = {13, 1};
        int[] ninthWithoutTen = {10};
        int[] ninthWithoutTenSolution = {0};
        int[] tenthWithoutTen = {};
        int[] tenthWithoutTenSolution = {};
        assertEquals(Arrays.toString(firstWithoutTenSolution), Arrays.toString(testArray2.withoutTen(firstWithoutTen)));
        assertEquals(Arrays.toString(secondWithoutTenSolution), Arrays.toString(testArray2.withoutTen(secondWithoutTen)));
        assertEquals(Arrays.toString(thirdWithoutTenSolution), Arrays.toString(testArray2.withoutTen(thirdWithoutTen)));
        assertEquals(Arrays.toString(fourthWithoutTenSolution), Arrays.toString(testArray2.withoutTen(fourthWithoutTen)));
        assertEquals(Arrays.toString(fifthWithoutTenSolution), Arrays.toString(testArray2.withoutTen(fifthWithoutTen)));
        assertEquals(Arrays.toString(sixthWithoutTenSolution), Arrays.toString(testArray2.withoutTen(sixthWithoutTen)));
        assertEquals(Arrays.toString(seventhWithoutTenSolution), Arrays.toString(testArray2.withoutTen(seventhWithoutTen)));
        assertEquals(Arrays.toString(eighthWithoutTenSolution), Arrays.toString(testArray2.withoutTen(eighthWithoutTen)));
        assertEquals(Arrays.toString(ninthWithoutTenSolution), Arrays.toString(testArray2.withoutTen(ninthWithoutTen)));
        assertEquals(Arrays.toString(tenthWithoutTenSolution), Arrays.toString(testArray2.withoutTen(tenthWithoutTen)));
    }

    //******https://codingbat.com/java/Array-2******second column

    //fizBuzz
    @Test
    public void testFizzBuzz() {
        String[] firstFizzBuzzSolution = {"1", "2", "Fizz", "4", "Buzz"};
        String[] secondFizzBuzzSolution = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"};
        String[] thirdFizzBuzzSolution = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"};
        String[] fourthFizzBuzzSolution = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
        String[] fifthFizzBuzzSolution = {"1", "2", "Fizz"};
        String[] sixthFizzBuzzSolution = {"1"};
        String[] seventhFizzBuzzSolution = {"Buzz", "Fizz", "52", "53", "Fizz", "Buzz"};
        String[] eighthFizzBuzzSolution = {"FizzBuzz", "16"};
        String[] ninthFizzBuzzSolution = {"FizzBuzz", "31", "32", "Fizz", "34", "Buzz"};
        String[] tenthFizzBuzzSolution = {"Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"};
        String[] eleventhFizzBuzzSolution = {"Fizz", "Buzz", "101"};
        String[] twelfthFizzBuzzSolution = {"14", "FizzBuzz", "16", "17", "Fizz", "19"};
        assertEquals(Arrays.toString(firstFizzBuzzSolution), Arrays.toString(testArray2.fizzBuzz(1, 6)));
        assertEquals(Arrays.toString(secondFizzBuzzSolution), Arrays.toString(testArray2.fizzBuzz(1, 8)));
        assertEquals(Arrays.toString(thirdFizzBuzzSolution), Arrays.toString(testArray2.fizzBuzz(1, 11)));
        assertEquals(Arrays.toString(fourthFizzBuzzSolution), Arrays.toString(testArray2.fizzBuzz(1, 16)));
        assertEquals(Arrays.toString(fifthFizzBuzzSolution), Arrays.toString(testArray2.fizzBuzz(1, 4)));
        assertEquals(Arrays.toString(sixthFizzBuzzSolution), Arrays.toString(testArray2.fizzBuzz(1, 2)));
        assertEquals(Arrays.toString(seventhFizzBuzzSolution), Arrays.toString(testArray2.fizzBuzz(50, 56)));
        assertEquals(Arrays.toString(eighthFizzBuzzSolution), Arrays.toString(testArray2.fizzBuzz(15, 17)));
        assertEquals(Arrays.toString(ninthFizzBuzzSolution), Arrays.toString(testArray2.fizzBuzz(30, 36)));
        assertEquals(Arrays.toString(tenthFizzBuzzSolution), Arrays.toString(testArray2.fizzBuzz(1000, 1006)));
        assertEquals(Arrays.toString(eleventhFizzBuzzSolution), Arrays.toString(testArray2.fizzBuzz(99, 102)));
        assertEquals(Arrays.toString(twelfthFizzBuzzSolution), Arrays.toString(testArray2.fizzBuzz(14, 20)));
    }

    //bigDiff
    @Test
    public void testBigDiff() {
        int[] firstBigDiff = {10, 3, 5, 6};
        int[] secondBigDiff = {7, 2, 10, 9};
        int[] thirdBigDiff = {2, 10, 7, 2};
        int[] fourthBigDiff = {2, 10};
        int[] fifthBigDiff = {10, 2};
        int[] sixthBigDiff = {10, 0};
        int[] seventhBigDiff = {2, 3};
        int[] eighthBigDiff = {2, 2};
        int[] ninthBigDiff = {2};
        int[] tenthBigDiff = {5, 1, 6, 1, 9, 9};
        int[] eleventhBigDiff = {7, 6, 8, 5};
        int[] twelfthBigDiff = {7, 7, 6, 8, 5, 5, 6};
        assertEquals(7, testArray2.bigDiff(firstBigDiff));
        assertEquals(8, testArray2.bigDiff(secondBigDiff));
        assertEquals(8, testArray2.bigDiff(thirdBigDiff));
        assertEquals(8, testArray2.bigDiff(fourthBigDiff));
        assertEquals(8, testArray2.bigDiff(fifthBigDiff));
        assertEquals(10, testArray2.bigDiff(sixthBigDiff));
        assertEquals(1, testArray2.bigDiff(seventhBigDiff));
        assertEquals(0, testArray2.bigDiff(eighthBigDiff));
        assertEquals(0, testArray2.bigDiff(ninthBigDiff));
        assertEquals(8, testArray2.bigDiff(tenthBigDiff));
        assertEquals(3, testArray2.bigDiff(eleventhBigDiff));
        assertEquals(3, testArray2.bigDiff(twelfthBigDiff));
    }

    //sum67
    @Test
    public void testSum67() {
        int[] firstSum67 = {1, 2, 2};
        int[] secondSum67 = {1, 2, 2, 6, 99, 99, 7};
        int[] thirdSum67 = {1, 1, 6, 7, 2};
        int[] fourthSum67 = {1, 6, 2, 2, 7, 1, 6, 99, 99, 7};
        int[] fifthSum67 = {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7};
        int[] sixthSum67 = {2, 7, 6, 2, 6, 7, 2, 7};
        int[] seventhSum67 = {2, 7, 6, 2, 6, 2, 7};
        int[] eighthSum67 = {1, 6, 7, 7};
        int[] ninthSum67 = {6, 7, 1, 6, 7, 7};
        int[] tenthSum67 = {6, 8, 1, 6, 7};
        int[] eleventhSum67 = {};
        int[] twelfthSum67 = {6, 7, 11};
        int[] thirteenthSum67 = {11, 6, 7, 11};
        int[] fourteenthSum67 = {2, 2, 6, 7, 7};
        assertEquals(5, testArray2.sum67(firstSum67));
        assertEquals(5, testArray2.sum67(secondSum67));
        assertEquals(4, testArray2.sum67(thirdSum67));
        assertEquals(2, testArray2.sum67(fourthSum67));
        assertEquals(2, testArray2.sum67(fifthSum67));
        assertEquals(18, testArray2.sum67(sixthSum67));
        assertEquals(9, testArray2.sum67(seventhSum67));
        assertEquals(8, testArray2.sum67(eighthSum67));
        assertEquals(8, testArray2.sum67(ninthSum67));
        assertEquals(0, testArray2.sum67(tenthSum67));
        assertEquals(0, testArray2.sum67(eleventhSum67));
        assertEquals(11, testArray2.sum67(twelfthSum67));
        assertEquals(22, testArray2.sum67(thirteenthSum67));
        assertEquals(11, testArray2.sum67(fourteenthSum67));
    }

    //sum28
    @Test
    public void testSum28() {
        int[] firstSum28 = {2, 3, 2, 2, 4, 2};
        int[] secondSum28 = {2, 3, 2, 2, 4, 2, 2};
        int[] thirdSum28 = {1, 2, 3, 4};
        int[] fourthSum28 = {2, 2, 2, 2};
        int[] fifthSum28 = {1, 2, 2, 2, 2, 4};
        int[] sixthSum28 = {};
        int[] seventhSum28 = {2};
        int[] eighthSum28 = {8};
        int[] ninthSum28 = {2, 2, 2};
        int[] tenthSum28 = {2, 2, 2, 2, 2};
        int[] eleventhSum28 = {1, 2, 2, 1, 2, 2};
        int[] twelfthSum28 = {5, 2, 2, 2, 4, 2};
        assertTrue(testArray2.sum28(firstSum28));
        assertFalse(testArray2.sum28(secondSum28));
        assertFalse(testArray2.sum28(thirdSum28));
        assertTrue(testArray2.sum28(fourthSum28));
        assertTrue(testArray2.sum28(fifthSum28));
        assertFalse(testArray2.sum28(sixthSum28));
        assertFalse(testArray2.sum28(seventhSum28));
        assertFalse(testArray2.sum28(eighthSum28));
        assertFalse(testArray2.sum28(ninthSum28));
        assertFalse(testArray2.sum28(tenthSum28));
        assertTrue(testArray2.sum28(eleventhSum28));
        assertTrue(testArray2.sum28(twelfthSum28));
        }

    //only14
    @Test
    public void testOnly14() {
        int[] firstOnly14 = {1, 4, 1, 4};
        int[] secondOnly14 = {1, 4, 2, 4};
        int[] thirdOnly14 = {1, 1};
        int[] fourthOnly14 = {4, 1};
        int[] fifthOnly14 = {2};
        int[] sixthOnly14 = {};
        int[] seventhOnly14 = {1, 4, 1, 3};
        int[] eighthOnly14 = {3, 1, 3};
        int[] ninthOnly14 = {1};
        int[] eleventhOnly14 = {4};
        int[] twelfthOnly14 = {3, 4};
        int[] thirteenthOnly14 = {1, 3, 4};
        int[] fourteenthOnly14 = {1, 1, 1};
        int[] fifteenthOnly14 = {1, 1, 1, 5};
        int[] sixteenthOnly14 = {4, 1, 4, 1};
        assertTrue(testArray2.only14(firstOnly14));
        assertFalse(testArray2.only14(secondOnly14));
        assertTrue(testArray2.only14(thirdOnly14));
        assertTrue(testArray2.only14(fourthOnly14));
        assertFalse(testArray2.only14(fifthOnly14));
        assertTrue(testArray2.only14(sixthOnly14));
        assertFalse(testArray2.only14(seventhOnly14));
        assertFalse(testArray2.only14(eighthOnly14));
        assertTrue(testArray2.only14(ninthOnly14));
        assertTrue(testArray2.only14(eleventhOnly14));
        assertFalse(testArray2.only14(twelfthOnly14));
        assertFalse(testArray2.only14(thirteenthOnly14));
        assertTrue(testArray2.only14(fourteenthOnly14));
        assertFalse(testArray2.only14(fifteenthOnly14));
        assertTrue(testArray2.only14(sixteenthOnly14));
    }

    //isEverywhere
    @Test
    public void testIsEverywhere() {
        int[] firstIsEverywhere = {1, 2, 1, 3};
        int[] secondIsEverywhere = {1, 2, 1, 3};
        int[] thirdIsEverywhere = {1, 2, 1, 3, 4};
        int[] fourthIsEverywhere = {2, 1, 2, 1};
        int[] fifthIsEverywhere = {2, 1, 2, 1};
        int[] sixthIsEverywhere = {2, 1, 2, 3, 1};
        int[] seventhIsEverywhere = {3, 1};
        int[] eighthIsEverywhere = {3, 1};
        int[] ninthIsEverywhere = {3};
        int[] tenthIsEverywhere = {};
        int[] eleventhIsEverywhere = {1, 2, 1, 2, 3, 2, 5};
        int[] twelfthIsEverywhere = {1, 2, 1, 1, 1, 2};
        int[] thirteenthIsEverywhere = {2, 1, 2, 1, 1, 2};
        int[] fourteenthIsEverywhere = {2, 1, 2, 2, 2, 1, 1, 2};
        int[] fifteenthIsEverywhere = {2, 1, 2, 2, 2, 1, 2, 1};
        int[] sixteenthIsEverywhere = {2, 1, 2, 1, 2};
        assertTrue(testArray2.isEverywhere(firstIsEverywhere, 1));
        assertFalse(testArray2.isEverywhere(secondIsEverywhere, 2));
        assertFalse(testArray2.isEverywhere(thirdIsEverywhere, 1));
        assertTrue(testArray2.isEverywhere(fourthIsEverywhere, 1));
        assertTrue(testArray2.isEverywhere(fifthIsEverywhere, 2));
        assertFalse(testArray2.isEverywhere(sixthIsEverywhere, 2));
        assertTrue(testArray2.isEverywhere(seventhIsEverywhere, 3));
        assertFalse(testArray2.isEverywhere(eighthIsEverywhere, 2));
        assertTrue(testArray2.isEverywhere(ninthIsEverywhere, 1));
        assertTrue(testArray2.isEverywhere(tenthIsEverywhere, 1));
        assertTrue(testArray2.isEverywhere(eleventhIsEverywhere, 2));
        assertFalse(testArray2.isEverywhere(twelfthIsEverywhere, 2));
        assertFalse(testArray2.isEverywhere(thirteenthIsEverywhere, 2));
        assertFalse(testArray2.isEverywhere(fourteenthIsEverywhere, 2));
        assertTrue(testArray2.isEverywhere(fifteenthIsEverywhere, 2));
        assertTrue(testArray2.isEverywhere(sixteenthIsEverywhere, 2));
    }

    //has77
    @Test
    public void testHas77() {
        int[] firstHas77 = {1, 7, 7};
        int[] secondHas77 = {1, 7, 1, 7};
        int[] thirdHas77 = {1, 7, 1, 1, 7};
        int[] fourthHas77 = {7, 7, 1, 1, 7};
        int[] fifthHas77 = {2, 7, 2, 2, 7, 2};
        int[] sixthHas77 = {2, 7, 2, 2, 7, 7};
        int[] seventhHas77 = {7, 2, 7, 2, 2, 7};
        int[] eighthHas77 = {7, 2, 6, 2, 2, 7};
        int[] ninthHas77 = {7, 7, 7};
        int[] tenthHas77 = {7, 1, 7};
        int[] eleventhHas77 = {7, 1, 1};
        int[] twelfthHas77 = {1, 2};
        int[] thirteenthHas77 = {1, 7};
        int[] fourteenthHas77 = {7};
        assertTrue(testArray2.has77(firstHas77));
        assertTrue(testArray2.has77(secondHas77));
        assertFalse(testArray2.has77(thirdHas77));
        assertTrue(testArray2.has77(fourthHas77));
        assertFalse(testArray2.has77(fifthHas77));
        assertTrue(testArray2.has77(sixthHas77));
        assertTrue(testArray2.has77(seventhHas77));
        assertFalse(testArray2.has77(eighthHas77));
        assertTrue(testArray2.has77(ninthHas77));
        assertTrue(testArray2.has77(tenthHas77));
        assertFalse(testArray2.has77(eleventhHas77));
        assertFalse(testArray2.has77(twelfthHas77));
        assertFalse(testArray2.has77(thirteenthHas77));
        assertFalse(testArray2.has77(fourteenthHas77));
    }

    //haveThree
    @Test
    public void testHaveThree() {
        int[] firstHaveThree = {3, 1, 3, 1, 3};
        int[] secondHaveThree = {3, 1, 3, 3};
        int[] thirdHaveThree = {3, 4, 3, 3, 4};
        int[] fourthHaveThree = {1, 3, 1, 3, 1, 2};
        int[] fifthHaveThree = {1, 3, 1, 3, 1, 3};
        int[] sixthHaveThree = {1, 3, 3, 1, 3};
        int[] seventhHaveThree = {1, 3, 1, 3, 1, 3, 4, 3};
        int[] eighthHaveThree = {3, 4, 3, 4, 3, 4, 4};
        int[] ninthHaveThree = {3, 3, 3};
        int[] tenthHaveThree = {1, 3};
        int[] eleventhHaveThree = {3};
        int[] twelfthHaveThree = {1};
        assertTrue(testArray2.haveThree(firstHaveThree));
        assertFalse(testArray2.haveThree(secondHaveThree));
        assertFalse(testArray2.haveThree(thirdHaveThree));
        assertFalse(testArray2.haveThree(fourthHaveThree));
        assertTrue(testArray2.haveThree(fifthHaveThree));
        assertFalse(testArray2.haveThree(sixthHaveThree));
        assertFalse(testArray2.haveThree(seventhHaveThree));
        assertTrue(testArray2.haveThree(eighthHaveThree));
        assertFalse(testArray2.haveThree(ninthHaveThree));
        assertFalse(testArray2.haveThree(tenthHaveThree));
        assertFalse(testArray2.haveThree(eleventhHaveThree));
        assertFalse(testArray2.haveThree(twelfthHaveThree));
    }

    //tripleUp
    @Test
    public void testTripleUp() {
        int[] firstTripleUp = {1, 4, 5, 6, 2};
        int[] secondTripleUp = {1, 2, 3};
        int[] thirdTripleUp = {1, 2, 4};
        int[] fourthTripleUp = {1, 2, 4, 5, 7, 6, 5, 6, 7, 6};
        int[] fifthTripleUp = {1, 2, 4, 5, 7, 6, 5, 7, 7, 6};
        int[] sixthTripleUp = {1, 2};
        int[] seventhTripleUp = {1};
        int[] eighthTripleUp = {};
        int[] ninthTripleUp = {10, 9, 8, -100, -99, -98, 100};
        int[] tenthTripleUp = {10, 9, 8, -100, -99, 99, 100};
        int[] eleventhTripleUp = {-100, -99, -99, 100, 101, 102};
        int[] twelfthTripleUp = {2, 3, 5, 6, 8, 9, 2, 3};

        assertTrue(testArray2.tripleUp(firstTripleUp));
        assertTrue(testArray2.tripleUp(secondTripleUp));
        assertFalse(testArray2.tripleUp(thirdTripleUp));
        assertTrue(testArray2.tripleUp(fourthTripleUp));
        assertFalse(testArray2.tripleUp(fifthTripleUp));
        assertFalse(testArray2.tripleUp(sixthTripleUp));
        assertFalse(testArray2.tripleUp(seventhTripleUp));
        assertFalse(testArray2.tripleUp(eighthTripleUp));
        assertTrue(testArray2.tripleUp(ninthTripleUp));
        assertFalse(testArray2.tripleUp(tenthTripleUp));
        assertTrue(testArray2.tripleUp(eleventhTripleUp));
        assertFalse(testArray2.tripleUp(twelfthTripleUp));
    }

    //tenRun
    @Test
    public void testTenRun() {
        int[] firstTenRun = {2, 10, 3, 4, 20, 5};
        int[] firstTenRunSolution = {2, 10, 10, 10, 20, 20};
        int[] secondTenRun = {10, 1, 20, 2};
        int[] secondTenRunSolution = {10, 10, 20, 20};
        int[] thirdTenRun = {10, 1, 9, 20};
        int[] thirdTenRunSolution = {10, 10, 10, 20};
        int[] fourthTenRun = {1, 2, 50, 1};
        int[] fourthTenRunSolution = {1, 2, 50, 50};
        int[] fifthTenRun = {1, 20, 50, 1};
        int[] fifthTenRunSolution = {1, 20, 50, 50};
        int[] sixthTenRun = {10, 10};
        int[] sixthTenRunSolution = {10, 10};
        int[] seventhTenRun = {10, 2};
        int[] seventhTenRunSolution = {10, 10};
        int[] eighthTenRun = {0, 2};
        int[] eighthTenRunSolution = {0, 0};
        int[] ninthTenRun = {1, 2};
        int[] ninthTenRunSolution = {1, 2};
        int[] tenthTenRun = {1};
        int[] tenthTenRunSolution = {1};
        int[] eleventhTenRun = {};
        int[] eleventhTenRunSolution = {};
        assertEquals(Arrays.toString(firstTenRunSolution), Arrays.toString(testArray2.tenRun(firstTenRun)));
        assertEquals(Arrays.toString(secondTenRunSolution), Arrays.toString(testArray2.tenRun(secondTenRun)));
        assertEquals(Arrays.toString(thirdTenRunSolution), Arrays.toString(testArray2.tenRun(thirdTenRun)));
        assertEquals(Arrays.toString(fourthTenRunSolution), Arrays.toString(testArray2.tenRun(fourthTenRun)));
        assertEquals(Arrays.toString(fifthTenRunSolution), Arrays.toString(testArray2.tenRun(fifthTenRun)));
        assertEquals(Arrays.toString(sixthTenRunSolution), Arrays.toString(testArray2.tenRun(sixthTenRun)));
        assertEquals(Arrays.toString(seventhTenRunSolution), Arrays.toString(testArray2.tenRun(seventhTenRun)));
        assertEquals(Arrays.toString(eighthTenRunSolution), Arrays.toString(testArray2.tenRun(eighthTenRun)));
        assertEquals(Arrays.toString(ninthTenRunSolution), Arrays.toString(testArray2.tenRun(ninthTenRun)));
        assertEquals(Arrays.toString(tenthTenRunSolution), Arrays.toString(testArray2.tenRun(tenthTenRun)));
        assertEquals(Arrays.toString(eleventhTenRunSolution), Arrays.toString(testArray2.tenRun(eleventhTenRun)));
    }

    //notAlone
    @Test
    public void testNotAlone() {
        int[] firstNotAlone = {1, 2, 3};
        int[] firstNotAloneSolution = {1, 3, 3};
        int[] secondNotAlone = {1, 2, 3, 2, 5, 2};
        int[] secondNotAloneSolution = {1, 3, 3, 5, 5, 2};
        int[] thirdNotAlone = {3, 4};
        int[] thirdNotAloneSolution = {3, 4};
        int[] fourthNotAlone = {3, 3};
        int[] fourthNotAloneSolution = {3, 3};
        int[] fifthNotAlone = {1, 3, 1, 2};
        int[] fifthNotAloneSolution = {1, 3, 3, 2};
        int[] sixthNotAlone = {3};
        int[] sixthNotAloneSolution = {3};
        int[] seventhNotAlone = {};
        int[] seventhNotAloneSolution = {};
        int[] eighthNotAlone = {7, 1, 6};
        int[] eighthNotAloneSolution = {7, 7, 6};
        int[] ninthNotAlone = {1, 1, 1};
        int[] ninthNotAloneSolution = {1, 1, 1};
        int[] tenthNotAlone = {1, 1, 1, 2};
        int[] tenthNotAloneSolution = {1, 1, 1, 2};
        assertEquals(Arrays.toString(firstNotAloneSolution), Arrays.toString(testArray2.notAlone(firstNotAlone, 2)));
        assertEquals(Arrays.toString(secondNotAloneSolution), Arrays.toString(testArray2.notAlone(secondNotAlone, 2)));
        assertEquals(Arrays.toString(thirdNotAloneSolution), Arrays.toString(testArray2.notAlone(thirdNotAlone, 3)));
        assertEquals(Arrays.toString(fourthNotAloneSolution), Arrays.toString(testArray2.notAlone(fourthNotAlone, 3)));
        assertEquals(Arrays.toString(fifthNotAloneSolution), Arrays.toString(testArray2.notAlone(fifthNotAlone, 1)));
        assertEquals(Arrays.toString(sixthNotAloneSolution), Arrays.toString(testArray2.notAlone(sixthNotAlone, 2)));
        assertEquals(Arrays.toString(seventhNotAloneSolution), Arrays.toString(testArray2.notAlone(seventhNotAlone, 2)));
        assertEquals(Arrays.toString(eighthNotAloneSolution), Arrays.toString(testArray2.notAlone(eighthNotAlone, 1)));
        assertEquals(Arrays.toString(ninthNotAloneSolution), Arrays.toString(testArray2.notAlone(ninthNotAlone, 1)));
        assertEquals(Arrays.toString(tenthNotAloneSolution), Arrays.toString(testArray2.notAlone(tenthNotAlone, 1)));
    }

    //zeroMax
    @Test
    public void testZeroMax() {
        int[] firstZeroMax = {0, 5, 0, 3};
        int[] firstZeroMaxSolution = {5, 5, 3, 3};
        int[] secondZeroMax = {0, 4, 0, 3};
        int[] secondZeroMaxSolution = {3, 4, 3, 3};
        int[] thirdZeroMax = {0, 1, 0};
        int[] thirdZeroMaxSolution = {1, 1, 0};
        int[] fourthZeroMax = {0, 1, 5};
        int[] fourthZeroMaxSolution = {5, 1, 5};
        int[] fifthZeroMax = {0, 2, 0};
        int[] fifthZeroMaxSolution = {0, 2, 0};
        int[] sixthZeroMax = {1};
        int[] sixthZeroMaxSolution = {1};
        int[] seventhZeroMax = {0};
        int[] seventhZeroMaxSolution = {0};
        int[] eighthZeroMax = {};
        int[] eighthZeroMaxSolution = {};
        int[] ninthZeroMax = {7, 0, 4, 3, 0, 2};
        int[] ninthZeroMaxSolution = {7, 3, 4, 3, 0, 2};
        int[] tenthZeroMax = {7, 0, 4, 3, 0, 1};
        int[] tenthZeroMaxSolution = {7, 3, 4, 3, 1, 1};
        int[] eleventhZeroMax = {7, 0, 4, 3, 0, 0};
        int[] eleventhZeroMaxSolution = {7, 3, 4, 3, 0, 0};
        int[] twelfthZeroMax = {7, 0, 1, 0, 0, 7};
        int[] twelfthZeroMaxSolution = {7, 7, 1, 7, 7, 7};
        assertEquals(Arrays.toString(firstZeroMaxSolution), Arrays.toString(testArray2.zeroMax(firstZeroMax)));
        assertEquals(Arrays.toString(secondZeroMaxSolution), Arrays.toString(testArray2.zeroMax(secondZeroMax)));
        assertEquals(Arrays.toString(thirdZeroMaxSolution), Arrays.toString(testArray2.zeroMax(thirdZeroMax)));
        assertEquals(Arrays.toString(fourthZeroMaxSolution), Arrays.toString(testArray2.zeroMax(fourthZeroMax)));
        assertEquals(Arrays.toString(fifthZeroMaxSolution), Arrays.toString(testArray2.zeroMax(fifthZeroMax)));
        assertEquals(Arrays.toString(sixthZeroMaxSolution), Arrays.toString(testArray2.zeroMax(sixthZeroMax)));
        assertEquals(Arrays.toString(seventhZeroMaxSolution), Arrays.toString(testArray2.zeroMax(seventhZeroMax)));
        assertEquals(Arrays.toString(eighthZeroMaxSolution), Arrays.toString(testArray2.zeroMax(eighthZeroMax)));
        assertEquals(Arrays.toString(ninthZeroMaxSolution), Arrays.toString(testArray2.zeroMax(ninthZeroMax)));
        assertEquals(Arrays.toString(tenthZeroMaxSolution), Arrays.toString(testArray2.zeroMax(tenthZeroMax)));
        assertEquals(Arrays.toString(eleventhZeroMaxSolution), Arrays.toString(testArray2.zeroMax(eleventhZeroMax)));
        assertEquals(Arrays.toString(twelfthZeroMaxSolution), Arrays.toString(testArray2.zeroMax(twelfthZeroMax)));
    }

    //******https://codingbat.com/java/Array-2******third column

}

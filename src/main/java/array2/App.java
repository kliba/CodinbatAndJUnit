package array2;

public class App {
    public static void main(String[] args) {

        Array2 myArray2 = new Array2();

        //******https://codingbat.com/java/Array-2******first column

        //countEvens
        int[] firstCountEvens = {2, 1, 2, 3, 4};
        int[] secondCountEvens = {2, 2, 0};
        int[] thirdCountEvens = {1, 3, 5};
        int[] fourthCountEvens = {};
        int[] fifthCountEvens = {11, 9, 0, 1};
        int[] sixthCountEvens = {2, 11, 9, 0};
        int[] seventhCountEvens = {2};
        int[] eighthCountEvens = {2, 5, 12};
        myArray2.countEvens(firstCountEvens);
        myArray2.countEvens(secondCountEvens);
        myArray2.countEvens(thirdCountEvens);
        myArray2.countEvens(fourthCountEvens);
        myArray2.countEvens(fifthCountEvens);
        myArray2.countEvens(sixthCountEvens);
        myArray2.countEvens(seventhCountEvens);
        myArray2.countEvens(eighthCountEvens);


        //sum13

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

        myArray2.sum13(firstSum13);
        myArray2.sum13(secondSum13);
        myArray2.sum13(thirdSum13);
        myArray2.sum13(fourthSum13);
        myArray2.sum13(sixthSum13);
        myArray2.sum13(seventhSum13);
        myArray2.sum13(eighthSum13);
        myArray2.sum13(ninthSum13);
        myArray2.sum13(tenthSum13);
        myArray2.sum13(eleventhSum13);
        myArray2.sum13(twelfthSum13);
        myArray2.sum13(thirteenthSum13);
        myArray2.sum13(fourteenthSum13);
        myArray2.sum13(sixteenthSum13);


        //lucky13
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
        myArray2.lucky13(firstLucky13);
        myArray2.lucky13(secondLucky13);
        myArray2.lucky13(thirdLucky13);
        myArray2.lucky13(fourthLucky13);
        myArray2.lucky13(fifthLucky13);
        myArray2.lucky13(sixthLucky13);
        myArray2.lucky13(seventhLucky13);
        myArray2.lucky13(eighthLucky13);
        myArray2.lucky13(ninthLucky13);
        myArray2.lucky13(tenthLucky13);
        myArray2.lucky13(eleventhLucky13);
        myArray2.lucky13(twelfthLucky13);

        //fizzArray
        myArray2.fizzArray(4);
        myArray2.fizzArray(1);
        myArray2.fizzArray(10);
        myArray2.fizzArray(0);
        myArray2.fizzArray(2);
        myArray2.fizzArray(7);

        //no14
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
        myArray2.no14(firstNot14);
        myArray2.no14(secondNot14);
        myArray2.no14(thirdNot14);
        myArray2.no14(fourthNot14);
        myArray2.no14(fifthNot14);
        myArray2.no14(sixthNot14);
        myArray2.no14(seventhNot14);
        myArray2.no14(eighthNot14);
        myArray2.no14(ninthNot14);
        myArray2.no14(tenthNot14);
        myArray2.no14(eleventhNot14);
        myArray2.no14(twelfthNot14);
        myArray2.no14(thirteenthNot14);
        myArray2.no14(fourteenthNot14);
        myArray2.no14(fifteenthNot14);
        myArray2.no14(sixteenthNot14);
        myArray2.no14(seventeenthNot14);
        myArray2.no14(eighteenthNot14);
        myArray2.no14(nineteenthNot14);


        //matchUp
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
        myArray2.matchUp(firstMatchUp1, firstMatchUp2);
        myArray2.matchUp(secondMatchUp1, secondMatchUp2);
        myArray2.matchUp(thirdMatchUp1, thirdMatchUp2);
        myArray2.matchUp(fourthMatchUp1, fourthMatchUp2);
        myArray2.matchUp(fifthMatchUp1, fifthMatchUp2);
        myArray2.matchUp(sixthMatchUp1, sixthMatchUp2);
        myArray2.matchUp(seventhMatchUp1, seventhMatchUp2);
        myArray2.matchUp(eighthMatchUp1, eighthMatchUp2);
        myArray2.matchUp(ninthMatchUp1, ninthMatchUp2);
        myArray2.matchUp(tenthMatchUp1, tenthMatchUp2);
        myArray2.matchUp(eleventhMatchUp1, eleventhMatchUp2);

        //modThree
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
        myArray2.modThree(firstModThree);
        myArray2.modThree(secondModThree);
        myArray2.modThree(thirdModThree);
        myArray2.modThree(fourthModThree);
        myArray2.modThree(fifthModThree);
        myArray2.modThree(sixthModThree);
        myArray2.modThree(seventhModThree);
        myArray2.modThree(eighthModThree);
        myArray2.modThree(ninthModThree);
        myArray2.modThree(tenthModThree);
        myArray2.modThree(eleventhModThree);
        myArray2.modThree(twelfthModThree);


        //sameEnds
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
        myArray2.sameEnds(firstSameEnds, 1);
        myArray2.sameEnds(secondSameEnds, 2);
        myArray2.sameEnds(thirdSameEnds, 3);
        myArray2.sameEnds(fourthSameEnds, 1);
        myArray2.sameEnds(fifthSameEnds, 2);
        myArray2.sameEnds(sixthSameEnds, 0);
        myArray2.sameEnds(seventhSameEnds, 5);
        myArray2.sameEnds(eighthSameEnds, 0);
        myArray2.sameEnds(ninthSameEnds, 1);
        myArray2.sameEnds(tenthSameEnds, 2);
        myArray2.sameEnds(eleventhSameEnds, 3);
        myArray2.sameEnds(twelfthSameEnds, 1);
        myArray2.sameEnds(thirteenthSameEnds, 0);
        myArray2.sameEnds(fourteenthSameEnds, 1);

        //shiftLeft
        int[] firstShiftLeft = {6, 2, 5, 3};
        int[] secondShiftLeft = {1, 2};
        int[] thirdShiftLeft = {1};
        int[] fourthShiftLeft = {};
        int[] fifthShiftLeft = {1, 1, 2, 2, 4};
        int[] sixthShiftLeft = {1, 1, 1};
        int[] seventhShiftLeft = {1, 2, 3};
        myArray2.shiftLeft(firstShiftLeft);
        myArray2.shiftLeft(secondShiftLeft);
        myArray2.shiftLeft(thirdShiftLeft);
        myArray2.shiftLeft(fourthShiftLeft);
        myArray2.shiftLeft(fifthShiftLeft);
        myArray2.shiftLeft(sixthShiftLeft);
        myArray2.shiftLeft(seventhShiftLeft);

        //post4
        int[] firstPost4 = {2, 4, 1, 2};
        int[] secondPost4 = {4, 1, 4, 2};
        int[] thirdPost4 = {4, 4, 1, 2, 3};
        int[] fourthPost4 = {4, 2};
        int[] fifthPost4 = {4, 4, 3};
        int[] sixthPost4 = {4, 4};
        int[] seventhPost4 = {4};
        int[] eighthPost4 = {2, 4, 1, 4, 3, 2};
        int[] ninthPost4 = {4, 1, 4, 2, 2, 2};
        int[] tenthPost4 = {3, 4, 3, 2};
        myArray2.post4(firstPost4);
        myArray2.post4(secondPost4);
        myArray2.post4(thirdPost4);
        myArray2.post4(fourthPost4);
        myArray2.post4(fifthPost4);
        myArray2.post4(sixthPost4);
        myArray2.post4(seventhPost4);
        myArray2.post4(eighthPost4);
        myArray2.post4(ninthPost4);
        myArray2.post4(tenthPost4);

        //withoutTen
        int[] firstWithoutTen = {1, 10, 10, 2};
        int[] secondWithoutTen = {10, 2, 10};
        int[] thirdWithoutTen = {1, 99, 10};
        int[] fourthWithoutTen = {10, 13, 10, 14};
        int[] fifthWithoutTen = {10, 13, 10, 14, 10};
        int[] sixthWithoutTen = {10, 10, 3};
        int[] seventhWithoutTen = {1};
        int[] eighthWithoutTen = {13, 1};
        int[] ninthWithoutTen = {10};
        int[] tenthWithoutTen = {};
        myArray2.withoutTen(firstWithoutTen);
        myArray2.withoutTen(secondWithoutTen);
        myArray2.withoutTen(thirdWithoutTen);
        myArray2.withoutTen(fourthWithoutTen);
        myArray2.withoutTen(fifthWithoutTen);
        myArray2.withoutTen(sixthWithoutTen);
        myArray2.withoutTen(seventhWithoutTen);
        myArray2.withoutTen(eighthWithoutTen);
        myArray2.withoutTen(ninthWithoutTen);
        myArray2.withoutTen(tenthWithoutTen);

        //******https://codingbat.com/java/Array-2******second column

        //fizzBuzz
        myArray2.fizzBuzz(1, 6);
        myArray2.fizzBuzz(1, 8);
        myArray2.fizzBuzz(1, 11);
        myArray2.fizzBuzz(1, 16);
        myArray2.fizzBuzz(1, 4);
        myArray2.fizzBuzz(1, 2);
        myArray2.fizzBuzz(50, 56);
        myArray2.fizzBuzz(15, 17);
        myArray2.fizzBuzz(30, 36);
        myArray2.fizzBuzz(1000, 1006);
        myArray2.fizzBuzz(99, 102);
        myArray2.fizzBuzz(14, 20);

        //bigDiff
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
        myArray2.bigDiff(firstBigDiff);
        myArray2.bigDiff(secondBigDiff);
        myArray2.bigDiff(thirdBigDiff);
        myArray2.bigDiff(fourthBigDiff);
        myArray2.bigDiff(fifthBigDiff);
        myArray2.bigDiff(sixthBigDiff);
        myArray2.bigDiff(seventhBigDiff);
        myArray2.bigDiff(eighthBigDiff);
        myArray2.bigDiff(ninthBigDiff);
        myArray2.bigDiff(tenthBigDiff);
        myArray2.bigDiff(eleventhBigDiff);
        myArray2.bigDiff(twelfthBigDiff);

        //sum67
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
        myArray2.sum67(firstSum67);
        myArray2.sum67(secondSum67);
        myArray2.sum67(thirdSum67);
        myArray2.sum67(fourthSum67);
        myArray2.sum67(fifthSum67);
        myArray2.sum67(sixthSum67);
        myArray2.sum67(seventhSum67);
        myArray2.sum67(eighthSum67);
        myArray2.sum67(ninthSum67);
        myArray2.sum67(tenthSum67);
        myArray2.sum67(eleventhSum67);
        myArray2.sum67(twelfthSum67);
        myArray2.sum67(thirteenthSum67);
        myArray2.sum67(fourteenthSum67);

        //sum28
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
        myArray2.sum28(firstSum28);
        myArray2.sum28(secondSum28);
        myArray2.sum28(thirdSum28);
        myArray2.sum28(thirdSum28);
        myArray2.sum28(fourthSum28);
        myArray2.sum28(fifthSum28);
        myArray2.sum28(sixthSum28);
        myArray2.sum28(seventhSum28);
        myArray2.sum28(eighthSum28);
        myArray2.sum28(ninthSum28);
        myArray2.sum28(tenthSum28);
        myArray2.sum28(eleventhSum28);
        myArray2.sum28(twelfthSum28);

        //only14
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
        myArray2.sum28(firstOnly14);
        myArray2.sum28(secondOnly14);
        myArray2.sum28(thirdOnly14);
        myArray2.sum28(fourthOnly14);
        myArray2.sum28(fifthOnly14);
        myArray2.sum28(sixthOnly14);
        myArray2.sum28(seventhOnly14);
        myArray2.sum28(eighthOnly14);
        myArray2.sum28(ninthOnly14);
        myArray2.sum28(eleventhOnly14);
        myArray2.sum28(twelfthOnly14);
        myArray2.sum28(thirteenthOnly14);
        myArray2.sum28(fourteenthOnly14);
        myArray2.sum28(fifteenthOnly14);
        myArray2.sum28(sixteenthOnly14);

        //isEverywhere
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

        myArray2.isEverywhere(firstIsEverywhere, 1);
        myArray2.isEverywhere(secondIsEverywhere, 2);
        myArray2.isEverywhere(thirdIsEverywhere, 1);
        myArray2.isEverywhere(fourthIsEverywhere, 1);
        myArray2.isEverywhere(fifthIsEverywhere, 2);
        myArray2.isEverywhere(sixthIsEverywhere, 2);
        myArray2.isEverywhere(seventhIsEverywhere, 3);
        myArray2.isEverywhere(eighthIsEverywhere, 2);
        myArray2.isEverywhere(ninthIsEverywhere, 1);
        myArray2.isEverywhere(tenthIsEverywhere, 1);
        myArray2.isEverywhere(eleventhIsEverywhere, 2);
        myArray2.isEverywhere(twelfthIsEverywhere, 2);
        myArray2.isEverywhere(thirteenthIsEverywhere, 2);
        myArray2.isEverywhere(fourteenthIsEverywhere, 2);
        myArray2.isEverywhere(fifteenthIsEverywhere, 2);
        myArray2.isEverywhere(sixteenthIsEverywhere, 2);


        //has77
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
        myArray2.has77(firstHas77);
        myArray2.has77(secondHas77);
        myArray2.has77(thirdHas77);
        myArray2.has77(fourthHas77);
        myArray2.has77(fifthHas77);
        myArray2.has77(sixthHas77);
        myArray2.has77(seventhHas77);
        myArray2.has77(eighthHas77);
        myArray2.has77(ninthHas77);
        myArray2.has77(tenthHas77);
        myArray2.has77(eleventhHas77);
        myArray2.has77(twelfthHas77);
        myArray2.has77(thirteenthHas77);
        myArray2.has77(fourteenthHas77);


        //haveThree
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

        myArray2.haveThree(firstHaveThree);
        myArray2.haveThree(secondHaveThree);
        myArray2.haveThree(thirdHaveThree);
        myArray2.haveThree(fourthHaveThree);
        myArray2.haveThree(fifthHaveThree);
        myArray2.haveThree(sixthHaveThree);
        myArray2.haveThree(seventhHaveThree);
        myArray2.haveThree(eighthHaveThree);
        myArray2.haveThree(ninthHaveThree);
        myArray2.haveThree(tenthHaveThree);
        myArray2.haveThree(eleventhHaveThree);
        myArray2.haveThree(twelfthHaveThree);


        //tripleUp
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
        myArray2.tripleUp(firstTripleUp);
        myArray2.tripleUp(secondTripleUp);
        myArray2.tripleUp(thirdTripleUp);
        myArray2.tripleUp(fourthTripleUp);
        myArray2.tripleUp(fifthTripleUp);
        myArray2.tripleUp(sixthTripleUp);
        myArray2.tripleUp(seventhTripleUp);
        myArray2.tripleUp(eighthTripleUp);
        myArray2.tripleUp(ninthTripleUp);
        myArray2.tripleUp(tenthTripleUp);
        myArray2.tripleUp(eleventhTripleUp);
        myArray2.tripleUp(twelfthTripleUp);

        //tenRun
        int[] firstTenRun = {2, 10, 3, 4, 20, 5};
        int[] secondTenRun = {10, 1, 20, 2};
        int[] thirdTenRun = {10, 1, 9, 20};
        int[] fourthTenRun = {1, 2, 50, 1};
        int[] fifthTenRun = {1, 20, 50, 1};
        int[] sixthTenRun = {10, 10};
        int[] seventhTenRun = {10, 2};
        int[] eighthTenRun = {0, 2};
        int[] ninthTenRun = {1, 2};
        int[] tenthTenRun = {1};
        int[] eleventhTenRun = {};
        myArray2.tenRun(firstTenRun);
        myArray2.tenRun(secondTenRun);
        myArray2.tenRun(thirdTenRun);
        myArray2.tenRun(fourthTenRun);
        myArray2.tenRun(fifthTenRun);
        myArray2.tenRun(sixthTenRun);
        myArray2.tenRun(seventhTenRun);
        myArray2.tenRun(eighthTenRun);
        myArray2.tenRun(ninthTenRun);
        myArray2.tenRun(tenthTenRun);
        myArray2.tenRun(eleventhTenRun);

        //notAlone
        int[] firstNotAlone = {1, 2, 3};
        int[] secondNotAlone = {1, 2, 3, 2, 5, 2};
        int[] thirdNotAlone = {3, 4};
        int[] fourthNotAlone = {3, 3};
        int[] fifthNotAlone = {1, 3, 1, 2};
        int[] sixthNotAlone = {3};
        int[] seventhNotAlone = {};
        int[] eighthNotAlone = {7, 1, 6};
        int[] ninthNotAlone = {1, 1, 1};
        int[] tenthNotAlone = {1, 1, 1, 2};
        myArray2.notAlone(firstNotAlone, 2);
        myArray2.notAlone(secondNotAlone, 2);
        myArray2.notAlone(thirdNotAlone, 3);
        myArray2.notAlone(fourthNotAlone, 3);
        myArray2.notAlone(fifthNotAlone, 1);
        myArray2.notAlone(sixthNotAlone, 3);
        myArray2.notAlone(seventhNotAlone, 3);
        myArray2.notAlone(eighthNotAlone, 1);
        myArray2.notAlone(ninthNotAlone, 1);
        myArray2.notAlone(tenthNotAlone, 1);

        //zeroMax
        int[] firstZeroMax = {0, 5, 0, 3};
        int[] secondZeroMax = {0, 4, 0, 3};
        int[] thirdZeroMax = {0, 1, 0};
        int[] fourthZeroMax = {0, 1, 5};
        int[] fifthZeroMax = {0, 2, 0};
        int[] sixthZeroMax = {1};
        int[] seventhZeroMax = {0};
        int[] eighthZeroMax = {};
        int[] ninthZeroMax = {7, 0, 4, 3, 0, 2};
        int[] tenthZeroMax = {7, 0, 4, 3, 0, 1};
        int[] eleventhZeroMax = {7, 0, 4, 3, 0, 0};
        int[] twelfthZeroMax = {7, 0, 1, 0, 0, 7};
        myArray2.zeroMax(firstZeroMax);
        myArray2.zeroMax(secondZeroMax);
        myArray2.zeroMax(thirdZeroMax);
        myArray2.zeroMax(fourthZeroMax);
        myArray2.zeroMax(fifthZeroMax);
        myArray2.zeroMax(sixthZeroMax);
        myArray2.zeroMax(seventhZeroMax);
        myArray2.zeroMax(eighthZeroMax);
        myArray2.zeroMax(ninthZeroMax);
        myArray2.zeroMax(tenthZeroMax);
        myArray2.zeroMax(eleventhZeroMax);
        myArray2.zeroMax(twelfthZeroMax);

        //******https://codingbat.com/java/Array-2******third column

        //centeredAverage
        int[] firstCenteredAverage = {1, 2, 3, 4, 100};
        int[] secondCenteredAverage = {1, 1, 5, 5, 10, 8, 7};
        int[] thirdCenteredAverage = {-10, -4, -2, -4, -2, 0};
        int[] fourthCenteredAverage = {5, 3, 4, 6, 2};
        int[] fifthCenteredAverage = {5, 3, 4, 0, 100};
        int[] sixthCenteredAverage = {100, 0, 5, 3, 4};
        int[] seventhCenteredAverage = {4, 0, 100};
        int[] eighthCenteredAverage = {0, 2, 3, 4, 100};
        int[] ninthCenteredAverage = {1, 1, 100};
        int[] tenthCenteredAverage = {7, 7, 7};
        int[] eleventhCenteredAverage = {1, 7, 8};
        int[] twelfthCenteredAverage = {1, 1, 99, 99};
        int[] thirteenthCenteredAverage = {1000, 0, 1, 99};
        int[] fourteenthCenteredAverage = {4, 4, 4, 4, 5};
        int[] fifteenthCenteredAverage = {4, 4, 4, 1, 5};
        int[] sixteenthCenteredAverage = {6, 4, 8, 12, 3};
        myArray2.centeredAverage(firstCenteredAverage);
        myArray2.centeredAverage(secondCenteredAverage);
        myArray2.centeredAverage(thirdCenteredAverage);
        myArray2.centeredAverage(thirdCenteredAverage);
        myArray2.centeredAverage(fourthCenteredAverage);
        myArray2.centeredAverage(fifthCenteredAverage);
        myArray2.centeredAverage(sixthCenteredAverage);
        myArray2.centeredAverage(seventhCenteredAverage);
        myArray2.centeredAverage(eighthCenteredAverage);
        myArray2.centeredAverage(ninthCenteredAverage);
        myArray2.centeredAverage(tenthCenteredAverage);
        myArray2.centeredAverage(eleventhCenteredAverage);
        myArray2.centeredAverage(twelfthCenteredAverage);
        myArray2.centeredAverage(thirteenthCenteredAverage);
        myArray2.centeredAverage(fourteenthCenteredAverage);
        myArray2.centeredAverage(fifteenthCenteredAverage);
        myArray2.centeredAverage(sixteenthCenteredAverage);

        //has22
        int[] firstHas22 = {1, 2, 2};
        int[] secondHas22 = {1, 2, 1, 2};
        int[] thirdHas22 = {2, 1, 2};
        int[] fourthHas22 = {2, 2, 1, 2};
        int[] fifthHas22 = {1, 3, 2};
        int[] sixthHas22 = {1, 3, 2, 2};
        int[] seventhHas22 = {2, 3, 2, 2};
        int[] eighthHas22 = {4, 2, 4, 2, 2, 5};
        int[] ninthHas22 = {1, 2};
        int[] tenthHas22 = {2, 2};
        int[] eleventhHas22 = {2};
        int[] twelfthHas22 = {};
        int[] thirteenthHas22 = {3, 3, 2, 2};
        int[] fourteenthHas22 = {5, 2, 5, 2};
        myArray2.has22(firstHas22);
        myArray2.has22(secondHas22);
        myArray2.has22(thirdHas22);
        myArray2.has22(fourthHas22);
        myArray2.has22(fifthHas22);
        myArray2.has22(sixthHas22);
        myArray2.has22(seventhHas22);
        myArray2.has22(eighthHas22);
        myArray2.has22(ninthHas22);
        myArray2.has22(tenthHas22);
        myArray2.has22(eleventhHas22);
        myArray2.has22(twelfthHas22);
        myArray2.has22(thirteenthHas22);
        myArray2.has22(fourteenthHas22);

        //more14
        int[] firstMore14 = {1, 4, 1};
        int[] secondMore14 = {1, 4, 1, 4};
        int[] thirdMore14 = {1, 1};
        int[] fourthMore14 = {1, 6, 6};
        int[] fifthMore14 = {1};
        int[] sixthMore14 = {1, 4};
        int[] seventhMore14 = {6, 1, 1};
        int[] eighthMore14 = {1, 6, 4};
        int[] ninthMore14 = {1, 1, 4, 4, 1};
        int[] tenthMore14 = {1, 1, 6, 4, 4, 1};
        int[] eleventhMore14 = {};
        int[] twelfthMore14 = {4, 1, 4, 6};
        int[] thirteenthMore14 = {4, 1, 4, 6, 1};
        int[] fourteenthMore14 = {1, 4, 1, 4, 1, 6};
        myArray2.more14(firstMore14);
        myArray2.more14(secondMore14);
        myArray2.more14(thirdMore14);
        myArray2.more14(fourthMore14);
        myArray2.more14(fifthMore14);
        myArray2.more14(sixthMore14);
        myArray2.more14(seventhMore14);
        myArray2.more14(eighthMore14);
        myArray2.more14(ninthMore14);
        myArray2.more14(tenthMore14);
        myArray2.more14(eleventhMore14);
        myArray2.more14(twelfthMore14);
        myArray2.more14(thirteenthMore14);
        myArray2.more14(fourteenthMore14);


        //fizzArray2
        myArray2.fizzArray2(4);
        myArray2.fizzArray2(10);
        myArray2.fizzArray2(2);
        myArray2.fizzArray2(1);
        myArray2.fizzArray2(0);
        myArray2.fizzArray2(7);
        myArray2.fizzArray2(9);
        myArray2.fizzArray2(11);


        //either24
        int[] firstEither24 = {1, 2, 2};
        int[] secondEither24 = {4, 4, 1};
        int[] thirdEither24 = {4, 4, 1, 2, 2};
        int[] fourthEither24 = {1, 2, 3, 4};
        int[] fifthEither24 = {3, 5, 9};
        int[] sixthEither24 = {1, 2, 3, 4, 4};
        int[] seventhEither24 = {2, 2, 3, 4};
        int[] eighthEither24 = {1, 2, 3, 2, 2, 4};
        int[] ninthEither24 = {1, 2, 3, 2, 2, 4, 4};
        int[] tenthEither24 = {1, 2};
        int[] eleventhEither24 = {2, 2};
        int[] twelfthEither24 = {4, 4};
        int[] thirteenthEither24 = {2};
        int[] fourteenthEither24 = {};
        myArray2.either24(firstEither24);
        myArray2.either24(secondEither24);
        myArray2.either24(thirdEither24);
        myArray2.either24(fourthEither24);
        myArray2.either24(fifthEither24);
        myArray2.either24(sixthEither24);
        myArray2.either24(seventhEither24);
        myArray2.either24(eighthEither24);
        myArray2.either24(ninthEither24);
        myArray2.either24(tenthEither24);
        myArray2.either24(eleventhEither24);
        myArray2.either24(twelfthEither24);
        myArray2.either24(thirteenthEither24);
        myArray2.either24(fourteenthEither24);


        //has12
        int[] firstHas12 = {1, 3, 2};
        int[] secondHas12 = {3, 1, 2};
        int[] thirdHas12 = {3, 1, 4, 5, 2};
        int[] fourthHas12 = {3, 1, 4, 5, 6};
        int[] fifthHas12 = {3, 1, 4, 1, 6, 2};
        int[] sixthHas12 = {2, 1, 4, 1, 6, 2};
        int[] seventhHas12 = {2, 1, 4, 1, 6};
        int[] eighthHas12 = {1};
        int[] ninthHas12 = {2, 1, 3};
        int[] tenthHas12 = {2, 1, 3, 2};
        int[] eleventhHas12 = {2};
        int[] twelfthHas12 = {3, 2};
        int[] thirteenthHas12 = {3, 1, 3, 2};
        int[] fourteenthHas12 = {3, 5, 9};
        int[] fifteenthHas12 = {3, 5, 1};
        int[] sixteenthHas12 = {3, 2, 1};
        int[] seventeenthHas12 = {1, 2};
        myArray2.has12(firstHas12);
        myArray2.has12(secondHas12);
        myArray2.has12(thirdHas12);
        myArray2.has12(fourthHas12);
        myArray2.has12(fifthHas12);
        myArray2.has12(sixthHas12);
        myArray2.has12(seventhHas12);
        myArray2.has12(eighthHas12);
        myArray2.has12(ninthHas12);
        myArray2.has12(tenthHas12);
        myArray2.has12(eleventhHas12);
        myArray2.has12(twelfthHas12);
        myArray2.has12(thirteenthHas12);
        myArray2.has12(fourteenthHas12);
        myArray2.has12(fifteenthHas12);
        myArray2.has12(sixteenthHas12);
        myArray2.has12(seventeenthHas12);

        //twoTwo
        int[] firstTwoTwo = {4, 2, 2, 3};
        int[] secondTwoTwo = {2, 2, 4};
        int[] thirdTwoTwo = {2, 2, 4, 2};
        int[] fourthTwoTwo = {1, 3, 4};
        int[] fifthTwoTwo = {1, 2, 2, 3, 4};
        int[] sixthTwoTwo = {1, 2, 3, 4};
        int[] seventhTwoTwo = {2, 2};
        int[] eighthTwoTwo = {2, 2, 7};
        int[] ninthTwoTwo = {2, 2, 7, 2, 1};
        int[] tenthTwoTwo = {4, 2, 2, 2};
        int[] eleventhTwoTwo = {2, 2, 2};
        int[] twelfthTwoTwo = {1, 2};
        int[] thirteenthTwoTwo = {2};
        int[] fourteenthTwoTwo = {1};
        int[] fifteenthTwoTwo = {};
        int[] sixteenthTwoTwo = {5, 2, 2, 3};
        int[] seventeenthTwoTwo = {2, 2, 5, 2};
        myArray2.twoTwo(firstTwoTwo);
        myArray2.twoTwo(secondTwoTwo);
        myArray2.twoTwo(thirdTwoTwo);
        myArray2.twoTwo(fourthTwoTwo);
        myArray2.twoTwo(fifthTwoTwo);
        myArray2.twoTwo(sixthTwoTwo);
        myArray2.twoTwo(seventhTwoTwo);
        myArray2.twoTwo(eighthTwoTwo);
        myArray2.twoTwo(ninthTwoTwo);
        myArray2.twoTwo(tenthTwoTwo);
        myArray2.twoTwo(eleventhTwoTwo);
        myArray2.twoTwo(twelfthTwoTwo);
        myArray2.twoTwo(thirteenthTwoTwo);
        myArray2.twoTwo(fourteenthTwoTwo);
        myArray2.twoTwo(fifteenthTwoTwo);
        myArray2.twoTwo(sixteenthTwoTwo);
        myArray2.twoTwo(seventeenthTwoTwo);

        //fizzArray3
        myArray2.fizzArray3(5, 10);
        myArray2.fizzArray3(11, 18);
        myArray2.fizzArray3(1, 3);
        myArray2.fizzArray3(1, 2);
        myArray2.fizzArray3(1, 1);
        myArray2.fizzArray3(1000, 1005);

        //pre4
        int[] firstPre4 = {1, 2, 4, 1};
        int[] secondPre4 = {3, 1, 4};
        int[] thirdPre4 = {1, 4, 4};
        int[] fourthPre4 = {1, 4, 4, 2};
        int[] fifthPre4 = {1, 3, 4, 2, 4};
        int[] sixthPre4 = {4, 4};
        int[] seventhPre4 = {3, 3, 4};
        int[] eighthPre4 = {1, 2, 1, 4};
        int[] ninthPre4 = {2, 1, 4, 2};
        int[] tenthPre4 = {2, 1, 2, 1, 4, 2};
        myArray2.pre4(firstPre4);
        myArray2.pre4(secondPre4);
        myArray2.pre4(thirdPre4);
        myArray2.pre4(fourthPre4);
        myArray2.pre4(fifthPre4);
        myArray2.pre4(sixthPre4);
        myArray2.pre4(seventhPre4);
        myArray2.pre4(eighthPre4);
        myArray2.pre4(ninthPre4);
        myArray2.pre4(tenthPre4);

        //zeroFront
        int[] firstZeroFront = {1, 0, 0, 1};
        int[] secondZeroFront = {0, 1, 1, 0, 1};
        int[] thirdZeroFront = {1, 0};
        int[] fourthZeroFront = {0, 1};
        int[] fifthZeroFront = {1, 1, 1, 0};
        int[] sixthZeroFront = {2, 2, 2, 2};
        int[] seventhZeroFront = {0, 0, 1, 0};
        int[] eighthZeroFront = {-1, 0, 0, -1, 0};
        int[] ninthZeroFront = {0, -3, 0, -3};
        int[] tenthZeroFront = {};
        int[] eleventhZeroFront = {9, 9, 0, 9, 0, 9};
        myArray2.zeroFront(firstZeroFront);
        myArray2.zeroFront(secondZeroFront);
        myArray2.zeroFront(thirdZeroFront);
        myArray2.zeroFront(fourthZeroFront);
        myArray2.zeroFront(fifthZeroFront);
        myArray2.zeroFront(sixthZeroFront);
        myArray2.zeroFront(seventhZeroFront);
        myArray2.zeroFront(eighthZeroFront);
        myArray2.zeroFront(ninthZeroFront);
        myArray2.zeroFront(tenthZeroFront);
        myArray2.zeroFront(eleventhZeroFront);

        //evenOdd
        int[] firstEvenOdd = {1, 0, 1, 0, 0, 1, 1};
        int[] secondEvenOdd = {3, 3, 2};
        int[] thirdEvenOdd = {2, 2, 2};
        int[] fourthEvenOdd = {3, 2, 2};
        int[] fifthEvenOdd = {1, 1, 0, 1, 0};
        int[] sixthEvenOdd = {1};
        int[] seventhEvenOdd = {1, 2};
        int[] eighthEvenOdd = {2, 1};
        int[] ninthEvenOdd = {};
        myArray2.evenOdd(firstEvenOdd);
        myArray2.evenOdd(secondEvenOdd);
        myArray2.evenOdd(thirdEvenOdd);
        myArray2.evenOdd(fourthEvenOdd);
        myArray2.evenOdd(fifthEvenOdd);
        myArray2.evenOdd(sixthEvenOdd);
        myArray2.evenOdd(seventhEvenOdd);
        myArray2.evenOdd(eighthEvenOdd);
        myArray2.evenOdd(ninthEvenOdd);

    }
}

package array1;

public class App {

    public static void main(String[] args) {

        Array1 myArray = new Array1();
        //******https://codingbat.com/java/Array-1******first column

        //firstLast6
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
        myArray.firstLast6(firstFirstLast6);
        myArray.firstLast6(secondFirstLast6);
        myArray.firstLast6(thirdFirstLast6);
        myArray.firstLast6(fourthFirstLast6);
        myArray.firstLast6(fifthFirstLast6);
        myArray.firstLast6(sixthFirstLast6);
        myArray.firstLast6(seventhFirstLast6);
        myArray.firstLast6(eighthFirstLast6);
        myArray.firstLast6(ninthFirstLast6);
        myArray.firstLast6(tenthFirstLast6);
        myArray.firstLast6(eleventhFirstLast6);
        myArray.firstLast6(twelfthFirstLast6);
        myArray.firstLast6(thirteenthFirstLast6);

        //commonEnd
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
        myArray.commonEnd(firstCommonEndA, firstCommonEndB);
        myArray.commonEnd(secondCommonEndA, secondCommonEndB);
        myArray.commonEnd(thirdCommonEndA, thirdCommonEndB);
        myArray.commonEnd(fourthCommonEndA, fourthCommonEndB);
        myArray.commonEnd(fifthCommonEndA, fifthCommonEndB);

        //reverse3
        int[] firstReverse3 = {1, 2, 3};
        int[] secondReverse3 = {5, 11, 9};
        int[] thirdReverse3 = {7, 0, 0};
        int[] fourthReverse3 = {2, 1, 2};
        int[] fifthReverse3 = {1, 2, 1};
        int[] sixthReverse3 = {2, 11, 3};
        int[] eighthReverse3 = {0, 6, 5};
        int[] ninthReverse3 = {7, 2, 3};
        myArray.reverse3(firstReverse3);
        myArray.reverse3(secondReverse3);
        myArray.reverse3(thirdReverse3);
        myArray.reverse3(fourthReverse3);
        myArray.reverse3(fifthReverse3);
        myArray.reverse3(sixthReverse3);
        myArray.reverse3(eighthReverse3);
        myArray.reverse3(ninthReverse3);

        //middleWay
        int[] firstMiddleWayA = {1, 2, 3};
        int[] firstMiddleWayB = {4, 5, 6};
        int[] secondMiddleWayA = {7, 7, 7};
        int[] secondMiddleWayB = {3, 8, 0};
        int[] thirdMiddleWayA = {5, 2, 9};
        int[] thirdMiddleWayB = {1, 4, 5};
        int[] fourthMiddleWayA = {1, 9, 7};
        int[] fourthMiddleWayB = {4, 8, 8};
        int[] fifthMiddleWayA = {1, 2, 3};
        int[] fifthMiddleWayB = {3, 1, 4};
        int[] sixthMiddleWayA = {1, 2, 3};
        int[] sixthMiddleWayB = {4, 1, 1};
        myArray.middleWay(firstMiddleWayA, firstMiddleWayB);
        myArray.middleWay(secondMiddleWayA, secondMiddleWayB);
        myArray.middleWay(thirdMiddleWayA, thirdMiddleWayB);
        myArray.middleWay(fourthMiddleWayA, fourthMiddleWayB);
        myArray.middleWay(fifthMiddleWayA, fifthMiddleWayB);
        myArray.middleWay(sixthMiddleWayA, sixthMiddleWayB);

        //no23
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
        myArray.no23(firstNo23);
        myArray.no23(secondNo23);
        myArray.no23(thirdNo23);
        myArray.no23(fourthNo23);
        myArray.no23(fifthNo23);
        myArray.no23(sixthNo23);
        myArray.no23(eighthNo23);
        myArray.no23(ninthNo23);
        myArray.no23(tenthNo23);
        myArray.no23(eleventhNo23);
        myArray.no23(twelfthNo23);

        //fix23
        int[] firstFix23 = {1, 2, 3};
        int[] secondFix23 = {2, 3, 5};
        int[] thirdFix23 = {1, 2, 1};
        int[] fourthFix23 = {3, 2, 1};
        int[] fifthFix23 = {2, 2, 3};
        int[] sixthFix23 = {2, 3, 3};
        myArray.fix23(firstFix23);
        myArray.fix23(secondFix23);
        myArray.fix23(thirdFix23);
        myArray.fix23(fourthFix23);
        myArray.fix23(fifthFix23);
        myArray.fix23(sixthFix23);

        //makeMiddle
        int[] firstMakeMiddle = {1, 2, 3, 4};
        int[] secondMakeMiddle = {7, 1, 2, 3, 4, 9};
        int[] thirdMakeMiddle = {1, 2};
        int[] fourthMakeMiddle = {5, 2, 4, 7};
        int[] fifthMakeMiddle = {9, 0, 4, 3, 9, 1};
        myArray.makeMiddle(firstMakeMiddle);
        myArray.makeMiddle(secondMakeMiddle);
        myArray.makeMiddle(thirdMakeMiddle);
        myArray.makeMiddle(fourthMakeMiddle);
        myArray.makeMiddle(fifthMakeMiddle);

        //midThree
        int[] firstMidThree = {1, 2, 3, 4, 5};
        int[] secondMidThree = {8, 6, 7, 5, 3, 0, 9};
        int[] thirdMidThree = {1, 2, 3};
        myArray.midThree(firstMidThree);
        myArray.midThree(secondMidThree);
        myArray.midThree(thirdMidThree);

        //unlucky1
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
        myArray.unlucky1(firstUnlucky1);
        myArray.unlucky1(secondUnlucky1);
        myArray.unlucky1(thirdUnlucky1);
        myArray.unlucky1(fourthUnlucky1);
        myArray.unlucky1(fifthUnlucky1);
        myArray.unlucky1(sixthUnlucky1);
        myArray.unlucky1(seventhUnlucky1);
        myArray.unlucky1(eighthUnlucky1);
        myArray.unlucky1(ninthUnlucky1);
        myArray.unlucky1(tenthUnlucky1);
        myArray.unlucky1(eleventhUnlucky1);
        myArray.unlucky1(twelfthUnlucky1);
        myArray.unlucky1(thirteenthUnlucky1);
        myArray.unlucky1(fourteenthUnlucky1);
        myArray.unlucky1(fifteenthUnlucky1);
        myArray.unlucky1(sixteenthUnlucky1);
        myArray.unlucky1(eighteenthUnlucky1);
        myArray.unlucky1(nineteenthUnlucky1);
        myArray.unlucky1(twentiethUnlucky1);

        //sameFirstLast
        int[] firstSameFirstLast = {1, 2, 3};
        int[] secondSameFirstLast = {1, 2, 3, 1};
        int[] thirdSameFirstLast = {1, 2, 1};
        int[] fourthSameFirstLast = {7};
        int[] fifthSameFirstLast = {};
        int[] sixthSameFirstLast = {1, 2, 3, 4, 5, 1};
        int[] seventhSameFirstLast = {1, 2, 3, 4, 5, 13};
        int[] eighthSameFirstLast = {13, 2, 3, 4, 5, 13};
        int[] ninthSameFirstLast = {7, 7};
        myArray.sameFirstLast(firstSameFirstLast);
        myArray.sameFirstLast(secondSameFirstLast);
        myArray.sameFirstLast(thirdSameFirstLast);
        myArray.sameFirstLast(fourthSameFirstLast);
        myArray.sameFirstLast(fifthSameFirstLast);
        myArray.sameFirstLast(sixthSameFirstLast);
        myArray.sameFirstLast(seventhSameFirstLast);
        myArray.sameFirstLast(eighthSameFirstLast);
        myArray.sameFirstLast(ninthSameFirstLast);

        //sum3
        int[] firstSum3 = {1, 2, 3};
        int[] secondSum3 = {5, 11, 2};
        int[] thirdSum3 = {7, 0, 0};
        int[] fourthSum3 = {1, 2, 1};
        int[] fifthSum3 = {1, 1, 1};
        int[] sixthSum3 = {2, 7, 2};
        myArray.sum3(firstSum3);
        myArray.sum3(secondSum3);
        myArray.sum3(thirdSum3);
        myArray.sum3(fourthSum3);
        myArray.sum3(fifthSum3);
        myArray.sum3(sixthSum3);

        //maxEnd3
        int[] firstMaxEnd3 = {1, 2, 3};
        int[] secondMaxEnd3 = {11, 5, 9};
        int[] thirdMaxEnd3 = {2, 11, 3};
        int[] fourthMaxEnd3 = {11, 3, 3};
        int[] fifthMaxEnd3 = {3, 11, 11};
        int[] eighthMaxEnd3 = {2, 2, 2};
        int[] ninthMaxEnd3 = {2, 11, 2};
        int[] tenthMaxEnd3 = {0, 0, 1};
        myArray.maxEnd3(firstMaxEnd3);
        myArray.maxEnd3(secondMaxEnd3);
        myArray.maxEnd3(thirdMaxEnd3);
        myArray.maxEnd3(fourthMaxEnd3);
        myArray.maxEnd3(fifthMaxEnd3);
        myArray.maxEnd3(eighthMaxEnd3);
        myArray.maxEnd3(ninthMaxEnd3);
        myArray.maxEnd3(tenthMaxEnd3);

        //makeEnds
        int[] firstMakeEnds = {1, 2, 3};
        int[] secondMakeEnds = {1, 2, 3, 4};
        int[] thirdMakeEnds = {7, 4, 6, 2};
        int[] fourthMakeEnds = {1, 2, 2, 2, 2, 2, 2, 3};
        int[] fifthMakeEnds = {7, 4};
        int[] sixthMakeEnds = {7};
        int[] seventhMakeEnds = {5, 2, 9};
        int[] eighthMakeEnds = {2, 3, 4, 1};
        myArray.makeEnds(firstMakeEnds);
        myArray.makeEnds(secondMakeEnds);
        myArray.makeEnds(thirdMakeEnds);
        myArray.makeEnds(fourthMakeEnds);
        myArray.makeEnds(fifthMakeEnds);
        myArray.makeEnds(sixthMakeEnds);
        myArray.makeEnds(seventhMakeEnds);
        myArray.makeEnds(eighthMakeEnds);

        //makeLast
        int[] firstMakeLast = {4, 5, 6};
        int[] secondMakeLast = {1, 2};
        int[] thirdMakeLast = {3};
        int[] fourthMakeLast = {0};
        int[] fifthMakeLast = {7, 7, 7};
        int[] sixthMakeLast = {3, 1, 4};
        int[] seventhMakeLast = {1, 2, 3, 4};
        int[] eighthMakeLast = {1, 2, 3, 0};
        int[] ninthMakeLast = {2, 4};
        myArray.makeLast(firstMakeLast);
        myArray.makeLast(secondMakeLast);
        myArray.makeLast(thirdMakeLast);
        myArray.makeLast(fourthMakeLast);
        myArray.makeLast(fifthMakeLast);
        myArray.makeLast(sixthMakeLast);
        myArray.makeLast(seventhMakeLast);
        myArray.makeLast(eighthMakeLast);
        myArray.makeLast(ninthMakeLast);

        //start1
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
        myArray.start1(firstStartA, firstStartB);
        myArray.start1(secondStartA, secondStartB);
        myArray.start1(thirdStartA, thirdStartB);
        myArray.start1(fourthStartA, fourthStartB);
        myArray.start1(fifthStartA, fifthStartB);
        myArray.start1(sixthStartA, sixthStartB);
        myArray.start1(seventhStartA, seventhStartB);
        myArray.start1(eighthStartA, eighthStartB);
        myArray.start1(ninthStartA, ninthStartB);
        myArray.start1(tenthStartA, tenthStartB);

        //plusTwo
        int[] firstPlusTwoA = {1, 2};
        int[] firstPlusTwoB = {3, 4};
        int[] secondPlusTwoA = {4, 4};
        int[] secondPlusTwoB = {2, 2};
        int[] thirdPlusTwoA = {9, 2};
        int[] thirdPlusTwoB = {3, 4};
        myArray.plusTwo(firstPlusTwoA, firstPlusTwoB);
        myArray.plusTwo(secondPlusTwoA, secondPlusTwoB);
        myArray.plusTwo(thirdPlusTwoA, thirdPlusTwoB);

        //maxTriple
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
        myArray.maxTriple(firstMaxTriple);
        myArray.maxTriple(secondMaxTriple);
        myArray.maxTriple(thirdMaxTriple);
        myArray.maxTriple(fourthMaxTriple);
        myArray.maxTriple(fifthMaxTriple);
        myArray.maxTriple(sixthMaxTriple);
        myArray.maxTriple(seventhMaxTriple);
        myArray.maxTriple(eighthMaxTriple);
        myArray.maxTriple(ninthMaxTriple);
        myArray.maxTriple(tenthMaxTriple);

        //make2
        int[] firstMake2A = {4, 5};
        int[] firstMake2B = {1, 2, 3};
        int[] secondMake2A = {4};
        int[] secondMake2B = {1, 2, 3};
        int[] thirdMake2A = {};
        int[] thirdMake2B = {1, 2};
        int[] fourthMake2A = {1, 2};
        int[] fourthMake2B = {};
        int[] fifthMake2A = {3};
        int[] fifthMake2B = {1, 2, 3};
        int[] sixthMake2A = {3};
        int[] sixthMake2B = {1};
        int[] seventhMake2A = {3, 1, 4};
        int[] seventMake2B = {};
        int[] eighthMake2A = {1};
        int[] eighthMake2B = {1};
        int[] ninthMake2A = {1, 2, 3};
        int[] ninthMake2B = {7, 8};
        int[] tenthMake2A = {7, 8};
        int[] tenthMake2B = {1, 2, 3};
        int[] eleventhMake2A = {7};
        int[] eleventhMake2B = {1, 2, 3};
        int[] twelfthMake2A = {5, 4};
        int[] twelfthMake2B = {2, 3, 7};
        myArray.make2(firstMake2A, firstMake2B);
        myArray.make2(secondMake2A, secondMake2B);
        myArray.make2(thirdMake2A, thirdMake2B);
        myArray.make2(fourthMake2A, fourthMake2B);
        myArray.make2(fifthMake2A, fifthMake2B);
        myArray.make2(sixthMake2A, sixthMake2B);
        myArray.make2(seventhMake2A, seventMake2B);
        myArray.make2(eighthMake2A, eighthMake2B);
        myArray.make2(ninthMake2A, ninthMake2B);
        myArray.make2(tenthMake2A, tenthMake2B);
        myArray.make2(eleventhMake2A, eleventhMake2B);
        myArray.make2(twelfthMake2A, twelfthMake2B);

        //makePi
        myArray.makePi();

        //rotateLeft3
        int[] firstRotateLeft3 = {1, 2, 3};
        int[] secondRotateLeft3 = {5, 11, 9};
        int[] thirdRotateLeft3 = {7, 0, 0};
        int[] fourthRotateLeft3 = {1, 2, 1};
        int[] fifthRotateLeft3 = {0, 0, 1};
        myArray.rotateLeft3(firstRotateLeft3);
        myArray.rotateLeft3(secondRotateLeft3);
        myArray.rotateLeft3(thirdRotateLeft3);
        myArray.rotateLeft3(fourthRotateLeft3);
        myArray.rotateLeft3(fifthRotateLeft3);

        //sum2
        int[] firstSum2 = {1, 2, 3};
        int[] secondSum2 = {1, 1};
        int[] thirdSum2 = {1, 1, 1, 1};
        int[] fourthSum2 = {1, 2};
        int[] fifthSum2 = {1};
        int[] sixthSum2 = {};
        int[] seventhSum2 = {4, 5, 6};
        int[] eighthSum2 = {4};
        myArray.sum2(firstSum2);
        myArray.sum2(secondSum2);
        myArray.sum2(thirdSum2);
        myArray.sum2(fourthSum2);
        myArray.sum2(fifthSum2);
        myArray.sum2(sixthSum2);
        myArray.sum2(seventhSum2);
        myArray.sum2(eighthSum2);

        //has23
        int[] firstHas23 = {2, 5};
        int[] secondHas23 = {4, 3};
        int[] thirdHas23 = {4, 5};
        int[] fourthHas23 = {2, 2};
        int[] fifthHas23 = {3, 2};
        int[] sixthHas23 = {3, 3};
        int[] seventhHas23 = {7, 7};
        int[] eighthHas23 = {3, 9};
        int[] ninthHas23 = {9, 5};
        myArray.has23(firstHas23);
        myArray.has23(secondHas23);
        myArray.has23(thirdHas23);
        myArray.has23(fourthHas23);
        myArray.has23(fifthHas23);
        myArray.has23(sixthHas23);
        myArray.has23(seventhHas23);
        myArray.has23(eighthHas23);
        myArray.has23(ninthHas23);

        //double23
        int[] firstDouble23 = {2, 2};
        int[] secondDouble23 = {3, 3};
        int[] thirdDouble23 = {2, 3};
        int[] fourthDouble23 = {3, 2};
        int[] fifthDouble23 = {4, 5};
        int[] sixthDouble23 = {2};
        int[] seventhDouble23 = {3};
        int[] eighthDouble23 = {};
        int[] ninthDouble23 = {3, 4};
        myArray.double23(firstDouble23);
        myArray.double23(secondDouble23);
        myArray.double23(thirdDouble23);
        myArray.double23(fourthDouble23);
        myArray.double23(fifthDouble23);
        myArray.double23(sixthDouble23);
        myArray.double23(seventhDouble23);
        myArray.double23(eighthDouble23);
        myArray.double23(ninthDouble23);

        //biggerTwo
        int[] firstBiggerTwoA = {1, 2};
        int[] firstBiggerTwoB = {3, 4};
        int[] secondBiggerTwoA = {3, 4};
        int[] secondBiggerTwoB = {1, 2};
        int[] thirdBiggerTwoA = {1, 1};
        int[] thirdBiggerTwoB = {1, 2};
        int[] fourthBiggerTwoA = {2, 1};
        int[] fourthBiggerTwoB = {1, 1};
        int[] sixthBiggerTwoA = {2, 2};
        int[] sixthBiggerTwoB = {1, 3};
        int[] seventhBiggerTwoA = {1, 3};
        int[] seventhBiggerTwoB = {2, 2};
        int[] eighthBiggerTwoA = {6, 7};
        int[] eighthBiggerTwoB = {3, 1};
        myArray.biggerTwo(firstBiggerTwoA, firstBiggerTwoB);
        myArray.biggerTwo(secondBiggerTwoA, secondBiggerTwoB);
        myArray.biggerTwo(thirdBiggerTwoA, thirdBiggerTwoB);
        myArray.biggerTwo(fourthBiggerTwoA, fourthBiggerTwoB);
        myArray.biggerTwo(sixthBiggerTwoA, sixthBiggerTwoB);
        myArray.biggerTwo(seventhBiggerTwoA, seventhBiggerTwoB);
        myArray.biggerTwo(eighthBiggerTwoA, eighthBiggerTwoB);

        //swapEnds
        int[] firstSwapEnds = {1, 2, 3, 4};
        int[] secondSwapEnds = {1, 2, 3};
        int[] thirdSwapEnds = {8, 6, 7, 9, 5};
        int[] fourthSwapEnds = {3, 1, 4, 1, 5, 9};
        int[] fifthSwapEnds = {1, 2};
        int[] sixthSwapEnds = {1};
        myArray.swapEnds(firstSwapEnds);
        myArray.swapEnds(secondSwapEnds);
        myArray.swapEnds(thirdSwapEnds);
        myArray.swapEnds(fourthSwapEnds);
        myArray.swapEnds(fifthSwapEnds);
        myArray.swapEnds(sixthSwapEnds);

        //frontPiece
        int[] firstFrontPiece = {1, 2, 3};
        int[] secondFrontPiece = {1, 2};
        int[] thirdFrontPiece = {1};
        int[] fourthFrontPiece = {};
        int[] fifthFrontPiece = {6, 5, 0};
        int[] sixthFrontPiece = {6, 5};
        int[] seventhFrontPiece = {3, 1, 4, 1, 5};
        int[] eighthFrontPiece = {6};
        myArray.frontPiece(firstFrontPiece);
        myArray.frontPiece(secondFrontPiece);
        myArray.frontPiece(thirdFrontPiece);
        myArray.frontPiece(fourthFrontPiece);
        myArray.frontPiece(fifthFrontPiece);
        myArray.frontPiece(sixthFrontPiece);
        myArray.frontPiece(seventhFrontPiece);
        myArray.frontPiece(eighthFrontPiece);

        //front11
        int[] firstFront11A = {1, 2, 3};
        int[] firstFront11B = {7, 9, 8};
        int[] secondFront11A = {1};
        int[] secondFront11B = {2};
        int[] thirdFront11A = {1, 7};
        int[] thirdFront11B = {};
        int[] fourthFront11A = {};
        int[] fourthFront11B = {2, 8};
        int[] fifthFront11A = {};
        int[] fifthFront11B = {};
        int[] sixthFront11A = {3};
        int[] sixthFront11B = {1, 4, 1, 9};
        int[] seventhFront11A = {1, 4, 1, 9};
        int[] seventhFront11B = {};
        myArray.front11(firstFront11A, firstFront11B);
        myArray.front11(secondFront11A, secondFront11B);
        myArray.front11(thirdFront11A, thirdFront11B);
        myArray.front11(fourthFront11A, fourthFront11B);
        myArray.front11(fifthFront11A, fifthFront11B);
        myArray.front11(sixthFront11A, sixthFront11B);
        myArray.front11(seventhFront11A, seventhFront11B);
    }
}

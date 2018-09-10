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

    }
}

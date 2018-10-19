package array3;

public class App {

    public static void main(String[] args) {
        Array3 myArray3 = new Array3();

        //******https://codingbat.com/java/Array-3******first column

        //maxSpan
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
        myArray3.maxSpan(firstMaxSpan);
        myArray3.maxSpan(secondMaxSpan);
        myArray3.maxSpan(thirdMaxSpan);
        myArray3.maxSpan(fourthMaxSpan);
        myArray3.maxSpan(fifthMaxSpan);
        myArray3.maxSpan(sixthMaxSpan);
        myArray3.maxSpan(seventhMaxSpan);
        myArray3.maxSpan(eighthMaxSpan);
        myArray3.maxSpan(ninthMaxSpan);
        myArray3.maxSpan(tenthMaxSpan);

        //canBalance
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
        myArray3.canBalance(firstCanBalance);
        myArray3.canBalance(secondCanBalance);
        myArray3.canBalance(thirdCanBalance);
        myArray3.canBalance(fourthCanBalance);
        myArray3.canBalance(fifthCanBalance);
        myArray3.canBalance(sixthCanBalance);
        myArray3.canBalance(seventhCanBalance);
        myArray3.canBalance(eighthCanBalance);
        myArray3.canBalance(ninthCanBalance);
        myArray3.canBalance(tenthCanBalance);
        myArray3.canBalance(eleventhCanBalance);

        //seriesUp
        myArray3.seriesUp(3);
        myArray3.seriesUp(4);
        myArray3.seriesUp(2);
        myArray3.seriesUp(1);
        myArray3.seriesUp(0);
        myArray3.seriesUp(6);

        //******https://codingbat.com/java/Array-3******second column

        //fix34
        int[] firstFix34 = {1, 3, 1, 4};
        int[] secondFix34 = {1, 3, 1, 4, 4, 3, 1};
        int[] thirdFix34 = {3, 2, 2, 4};
        int[] fourthFix34 = {3, 2, 3, 2, 4, 4};
        int[] fifthFix34 = {2, 3, 2, 3, 2, 4, 4};
        int[] sixthFix34 = {5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5};
        int[] seventhFix34 = {3, 1, 4};
        int[] eighthFix34 = {3, 4, 1};
        int[] ninthFix34 = {1, 1, 1};
        int[] tenthFix34 = {1};
        int[] eleventhFix34 = {};
        int[] twelfthFix34 = {7, 3, 7, 7, 4};
        int[] thirteenthFix34 = {3, 1, 4, 3, 1, 4};
        int[] fourteenthFix34 = {3, 1, 1, 3, 4, 4};
        myArray3.fix34(firstFix34);
        myArray3.fix34(secondFix34);
        myArray3.fix34(thirdFix34);
        myArray3.fix34(fourthFix34);
        myArray3.fix34(fifthFix34);
        myArray3.fix34(sixthFix34);
        myArray3.fix34(seventhFix34);
        myArray3.fix34(eighthFix34);
        myArray3.fix34(ninthFix34);
        myArray3.fix34(tenthFix34);
        myArray3.fix34(eleventhFix34);
        myArray3.fix34(twelfthFix34);
        myArray3.fix34(thirteenthFix34);
        myArray3.fix34(fourteenthFix34);

        //linearIn
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
        myArray3.linearIn(firstLinearInOuter, firstLinearInInner);
        myArray3.linearIn(secondLinearInOuter, secondLinearInInner);
        myArray3.linearIn(thirdLinearInOuter, thirdLinearInInner);
        myArray3.linearIn(fourthLinearInOuter, fourthLinearInInner);
        myArray3.linearIn(fifthLinearInOuter, fifthLinearInInner);
        myArray3.linearIn(sixthLinearInOuter, sixthLinearInInner);
        myArray3.linearIn(seventhLinearInOuter, seventhLinearInInner);
        myArray3.linearIn(eighthLinearInOuter, eighthLinearInInner);
        myArray3.linearIn(ninthLinearInOuter, ninthLinearInInner);
        myArray3.linearIn(tenthLinearInOuter, tenthLinearInInner);
        myArray3.linearIn(eleventhLinearInOuter, eleventhLinearInInner);
        myArray3.linearIn(twelfthLinearInOuter, twelfthLinearInInner);
        myArray3.linearIn(thirteenthLinearInOuter, thirteenthLinearInInner);

        //maxMirror
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
        myArray3.maxMirror(firstMaxMirror);
        myArray3.maxMirror(secondMaxMirror);
        myArray3.maxMirror(thirdMaxMirror);
        myArray3.maxMirror(fourthMaxMirror);
        myArray3.maxMirror(fifthMaxMirror);
        myArray3.maxMirror(sixthMaxMirror);
        myArray3.maxMirror(seventhMaxMirror);
        myArray3.maxMirror(eighthMaxMirror);
        myArray3.maxMirror(ninthMaxMirror);
        myArray3.maxMirror(tenthMaxMirror);
        myArray3.maxMirror(eleventhMaxMirror);
        myArray3.maxMirror(twelfthMaxMirror);
        myArray3.maxMirror(thirteenthMaxMirror);
        myArray3.maxMirror(fourteenthMaxMirror);
        myArray3.maxMirror(fifteenthMaxMirror);

        //******https://codingbat.com/java/Array-3******third column

        //fix45
        int[] firstFix45 = {5, 4, 9, 4, 9, 5};
        int[] secondFix45 = {1, 4, 1, 5};
        int[] thirdFix45 = {1, 4, 1, 5, 5, 4, 1};
        int[] fourthFix45 = {4, 9, 4, 9, 5, 5, 4, 9, 5};
        int[] fifthFix45 = {5, 5, 4, 1, 4, 1};
        int[] sixthFix45 = {4, 2, 2, 5};
        int[] seventhFix45 = {4, 2, 4, 2, 5, 5};
        int[] eighthFix45 = {4, 2, 4, 5, 5};
        int[] ninthFix45 = {1, 1, 1};
        int[] tenthFix45 = {4, 5};
        int[] eleventhFix45 = {5, 4, 1};
        int[] twelfthFix45 = {};
        int[] thirteenthFix45 = {5, 4, 5, 4, 1};
        int[] fourteenthFix45 = {4, 5, 4, 1, 5};
        int[] fifteenthFix45 = {3, 4, 5};
        int[] sixteenthFix45 = {4, 1, 5};
        int[] seventeenthFix45 = {5, 4, 1};
        int[] eighteenthFix45 = {2, 4, 2, 5};
        myArray3.fix45(firstFix45);
        myArray3.fix45(secondFix45);
        myArray3.fix45(thirdFix45);
        myArray3.fix45(fourthFix45);
        myArray3.fix45(fifthFix45);
        myArray3.fix45(sixthFix45);
        myArray3.fix45(seventhFix45);
        myArray3.fix45(eighthFix45);
        myArray3.fix45(ninthFix45);
        myArray3.fix45(tenthFix45);
        myArray3.fix45(eleventhFix45);
        myArray3.fix45(twelfthFix45);
        myArray3.fix45(thirteenthFix45);
        myArray3.fix45(fourteenthFix45);
        myArray3.fix45(fifteenthFix45);
        myArray3.fix45(sixteenthFix45);
        myArray3.fix45(seventeenthFix45);
        myArray3.fix45(eighteenthFix45);

        //squareUp
        myArray3.squareUp(3);
        myArray3.squareUp(2);
        myArray3.squareUp(4);
        myArray3.squareUp(1);
        myArray3.squareUp(0);
        myArray3.squareUp(6);

        //countClumps
        int[] firstCountClumps = {1, 2, 2, 3, 4, 4};
        int[] secondCountClumps = {1, 1, 2, 1, 1};
        int[] thirdCountClumps = {1, 1, 1, 1, 1};
        int[] fourthCountClumps = {1, 2, 3};
        int[] fifthCountClumps = {2, 2, 1, 1, 1, 2, 1, 1, 2, 2};
        int[] sixthCountClumps = {0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2};
        int[] seventhCountClumps = {0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2};
        int[] eighthCountClumps = {0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2};
        int[] ninthCountClumps = {};
        myArray3.countClumps(firstCountClumps);
        myArray3.countClumps(secondCountClumps);
        myArray3.countClumps(thirdCountClumps);
        myArray3.countClumps(fourthCountClumps);
        myArray3.countClumps(fifthCountClumps);
        myArray3.countClumps(sixthCountClumps);
        myArray3.countClumps(seventhCountClumps);
        myArray3.countClumps(eighthCountClumps);
        myArray3.countClumps(ninthCountClumps);

    }
}

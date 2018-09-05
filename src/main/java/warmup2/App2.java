package warmup2;

public class App2 {

    public static void main(String[] args) {

        Imp2 imp2 = new Imp2();

        //******https://codingbat.com/java/Warmup-2******first column

        //stringTimes
        imp2.stringTimes("Hi", 2);
        imp2.stringTimes("Hi", 3);
        imp2.stringTimes("Hi", 1);
        imp2.stringTimes("Hi", 0);
        imp2.stringTimes("Hi", 5);
        imp2.stringTimes("Oh Boy!", 2);
        imp2.stringTimes("x", 4);
        imp2.stringTimes("", 4);
        imp2.stringTimes("code", 2);
        imp2.stringTimes("code", 3);

        //doubleX
        imp2.doubleX("axxbb");
        imp2.doubleX("axaxax");
        imp2.doubleX("xxxxx");
        imp2.doubleX("xaxxx");
        imp2.doubleX("aaaax");
        imp2.doubleX("");
        imp2.doubleX("abc");
        imp2.doubleX("x");
        imp2.doubleX("xx");
        imp2.doubleX("xax");
        imp2.doubleX("xaxx");

        //last2
        imp2.last2("hixxhi");
        imp2.last2("xaxxaxaxx");
        imp2.last2("axxxaaxx");
        imp2.last2("xxaxxaxxaxx");
        imp2.last2("xaxaxaxx");
        imp2.last2("xxxx");
        imp2.last2("13121312");
        imp2.last2("11212");
        imp2.last2("13121311");
        imp2.last2("1717171");
        imp2.last2("hi");
        imp2.last2("h");
        imp2.last2("");

        //array123
        int [] firstForArray123 = {1, 1, 2, 3, 1};
        imp2.array123(firstForArray123);
        int [] secondForArray123 = {1, 1, 2, 4, 1};
        imp2.array123(secondForArray123);
        int [] thirdForArray123 = {1, 1, 2, 1, 2, 3};
        imp2.array123(thirdForArray123);
        int [] fourthForArray123 = {1, 1, 2, 1, 2, 1};
        imp2.array123(fourthForArray123);
        int [] fifthForArray123 = {1, 2, 3, 1, 2, 3};
        imp2.array123(fifthForArray123);
        int [] sixthForArray123 = {1, 2, 3};
        imp2.array123(sixthForArray123);
        int [] seventhForArray123 = {1, 1, 1};
        imp2.array123(seventhForArray123);
        int [] eighthForArray123 = {1, 2};
        imp2.array123(eighthForArray123);
        int [] ninthForArray123 = {1};
        imp2.array123(ninthForArray123);
        int [] tenthForArray123 = {};
        imp2.array123(tenthForArray123);

        //altPairs
        imp2.altPairs("kitten");
        imp2.altPairs("Chocolate");
        imp2.altPairs("CodingHorror");
        imp2.altPairs("yak");
        imp2.altPairs("ya");
        imp2.altPairs("y");
        imp2.altPairs("");
        imp2.altPairs("ThisThatTheOther");

        //noTriples
        int[] firstForNoTriples = {1, 1, 2, 2, 1};
        int[] secondForNoTriples = {1, 1, 2, 2, 2, 1};
        int[] thirdForNoTriples = {1, 1, 1, 2, 2, 2, 1};
        int[] fourthForNoTriples = {1, 1, 2, 2, 1, 2, 1};
        int[] fifthForNoTriples = {1, 2, 1};
        int[] sixthForNoTriples = {1, 1, 1};
        int[] seventhForNoTriples = {1, 1};
        int[] eighthForNoTriples = {1};
        int[] ninthForNoTriples = {};

        imp2.noTriples(firstForNoTriples);
        imp2.noTriples(secondForNoTriples);
        imp2.noTriples(thirdForNoTriples);
        imp2.noTriples(fourthForNoTriples);
        imp2.noTriples(fifthForNoTriples);
        imp2.noTriples(sixthForNoTriples);
        imp2.noTriples(seventhForNoTriples);
        imp2.noTriples(eighthForNoTriples);
        imp2.noTriples(ninthForNoTriples);


        //******https://codingbat.com/java/Warmup-2******second column

        //frontTimes
        imp2.frontTimes("Chocolate", 2);
        imp2.frontTimes("Chocolate", 3);
        imp2.frontTimes("Abc", 3);
        imp2.frontTimes("Ab", 4);
        imp2.frontTimes("A", 4);
        imp2.frontTimes("", 4);
        imp2.frontTimes("Abc", 0);


        //stringBits
        imp2.stringBits("Hello");
        imp2.stringBits("Hi");
        imp2.stringBits("Heeololeo");
        imp2.stringBits("HiHiHi");
        imp2.stringBits("");
        imp2.stringBits("Greetings");
        imp2.stringBits("Chocoate");
        imp2.stringBits("pi");
        imp2.stringBits("Hello Kitten");
        imp2.stringBits("hxaxpxpxy");


        //arrayCount9
        int[] firstForArrayCount9 = {1, 2, 9};
        int[] secondForArrayCount9 = {1, 9, 9};
        int[] thirdForArrayCount9 = {1, 9, 9, 3, 9};
        int[] fourthForArrayCount9 = {1, 2, 3};
        int[] fifthForArrayCount9 = {};
        int[] sixthForArrayCount9 = {4, 2, 4, 3, 1};
        int[] seventhForArrayCount9 = {9, 2, 4, 3, 1};
        imp2.arrayCount9(firstForArrayCount9);
        imp2.arrayCount9(secondForArrayCount9);
        imp2.arrayCount9(thirdForArrayCount9);
        imp2.arrayCount9(fourthForArrayCount9);
        imp2.arrayCount9(fifthForArrayCount9);
        imp2.arrayCount9(sixthForArrayCount9);
        imp2.arrayCount9(seventhForArrayCount9);


        //stringMatch
        imp2.stringMatch("xxcaazz", "xxbaaz");
        imp2.stringMatch("abc", "abc");
        imp2.stringMatch("abc", "axc");
        imp2.stringMatch("hello", "he");
        imp2.stringMatch("he", "hello");
        imp2.stringMatch("h", "hello");
        imp2.stringMatch("", "hello");
        imp2.stringMatch("aabbccdd", "abbbxxd");
        imp2.stringMatch("aaxxaaxx", "iaxxai");
        imp2.stringMatch("iaxxai", "aaxxaaxx");


        //stringYak
        imp2.stringYak("yakpak");
        imp2.stringYak("pakyak");
        imp2.stringYak("yak123ya");
        imp2.stringYak("yak");
        imp2.stringYak("yakxxxyak");
        imp2.stringYak("HiyakHi");
        imp2.stringYak("xxxyakyyyakzzz");


        //has271
        int [] firstForHas271 = {1, 2, 7, 1};
        int [] secondForHas271 = {1, 2, 8, 1};
        int [] thirdForHas271 = {2, 7, 1};
        int [] fourthForHas271 = {3, 8, 2};
        int [] fifthForHas271 = {2, 7, 3};
        int [] sixthForHas271 = {2, 7, 4};
        int [] seventhForHas271 = {2, 7, -1};
        int [] eighthForHas271 = {2, 7, -2};
        int [] ninthForHas271 = {4, 5, 3, 8, 0};
        int [] tenthForHas271 = {2, 7, 5, 10, 4};
        int [] eleventhForHas271 = {2, 7, -2, 4, 9, 3};
        int [] twelfthForHas271 = {2, 7, 5, 10, 1};
        int [] thirteenthForHas271 = {2, 7, -2, 4, 10, 2};
        int [] fourteenthForHas271 = {1, 1, 4, 9, 0};
        int [] fifteenthForHas271 = {1, 1, 4, 9, 4, 9, 2};
        imp2.has271(firstForHas271);
        imp2.has271(secondForHas271);
        imp2.has271(thirdForHas271);
        imp2.has271(fourthForHas271);
        imp2.has271(fifthForHas271);
        imp2.has271(sixthForHas271);
        imp2.has271(seventhForHas271);
        imp2.has271(eighthForHas271);
        imp2.has271(ninthForHas271);
        imp2.has271(tenthForHas271);
        imp2.has271(eleventhForHas271);
        imp2.has271(twelfthForHas271);
        imp2.has271(thirteenthForHas271);
        imp2.has271(fourteenthForHas271);
        imp2.has271(fifteenthForHas271);

        //******https://codingbat.com/java/Warmup-2******third column
        //countXX
        imp2.countXX("abcxx");
        imp2.countXX("xxx");
        imp2.countXX("xxxx");
        imp2.countXX("abc");
        imp2.countXX("Hello there");
        imp2.countXX("Hexxo thxxe");
        imp2.countXX("");
        imp2.countXX("Kittens");
        imp2.countXX("Kittensxxx");

        //stringSplosion
        imp2.stringSplosion("Code");
        imp2.stringSplosion("abc");
        imp2.stringSplosion("ab");
        imp2.stringSplosion("x");
        imp2.stringSplosion("fade");
        imp2.stringSplosion("There");
        imp2.stringSplosion("Kitten");
        imp2.stringSplosion("Bye");
        imp2.stringSplosion("Good");
        imp2.stringSplosion("Bad");

        //arrayFront9
        int [] firstForArrayFront9 = {1, 2, 9, 3, 4};
        int [] secondForArrayFront9 = {1, 2, 3, 4, 9};
        int [] thirdForArrayFront9 = {1, 2, 3, 4, 5};
        int [] fourthForArrayFront9 = {9, 2, 3};
        int [] fifthForArrayFront9 = {1, 9, 9};
        int [] sixthForArrayFront9 = {1, 2, 3};
        int [] seventhForArrayFront9 = {1, 9};
        int [] eihghtForArrayFront9 = {5, 5};
        int [] ninthForArrayFront9 = {2};
        int [] tenthForArrayFront9 = {9};
        int [] eleventhForArrayFront9 = {};
        int [] twelfthForArrayFront9 = {3, 9, 2, 3, 3};
        imp2.array123(firstForArrayFront9);
        imp2.array123(secondForArrayFront9);
        imp2.array123(thirdForArrayFront9);
        imp2.array123(fourthForArrayFront9);
        imp2.array123(fifthForArrayFront9);
        imp2.array123(sixthForArrayFront9);
        imp2.array123(seventhForArrayFront9);
        imp2.array123(eihghtForArrayFront9);
        imp2.array123(ninthForArrayFront9);
        imp2.array123(tenthForArrayFront9);
        imp2.array123(eleventhForArrayFront9);
        imp2.array123(twelfthForArrayFront9);

        //stringX
        imp2.stringX("xxHxix");
        imp2.stringX("abxxxcd");
        imp2.stringX("xabxxxcdx");
        imp2.stringX("xKittenx");
        imp2.stringX("Hello");
        imp2.stringX("xx");
        imp2.stringX("x");
        imp2.stringX("");

        //array667
        int[] firstForArray667 = {6, 6, 2};
        int[] secondForArray667 = {6, 6, 2, 6};
        int[] thirdForArray667 = {6, 7, 2, 6};
        int[] fourthForArray667 = {6, 6, 2, 6, 7};
        int[] fifthForArray667 = {1, 6, 3};
        int[] sixthFrArray667 = {6, 1};
        int[] seventhForArray667 = {};
        int[] eighthForArray667 = {3, 6, 7, 6};
        int[] ninthForArray667 = {3, 6, 6, 7};
        int[] tenthForArray667 = {6, 3, 6, 6};
        int[] eleventhForArray667 = {6, 7, 6, 6};
        int[] twelfthForArray667 = {1, 2, 3, 5, 6};
        int[] thirteenthForArray667 = {1, 2, 3, 6, 6};
        imp2.array667(firstForArray667);
        imp2.array667(secondForArray667);
        imp2.array667(thirdForArray667);
        imp2.array667(fourthForArray667);
        imp2.array667(fifthForArray667);
        imp2.array667(sixthFrArray667);
        imp2.array667(seventhForArray667);
        imp2.array667(eighthForArray667);
        imp2.array667(ninthForArray667);
        imp2.array667(tenthForArray667);
        imp2.array667(eleventhForArray667);
        imp2.array667(twelfthForArray667);
        imp2.array667(thirteenthForArray667);
    }
}

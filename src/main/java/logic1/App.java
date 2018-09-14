package logic1;

public class App {

    public static void main(String[] args) {

        Logic1 myLogic = new Logic1();

        //******https://codingbat.com/java/Logic-1******first column

        //cigarParty
        myLogic.cigarParty(30, false);
        myLogic.cigarParty(50, false);
        myLogic.cigarParty(70, true);
        myLogic.cigarParty(30, true);
        myLogic.cigarParty(50, true);
        myLogic.cigarParty(60, false);
        myLogic.cigarParty(61, false);
        myLogic.cigarParty(40, false);
        myLogic.cigarParty(39, false);
        myLogic.cigarParty(40, true);
        myLogic.cigarParty(39, true);

        //caughtSpeeding
        myLogic.caughtSpeeding(60, false);
        myLogic.caughtSpeeding(65, false);
        myLogic.caughtSpeeding(65, true);
        myLogic.caughtSpeeding(80, false);
        myLogic.caughtSpeeding(85, false);
        myLogic.caughtSpeeding(85, true);
        myLogic.caughtSpeeding(70, false);
        myLogic.caughtSpeeding(75, false);
        myLogic.caughtSpeeding(75, true);
        myLogic.caughtSpeeding(40, false);
        myLogic.caughtSpeeding(40, true);
        myLogic.caughtSpeeding(90, false);

        //
        myLogic.love6(6, 4);
        myLogic.love6(4, 5);
        myLogic.love6(1, 5);
        myLogic.love6(1, 6);
        myLogic.love6(1, 8);
        myLogic.love6(1, 7);
        myLogic.love6(7, 5);
        myLogic.love6(8, 2);
        myLogic.love6(6, 6);
        myLogic.love6(-6, 2);
        myLogic.love6(-4, -10);
        myLogic.love6(-7, 1);
        myLogic.love6(7, -1);
        myLogic.love6(-6, 12);
        myLogic.love6(-2, -4);
        myLogic.love6(7, 1);
        myLogic.love6(0, 9);
        myLogic.love6(8, 3);
        myLogic.love6(3, 3);
        myLogic.love6(3, 4);

        //more20
        myLogic.more20(20);
        myLogic.more20(21);
        myLogic.more20(22);
        myLogic.more20(23);
        myLogic.more20(25);
        myLogic.more20(30);
        myLogic.more20(31);
        myLogic.more20(59);
        myLogic.more20(60);
        myLogic.more20(61);
        myLogic.more20(62);
        myLogic.more20(1020);
        myLogic.more20(2021);
        myLogic.more20(1000);
        myLogic.more20(1001);
        myLogic.more20(50);
        myLogic.more20(55);
        myLogic.more20(40);
        myLogic.more20(41);
        myLogic.more20(39);
        myLogic.more20(42);

        //nearTen
        myLogic.nearTen(12);
        myLogic.nearTen(17);
        myLogic.nearTen(19);
        myLogic.nearTen(31);
        myLogic.nearTen(6);
        myLogic.nearTen(10);
        myLogic.nearTen(11);
        myLogic.nearTen(21);
        myLogic.nearTen(22);
        myLogic.nearTen(23);
        myLogic.nearTen(54);
        myLogic.nearTen(155);
        myLogic.nearTen(158);
        myLogic.nearTen(3);
        myLogic.nearTen(1);

        //teaParty
        myLogic.teaParty(6, 8);
        myLogic.teaParty(3, 8);
        myLogic.teaParty(20, 6);
        myLogic.teaParty(12, 6);
        myLogic.teaParty(11, 6);
        myLogic.teaParty(11, 4);
        myLogic.teaParty(4, 5);
        myLogic.teaParty(5, 5);
        myLogic.teaParty(6, 6);
        myLogic.teaParty(5, 10);
        myLogic.teaParty(5, 9);
        myLogic.teaParty(10, 4);
        myLogic.teaParty(10, 20);

        //twoAsOne
        myLogic.twoAsOne(1, 2, 3);
        myLogic.twoAsOne(3, 1, 2);
        myLogic.twoAsOne(3, 2, 2);
        myLogic.twoAsOne(2, 3, 1);
        myLogic.twoAsOne(5, 3, -2);
        myLogic.twoAsOne(5, 3, -3);
        myLogic.twoAsOne(2, 5, 3);
        myLogic.twoAsOne(9, 5, 5);
        myLogic.twoAsOne(9, 4, 5);
        myLogic.twoAsOne(5, 4, 9);
        myLogic.twoAsOne(3, 3, 0);
        myLogic.twoAsOne(3, 3, 2);

        //lastDigit
        myLogic.lastDigit(23, 19, 13);
        myLogic.lastDigit(23, 19, 12);
        myLogic.lastDigit(23, 19, 3);
        myLogic.lastDigit(23, 19, 39);
        myLogic.lastDigit(1, 2, 3);
        myLogic.lastDigit(1, 1, 2);
        myLogic.lastDigit(1, 2, 2);
        myLogic.lastDigit(14, 25, 43);
        myLogic.lastDigit(14, 25, 45);
        myLogic.lastDigit(248, 106, 1002);
        myLogic.lastDigit(248, 106, 1008);
        myLogic.lastDigit(10, 11, 20);
        myLogic.lastDigit(0, 11, 0);

        //maxMod5
        myLogic.maxMod5(2, 3);
        myLogic.maxMod5(6, 2);
        myLogic.maxMod5(3, 2);
        myLogic.maxMod5(8, 12);
        myLogic.maxMod5(7, 12);
        myLogic.maxMod5(11, 6);
        myLogic.maxMod5(2, 7);
        myLogic.maxMod5(7, 7);
        myLogic.maxMod5(9, 1);
        myLogic.maxMod5(9, 14);
        myLogic.maxMod5(1, 2);

        //blueTicket
        myLogic.blueTicket(9, 1, 0);
        myLogic.blueTicket(9, 2, 0);
        myLogic.blueTicket(6, 1, 4);
        myLogic.blueTicket(6, 1, 5);
        myLogic.blueTicket(10, 0, 0);
        myLogic.blueTicket(15, 0, 5);
        myLogic.blueTicket(5, 15, 5);
        myLogic.blueTicket(4, 11, 1);
        myLogic.blueTicket(13, 2, 3);
        myLogic.blueTicket(8, 4, 3);
        myLogic.blueTicket(8, 4, 2);
        myLogic.blueTicket(8, 4, 1);

        //******https://codingbat.com/java/Array-1******second column

        //dateFashion
        myLogic.dateFashion(5, 10);
        myLogic.dateFashion(5, 2);
        myLogic.dateFashion(5, 5);
        myLogic.dateFashion(3, 3);
        myLogic.dateFashion(10, 2);
        myLogic.dateFashion(2, 9);
        myLogic.dateFashion(9, 9);
        myLogic.dateFashion(10, 5);
        myLogic.dateFashion(2, 2);
        myLogic.dateFashion(3, 7);
        myLogic.dateFashion(2, 7);
        myLogic.dateFashion(6, 2);

        //sortaSum
        myLogic.sortaSum(3, 4);
        myLogic.sortaSum(9, 4);
        myLogic.sortaSum(10, 11);
        myLogic.sortaSum(12, -3);
        myLogic.sortaSum(-3, 12);
        myLogic.sortaSum(4, 5);
        myLogic.sortaSum(4, 6);
        myLogic.sortaSum(14, 7);
        myLogic.sortaSum(14, 6);

        //in1To10
        myLogic.in1To10(5, false);
        myLogic.in1To10(11, false);
        myLogic.in1To10(11, true);
        myLogic.in1To10(10, false);
        myLogic.in1To10(10, true);
        myLogic.in1To10(9, false);
        myLogic.in1To10(9, true);
        myLogic.in1To10(1, false);
        myLogic.in1To10(1, true);
        myLogic.in1To10(0, false);
        myLogic.in1To10(0, true);
        myLogic.in1To10(-1, false);
        myLogic.in1To10(-1, true);
        myLogic.in1To10(99, false);
        myLogic.in1To10(-99, true);

        //old35
        myLogic.old35(3);
        myLogic.old35(10);
        myLogic.old35(15);
        myLogic.old35(5);
        myLogic.old35(9);
        myLogic.old35(8);
        myLogic.old35(7);
        myLogic.old35(6);
        myLogic.old35(17);
        myLogic.old35(18);
        myLogic.old35(29);
        myLogic.old35(20);
        myLogic.old35(21);
        myLogic.old35(22);
        myLogic.old35(45);
        myLogic.old35(99);

        //teenSum
        myLogic.teenSum(3, 4);
        myLogic.teenSum(10, 13);
        myLogic.teenSum(13, 2);
        myLogic.teenSum(3, 19);
        myLogic.teenSum(13, 13);
        myLogic.teenSum(10, 10);
        myLogic.teenSum(6, 14);
        myLogic.teenSum(15, 2);
        myLogic.teenSum(19, 19);
        myLogic.teenSum(19, 20);
        myLogic.teenSum(2, 18);
        myLogic.teenSum(12, 4);
        myLogic.teenSum(2, 20);
        myLogic.teenSum(2, 17);
        myLogic.teenSum(2, 16);
        myLogic.teenSum(6, 7);

        //fizzString
        myLogic.fizzString("fig");
        myLogic.fizzString("dib");
        myLogic.fizzString("fib");
        myLogic.fizzString("abc");
        myLogic.fizzString("fooo");
        myLogic.fizzString("booo");
        myLogic.fizzString("ooob");
        myLogic.fizzString("fooob");
        myLogic.fizzString("f");
        myLogic.fizzString("b");
        myLogic.fizzString("abcb");
        myLogic.fizzString("Hello");
        myLogic.fizzString("Hellob");
        myLogic.fizzString("af");
        myLogic.fizzString("bf");
        myLogic.fizzString("fb");

        //inOrder
        myLogic.inOrder(1, 2, 4, false);
        myLogic.inOrder(1, 2, 1, false);
        myLogic.inOrder(1, 1, 2, true);
        myLogic.inOrder(3, 2, 4, false);
        myLogic.inOrder(2, 3, 4, false);
        myLogic.inOrder(3, 2, 4, true);
        myLogic.inOrder(4, 2, 2, true);
        myLogic.inOrder(4, 5, 2, true);
        myLogic.inOrder(2, 4, 6, true);
        myLogic.inOrder(7, 9, 10, false);
        myLogic.inOrder(7, 5, 6, true);
        myLogic.inOrder(7, 5, 4, true);

        //lessBy10
        myLogic.lessBy10(1, 7, 11);
        myLogic.lessBy10(1, 7, 10);
        myLogic.lessBy10(11, 1, 7);
        myLogic.lessBy10(10, 7, 1);
        myLogic.lessBy10(-10, 2, 2);
        myLogic.lessBy10(2, 11, 11);
        myLogic.lessBy10(3, 3, 30);
        myLogic.lessBy10(3, 3, 3);
        myLogic.lessBy10(10, 1, 11);
        myLogic.lessBy10(10, 11, 1);
        myLogic.lessBy10(10, 11, 2);
        myLogic.lessBy10(3, 30, 3);
        myLogic.lessBy10(2, 2, -8);
        myLogic.lessBy10(2, 8, 12);

        //redTicket
        myLogic.redTicket(2, 2, 2);
        myLogic.redTicket(2, 2, 1);
        myLogic.redTicket(0, 0, 0);
        myLogic.redTicket(2, 0, 0);
        myLogic.redTicket(1, 1, 1);
        myLogic.redTicket(1, 2, 1);
        myLogic.redTicket(1, 2, 0);
        myLogic.redTicket(0, 2, 2);
        myLogic.redTicket(1, 2, 2);
        myLogic.redTicket(0, 2, 0);
        myLogic.redTicket(1, 1, 2);

        //shareDigit
        myLogic.shareDigit(12, 23);
        myLogic.shareDigit(12, 43);
        myLogic.shareDigit(12, 44);
        myLogic.shareDigit(23, 12);
        myLogic.shareDigit(23, 39);
        myLogic.shareDigit(23, 19);
        myLogic.shareDigit(30, 90);
        myLogic.shareDigit(30, 91);
        myLogic.shareDigit(55, 55);
        myLogic.shareDigit(55, 44);

        //squirrelPlay
        myLogic.squirrelPlay(70, false);
        myLogic.squirrelPlay(95, false);
        myLogic.squirrelPlay(95, true);
        myLogic.squirrelPlay(90, false);
        myLogic.squirrelPlay(90, true);
        myLogic.squirrelPlay(50, false);
        myLogic.squirrelPlay(50, true);
        myLogic.squirrelPlay(100, false);
        myLogic.squirrelPlay(100, true);
        myLogic.squirrelPlay(105, true);
        myLogic.squirrelPlay(59, false);
        myLogic.squirrelPlay(59, true);
        myLogic.squirrelPlay(60, false);

        //alarmClock
        myLogic.alarmClock(1, false);
        myLogic.alarmClock(5, false);
        myLogic.alarmClock(0, false);
        myLogic.alarmClock(6, false);
        myLogic.alarmClock(0, true);
        myLogic.alarmClock(6, true);
        myLogic.alarmClock(1, true);
        myLogic.alarmClock(3, true);
        myLogic.alarmClock(5, true);

        //specialEvent
        myLogic.specialEleven(22);
        myLogic.specialEleven(23);
        myLogic.specialEleven(24);
        myLogic.specialEleven(21);
        myLogic.specialEleven(11);
        myLogic.specialEleven(12);
        myLogic.specialEleven(10);
        myLogic.specialEleven(9);
        myLogic.specialEleven(8);
        myLogic.specialEleven(0);
        myLogic.specialEleven(1);
        myLogic.specialEleven(2);
        myLogic.specialEleven(121);
        myLogic.specialEleven(122);
        myLogic.specialEleven(123);
        myLogic.specialEleven(46);
        myLogic.specialEleven(49);
        myLogic.specialEleven(52);
        myLogic.specialEleven(54);
        myLogic.specialEleven(55);

        //less20
        myLogic.less20(18);
        myLogic.less20(19);
        myLogic.less20(20);
        myLogic.less20(8);
        myLogic.less20(17);
        myLogic.less20(23);
        myLogic.less20(25);
        myLogic.less20(30);
        myLogic.less20(31);
        myLogic.less20(58);
        myLogic.less20(59);
        myLogic.less20(60);
        myLogic.less20(61);
        myLogic.less20(62);
        myLogic.less20(1017);
        myLogic.less20(1018);
        myLogic.less20(1019);
        myLogic.less20(1020);
        myLogic.less20(1020);
        myLogic.less20(1021);
        myLogic.less20(1022);
        myLogic.less20(1023);
        myLogic.less20(37);

        //answerCell
        myLogic.answerCell(false, false, false);
        myLogic.answerCell(false, false, true);
        myLogic.answerCell(true, false, false);
        myLogic.answerCell(true, true, false);
        myLogic.answerCell(false, true, false);
        myLogic.answerCell(true, true, true);

        //fizzString2
        myLogic.fizzString2(1);
        myLogic.fizzString2(2);
        myLogic.fizzString2(3);
        myLogic.fizzString2(4);
        myLogic.fizzString2(5);
        myLogic.fizzString2(6);
        myLogic.fizzString2(7);
        myLogic.fizzString2(8);
        myLogic.fizzString2(9);
        myLogic.fizzString2(15);
        myLogic.fizzString2(16);
        myLogic.fizzString2(17);
        myLogic.fizzString2(18);
        myLogic.fizzString2(19);
        myLogic.fizzString2(21);
        myLogic.fizzString2(44);
        myLogic.fizzString2(45);
        myLogic.fizzString2(100);

        //inOrderEqual
        myLogic.inOrderEqual(2, 5, 11, false);
        myLogic.inOrderEqual(5, 7, 6, false);
        myLogic.inOrderEqual(5, 5, 7, true);
        myLogic.inOrderEqual(5, 5, 7, false);
        myLogic.inOrderEqual(2, 5, 4, false);
        myLogic.inOrderEqual(3, 4, 3, false);
        myLogic.inOrderEqual(3, 4, 4, false);
        myLogic.inOrderEqual(3, 4, 3, true);
        myLogic.inOrderEqual(3, 4, 4, true);
        myLogic.inOrderEqual(1, 5, 5, true);
        myLogic.inOrderEqual(5, 5, 5, true);
        myLogic.inOrderEqual(2, 2, 1, true);
        myLogic.inOrderEqual(9, 2, 2, true);
        myLogic.inOrderEqual(0, 1, 0, true);

        //withoutDoubles
        myLogic.withoutDoubles(2, 3, true);
        myLogic.withoutDoubles(3, 3, true);
        myLogic.withoutDoubles(3, 3, false);
        myLogic.withoutDoubles(2, 3, false);
        myLogic.withoutDoubles(5, 4, true);
        myLogic.withoutDoubles(5, 4, false);
        myLogic.withoutDoubles(5, 5, true);
        myLogic.withoutDoubles(5, 5, false);
        myLogic.withoutDoubles(6, 6, true);
        myLogic.withoutDoubles(6, 6, false);
        myLogic.withoutDoubles(1, 6, true);
        myLogic.withoutDoubles(6, 1, false);

        //greenTicket
        myLogic.greenTicket(1, 2, 3);
        myLogic.greenTicket(2, 2, 2);
        myLogic.greenTicket(1, 1, 2);
        myLogic.greenTicket(2, 1, 1);
        myLogic.greenTicket(1, 2, 1);
        myLogic.greenTicket(3, 2, 1);
        myLogic.greenTicket(0, 0, 0);
        myLogic.greenTicket(2, 0, 0);
        myLogic.greenTicket(0, 9, 10);
        myLogic.greenTicket(0, 10, 0);
        myLogic.greenTicket(9, 9, 9);
        myLogic.greenTicket(9, 0, 9);

        //sumLimit
        myLogic.sumLimit(2, 3);
        myLogic.sumLimit(8, 3);
        myLogic.sumLimit(8, 1);
        myLogic.sumLimit(11, 39);
        myLogic.sumLimit(11, 99);
        myLogic.sumLimit(0, 0);
        myLogic.sumLimit(99, 0);
        myLogic.sumLimit(99, 1);
        myLogic.sumLimit(123, 1);
        myLogic.sumLimit(1, 123);
        myLogic.sumLimit(23, 60);
        myLogic.sumLimit(23, 80);
        myLogic.sumLimit(9000, 1);
        myLogic.sumLimit(90000000, 1);
        myLogic.sumLimit(9000, 1000);

    }
}

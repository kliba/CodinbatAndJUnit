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
    }
}

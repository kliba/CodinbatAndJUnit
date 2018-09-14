package logic1test;

import logic1.Logic1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Logic1Test {

    Logic1 testToLogic1 = new Logic1();

    //******https://codingbat.com/java/Logic-1******first column

    //cigarParty
    @Test
    public void testCigarParty() {
        assertFalse(testToLogic1.cigarParty(30, false));
        assertTrue(testToLogic1.cigarParty(50, false));
        assertTrue(testToLogic1.cigarParty(70, true));
        assertFalse(testToLogic1.cigarParty(30, true));
        assertTrue(testToLogic1.cigarParty(50, true));
        assertTrue(testToLogic1.cigarParty(60, false));
        assertFalse(testToLogic1.cigarParty(61, false));
        assertTrue(testToLogic1.cigarParty(40, false));
        assertFalse(testToLogic1.cigarParty(39, false));
        assertTrue(testToLogic1.cigarParty(40, true));
        assertFalse(testToLogic1.cigarParty(39, true));
    }

    //caughtSpeeding
    @Test
    public void testCaughtSpeeding() {
        assertEquals(0, testToLogic1.caughtSpeeding(60, false));
        assertEquals(1, testToLogic1.caughtSpeeding(65, false));
        assertEquals(0, testToLogic1.caughtSpeeding(65, true));
        assertEquals(1, testToLogic1.caughtSpeeding(80, false));
        assertEquals(2, testToLogic1.caughtSpeeding(85, false));
        assertEquals(1, testToLogic1.caughtSpeeding(85, true));
        assertEquals(1, testToLogic1.caughtSpeeding(70, false));
        assertEquals(1, testToLogic1.caughtSpeeding(75, false));
        assertEquals(1, testToLogic1.caughtSpeeding(75, true));
        assertEquals(0, testToLogic1.caughtSpeeding(40, false));
        assertEquals(0, testToLogic1.caughtSpeeding(40, true));
        assertEquals(2, testToLogic1.caughtSpeeding(90, false));
    }

    //love6
    @Test
    public void testLove6() {
        assertTrue(testToLogic1.love6(6, 4));
        assertFalse(testToLogic1.love6(4, 5));
        assertTrue(testToLogic1.love6(1, 5));
        assertTrue(testToLogic1.love6(1, 6));
        assertFalse(testToLogic1.love6(1, 8));
        assertTrue(testToLogic1.love6(1, 7));
        assertFalse(testToLogic1.love6(7, 5));
        assertTrue(testToLogic1.love6(8, 2));
        assertTrue(testToLogic1.love6(6, 6));
        assertFalse(testToLogic1.love6(-6, 2));
        assertTrue(testToLogic1.love6(-4, -10));
        assertFalse(testToLogic1.love6(-7, 1));
        assertTrue(testToLogic1.love6(7, -1));
        assertTrue(testToLogic1.love6(-6, 12));
        assertFalse(testToLogic1.love6(-2, -4));
        assertTrue(testToLogic1.love6(7, 1));
        assertFalse(testToLogic1.love6(0, 9));
        assertFalse(testToLogic1.love6(8, 3));
        assertTrue(testToLogic1.love6(3, 3));
        assertFalse(testToLogic1.love6(3, 4));
    }

    //more20
    @Test
    public void testMore20() {
        assertFalse(testToLogic1.more20(20));
        assertTrue(testToLogic1.more20(21));
        assertTrue(testToLogic1.more20(22));
        assertFalse(testToLogic1.more20(23));
        assertFalse(testToLogic1.more20(25));
        assertFalse(testToLogic1.more20(30));
        assertFalse(testToLogic1.more20(31));
        assertFalse(testToLogic1.more20(59));
        assertFalse(testToLogic1.more20(60));
        assertTrue(testToLogic1.more20(61));
        assertTrue(testToLogic1.more20(62));
        assertFalse(testToLogic1.more20(1020));
        assertTrue(testToLogic1.more20(1021));
        assertFalse(testToLogic1.more20(1000));
        assertTrue(testToLogic1.more20(1001));
        assertFalse(testToLogic1.more20(50));
        assertFalse(testToLogic1.more20(55));
        assertFalse(testToLogic1.more20(40));
        assertTrue(testToLogic1.more20(41));
        assertFalse(testToLogic1.more20(39));
        assertTrue(testToLogic1.more20(42));
    }

    //nearTen
    @Test
    public void testNearTen() {
        assertTrue(testToLogic1.nearTen(12));
        assertFalse(testToLogic1.nearTen(17));
        assertTrue(testToLogic1.nearTen(19));
        assertTrue(testToLogic1.nearTen(31));
        assertFalse(testToLogic1.nearTen(6));
        assertTrue(testToLogic1.nearTen(10));
        assertTrue(testToLogic1.nearTen(11));
        assertTrue(testToLogic1.nearTen(21));
        assertTrue(testToLogic1.nearTen(22));
        assertFalse(testToLogic1.nearTen(23));
        assertFalse(testToLogic1.nearTen(54));
        assertFalse(testToLogic1.nearTen(155));
        assertTrue(testToLogic1.nearTen(158));
        assertFalse(testToLogic1.nearTen(3));
        assertTrue(testToLogic1.nearTen(1));
    }

    //teaParty
    @Test
    public void testTeaParty() {
        assertEquals(1 ,testToLogic1.teaParty(6, 8));
        assertEquals(0 ,testToLogic1.teaParty(3, 8));
        assertEquals(2 ,testToLogic1.teaParty(20, 6));
        assertEquals(2 ,testToLogic1.teaParty(12, 6));
        assertEquals(1 ,testToLogic1.teaParty(11, 6));
        assertEquals(0 ,testToLogic1.teaParty(11, 4));
        assertEquals(0 ,testToLogic1.teaParty(4, 5));
        assertEquals(1 ,testToLogic1.teaParty(5, 5));
        assertEquals(1 ,testToLogic1.teaParty(6, 6));
        assertEquals(2 ,testToLogic1.teaParty(5, 10));
        assertEquals(1 ,testToLogic1.teaParty(5, 9));
        assertEquals(0 ,testToLogic1.teaParty(10, 4));
        assertEquals(2 ,testToLogic1.teaParty(10, 20));
    }

    //twoAsOne
    @Test
    public void testTwoAsOne() {
        assertTrue(testToLogic1.twoAsOne(1, 2, 3));
        assertTrue(testToLogic1.twoAsOne(3, 1, 2));
        assertFalse(testToLogic1.twoAsOne(3, 2, 2));
        assertTrue(testToLogic1.twoAsOne(2, 3, 1));
        assertTrue(testToLogic1.twoAsOne(5, 3, -2));
        assertFalse(testToLogic1.twoAsOne(5, 3, -3));
        assertTrue(testToLogic1.twoAsOne(2, 5, 3));
        assertFalse(testToLogic1.twoAsOne(9, 5, 5));
        assertTrue(testToLogic1.twoAsOne(9, 4, 5));
        assertTrue(testToLogic1.twoAsOne(5, 4, 9));
        assertTrue(testToLogic1.twoAsOne(3, 3, 0));
        assertFalse(testToLogic1.twoAsOne(3, 3, 2));
    }

    //lastDigit
    @Test
    public void testLastDigit() {
        assertTrue(testToLogic1.lastDigit(23, 19, 13));
        assertFalse(testToLogic1.lastDigit(23, 19, 12));
        assertTrue(testToLogic1.lastDigit(23, 19, 3));
        assertTrue(testToLogic1.lastDigit(23, 19, 39));
        assertFalse(testToLogic1.lastDigit(1, 2, 3));
        assertTrue(testToLogic1.lastDigit(1, 1, 2));
        assertTrue(testToLogic1.lastDigit(1, 2, 2));
        assertFalse(testToLogic1.lastDigit(14, 25, 43));
        assertTrue(testToLogic1.lastDigit(14, 25, 45));
        assertFalse(testToLogic1.lastDigit(248, 106, 1002));
        assertTrue(testToLogic1.lastDigit(248, 106, 1008));
        assertTrue(testToLogic1.lastDigit(10, 11, 20));
        assertTrue(testToLogic1.lastDigit(0, 11, 0));
    }

    //maxMod5
    @Test
    public void testMaxMod5() {
        assertEquals(3, testToLogic1.maxMod5(2, 3));
        assertEquals(6, testToLogic1.maxMod5(6, 2));
        assertEquals(3, testToLogic1.maxMod5(3, 2));
        assertEquals(12, testToLogic1.maxMod5(8, 12));
        assertEquals(7, testToLogic1.maxMod5(7, 12));
        assertEquals(6, testToLogic1.maxMod5(11, 6));
        assertEquals(2, testToLogic1.maxMod5(2, 7));
        assertEquals(0, testToLogic1.maxMod5(7, 7));
        assertEquals(9, testToLogic1.maxMod5(9, 1));
        assertEquals(9, testToLogic1.maxMod5(9, 14));
        assertEquals(2, testToLogic1.maxMod5(1, 2));
    }

    //blueTicket
    @Test
    public void testBlueTicket() {
        assertEquals(10, testToLogic1.blueTicket(9, 1, 0));
        assertEquals(0, testToLogic1.blueTicket(9, 2, 0));
        assertEquals(10, testToLogic1.blueTicket(6, 1, 4));
        assertEquals(0, testToLogic1.blueTicket(6, 1, 5));
        assertEquals(10, testToLogic1.blueTicket(10, 0, 0));
        assertEquals(5, testToLogic1.blueTicket(15, 0, 5));
        assertEquals(10, testToLogic1.blueTicket(5, 15, 5));
        assertEquals(5, testToLogic1.blueTicket(4, 11, 1));
        assertEquals(5, testToLogic1.blueTicket(13, 2, 3));
        assertEquals(0, testToLogic1.blueTicket(8, 4, 3));
        assertEquals(10, testToLogic1.blueTicket(8, 4, 2));
        assertEquals(0, testToLogic1.blueTicket(8, 4, 1));
    }

    //******https://codingbat.com/java/Array-1******second column

    //dateFashion
    @Test
    public void testDateFashion() {
        assertEquals(2, testToLogic1.dateFashion(5, 10));
        assertEquals(0, testToLogic1.dateFashion(5, 2));
        assertEquals(1, testToLogic1.dateFashion(5, 5));
        assertEquals(1, testToLogic1.dateFashion(3, 3));
        assertEquals(0, testToLogic1.dateFashion(10, 2));
        assertEquals(0, testToLogic1.dateFashion(2, 9));
        assertEquals(2, testToLogic1.dateFashion(9, 9));
        assertEquals(2, testToLogic1.dateFashion(10, 5));
        assertEquals(0, testToLogic1.dateFashion(2, 2));
        assertEquals(1, testToLogic1.dateFashion(3, 7));
        assertEquals(0, testToLogic1.dateFashion(2, 7));
        assertEquals(0, testToLogic1.dateFashion(6, 2));
    }

    //sortaSum
    @Test
    public void testSortaSum() {
        assertEquals(7, testToLogic1.sortaSum(3, 4));
        assertEquals(20, testToLogic1.sortaSum(9, 4));
        assertEquals(21, testToLogic1.sortaSum(10, 11));
        assertEquals(9, testToLogic1.sortaSum(12, -3));
        assertEquals(9, testToLogic1.sortaSum(-3, 12));
        assertEquals(9, testToLogic1.sortaSum(4, 5));
        assertEquals(20, testToLogic1.sortaSum(4, 6));
        assertEquals(21, testToLogic1.sortaSum(14, 7));
        assertEquals(20, testToLogic1.sortaSum(14, 6));
    }

    //in1To10
    @Test
    public void testIn1To10() {
        assertTrue(testToLogic1.in1To10(5, false));
        assertFalse(testToLogic1.in1To10(11, false));
        assertTrue(testToLogic1.in1To10(11, true));
        assertTrue(testToLogic1.in1To10(10, false));
        assertTrue(testToLogic1.in1To10(10, true));
        assertTrue(testToLogic1.in1To10(9, false));
        assertFalse(testToLogic1.in1To10(9, true));
        assertTrue(testToLogic1.in1To10(1, false));
        assertTrue(testToLogic1.in1To10(1, true));
        assertFalse(testToLogic1.in1To10(0, false));
        assertTrue(testToLogic1.in1To10(0, true));
        assertFalse(testToLogic1.in1To10(-1, false));
        assertTrue(testToLogic1.in1To10(-1, true));
        assertFalse(testToLogic1.in1To10(99, false));
        assertTrue(testToLogic1.in1To10(-99, true));
    }

    //old35
    @Test
    public void testOld35() {
        assertTrue(testToLogic1.old35(3));
        assertTrue(testToLogic1.old35(10));
        assertFalse(testToLogic1.old35(15));
        assertTrue(testToLogic1.old35(5));
        assertTrue(testToLogic1.old35(9));
        assertFalse(testToLogic1.old35(8));
        assertFalse(testToLogic1.old35(7));
        assertTrue(testToLogic1.old35(6));
        assertFalse(testToLogic1.old35(17));
        assertTrue(testToLogic1.old35(18));
        assertFalse(testToLogic1.old35(29));
        assertTrue(testToLogic1.old35(20));
        assertTrue(testToLogic1.old35(21));
        assertFalse(testToLogic1.old35(22));
        assertFalse(testToLogic1.old35(45));
        assertTrue(testToLogic1.old35(99));
    }

    //teenSum
    @Test
    public void testTeenSum() {
        assertEquals(7, testToLogic1.teenSum(3, 4));
        assertEquals(19, testToLogic1.teenSum(10, 13));
        assertEquals(19, testToLogic1.teenSum(13, 2));
        assertEquals(19, testToLogic1.teenSum(3, 19));
        assertEquals(19, testToLogic1.teenSum(13, 13));
        assertEquals(20, testToLogic1.teenSum(10, 10));
        assertEquals(19, testToLogic1.teenSum(6, 14));
        assertEquals(19, testToLogic1.teenSum(15, 2));
        assertEquals(19, testToLogic1.teenSum(19, 19));
        assertEquals(19, testToLogic1.teenSum(19, 20));
        assertEquals(19, testToLogic1.teenSum(2, 18));
        assertEquals(16, testToLogic1.teenSum(12, 4));
        assertEquals(22, testToLogic1.teenSum(2, 20));
        assertEquals(19, testToLogic1.teenSum(2, 17));
        assertEquals(19, testToLogic1.teenSum(2, 16));
        assertEquals(13, testToLogic1.teenSum(6, 7));
    }

    //fizzString
    @Test
    public void testFizzString() {
        assertEquals("Fizz", testToLogic1.fizzString("fig"));
        assertEquals("Buzz", testToLogic1.fizzString("dib"));
        assertEquals("FizzBuzz", testToLogic1.fizzString("fib"));
        assertEquals("abc", testToLogic1.fizzString("abc"));
        assertEquals("Fizz", testToLogic1.fizzString("fooo"));
        assertEquals("booo", testToLogic1.fizzString("booo"));
        assertEquals("Buzz", testToLogic1.fizzString("ooob"));
        assertEquals("FizzBuzz", testToLogic1.fizzString("fooob"));
        assertEquals("Fizz", testToLogic1.fizzString("f"));
        assertEquals("Buzz", testToLogic1.fizzString("b"));
        assertEquals("Buzz", testToLogic1.fizzString("abcb"));
        assertEquals("Hello", testToLogic1.fizzString("Hello"));
        assertEquals("Buzz", testToLogic1.fizzString("Hellob"));
        assertEquals("af", testToLogic1.fizzString("af"));
        assertEquals("bf", testToLogic1.fizzString("bf"));
        assertEquals("FizzBuzz", testToLogic1.fizzString("fb"));
    }

    //inOrder
    @Test
    public void testInOrder() {
        assertTrue(testToLogic1.inOrder(1, 2, 4, false));
        assertFalse(testToLogic1.inOrder(1, 2, 1, false));
        assertTrue(testToLogic1.inOrder(1, 1, 2, true));
        assertFalse(testToLogic1.inOrder(3, 2, 4, false));
        assertTrue(testToLogic1.inOrder(2, 3, 4, false));
        assertTrue(testToLogic1.inOrder(3, 2, 4, true));
        assertFalse(testToLogic1.inOrder(4, 2, 2, true));
        assertFalse(testToLogic1.inOrder(4, 5, 2, true));
        assertTrue(testToLogic1.inOrder(2, 4, 6, true));
        assertTrue(testToLogic1.inOrder(7, 9, 10, false));
        assertTrue(testToLogic1.inOrder(7, 5, 6, true));
        assertFalse(testToLogic1.inOrder(7, 5, 4, true));
    }

    //lessBy10
    @Test
    public void testLessBy10() {
        assertTrue(testToLogic1.lessBy10(1, 7, 11));
        assertFalse(testToLogic1.lessBy10(1, 7, 10));
        assertTrue(testToLogic1.lessBy10(11, 1, 7));
        assertFalse(testToLogic1.lessBy10(10, 7, 1));
        assertTrue(testToLogic1.lessBy10(-10, 2, 2));
        assertFalse(testToLogic1.lessBy10(2, 11, 11));
        assertTrue(testToLogic1.lessBy10(3, 3, 30));
        assertFalse(testToLogic1.lessBy10(3, 3, 3));
        assertTrue(testToLogic1.lessBy10(10, 1, 11));
        assertTrue(testToLogic1.lessBy10(10, 11, 1));
        assertFalse(testToLogic1.lessBy10(10, 11, 2));
        assertTrue(testToLogic1.lessBy10(3, 30, 3));
        assertTrue(testToLogic1.lessBy10(2, 2, -8));
        assertTrue(testToLogic1.lessBy10(2, 8, 12));
    }

    //redTicket
    @Test
    public void testRedTicket() {
        assertEquals(10, testToLogic1.redTicket(2, 2, 2));
        assertEquals(0, testToLogic1.redTicket(2, 2, 1));
        assertEquals(5, testToLogic1.redTicket(0, 0, 0));
        assertEquals(1, testToLogic1.redTicket(2, 0, 0));
        assertEquals(5, testToLogic1.redTicket(1, 1, 1));
        assertEquals(0, testToLogic1.redTicket(1, 2, 1));
        assertEquals(1, testToLogic1.redTicket(1, 2, 0));
        assertEquals(1, testToLogic1.redTicket(0, 2, 2));
        assertEquals(1, testToLogic1.redTicket(1, 2, 2));
        assertEquals(0, testToLogic1.redTicket(0, 2, 0));
        assertEquals(0, testToLogic1.redTicket(1, 1, 2));
    }

    //shareDigit
    @Test
    public void testShareDigit() {
        assertTrue(testToLogic1.shareDigit(12, 23));
        assertFalse(testToLogic1.shareDigit(12, 43));
        assertFalse(testToLogic1.shareDigit(12, 44));
        assertTrue(testToLogic1.shareDigit(23, 12));
        assertTrue(testToLogic1.shareDigit(23, 39));
        assertFalse(testToLogic1.shareDigit(23, 19));
        assertTrue(testToLogic1.shareDigit(30, 90));
        assertFalse(testToLogic1.shareDigit(30, 91));
        assertTrue(testToLogic1.shareDigit(55, 55));
        assertFalse(testToLogic1.shareDigit(55, 44));
    }

    //squirrelPlay
    @Test
    public void testSquirrelPlay() {
        assertTrue(testToLogic1.squirrelPlay(70, false));
        assertFalse(testToLogic1.squirrelPlay(95, false));
        assertTrue(testToLogic1.squirrelPlay(95, true));
        assertTrue(testToLogic1.squirrelPlay(90, false));
        assertTrue(testToLogic1.squirrelPlay(90, true));
        assertFalse(testToLogic1.squirrelPlay(50, false));
        assertFalse(testToLogic1.squirrelPlay(50, true));
        assertFalse(testToLogic1.squirrelPlay(100, false));
        assertTrue(testToLogic1.squirrelPlay(100, true));
        assertFalse(testToLogic1.squirrelPlay(105, true));
        assertFalse(testToLogic1.squirrelPlay(59, false));
        assertFalse(testToLogic1.squirrelPlay(59, true));
        assertTrue(testToLogic1.squirrelPlay(60, false));
    }

    //alarmClock
    @Test
    public void testAlarmClock() {
        assertEquals("7:00", testToLogic1.alarmClock(1, false));
        assertEquals("7:00", testToLogic1.alarmClock(5, false));
        assertEquals("10:00", testToLogic1.alarmClock(0, false));
        assertEquals("10:00", testToLogic1.alarmClock(6, false));
        assertEquals("off", testToLogic1.alarmClock(0, true));
        assertEquals("off", testToLogic1.alarmClock(6, true));
        assertEquals("10:00", testToLogic1.alarmClock(1, true));
        assertEquals("10:00", testToLogic1.alarmClock(3, true));
        assertEquals("10:00", testToLogic1.alarmClock(5, true));
    }

    //specialEleven
    @Test
    public void testSpecialEleven() {
        assertTrue(testToLogic1.specialEleven(22));
        assertTrue(testToLogic1.specialEleven(23));
        assertFalse(testToLogic1.specialEleven(24));
        assertFalse(testToLogic1.specialEleven(21));
        assertTrue(testToLogic1.specialEleven(11));
        assertTrue(testToLogic1.specialEleven(12));
        assertFalse(testToLogic1.specialEleven(10));
        assertFalse(testToLogic1.specialEleven(9));
        assertFalse(testToLogic1.specialEleven(8));
        assertTrue(testToLogic1.specialEleven(0));
        assertTrue(testToLogic1.specialEleven(1));
        assertFalse(testToLogic1.specialEleven(2));
        assertTrue(testToLogic1.specialEleven(121));
        assertTrue(testToLogic1.specialEleven(122));
        assertFalse(testToLogic1.specialEleven(123));
        assertFalse(testToLogic1.specialEleven(46));
        assertFalse(testToLogic1.specialEleven(49));
        assertFalse(testToLogic1.specialEleven(52));
        assertFalse(testToLogic1.specialEleven(54));
        assertTrue(testToLogic1.specialEleven(55));
    }

    //less20
    @Test
    public void testLess20() {
        assertTrue(testToLogic1.less20(18));
        assertTrue(testToLogic1.less20(19));
        assertFalse(testToLogic1.less20(20));
        assertFalse(testToLogic1.less20(8));
        assertFalse(testToLogic1.less20(17));
        assertFalse(testToLogic1.less20(23));
        assertFalse(testToLogic1.less20(25));
        assertFalse(testToLogic1.less20(30));
        assertFalse(testToLogic1.less20(31));
        assertTrue(testToLogic1.less20(58));
        assertTrue(testToLogic1.less20(59));
        assertFalse(testToLogic1.less20(60));
        assertFalse(testToLogic1.less20(61));
        assertFalse(testToLogic1.less20(62));
        assertFalse(testToLogic1.less20(1017));
        assertTrue(testToLogic1.less20(1018));
        assertTrue(testToLogic1.less20(1019));
        assertFalse(testToLogic1.less20(1020));
        assertFalse(testToLogic1.less20(1021));
        assertFalse(testToLogic1.less20(1022));
        assertFalse(testToLogic1.less20(1023));
        assertFalse(testToLogic1.less20(37));
    }

    //answerCell
    @Test
    public void testAnswerCell() {
        assertTrue(testToLogic1.answerCell(false, false, false));
        assertFalse(testToLogic1.answerCell(false, false, true));
        assertFalse(testToLogic1.answerCell(true, false, false));
        assertTrue(testToLogic1.answerCell(true, true, false));
        assertTrue(testToLogic1.answerCell(false, true, false));
        assertFalse(testToLogic1.answerCell(true, true, true));
    }

    //fizzString2
    @Test
    public void testFizzString2() {
        assertEquals("1!", testToLogic1.fizzString2(1));
        assertEquals("2!", testToLogic1.fizzString2(2));
        assertEquals("Fizz!", testToLogic1.fizzString2(3));
        assertEquals("4!", testToLogic1.fizzString2(4));
        assertEquals("Buzz!", testToLogic1.fizzString2(5));
        assertEquals("Fizz!", testToLogic1.fizzString2(6));
        assertEquals("7!", testToLogic1.fizzString2(7));
        assertEquals("8!", testToLogic1.fizzString2(8));
        assertEquals("Fizz!", testToLogic1.fizzString2(9));
        assertEquals("FizzBuzz!", testToLogic1.fizzString2(15));
        assertEquals("16!", testToLogic1.fizzString2(16));
        assertEquals("Fizz!", testToLogic1.fizzString2(18));
        assertEquals("19!", testToLogic1.fizzString2(19));
        assertEquals("Fizz!", testToLogic1.fizzString2(21));
        assertEquals("44!", testToLogic1.fizzString2(44));
        assertEquals("FizzBuzz!", testToLogic1.fizzString2(45));
        assertEquals("Buzz!", testToLogic1.fizzString2(100));
    }

    //inOrderEqual
    @Test
    public void testInOrderEqual() {
        assertTrue(testToLogic1.inOrderEqual(2, 5, 11, false));
        assertFalse(testToLogic1.inOrderEqual(5, 7, 6, false));
        assertTrue(testToLogic1.inOrderEqual(5, 5, 7, true));
        assertFalse(testToLogic1.inOrderEqual(5, 5, 7, false));
        assertFalse(testToLogic1.inOrderEqual(2, 5, 4, false));
        assertFalse(testToLogic1.inOrderEqual(3, 4, 3, false));
        assertFalse(testToLogic1.inOrderEqual(3, 4, 4, false));
        assertFalse(testToLogic1.inOrderEqual(3, 4, 3, true));
        assertTrue(testToLogic1.inOrderEqual(3, 4, 4, true));
        assertTrue(testToLogic1.inOrderEqual(1, 5, 5, true));
        assertTrue(testToLogic1.inOrderEqual(5, 5, 5, true));
        assertFalse(testToLogic1.inOrderEqual(2, 2, 1, true));
        assertFalse(testToLogic1.inOrderEqual(9, 2, 2, true));
        assertFalse(testToLogic1.inOrderEqual(0, 1, 0, true));
    }

    //withoutDoubles
    @Test
    public void testWithoutDoubles() {
        assertEquals(5, testToLogic1.withoutDoubles(2, 3, true));
        assertEquals(7, testToLogic1.withoutDoubles(3, 3, true));
        assertEquals(6, testToLogic1.withoutDoubles(3, 3, false));
        assertEquals(5, testToLogic1.withoutDoubles(2, 3, false));
        assertEquals(9, testToLogic1.withoutDoubles(5, 4, true));
        assertEquals(9, testToLogic1.withoutDoubles(5, 4, false));
        assertEquals(11, testToLogic1.withoutDoubles(5, 5, true));
        assertEquals(10, testToLogic1.withoutDoubles(5, 5, false));
        assertEquals(7, testToLogic1.withoutDoubles(6, 6, true));
        assertEquals(12, testToLogic1.withoutDoubles(6, 6, false));
        assertEquals(7, testToLogic1.withoutDoubles(1, 6, true));
        assertEquals(7, testToLogic1.withoutDoubles(6, 1, false));
    }

    //greenTicket
    @Test
    public void testGreenTicket() {
        assertEquals(0, testToLogic1.greenTicket(1, 2, 3));
        assertEquals(20, testToLogic1.greenTicket(2, 2, 2));
        assertEquals(10, testToLogic1.greenTicket(1, 1, 2));
        assertEquals(10, testToLogic1.greenTicket(2, 1, 1));
        assertEquals(10, testToLogic1.greenTicket(1, 2, 1));
        assertEquals(0, testToLogic1.greenTicket(3, 2, 1));
        assertEquals(20, testToLogic1.greenTicket(0, 0, 0));
        assertEquals(10, testToLogic1.greenTicket(2, 0, 0));
        assertEquals(0, testToLogic1.greenTicket(0, 9, 10));
        assertEquals(10, testToLogic1.greenTicket(0, 10, 0));
        assertEquals(20, testToLogic1.greenTicket(9, 9, 9));
        assertEquals(10, testToLogic1.greenTicket(9, 0, 9));
    }

    //sumLimit
    @Test
    public void testSumLimit() {
        assertEquals(5, testToLogic1.sumLimit(2, 3));
        assertEquals(8, testToLogic1.sumLimit(8, 3));
        assertEquals(9, testToLogic1.sumLimit(8, 1));
        assertEquals(50, testToLogic1.sumLimit(11, 39));
        assertEquals(11, testToLogic1.sumLimit(11, 99));
        assertEquals(0, testToLogic1.sumLimit(0, 0));
        assertEquals(99, testToLogic1.sumLimit(99, 0));
        assertEquals(99, testToLogic1.sumLimit(99, 1));
        assertEquals(124, testToLogic1.sumLimit(123, 1));
        assertEquals(1, testToLogic1.sumLimit(1, 123));
        assertEquals(83, testToLogic1.sumLimit(23, 60));
        assertEquals(23, testToLogic1.sumLimit(23, 80));
        assertEquals(9001, testToLogic1.sumLimit(9000, 1));
        assertEquals(90000001, testToLogic1.sumLimit(90000000, 1));
        assertEquals(9000, testToLogic1.sumLimit(9000, 1000));
    }

}

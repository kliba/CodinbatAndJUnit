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
}

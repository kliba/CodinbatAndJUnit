package logic2test;

import logic2.Logic2;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Logic2Test {

    Logic2 testLogic2 = new Logic2();

    //******https://codingbat.com/java/Logic-2******first column

    //makeBricks
    @Test
    public void makeBricks() {
        assertTrue(testLogic2.makeBricks(3, 1, 8));
        assertFalse(testLogic2.makeBricks(3, 1, 9));
        assertTrue(testLogic2.makeBricks(3, 2, 10));
        assertTrue(testLogic2.makeBricks(3, 2, 8));
        assertFalse(testLogic2.makeBricks(3, 2, 9));
        assertTrue(testLogic2.makeBricks(6, 1, 11));
        assertFalse(testLogic2.makeBricks(6, 0, 11));
        assertTrue(testLogic2.makeBricks(1, 4, 11));
        assertTrue(testLogic2.makeBricks(0, 3, 10));
        assertFalse(testLogic2.makeBricks(1, 4, 12));
        assertTrue(testLogic2.makeBricks(3, 1, 7));
        assertFalse(testLogic2.makeBricks(1, 1, 7));
        assertTrue(testLogic2.makeBricks(2, 1, 7));
        assertTrue(testLogic2.makeBricks(7, 1, 11));
        assertTrue(testLogic2.makeBricks(7, 1, 8));
        assertFalse(testLogic2.makeBricks(7, 1, 13));
        assertTrue(testLogic2.makeBricks(43, 1, 46));
        assertFalse(testLogic2.makeBricks(40, 1, 46));
        assertTrue(testLogic2.makeBricks(40, 2, 47));
        assertTrue(testLogic2.makeBricks(40, 2, 50));
        assertFalse(testLogic2.makeBricks(40, 2, 52));
        assertFalse(testLogic2.makeBricks(22, 2, 33));
        assertTrue(testLogic2.makeBricks(0, 2, 10));
        assertTrue(testLogic2.makeBricks(1000000, 1000, 1000100));
        assertFalse(testLogic2.makeBricks(2, 1000000, 100003));
        assertTrue(testLogic2.makeBricks(20, 0, 19));
        assertFalse(testLogic2.makeBricks(20, 0, 21));
        assertFalse(testLogic2.makeBricks(20, 4, 51));
        assertTrue(testLogic2.makeBricks(20, 4, 39));
    }

    //noTeenSum
    @Test
    public void testNoTeenSum() {
        assertEquals(6, testLogic2.noTeenSum(1, 2, 3));
        assertEquals(3, testLogic2.noTeenSum(2, 13, 1));
        assertEquals(3, testLogic2.noTeenSum(2, 1, 14));
        assertEquals(18, testLogic2.noTeenSum(2, 1, 15));
        assertEquals(19, testLogic2.noTeenSum(2, 1, 16));
        assertEquals(3, testLogic2.noTeenSum(2, 1, 17));
        assertEquals(3, testLogic2.noTeenSum(17, 1, 2));
        assertEquals(19, testLogic2.noTeenSum(2, 15, 2));
        assertEquals(16, testLogic2.noTeenSum(16, 17, 18));
        assertEquals(0, testLogic2.noTeenSum(17, 18, 19));
        assertEquals(32, testLogic2.noTeenSum(15, 16, 1));
        assertEquals(30, testLogic2.noTeenSum(15, 15, 19));
        assertEquals(31, testLogic2.noTeenSum(15, 19, 16));
        assertEquals(5, testLogic2.noTeenSum(5, 17, 18));
        assertEquals(16, testLogic2.noTeenSum(17, 18, 16));
        assertEquals(0, testLogic2.noTeenSum(17, 19, 18));
    }

    //blackjack
    @Test
    public void testBlackjack() {
        assertEquals(21, testLogic2.blackjack(19, 21));
        assertEquals(21, testLogic2.blackjack(21, 19));
        assertEquals(19, testLogic2.blackjack(19, 22));
        assertEquals(19, testLogic2.blackjack(22, 19));
        assertEquals(0, testLogic2.blackjack(22, 50));
        assertEquals(0, testLogic2.blackjack(22, 22));
        assertEquals(1, testLogic2.blackjack(33, 1));
        assertEquals(2, testLogic2.blackjack(1, 2));
        assertEquals(0, testLogic2.blackjack(34, 33));
        assertEquals(19, testLogic2.blackjack(17, 19));
        assertEquals(18, testLogic2.blackjack(18, 17));
        assertEquals(16, testLogic2.blackjack(16, 23));
        assertEquals(4, testLogic2.blackjack(3, 4));
        assertEquals(3, testLogic2.blackjack(3, 2));
        assertEquals(21, testLogic2.blackjack(21, 20));
    }

    //******https://codingbat.com/java/Logic-2******first column
    //loneSum
    @Test
    public void testLoneSum() {
        assertEquals(6, testLogic2.loneSum(1, 2, 3));
        assertEquals(2, testLogic2.loneSum(3, 2, 3));
        assertEquals(0, testLogic2.loneSum(3, 3, 3));
        assertEquals(9, testLogic2.loneSum(9, 2, 2));
        assertEquals(9, testLogic2.loneSum(2, 2, 9));
        assertEquals(9, testLogic2.loneSum(2, 9, 2));
        assertEquals(14, testLogic2.loneSum(2, 9, 3));
        assertEquals(9, testLogic2.loneSum(4, 2, 3));
        assertEquals(3, testLogic2.loneSum(1, 3, 1));
    }

    //roundSum
    @Test
    public void testRoundSum() {
        assertEquals(60, testLogic2.roundSum(16, 17, 18));
        assertEquals(30, testLogic2.roundSum(12, 13, 14));
        assertEquals(10, testLogic2.roundSum(6, 4, 4));
        assertEquals(20, testLogic2.roundSum(4, 6, 5));
        assertEquals(10, testLogic2.roundSum(4, 4, 6));
        assertEquals(10, testLogic2.roundSum(9, 4, 4));
        assertEquals(0, testLogic2.roundSum(0, 0, 1));
        assertEquals(10, testLogic2.roundSum(0, 9, 0));
        assertEquals(40, testLogic2.roundSum(10, 10, 19));
        assertEquals(90, testLogic2.roundSum(20, 30, 40));
        assertEquals(100, testLogic2.roundSum(45, 21, 30));
        assertEquals(60, testLogic2.roundSum(23, 11, 26));
        assertEquals(70, testLogic2.roundSum(23, 24, 25));
        assertEquals(80, testLogic2.roundSum(25, 24, 25));
        assertEquals(70, testLogic2.roundSum(23, 24, 29));
        assertEquals(70, testLogic2.roundSum(11, 24, 36));
        assertEquals(90, testLogic2.roundSum(24, 36, 32));
        assertEquals(50, testLogic2.roundSum(14, 12, 26));
        assertEquals(40, testLogic2.roundSum(12, 10, 24));
    }

    //evenlySpaced
    @Test
    public void testEvenlySpaced() {
        assertTrue(testLogic2.evenlySpaced(2, 4, 6));
        assertTrue(testLogic2.evenlySpaced(4, 6, 2));
        assertFalse(testLogic2.evenlySpaced(4, 6, 3));
        assertTrue(testLogic2.evenlySpaced(6, 2, 4));
        assertFalse(testLogic2.evenlySpaced(6, 2, 8));
        assertTrue(testLogic2.evenlySpaced(2, 2, 2));
        assertFalse(testLogic2.evenlySpaced(2, 2, 3));
        assertTrue(testLogic2.evenlySpaced(9, 10, 11));
        assertTrue(testLogic2.evenlySpaced(10, 9, 11));
        assertFalse(testLogic2.evenlySpaced(10, 9, 9));
        assertFalse(testLogic2.evenlySpaced(2, 4, 4));
        assertFalse(testLogic2.evenlySpaced(2, 2, 4));
        assertFalse(testLogic2.evenlySpaced(3, 6, 12));
        assertFalse(testLogic2.evenlySpaced(12, 3, 6));
    }


    //******https://codingbat.com/java/Logic-2******third column

    //luckySum
    @Test
    public void testLuckySum() {
        assertEquals(6, testLogic2.luckySum(1, 2, 3));
        assertEquals(3, testLogic2.luckySum(1, 2, 13));
        assertEquals(1, testLogic2.luckySum(1, 13, 3));
        assertEquals(1, testLogic2.luckySum(1, 13, 13));
        assertEquals(13, testLogic2.luckySum(6, 5, 2));
        assertEquals(0, testLogic2.luckySum(13, 2, 3));
        assertEquals(0, testLogic2.luckySum(13, 2, 13));
        assertEquals(0, testLogic2.luckySum(13, 13, 2));
        assertEquals(13, testLogic2.luckySum(9, 4, 13));
        assertEquals(8, testLogic2.luckySum(8, 13, 2));
        assertEquals(10, testLogic2.luckySum(7, 2, 1));
        assertEquals(6, testLogic2.luckySum(3, 3, 13));
    }

    //closeFar
    @Test
    public void testCloseFar() {
        assertTrue(testLogic2.closeFar(1, 2, 10));
        assertFalse(testLogic2.closeFar(1, 2, 3));
        assertTrue(testLogic2.closeFar(4, 1, 3));
        assertFalse(testLogic2.closeFar(4, 5, 3));
        assertFalse(testLogic2.closeFar(4, 3, 5));
        assertTrue(testLogic2.closeFar(-1, 10, 0));
        assertTrue(testLogic2.closeFar(0, -1, 10));
        assertTrue(testLogic2.closeFar(10, 10, 8));
        assertFalse(testLogic2.closeFar(10, 8, 9));
        assertFalse(testLogic2.closeFar(8, 9, 10));
        assertFalse(testLogic2.closeFar(8, 9, 7));
        assertTrue(testLogic2.closeFar(8, 6, 9));
    }

    //makeChocolate
    @Test
    public void testMakeChocolate() {
        assertEquals(4, testLogic2.makeChocolate(4, 1, 9));
        assertEquals(-1, testLogic2.makeChocolate(4, 1, 10));
        assertEquals(2, testLogic2.makeChocolate(4, 1, 7));
        assertEquals(2, testLogic2.makeChocolate(6, 2, 7));
        assertEquals(0, testLogic2.makeChocolate(4, 1, 5));
        assertEquals(4, testLogic2.makeChocolate(4, 1, 4));
        assertEquals(4, testLogic2.makeChocolate(5, 4, 9));
        assertEquals(3, testLogic2.makeChocolate(9, 3, 18));
        assertEquals(-1, testLogic2.makeChocolate(3, 1, 9));
        assertEquals(-1, testLogic2.makeChocolate(1, 2, 7));
        assertEquals(1, testLogic2.makeChocolate(1, 2, 6));
        assertEquals(0, testLogic2.makeChocolate(1, 2, 5));
        assertEquals(5, testLogic2.makeChocolate(6, 1, 10));
        assertEquals(6, testLogic2.makeChocolate(6, 1, 11));
        assertEquals(-1, testLogic2.makeChocolate(6, 1, 12));
        assertEquals(-1, testLogic2.makeChocolate(6, 1, 13));
        assertEquals(0, testLogic2.makeChocolate(6, 2, 10));
        assertEquals(1, testLogic2.makeChocolate(6, 2, 11));
        assertEquals(2, testLogic2.makeChocolate(6, 2, 12));
        assertEquals(50, testLogic2.makeChocolate(60, 100, 550));
        assertEquals(6, testLogic2.makeChocolate(1000, 1000000, 5000006));
        assertEquals(7, testLogic2.makeChocolate(7, 1, 12));
        assertEquals(-1, testLogic2.makeChocolate(7, 1, 13));
        assertEquals(3, testLogic2.makeChocolate(7, 2, 13));
    }
}

package logic2;

public class Logic2 {

    //******https://codingbat.com/java/Logic-2******first column

    /**
     * We want to make a row of bricks that is goal inches long. We have a number of small bricks
     * (1 inch each) and big bricks (5 inches each).
     * Return true if it is possible to make the goal by choosing from the given bricks.
     * This is a little harder than it looks and can be done without any loops.
     * See also: Introduction to MakeBricks https://codingbat.com/doc/practice/makebricks-introduction.html
     *   makeBricks(3, 1, 8) → true
     *   makeBricks(3, 1, 9) → false
     *   makeBricks(3, 2, 10) → true
     * @param small int, means 1 inch each
     * @param big int, means 5 inches each
     * @param goal int, defines how many inches we expect
     * @return boolean, it is true if it is possible to make the goal by choosing from the given bricks
     */

    public boolean makeBricks(int small, int big, int goal) {
        if (goal > small + big * 5) {
            return false;
        }

        if (goal % 5 > small) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Given 3 int values, a b c, return their sum. However, if any of the values is a teen
     * -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens.
     * Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that
     * value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times
     * (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().
     *   noTeenSum(1, 2, 3) → 6
     *   noTeenSum(2, 13, 1) → 3
     *   noTeenSum(2, 1, 14) → 3
     * @param a int
     * @param b int
     * @param c int
     * @return int, its the sum of a, b and c. However, if any of the values is a teen
     * -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens.
     */

    public int noTeenSum(int a, int b, int c) {
        int valueOfA;
        int valueOfB;
        int valueOfC;

        if (a >= 13 && a <= 19) {
            if (a == 15 || a == 16) {
                valueOfA = a;
            } else {
                valueOfA = 0;
            }
        } else {
            valueOfA = a;
        }

        if (b >= 13 && b <= 19) {
            if (b == 15 || b == 16) {
                valueOfB = b;
            } else {
                valueOfB = 0;
            }
        } else {
            valueOfB = b;
        }

        if (c >= 13 && c <= 19) {
            if (c == 15 || c == 16) {
                valueOfC = c;
            } else {
                valueOfC = 0;
            }
        } else {
            valueOfC = c;
        }

        return valueOfA + valueOfB + valueOfC;
    }

    /**
     * Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
     * Return 0 if they both go over.
     *   blackjack(19, 21) → 21
     *   blackjack(21, 19) → 21
     *   blackjack(19, 22) → 19
     * @param a int, bigger than 0
     * @param b int, bigger than 0
     * @return int, its whichever value is nearest to 21 without going over. Return 0 if they both go over.
     */

    public int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        } else if (a > 21) {
            return b;
        } else if (b > 21) {
            return a;
        } else if (a == b) {
            return a;
        } else if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //******https://codingbat.com/java/Logic-2******second column

    /**
     * Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,
     * it does not count towards the sum.
     *   loneSum(1, 2, 3) → 6
     *   loneSum(3, 2, 3) → 2
     *   loneSum(3, 3, 3) → 0
     * @param a int
     * @param b int
     * @param c int
     * @return int, its sum of a, b and c. However, if one of the values is the same as another of the values,
     * it does not count towards the sum.
     */

    public int loneSum(int a, int b, int c) {
        if (a == b && b == c)
            return 0;
        else if (a == b)
            return c;
        else if (a == c)
            return b;
        else if (b == c)
            return a;
        else
            return a + b + c;
    }

    /**
     * For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more,
     * so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit
     * is less than 5, so 12 rounds down to 10.
     * Given 3 ints, a b c, return the sum of their rounded values.
     * To avoid code repetition, write a separate helper "public int round10(int num)
     * {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().
     *   roundSum(16, 17, 18) → 60
     *   roundSum(12, 13, 14) → 30
     *   roundSum(6, 4, 4) → 10
     * @param a int
     * @param b int
     * @param c int
     * @return int, its the sum of the a, b and c rounded values
     */

    public int roundSum(int a, int b, int c) {
        int roundedA;
        int roundedB;
        int roundedC;
        int remainingA = a % 10;
        int remainingB = b % 10;
        int remainingC = c % 10;

        if (remainingA >= 5)
            roundedA = a + (10 - remainingA);
        else
            roundedA = a - (remainingA);

        if (remainingB >= 5)
            roundedB = b + (10 - remainingB);
        else
            roundedB = b - (remainingB);

        if (remainingC >= 5)
            roundedC = c + (10 - remainingC);
        else
            roundedC = c - (remainingC);

        return roundedA + roundedB + roundedC;
    }

    /**
     * Given three ints, a b c, one of them is small, one is medium and one is large.
     * Return true if the three values are evenly spaced, so the difference between small and medium is
     * the same as the difference between medium and large.
     *   evenlySpaced(2, 4, 6) → true
     *   evenlySpaced(4, 6, 2) → true
     *   evenlySpaced(4, 6, 3) → false
     * (1,2,3    1,3,2   2,1,3   2,3,1   3,2,1   3,1,2)
     * @param a int
     * @param b int
     * @param c int
     * @return boolean, it is true if the three values are evenly spaced, so the difference between small and medium is
     * the same as the difference between medium and large
     */

    public boolean evenlySpaced(int a, int b, int c) {
        if (c - b == b - a ||
                b - c == c - a ||
                c - a == a - c ||
                b - a == a - c ||
                a - b == b - c ||
                a - c == c - b)
            return true;
        else
            return false;
    }


    //******https://codingbat.com/java/Logic-2******third column

    /**
     * Given 3 int values, a b c, return their sum. However, if one of the values is 13 then
     * it does not count towards the sum and values to its right do not count.
     * So for example, if b is 13, then both b and c do not count.
     *   luckySum(1, 2, 3) → 6
     *   luckySum(1, 2, 13) → 3
     *   luckySum(1, 13, 3) → 1
     * @param a int
     * @param b int
     * @param c int
     * @return int, its a, b and c sum. However, if one of the values is 13 then
     * it does not count towards the sum and values to its right do not count.
     */

    public int luckySum(int a, int b, int c) {
        int valueOfA;
        int valueOfB;
        int valueOfC;

        if (a == 13) {
            valueOfA = 0;
            valueOfB = 0;
            valueOfC = 0;
        } else if (b == 13) {
            valueOfA = a;
            valueOfB = 0;
            valueOfC = 0;
        } else if (c == 13) {
            valueOfA = a;
            valueOfB = b;
            valueOfC = 0;
        } else {
            valueOfA = a;
            valueOfB = b;
            valueOfC = c;
        }

        return valueOfA + valueOfB + valueOfC;
    }

    /**
     * Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
     * while the other is "far", differing from both other values by 2 or more.
     * Note: Math.abs(num) computes the absolute value of a number.
     *   closeFar(1, 2, 10) → true
     *   closeFar(1, 2, 3) → false
     *   closeFar(4, 1, 3) → true
     * (1,2,5    1,5,2   2,1,5   2,5,1   5,2,1   5,1,2)
     * @param a int
     * @param b int
     * @param c int
     * @return boolean, it is true if one of b or c is "close" (differing from a by at most 1),
     * while the other is "far", differing from both other values by 2 or more
     */

    public boolean closeFar(int a, int b, int c) {
        if ((Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) ||
                (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2))
            return true;
        else
            return false;
    }

    /**
     * We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
     * Return the number of small bars to use, assuming we always use big bars before small bars.
     * Return -1 if it can't be done.
     *   makeChocolate(4, 1, 9) → 4
     *   makeChocolate(4, 1, 10) → -1
     *   makeChocolate(4, 1, 7) → 2
     * @param small int, means 1kg each
     * @param big int, means 5 kgs each
     * @param goal int, defines how many kilos chocolate we need
     * @return int, it is the number of small bars to use, assuming we always use big bars before small bars or
     * -1 if it can't be done.
     */

    public int makeChocolate(int small, int big, int goal) {

        //if the total weight is smaller than the goal OR small is smaller than the goal remaining of the goal
        //we return -1
        if (big * 5 + small < goal | small < goal % 5) return -1;

        //if weight of big is not bigger than the goal, we return with goal minus weight of big;
        if (big * 5 <= goal) return goal - big * 5;

        //any other way we return with the remaining.
        return goal % 5;
    }

}

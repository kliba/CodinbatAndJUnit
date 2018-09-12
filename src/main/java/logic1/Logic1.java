package logic1;

public class Logic1 {

    //******https://codingbat.com/java/Array-1******first column

    //When squirrels get together for a party, they like to have cigars. A squirrel party is successful
    //when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case
    //there is no upper bound on the number of cigars. Return true if the party with the given values is successful,
    //or false otherwise.
      //cigarParty(30, false) → false
      //cigarParty(50, false) → true
      //cigarParty(70, true) → true

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars >= 40 && cigars <= 60 && !isWeekend)
            return true;
        else if (cigars >= 40 && isWeekend)
            return true;
        else
            return false;
    }


    //You are driving a little too fast, and a police officer stops you. Write code to compute the result,
    //encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
    //If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2.
    //Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
     //caughtSpeeding(60, false) → 0
     //caughtSpeeding(65, false) → 1
     //caughtSpeeding(65, true) → 0

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if ((speed <= 60 && !isBirthday) ||
                (speed <= 65 && isBirthday))
            return 0;
        else if ((speed <= 80 && !isBirthday) ||
                (speed <= 85 && isBirthday))
            return 1;
        else
            return 2;
    }


    //The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
    //Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
      //love6(6, 4) → true
      //love6(4, 5) → false
      //love6(1, 5) → true

    public boolean love6(int a, int b) {
        if ((a == 6 || b == 6) ||
                a + b == 6 ||
                a - b == 6 ||
                b - a == 6)
        return true;
        else
            return false;
    }


    //Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
    //See also: Introduction to Mod: https://codingbat.com/doc/practice/mod-introduction.html
      //more20(20) → false
      //more20(21) → true
      //more20(22) → true

    public boolean more20(int n) {
        if (n % 20 == 1 || n % 20 == 2)
            return true;
        else
            return false;
    }


    //Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
    //Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
      //nearTen(12) → true
      //nearTen(17) → false
      //nearTen(19) → true

    public boolean nearTen(int num) {
        if (num % 10 < 3 || num % 10 >7)
            return true;
        else
            return false;
    }


    //We are having a party with amounts of tea and candy. Return the int outcome of the party encoded
    //as 0=bad, 1=good, or 2=great.
    //A party is good (1) if both tea and candy are at least 5.
    //However, if either tea or candy is at least double the amount of the other one, the party is great (2).
    //However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
      //teaParty(6, 8) → 1
      //teaParty(3, 8) → 0
      //teaParty(20, 6) → 2

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5)
            return 0;
        else if (tea >= candy * 2 || candy >= tea * 2)
            return 2;
        else
            return 1;
    }


    //Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
      //twoAsOne(1, 2, 3) → true
      //twoAsOne(3, 1, 2) → true
      //twoAsOne(3, 2, 2) → false

    public boolean twoAsOne(int a, int b, int c) {
        if (a + b == c || b + c == a || a + c == b)
            return true;
        else
            return false;
    }


    //Given three ints, a b c, return true if two or more of them have the same rightmost digit.
    //The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
      //lastDigit(23, 19, 13) → true
      //lastDigit(23, 19, 12) → false
      //lastDigit(23, 19, 3) → true

    public boolean lastDigit(int a, int b, int c) {
        int lastA;
        int lastB;
        int lastC;

        //get the rightmost character of the 'a' param and store that in lastA variable
        if (a > 9)
            lastA = a % 10;
        else
            lastA = a;
        //get the rightmost character of the 'b' param and store that in lastB variable
        if (b > 9)
            lastB = b % 10;
        else
            lastB = b;
        //get the rightmost character of the 'c' param and store that in lastC variable
        if (c > 9)
            lastC = c % 10;
        else
            lastC = c;
        //compare the local variables to each others to get the right output
        if (lastA == lastB || lastB == lastC || lastC == lastA)
            return true;
        else
            return false;
    }


    //Given two int values, return whichever value is larger. However if the two values have the same remainder
    //when divided by 5, then the return the smaller value. However, in all cases, if the two values are the same,
    //return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
    //maxMod5(2, 3) → 3
    //maxMod5(6, 2) → 6
    //maxMod5(3, 2) → 3

    public int maxMod5(int a, int b) {
        if (a % 5 == b % 5) {
            if (a > b)
                return b;
            else if (a < b)
                return a;
            else
                return 0;
        } else if (a > b) {
            return a;
        } else if (a < b) {
            return b;
        } else {
            return 0;
        }
    }


    //You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs,
    //which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to
    //exactly 10, the result is 10.
    //Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5.
    //Otherwise the result is 0.
      //blueTicket(9, 1, 0) → 10
      //blueTicket(9, 2, 0) → 0
      //blueTicket(6, 1, 4) → 10

    public int blueTicket(int a, int b, int c) {
        if (a + b == 10 || b + c == 10 || a + c == 10)
            return 10;
        else if (b + c + 10 == a + b || a + c + 10 == a + b)
            return 5;
        else
            return 0;


    }
}
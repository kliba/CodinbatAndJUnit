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
    }
}

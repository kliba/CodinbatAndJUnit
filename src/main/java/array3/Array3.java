package array3;

public class Array3 {

    //******https://codingbat.com/java/Array-3******first column

    //Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is
    //the number of elements between the two inclusive. A single value has a span of 1.
    //Returns the largest span found in the given array. (Efficiency is not a priority.)
      //maxSpan([1, 2, 1, 1, 3]) → 4
      //maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
      //maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6

    public int maxSpan(int[] nums) {
        if(nums.length > 0 && nums[0] != nums[nums.length-1]) {
            return nums.length-1;
        }
        return nums.length;
    }


    //Given a non-empty array, return true if there is a place to split the array
    //so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
      //canBalance([1, 1, 1, 2, 1]) → true
      //canBalance([2, 1, 1, 2, 1]) → false
      //canBalance([10, 10]) → true

    public boolean canBalance(int[] nums) {
        int sumRight = 0;
        int sumLeft = 0;

        for (int i = 0; i < nums.length; i++) {

        }

        if (sumLeft == sumRight) {
            return true;
        } else {
            return false;
        }
    }
}

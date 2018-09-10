package array1;

public class Array1 {

    //******https://codingbat.com/java/Array-1******first column

    //Given an array of ints, return true if 6 appears as either the first or last element in the array.
    //The array will be length 1 or more.
      //firstLast6([1, 2, 6]) → true
      //firstLast6([6, 1, 2, 3]) → true
      //firstLast6([13, 6, 1, 2, 3]) → false

    public boolean firstLast6(int[] nums) {
        boolean result = false;

        if (nums[0] == 6 || nums[nums.length - 1] == 6)
            result = true;

        return result;
    }


    //Given 2 arrays of ints, a and b, return true if they have the same first element or
    //they have the same last element. Both arrays will be length 1 or more.
      //commonEnd([1, 2, 3], [7, 3]) → true
      //commonEnd([1, 2, 3], [7, 3, 2]) → false
      //commonEnd([1, 2, 3], [1, 3]) → true

    public boolean commonEnd(int[] a, int[] b) {
        boolean result = false;

        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1])
            result = true;

        return result;
    }


    //Given an array of ints length 3, return a new array with the elements in reverse order,
    //so {1, 2, 3} becomes {3, 2, 1}.
      //reverse3([1, 2, 3]) → [3, 2, 1]
      //reverse3([5, 11, 9]) → [9, 11, 5]
      //reverse3([7, 0, 0]) → [0, 0, 7]

    public int[] reverse3(int[] nums) {
        int[] result = {nums[2], nums[1], nums[0]};

        return result;
    }


    //Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
      //middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
      //middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
      //middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]

    public int[] middleWay(int[] a, int[] b) {
        int[] result = {a[1], b[1]};

        return result;
    }


    //Given an int array length 2, return true if it does not contain a 2 or 3.
      //no23([4, 5]) → true
      //no23([4, 2]) → false
      //no23([3, 5]) → false

    public boolean no23(int[] nums) {
        boolean result = true;

        if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3)
            result = false;

        return result;
    }


    //Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
    // set the 3 element to 0. Return the changed array.
      //fix23([1, 2, 3]) → [1, 2, 0]
      //fix23([2, 3, 5]) → [2, 0, 5]
      //fix23([1, 2, 1]) → [1, 2, 1]

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3)
            nums[1] = 0;
        else if (nums[1] == 2 && nums[2] == 3)
            nums[2] = 0;

        return nums;
    }


    //Given an array of ints of even length, return a new array length 2 containing the middle two elements from
    //the original array. The original array will be length 2 or more.
      //makeMiddle([1, 2, 3, 4]) → [2, 3]
      //makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
      //makeMiddle([1, 2]) → [1, 2]

    public int[] makeMiddle(int[] nums) {
        int[] result = {nums[nums.length / 2 - 1], nums[nums.length / 2]};

        return result;
    }


}

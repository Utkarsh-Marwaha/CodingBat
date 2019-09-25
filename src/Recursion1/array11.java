package Recursion1;

public class array11 {

    public int array11(int[] nums, int index) {
        return array11(nums, index, 0);
    }


    public int array11(int[] nums, int index, int count) {

        if (nums.length == index){
            return count;
        }

        if (nums[index] == 11){
            return array11(nums, index+1, count+1);
        }

        return array11(nums, index+1, count);
    }


}

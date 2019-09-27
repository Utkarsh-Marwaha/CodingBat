package Array2;


public class zeroFront {

    public int[] zeroFront(int[] nums) {

        int index = nums.length - 1;

        for (int i = nums.length - 1; i >= 0 ; i--) {

            if (nums[i] != 0) {
                nums[index--] = nums[i];
            }
        }

        while (index >= 0){
            nums[index--] = 0;
        }

        return nums;
    }
}

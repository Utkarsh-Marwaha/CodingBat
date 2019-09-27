package Array2;

public class zeroMax {

    public int[] zeroMax(int[] nums) {

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0 && i+1 < nums.length){
                int val = largetOddValue(nums,i+1);
                nums[i] = val != Integer.MIN_VALUE ? val : 0;
            }
        }

        return nums;
    }

    public int largetOddValue (int nums[], int fromIndex){

        int maxValue = Integer.MIN_VALUE;

        for (int i = fromIndex; i < nums.length; i++){
            if (nums[i] % 2 == 1 && nums[i] > maxValue){
                maxValue = nums[i];
            }
        }

        return maxValue;
    }

}

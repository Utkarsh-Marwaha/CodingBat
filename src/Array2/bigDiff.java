package Array2;

public class bigDiff {

    public int bigDiff(int[] nums) {

        int max = nums[0], min = nums[0];

        for (int num : nums){
            if (num > max){
                max = num;
            }

            if (num < min){
                min = num;
            }
        }

        return max - min;
    }
}

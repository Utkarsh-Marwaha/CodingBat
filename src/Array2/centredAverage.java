package Array2;

public class centredAverage {
    public int centeredAverage(int[] nums) {

        int max = nums[0], min = nums[0];
        int sum = 0;

        for (int num : nums){
            if (num > max){
                max = num;
            }

            if (num < min){
                min = num;
            }

            sum+=num;
        }

        if (max!=min){
            sum -= (max + min);
            return sum/(nums.length-2);
        } else {
            sum-=max;
            return sum/(nums.length-1);
        }
    }

}

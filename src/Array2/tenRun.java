package Array2;

public class tenRun {

    public int[] tenRun(int[] nums) {

        int latestMultipleOfTen = -1;
        for (int i = 0; i < nums.length; i++){

            if (nums[i] % 10 == 0){
                latestMultipleOfTen = nums[i];
            }

            if (nums[i] % 10 != 0 && latestMultipleOfTen != -1){
                nums[i] = latestMultipleOfTen;
            }
        }

        return nums;
    }

}

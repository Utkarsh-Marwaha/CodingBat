package Array2;

public class isEverywhere {
    public boolean isEverywhere(int[] nums, int val) {

        for (int i = 0; i < nums.length - 1; i++){
            int first = nums[i];
            int second = nums[i+1];

            if (!(first == val || second == val)){
                return false;
            }
        }
        return true;
    }

}

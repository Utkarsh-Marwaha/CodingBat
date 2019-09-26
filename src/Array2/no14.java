package Array2;

public class no14 {

    public boolean no14(int[] nums) {

        boolean noOnes = false, noFours = false;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                noOnes = true;
            }
            if (nums[i] == 4){
                noFours = true;
            }
        }

        return !noOnes || !noFours;

    }

}

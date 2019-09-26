package Array2;

public class more14 {

    public boolean more14(int[] nums) {

        int numOfOnes = 0, numOfFours = 0;

        for (int i = 0; i < nums.length; i++ ){

            if (nums[i] == 1){
                numOfOnes++;
            }

            if (nums[i] == 4){
                numOfFours++;
            }

        }

        return numOfOnes > numOfFours;

    }

}

package Array2;

public class haveThree {

    public boolean haveThree(int[] nums) {

        int threeCount = 0;

        for(int i = 0; i < nums.length; i++){

            if (threeCount > 3){
                return false;
            }

            if (nums[i] == 3){
                threeCount++;
            }

            if (nums[i] == 3 && i + 1 < nums.length && nums[i+1] == 3){
                return false;
            }
        }

        return threeCount == 3;
    }

}

package Array2;

public class modThree {
    public boolean modThree(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++){

            boolean first  = isEven(nums[i]);
            boolean second = isEven(nums[i+1]);
            boolean third  = isEven(nums[i+2]);

            if (first && second && third){
                return true;
            } else if (!first && !second && !third){
                return true;
            }
        }

        return false;
    }

    public boolean isEven (int num){
        return num % 2 == 0;
    }


}

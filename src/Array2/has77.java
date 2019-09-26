package Array2;

public class has77 {

    public boolean has77(int[] nums) {


        for (int i = 0; i < nums.length; i++){

            if (nums[i]== 7 && i + 1 < nums.length && nums[i] == nums[i+1]){
                return true;
            }

            if (nums[i]== 7 && i + 2 < nums.length && nums[i] == nums[i+2]){
                return true;
            }
        }

        return false;
    }

}

package Array2;

public class has12 {

    public boolean has12(int[] nums) {

        for (int i = 0; i < nums.length; i++){

            if (nums[i] == 1){
                while (i < nums.length && nums[i] != 2){
                    i++;
                }

                if (i == nums.length){
                    return false;
                } else {
                    return true;
                }
            }
        }

        return false;
    }

}

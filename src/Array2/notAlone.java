package Array2;

public class notAlone {

    public int[] notAlone(int[] nums, int val) {


        for (int i = 0; i < nums.length; i++){

            if (nums[i] == val){

                if (i - 1 >= 0){
                    if (nums[i-1] == val){
                        continue;
                    } else if (i + 1 < nums.length){
                        if (nums[i+1] == val){
                            continue;
                        }
                        nums[i] = Math.max(nums[i-1], nums[i+1]);
                    }
                }
            }
        }

        return nums;
    }

}

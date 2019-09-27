package Array2;

public class withoutTen {

    public int[] withoutTen(int[] nums) {

        int index = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 10){
                nums[index++] = nums[i];
            }
        }

        while (index < nums.length){
            nums[index++] = 0;
        }

        return nums;
    }

}

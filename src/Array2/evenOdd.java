package Array2;

public class evenOdd {

    public int[] evenOdd(int[] nums) {

        int array[] = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                array[index++] = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 != 0){
                array[index++] = nums[i];
            }
        }

        return array;
    }

}

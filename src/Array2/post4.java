package Array2;

public class post4 {

    public int[] post4(int[] nums) {

        int indexOfLast4 = -1;

        for (int i = nums.length - 1; i >= 0; i--){
            if (nums[i] == 4){
                indexOfLast4 = i;
                break;
            }
        }

        int array[] = new int[nums.length - indexOfLast4 - 1];
        int index = 0;
        for (int i = indexOfLast4 + 1; i < nums.length; i++){
            array[index++] = nums[i];
        }

        return array;
    }
}

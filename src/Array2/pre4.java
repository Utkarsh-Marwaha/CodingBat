package Array2;

public class pre4 {

    public int[] pre4(int[] nums) {

        int indexOfFirst4 = -1;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 4){
                indexOfFirst4 = i;
                break;
            }
        }

        int array[] = new int[indexOfFirst4];
        int index = 0;
        for (int i = 0; i < array.length; i++){
            array[index++] = nums[i];
        }

        return array;
    }

}

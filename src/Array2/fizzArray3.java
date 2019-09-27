package Array2;

public class fizzArray3 {

    public int[] fizzArray3(int start, int end) {

        int[] nums = new int[end - start];
        int index = 0;

        for (int i = start; i < end; i++){
            nums[index++] = i;
        }

        return nums;
    }

}

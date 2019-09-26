package Array2;

public class sum67 {
    public int sum67(int[] nums) {

        int sum = 0;

        if (nums.length == 0){
            return 0;
        }

        for (int i = 0; i < nums.length; i++){

            if (nums[i] == 6){
                while (nums[i] != 7){
                    i++;
                }
                continue;
            } else {
                sum+=nums[i];
            }
        }

        return sum;
    }
}

package Array3;

public class maxSpan {

    public int maxSpan(int[] nums) {

        if (nums.length == 0){
            return 0;
        }

        int maxSpan = 1;

        for (int num: nums){

            int span = spanOf(nums, num);
            maxSpan  = span > maxSpan ? span : maxSpan;
        }

        return maxSpan;

    }

    private int spanOf(int[] nums, int val){

        int leftMostOccurrence = -1, rightMostOccurrence = -1;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                leftMostOccurrence = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--){
            if (nums[i] == val){
                rightMostOccurrence = i;
                break;
            }
        }

        if (leftMostOccurrence != -1){
            return rightMostOccurrence - leftMostOccurrence + 1;
        }
        return -1;
    }

}

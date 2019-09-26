package Array2;

public class twoTwo {

    public boolean twoTwo(int[] nums) {

        boolean areTwosAdjacent;

        for (int i = 0; i < nums.length; i++){

            // found two
            if (nums[i] == 2){

                areTwosAdjacent = false;

                // check next number
                if (i + 1 < nums.length){
                    if (nums[i+1] == 2){
                        areTwosAdjacent = true;
                    }
                }

                // check previous number
                if (i - 1 >= 0){
                    if (nums[i-1] == 2){
                        areTwosAdjacent = true;
                    }
                }

                if (!areTwosAdjacent){
                    return false;
                }
            }
        }

        return true;
    }

}

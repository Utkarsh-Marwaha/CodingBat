package Array2;

public class either24 {

    public boolean either24(int[] nums) {

        boolean twoNextToTwo = false;
        boolean fourNextToFour = false;

        for (int i = 0; i < nums.length - 1; i++){

            int first = nums[i];
            int second = nums[i+1];

            if (first == 2 && second == 2){
                twoNextToTwo = true;
            }

            if (first == 4 && second == 4){
                fourNextToFour = true;
            }
        }

        return twoNextToTwo ^ fourNextToFour;
    }

}

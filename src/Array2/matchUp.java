package Array2;

public class matchUp {

    public int matchUp(int[] nums1, int[] nums2) {

        int len = nums1.length;
        int count = 0;

        for (int i = 0; i < len; i++){
            if ((nums1[i] != nums2[i]) && (Math.abs(nums1[i] - nums2[i]) <= 2)){
                count++;
            }
        }

        return count;
    }

}

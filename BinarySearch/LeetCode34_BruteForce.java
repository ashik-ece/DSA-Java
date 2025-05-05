package BinarySearch;

public class LeetCode34_BruteForce {

    public int[] searchRange(int[] nums, int target) {

            int[] result = new int[2];
            result[0] = -1;
            result[1] = -1;

            // Bad, brute force approach (TC : O(N^2))
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == target) {
                    result[0] = i;
                    break;
                }
            }
            for(int j = nums.length-1; j >= 0; j--) {
                if(nums[j] == target) {
                    result[1] = j;
                    break;
                }
            }
            return result;

            //slightly more optimised approach (TC : O(N))
//            int first = -1;
//            int last = -1;
//            for(int k = 0; k < nums.length; k++) {
//                if(nums[k] == target) {
//                    if(first == -1) {
//                        first = k;
//                    }
//                    last = k;
//                }
//            }
//            result[0] = first;
//            result[1] = last;
//            return result;
        }

}

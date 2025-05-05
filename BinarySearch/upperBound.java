// UpperBound : smallest index value > target
// lowerbound : Smallest index value >= target


// problem statement : Given a sorted array of N integers and an integer x, write a program to find the upper bound of x.
package BinarySearch;

public class upperBound {


    public static int findUpperBound(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = n;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] arr = {1,2,2,3};
        int[] arr = {3,5,8,9,15,19};
        int target = 9;
        System.out.println(findUpperBound(arr,target));
    }


}

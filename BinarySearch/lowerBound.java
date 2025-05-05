// Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the lower bound of x.
// lower bound : Smallest value for which arr[mid] >= target (x)
package BinarySearch;

public class lowerBound {

    public static int findLowerBound(int[] arr, int target) {
        int n = arr.length;
        int ans = n;
        int low = 0;
        int high = n-1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int target = 2;

        int[] arr2 = {3,5,8,15,19};
        int target2 = 9;

//        System.out.println(findLowerBound(arr,target));
        System.out.println(findLowerBound(arr2,target2));
    }

}

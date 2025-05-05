// Count Occurrences in Sorted Array
// Problem Statement: You are given a sorted array containing N integers and a number X, you have to find the occurrences of X in the given array.

package BinarySearch;

public class countOccurance {

    // brute force TC (O(N))

    static int bruteForce(int[] arr, int target) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    //optimized approach
     static int firstOcc(int[] arr, int target) {
        int first = -1;
        int high = arr.length-1;
        int low = 0;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if(arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

     static int lastOcc(int[] arr, int target) {
        int last = -1;
        int low = 0;
        int high = arr.length-1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }

    static int optimized(int[] arr, int target) {
        int lastOcc = lastOcc(arr,target);
        int firstOcc = firstOcc(arr,target);

        return lastOcc - firstOcc + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 2, 3};
        int target = 2;
        System.out.println(optimized(arr,target));
    }
}

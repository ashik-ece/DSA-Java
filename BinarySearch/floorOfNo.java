// floor : greatest number less than equal to target
// same concept as ceiling, but here we return end in case the target is not in the array
//eg: arr = [2,3,5,9,14,16,18], target = 14, floor = 14. target = 13, floor = 9. [In here, return the index, not the value.]

package BinarySearch;

public class floorOfNo {

    // return the greatest number <= target
    public static int floorNo(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        //what if the target is smaller than the smallest element in the array? (corner case)
        // but even if we don't add this, it will return -1 because, when the while loop terminates, the
        // end index will go from 0 to -1
        if(target < arr[0]) {
            return -1;
        }



        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 4;
        System.out.println(floorNo(arr, target));
    }

}

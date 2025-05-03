// floor : greatest number less than equal to target
// same concept as ceiling, but here we return end in case the target is not in the array
//eg: arr = [2,3,5,9,14,16,18], target = 14, floor = 14. target = 13, floor = 9. [In here, return the index, not the value.]

package BinarySearch;

public class floorOfNo {


    public static int floorNo(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

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
        int target = 14;
        System.out.println(floorNo(arr, target));
    }

}

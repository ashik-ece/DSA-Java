// ceiling : Return the index of smallest number >= target. eg: if target is 15 and is present in array, return 15, if not present in array, return the next.
// eg: arr = [2,3,5,9,14,16,18], target = 14, ceiling = 14. target = 15, ceiling = 16. [In here, return the index, not the value.]

package BinarySearch;

public class ceilingOfNo {

    public static int ceilingNo(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // if (arr[mid] == target) {
            // return mid;
            // }
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;
        System.out.println(ceilingNo(arr, target));
    }
}

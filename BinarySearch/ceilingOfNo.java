// ceiling : Return the index of smallest number >= target. eg: if target is 15 and is present in array, return 15, if not present in array, return the next.
// eg: arr = [2,3,5,9,14,16,18], target = 14, ceiling = 14. target = 15, ceiling = 16. [In here, return the index, not the value.]
// this is because when the target is not in the array, the while loop will terminate, and the cieling is the next smallest value, that is the start
// the purpose of start and end is to narrow the answer value (mid). so, the answer lies inbetween start and end.
// when the target is in the array, it lies in between start and end, the while loop doesnt terminate, bacause the condition target == arr[mid] will be satisfied because the target is present in the array
// but when the target is not present in the array, the while loop condtion (start <= end) will terminate, because the loop wont be able to find the target in the array. so when the loop terminates,
// ie: start > end, the next smallest number to the target is the start. hence we return start.
/*
* eg : case - 1 : Target is in the array:
*     Start     answer      end
* - Here the answer lies in between start and end, (because the target is in the array)
* - Hence, the while loop (start <= end) is satisfied .
* - Hence, we return the answer.
*
* eg : Case - 2 : Target is not in the array. (need to retrun the next smallest element of the target)
*
*       End     answer      Start
*
* - Here, since the target is not in the array, after some iterations, the while loop (start <= end) will terminate/exceed
* - So the Start will be greater than the end or (start > end (or) end < start)
* - so the answer still lies between start and end, but since start is the next smallest element in the array, we return start
*
* eg : Case 2 : Numerical Example: arr = [2,3,5,9,14,16,18], target : 15
*
* - Now 15 is not in the array, so first the while loop (start <= end) will run as earlier start < end
* - but as the iterations go on, and Since the target is not in the loop, the start pointer will exceed the end pointer
* - that is start > end, here the while loop is not satisfied and is terminated.
*
* - so now,
*           - the end pointer : 14
*           - the answer : 15
*           - the start pointer : 16 (start > end)
*
* - so the answer still lies between start and end, and the ceiling which is the next smallest target THAT IS "START" is returned
* */
package BinarySearch;

public class ceilingOfNo {

    // return the index of smallest number >= target
    public static int ceilingNo(int[] arr, int target) {

//        // but what if the target is greater than the greatest/largest element in the array? (corner case)
        if(target > arr[arr.length-1]) {
            return -1;
        }

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
        int target = 20;
        System.out.println(ceilingNo(arr, target));
    }
}

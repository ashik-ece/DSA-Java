package linearSearch;

public class minNumber {
    // assume arr size != 1;
    static int minimumNumber(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 3, 14, 28 };
        System.out.println(minimumNumber(arr));
    }
}

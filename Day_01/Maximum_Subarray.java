public class Maximum_Subarray {
    /*
     * Kadane's Algorithm
     */
    public static int maxisub(int[] arr, int n) {
        int min = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min += arr[i];
            maxi = Math.max(maxi, min);
            min = Math.max(min, 0);
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;
        int ans = maxisub(arr, n);
        System.err.println(ans);
    }
}

public class Third_Largest {
    public static int Third(int[] arr) {
        int n = arr.length;
        long max = Long.MIN_VALUE;
        long sec_max = Long.MIN_VALUE;
        long third_max = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > sec_max && arr[i] != max) {
                sec_max = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > third_max && arr[i] != max && arr[i] != sec_max) {
                third_max = arr[i];
            }
        }
        if (third_max == Long.MIN_VALUE) {
            return (int) max;
        } else {
            return (int) third_max;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, -2147483648 };
        int ans = Third(arr);
        System.out.println(ans);
    }
}
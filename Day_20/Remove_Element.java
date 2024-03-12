public class Remove_Element {
    public static int Remove(int[] arr, int n, int val) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != val) {
                arr[count++] = arr[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 3 };
        int n = arr.length;
        int val = 3;
        int ans = Remove(arr, n, val);
        System.out.println(ans);
    }
}
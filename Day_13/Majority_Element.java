public class Majority_Element {
    // Boyer-Moore Algorithm
    public static int Major(int[] arr) {
        int n = arr.length;
        int count = 0;
        int major = arr[0];
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                major = arr[i];
                count++;
            } else if (arr[i] == major) {
                count++;
            } else {
                count--;
            }
        }
        return major;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        int ans = Major(arr);
        System.out.println(ans);
    }
}

public class Counting_Bits {
    public static int[] count(int n) {
        int[] res = new int[n + 1];
        // Corner Case
        if (n == 0) {
            return res;
        }
        for (int i = 1; i <= n; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] ans = count(n);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}

public class Count_Matches {
    // Time Complexity --> O(1)
    public static int Match1(int n) {
        return n - 1;
    }

    // Time Complexity --> O(log(n))
    public static int Match(int n) {
        int result = 0;
        while (n > 1) {
            if (n % 2 == 0) { // even
                result += n / 2;
                n = n / 2;
            } else { // Odd
                result += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 7;
        int ans = Match1(n);
        System.out.print(ans);
    }
}

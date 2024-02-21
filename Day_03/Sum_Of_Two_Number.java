public class Sum_Of_Two_Number {
    // Iterative
    public static int sum(int a, int b) {
        // Corner case
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    // Recursive
    public static int rescsum(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return rescsum(a ^ b, (a & b) << 1);
        }
    }

    public static void main(String[] args) {
        int a = 6, b = 4;
        int ans = rescsum(a, b);
        System.out.print(ans);
    }
}
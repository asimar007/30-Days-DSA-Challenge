public class Reverse_Integer {
	public static int Reverse(int n) {
		int rev = 0;
		while (n != 0) {
			int digit = n % 10;
			if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
				return 0;
			}
			rev = (rev * 10) + digit;
			n /= 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int x = 120;
		int ans = Reverse(x);
		System.out.println(ans);
	}
}
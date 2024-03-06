public class Palindrome {
	public static boolean Pal(int n) {
		int temp = n;
		int reverse = 0, digit = 0;

		while (n > 0) {
			digit = n % 10;
			reverse = (reverse * 10) + digit;
			n /= 10;
		}
		if (reverse == temp) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int x = -121;
		boolean ans = Pal(x);
		System.out.println(ans);
	}
}
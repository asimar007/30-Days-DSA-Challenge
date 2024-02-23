public class Number_Of_1Bits {
	// unset right most set bits
	public static int Num1it(int n) {
		int count = 0;
		while (n > 0) {
			n = (n & (n - 1));
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int n = 00000000000000000000000000001011;
		int ans = Num1it(n);
		System.out.print(ans);
	}
}
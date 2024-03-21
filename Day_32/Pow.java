public class Pow {
	public static double Solve(double x, long n) {
		// Base Case
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return Solve(1 / x, -n);
		}
		if (n % 2 == 0) {
			return Solve(x * x, n / 2);
		} else {
			return x * Solve(x * x, (n - 1) / 2);
		}
	}

	public static void main(String[] args) {
		double x = 2.00000;
		int n = -2;
		double ans = Solve(x, (long) n);
		System.out.print(ans);
	}
}
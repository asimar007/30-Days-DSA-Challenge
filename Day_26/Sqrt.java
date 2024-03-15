public class Sqrt {
	public static int Root(int x) {
		// Base Case
		if (x <= 1) {
			return x;
		}
		// Using Binary Search
		int start = 1, end = x;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			int val = mid * mid;
			if (val == x) {
				return mid;
			} else if (val < x) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return end;
	}

	public static void main(String[] args) {
		int x = 28;
		int ans = Root(x);
		System.out.print(ans);
	}
}
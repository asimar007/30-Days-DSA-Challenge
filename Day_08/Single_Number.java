public class Single_Number {
	// Using XOR
	public static int SNumber(int[] nums, int n) {
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans ^= nums[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 1, 2, 1, 2 };
		int n = arr.length;
		int ans = SNumber(arr, n);
		System.out.println(ans);
	}
}
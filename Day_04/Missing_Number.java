public class Missing_Number {
	// Bit manupulation
	public static int bitmiss(int[] arr, int n) {
		int missing = 0;
		for (int i = 0; i <=n; i++) {
			missing ^= i ^ arr[i];
		}
		return missing;
	}

	// Using Gauss formula
	public static int missnumber(int[] arr, int n) {
		int total = 0;
		int sum = (n * (n + 1)) / 2;
		for (int num : arr) {
			total += num;
		}
		return sum - total;
	}

	public static void main(String[] args) {
		int arr[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int n = arr.length;
		int ans = bitmiss(arr, n);
		System.out.print(ans);
	}
}
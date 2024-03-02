public class Duplicate {
	public static int dup(int[] arr, int n) {
		int slow = arr[0];
		int fast = arr[0];

		// Hare And Tortoise
		slow = arr[slow];
		fast = arr[arr[fast]];

		// Detect Cycle
		while (slow != fast) {
			slow = arr[slow];
			fast = arr[arr[fast]];
		}

		// Find Duplicate
		slow = arr[0];
		while (slow != fast) {
			slow = arr[slow];
			fast = arr[fast];
		}
		// we can take any of two fast/slow
		return fast;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 2, 2 };
		int n = arr.length;
		int ans = dup(arr, n);
		System.out.println(ans);
	}
}
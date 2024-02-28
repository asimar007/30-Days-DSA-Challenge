public class MovesZero {
	public static int[] MovesZ(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while (count < n) {
			arr[count++] = 0;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 3, 12 };
		int n = arr.length;
		int[] ans = MovesZ(arr, n);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}
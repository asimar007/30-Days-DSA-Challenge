public class Plus_One {
	public static int[] POne(int[] arr, int n) {
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] == 9) {
				arr[i] = 0;
			} else {
				arr[i]++;
				return arr;
			}
		}
		arr = new int[n + 1];
		arr[0] = 1;
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 9 };
		int n = arr.length;
		int[] result = POne(arr, n);
		for (int num : result) {
			System.out.print(num + " ");
		}
	}
}
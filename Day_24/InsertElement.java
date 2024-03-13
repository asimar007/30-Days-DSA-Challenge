public class InsertElement {
	public static int SearchInsert(int[] arr, int n, int target) {
		int start = 0;
		int end = n - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6 };
		int n = arr.length;
		int target = 5;
		int ans = SearchInsert(arr, n, target);
		System.out.print(ans);
	}
}
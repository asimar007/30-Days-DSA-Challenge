public class Maxi_Product {
	public static int Maxxi(int[] arr) {
		int n = arr.length;
		int maxi = Integer.MIN_VALUE;
		int sec_maxi = Integer.MIN_VALUE;
		int mini = Integer.MAX_VALUE;
		int sec_mini = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (arr[i] > maxi) {
				sec_maxi = maxi;
				maxi = arr[i];
			} else if (arr[i] > sec_maxi) {
				sec_maxi = arr[i];
			}
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] < mini) {
				sec_mini = mini;
				mini = arr[i];
			} else if (arr[i] < sec_mini) {
				sec_mini = arr[i];
			}
		}
		int result = ((maxi * sec_maxi) - (mini * sec_mini));
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 5, 9, 7, 4, 8 };
		int ans = Maxxi(arr);
		System.out.println(ans);
	}
}
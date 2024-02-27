public class OneDto2D {
	public static int[][] matrix(int[] arr, int m, int n, int len) {
		// row=2(m) && column=2(n)
		int[][] st = new int[m][n];
		// Corner Case
		if (len != m * n) {
			return new int[][] {};
		}
		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				st[i][j] = arr[count++];
			}
		}
		return st;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int len = arr.length;
		int m = 2, n = 2;
		int[][] ans = matrix(arr, m, n, len);
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans.length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
}
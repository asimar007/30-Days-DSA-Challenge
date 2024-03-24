public class Transpose {
	public static int[][] Mat(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int[][] st = new int[n][m];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				st[j][i] = matrix[i][j];
			}
		}
		return st;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] ans = Mat(matrix);
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans.length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
}
import java.util.*;

public class Square_Array {
	public static int[] SortedSquare(int[] arr) {
		int n = arr.length;
		
		// Brute Force Approach
		for (int i = 0; i < n; i++) {
			arr[i] = (arr[i] * arr[i]);
		}
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { -7, -3, 2, 3, 11 };
		int[] ans = SortedSquare(arr);
		for (int num : ans) {
			System.out.print(num + " ");
		}
	}
}
import java.util.*;

public class Remove_Element {
	// Approach - 1
	public static int Remove_Dup(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (i < n - 1 && arr[i] == arr[i + 1]) {
				continue;
			} else {
				arr[count++] = arr[i];
			}
		}
		return count;
	}

	// Approach - 2
	public static int Remove_Dup1(int[] arr, int n) {
		HashSet<Integer> set = new HashSet<>();
		int count = 0;
		for (int x : arr) {
			if (!set.contains(x)) {
				set.add(x);
				arr[count++] = x;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int n = arr.length;
		int ans = Remove_Dup1(arr, n);
		System.out.print(ans);
	}
}
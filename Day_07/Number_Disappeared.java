import java.util.*;

public class Number_Disappeared {
	public static List<Integer> Disappear(int[] arr, int n) {
		List<Integer> res = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int idx = Math.abs(arr[i]) - 1;
			if (arr[idx] < 0)
				continue;
			arr[idx] *= -1;
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] > 0)
				res.add(i + 1);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		int n = arr.length;
		List<Integer> ans = new ArrayList<>();
		ans = Disappear(arr, n);
		System.out.print(ans + " ");
	}
}
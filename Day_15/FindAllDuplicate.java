import java.util.*;

public class FindAllDuplicate {
	public static List<Integer> Duplicate(int[] arr, int n) {
		// contain Unique Value
		HashSet<Integer> set = new HashSet<>();
		// contain Duplicate value
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (!set.add(arr[i])) {
				result.add(arr[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		int n = arr.length;
		List<Integer> ans = Duplicate(arr, n);
		System.out.print(ans);
	}
}
import java.util.*;

public class Dupliacte {
	public static boolean dup(int[] arr, int n) {
		HashSet<Integer> res = new HashSet<>();
		for (int num : arr) {
			if (res.contains(num)) {
				return true;
			}
			res.add(num);
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		int n = arr.length;
		boolean ans = dup(arr, n);
		System.out.println(ans);
	}
}
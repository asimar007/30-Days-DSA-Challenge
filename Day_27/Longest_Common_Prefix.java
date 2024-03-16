import java.util.*;

public class Longest_Common_Prefix {
	public static String Prefix(String[] str) {
		int n = str.length;
		// Corner Case
		if (str == null || n == 0) {
			return "";
		}
		Arrays.sort(str);
		String st1 = str[0];
		String st2 = str[n - 1];
		int i = 0;
		for (i = 0; i < st1.length(); i++) {
			if (st1.charAt(i) == st2.charAt(i)) {
			} else {
				break;
			}
		}
		return st1.substring(0, i);
	}

	public static void main(String[] args) {
		String[] str = { "flower", "flow", "flight" };
		String ans = Prefix(str);
		System.out.println(ans);
	}
}
public class Min_Change_Binary {
	public static int MinOp(String s) {
		int n = s.length();
		int start_with_0 = 0; // 0101010...
		int start_with_1 = 0; // 0101010...

		for (int i = 0; i < n; i++) {
			if ((i & 1) == 0) {
				if (s.charAt(i) == '0') {
					start_with_1++;
				} else {
					start_with_0++;
				}
			} else {
				if (s.charAt(i) == '1') {
					start_with_1++;
				} else {
					start_with_0++;
				}
			}
		}
		return Math.min(start_with_1, start_with_0);
	}

	public static void main(String[] args) {
		String s = "1111";
		int ans = MinOp(s);
		System.out.println(ans);
	}
}
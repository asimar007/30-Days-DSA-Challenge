public class Three_Same_Digit {
	public static String Digit(String s) {
		int n = s.length();
		char count = ' ';
		for (int i = 2; i < n; i++) {
			if (s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i - 2)) {
				count = (char) Math.max(count, s.charAt(i));
			}
		}
		if (count == ' ') {
			return "";
		} else {
			return new String(new char[] { count, count, count });
		}
	}

	public static void main(String[] args) {
		String st = "6777133339";
		System.out.println(Digit(st));
	}
}
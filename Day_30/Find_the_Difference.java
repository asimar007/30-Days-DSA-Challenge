public class Find_the_Difference {
	public static char Diff(String s, String t) {
		int XOR = 0;
		for (int i = 0; i < s.length(); i++) {
			XOR ^= s.charAt(i);
		}
		for (int i = 0; i < t.length(); i++) {
			XOR ^= t.charAt(i);
		}
		return (char) XOR;
	}

	public static void main(String[] args) {
		String s = "abcd", t = "abcde";
		char ans = Diff(s, t);
		System.out.print(ans);
	}
}
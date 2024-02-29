public class SmallestLatters {
	public static char SmallLatt(char[] latters, char target) {
		for (char latter : latters) {
			if (target < latter) {
				return latter;
			}
		}
		return latters[0];
	}

	public static void main(String[] args) {
		char[] latters = { 'c', 'f', 'j' };
		char target = 'i';
		char ans = SmallLatt(latters, target);
		System.out.println(ans + " ");
	}
}
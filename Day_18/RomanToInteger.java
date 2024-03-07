import java.util.HashMap;

public class RomanToInteger {
	public static int Roman(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		int n = s.length();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int result = 0;

		for (int i = 0; i < n; i++) {
			if (i < n - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
				result -= map.get(s.charAt(i));
			} else {
				result += map.get(s.charAt(i));
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String s = "MCMXCIV";
		int ans = Roman(s);
		System.out.println(ans);
	}
}
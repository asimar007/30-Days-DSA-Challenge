public class Length_Word {
	public static int LastWord(String s) {
		int count = 0;
		String st = s.trim(); //! To Remove Extra Space from 1st and Last
		/*
		 * Before s= "   fly me   to   the moon  ";
		 * After st= "fly me   to   the moon";
		 */
		for (int i = st.length() - 1; i >= 0; i--) {
			if (st.charAt(i) != ' ') {
				count++;
			} else {
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String s = "   fly me   to   the moon  ";
		int ans = (LastWord(s));
		System.out.print(ans);
	}
}
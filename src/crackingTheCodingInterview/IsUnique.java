package crackingTheCodingInterview;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
 * @author vvajagou
 *
 */
public class IsUnique {

	static boolean chars[] = new boolean[128];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdgrtfeyo";
		System.out.println(isUnique(str));
	}

	public static boolean isUnique(String str) {
		if (str.length() > 128) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (chars[str.charAt(i)]) {
				return false;
			}
			chars[str.charAt(i)] = true;
		}
		return true;
	}

}

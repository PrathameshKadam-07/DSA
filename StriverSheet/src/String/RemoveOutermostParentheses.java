package String;

public class RemoveOutermostParentheses {

	public String removeOuterParentheses(String s) {
		StringBuilder sb = new StringBuilder();
		int c = 0;
		int in = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(') {
				if (c == 0) {
					c++;
				} else {
					sb.append(s.charAt(i));
					in++;
				}

				if (s.charAt(i) == ')') {
					if (c != 0) {
						if (in != 0) {
							sb.append(s.charAt(i));
							in--;
						} else {
							c--;
						}
					}

				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {

	}
}

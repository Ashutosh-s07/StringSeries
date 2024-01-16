public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String S) {
        int count = 0;
        StringBuilder result = new StringBuilder();

        for (char c : S.toCharArray()) {
            if (c == '(') {
                if (count != 0) {
                    result.append(c);
                }
                count++;
            } else {
                if (count != 1) {
                    result.append(c);
                }
                count--;
            }
        }

        return result.toString();
    }
}

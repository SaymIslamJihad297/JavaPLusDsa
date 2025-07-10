
public class ValidParanthesesEasy {

    public static boolean isValid(String s) {
        StringBuilder stack = new StringBuilder();

        boolean valid = false;
        int i = 0;

        while (true) {
            if (i >= s.length()) {
                break;
            }
            char c = s.charAt(i);

            int lastInStack = stack.length() - 1;
            if (c == '(' || c == '{' || c == '[') {
                stack.append(c);
            } else if (c == ')') {
                if (stack.length() <= 0) {
                    valid = false;
                    break;
                } else if (stack.charAt(lastInStack) == '(') {
                    valid = true;
                    stack.deleteCharAt(lastInStack);
                } else {
                    valid = false;
                    break;
                }
            } else if (c == '}') {
                if (stack.length() <= 0) {
                    valid = false;
                    break;
                } else if (stack.charAt(lastInStack) == '{') {
                    valid = true;
                    stack.deleteCharAt(lastInStack);
                } else {
                    valid = false;
                    break;
                }
            } else if (c == ']') {
                if (stack.length() <= 0) {
                    valid = false;
                    break;
                } else if (stack.charAt(lastInStack) == '[') {
                    valid = true;
                    stack.deleteCharAt(lastInStack);
                } else {
                    valid = false;
                    break;
                }
            }

            i++;
        }

        if (stack.length() > 0) {
            return false;
        }

        return valid;
    }

    public static void main(String[] args) {
        System.out.println(isValid("([]){}"));
    }
}

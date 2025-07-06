public class LongestValidParantheses {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int longestValidParentheses(String s) {
        int n = s.length();
        int[] stack = new int[n];
        int top = -1;
        int[] valid = new int[n];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack[++top] = i;
            } else {
                if (top != -1) {
                    int matchedIndex = stack[top--];
                    valid[i] = 1;
                    valid[matchedIndex] = 1;
                }
            }
        }

        System.out.println("Valid matched array:");
        printArr(valid);

        int maxLen = 0, currentLen = 0;
        for (int i = 0; i < n; i++) {
            if (valid[i] == 1) {
                currentLen++;
                maxLen = Math.max(maxLen, currentLen);
            } else {
                currentLen = 0;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println("Answer: " + longestValidParentheses("(()"));
        System.out.println("Answer: " + longestValidParentheses(")()())"));
        System.out.println("Answer: " + longestValidParentheses(""));
        System.out.println("Answer: " + longestValidParentheses("(())())"));
        System.out.println("Answer: " + longestValidParentheses("(()())"));
        System.out.println("Answer: " + longestValidParentheses("()(()"));
    }
}

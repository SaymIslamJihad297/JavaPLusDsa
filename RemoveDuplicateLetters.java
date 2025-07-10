
public class RemoveDuplicateLetters {

    public static String removeDupicates(String s) {
        boolean[] arr = new boolean[26];

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a';
            if (arr[val] == false) {
                str.append(s.charAt(i));
                arr[val] = true;
            }
        }

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = 0; j < str.length()-1; j++) {
                if (str.charAt(j) > str.charAt(j + 1)) {
                    char temp = str.charAt(j + 1);
                    str.setCharAt(j + 1, str.charAt(j));
                    str.setCharAt(j, temp);
                }
            }

        }

        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDupicates("cbacdcbc"));
    }
}

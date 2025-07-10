public class RemoveStarsFromAString {

    public static String removeStars(String s) {

        StringBuilder str = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (str.length() > 0) {
                    str.deleteCharAt(str.length() - 1);
                }
            } else {
                str.append(c);
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
}

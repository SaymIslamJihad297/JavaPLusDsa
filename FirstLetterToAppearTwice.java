
public class FirstLetterToAppearTwice {

    public static char repeatedCharacter(String s) {
        int len = s.length();
        char repeatedChar = 'a';
        int i = 0;
        while (i < len - 1) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                repeatedChar = s.charAt(i);
                break;
            }
            i++;
        }

        return repeatedChar;
    }

    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abcdd"));
    }
}

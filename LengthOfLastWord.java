public class LengthOfLastWord {
 
    public static int lenOfLastWord(String s){

        int count = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }
    
    public static void main(String[] args) {
        int count = lenOfLastWord("   fly me   to   the moon  ");
        System.out.println(count);
    }
}

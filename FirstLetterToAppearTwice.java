
public class FirstLetterToAppearTwice {

    public static char repeatedCharacter(String s) {
        boolean[] seen = new boolean[26];

        int i = 0;
        
        for(char c: s.toCharArray()){
            int index = c - 'a';
            if(seen[index]){
                return c;
            }
            seen[index] = true;
        }

        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abcdd"));
    }
}



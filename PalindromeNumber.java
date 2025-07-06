public class PalindromeNumber {
    
    public static boolean isPalindrome(int x){

        String strX = String.valueOf(x);
        for(int i=0; i<strX.length()/2; i++){
            int len = strX.length();
            if(strX.charAt(i) != strX.charAt(len-i-1)){
                System.out.println(false);
                return false;
            }
        }

        System.out.println(true);
        return true;
    }

    public static void main(String[] args) {
        isPalindrome(121);
    }
}

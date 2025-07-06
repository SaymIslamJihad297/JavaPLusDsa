public class StringCompression {
    
    public static int stringCompression(char[] chars){
        String str = new String(chars);
        String newStr = "";

        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }

        char[] arr = newStr.toCharArray();
        int length = newStr.length();

        for(int i=0; i<arr.length; i++){
            chars[i]=arr[i];
        }
        return length;

    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        
        System.out.println(stringCompression(chars));
    }
}

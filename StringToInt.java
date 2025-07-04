
public class StringToInt {

    public static int myAtoi(String s) {
        String digits = "1234567890";
        int sign = 1;
        long convertedInt = 0;
        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }

        int i = 0;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < s.length() && digits.indexOf(s.charAt(i)) != -1) {
            int digit = s.charAt(i) - '0';

            if (convertedInt > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            convertedInt = convertedInt * 10 + digit;
            i++;
        }

        return (int) (convertedInt * sign);
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-67kjh5"));
    }
}

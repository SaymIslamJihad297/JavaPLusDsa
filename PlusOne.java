
public class PlusOne {

    public static int[] plusOne(int[] digits) {

        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;
        return result;

    }

    public static void main(String[] args) {
        int[] digits = {9, 9};
        int[] newDigits = plusOne(digits);

        for(int i=0; i<newDigits.length; i++){
            System.out.print(newDigits[i]+" ");
        }
    }
}

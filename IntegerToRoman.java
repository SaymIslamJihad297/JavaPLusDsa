public class IntegerToRoman {

    public static String intRoman(int num) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        String roman = new String();

        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman += symbols[i];
            }
        }

        return roman;
    }

    public static void main(String[] args) {
        System.out.println(intRoman(1994));
    }
}
public class FindLuckyInteger {

    public static int findLucky(int[] arr) {
        int[] counter = new int[501];

        int largestValue = -1;

        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (counter[arr[i]] == arr[i]) {
                if (largestValue < arr[i]) {
                    largestValue = arr[i];
                }
            }
        }

        return largestValue;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 7, 8, 4, 8, 8, 3, 7, 7, 6, 3, 7, 6, 5, 6, 8, 4, 5, 7, 4, 7, 7, 5, 2, 5, 6, 6, 8, 1, 6, 8, 8,
                8, 9, 3, 2, 9 };
        System.out.print(findLucky(arr));
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class SumInAMatrix {

    public static int matrixSum(int[][] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        int currentJ = 0;
        int biggestNumber = Integer.MIN_VALUE;
        int score = 0;

        for (int k = 0; k < nums[0].length; k++) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[0].length; j++) {
                    if (nums[i][j] >= biggestNumber) {
                        biggestNumber = nums[i][j];
                        currentJ = j;
                    }
                }
                nums[i][currentJ] = 0;

                list.add(biggestNumber);
                biggestNumber = Integer.MIN_VALUE;
            }
            System.out.println("Here is List: " + list);
            System.out.println(Collections.max(list));
            score += Collections.max(list);
            list.clear();
            biggestNumber = Integer.MIN_VALUE;
        }

        System.out.println("Final Score: " + score);
        return score;
    }

    public static void main(String[] args) {
        int[][] nums = {
            {5},
            {1, 9, 2},
            {8, 7}
        };
        matrixSum(nums);
    }
}

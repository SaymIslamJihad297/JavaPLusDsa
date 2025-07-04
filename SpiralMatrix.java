
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        int stRow = 0, stCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        List<Integer> list = new ArrayList<>();

        while (stRow <= endRow && stCol <= endCol) {

            for (int j = stCol; j <= endCol; j++) {
                list.add(matrix[stRow][j]);
            }

            for (int j = stRow + 1; j <= endRow; j++) {
                list.add(matrix[j][endCol]);
            }

            for (int j = endCol - 1; j >= stCol; j--) {
                if(stRow==endRow){
                    break;
                }
                list.add(matrix[endRow][j]);
            }

            for (int j = endRow - 1; j >= stRow + 1; j--) {
                if(stCol==endCol){
                    break;
                }
                list.add(matrix[j][stCol]);
            }

            stRow++;
            stCol++;
            endRow--;
            endCol--;
        }

        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},};
        System.out.println(spiralOrder(matrix));
    }
}

// [1,2,3,6,9,8,7,4,5]
// [1,2,3,4,8,12,11,10,9,5,6,7]
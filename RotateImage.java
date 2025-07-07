
public class RotateImage {

    public static void rotate(int[][] matrix) {

        int[][] clone = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            clone[i] = matrix[i].clone();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[j][matrix.length - 1 - i] = clone[i][j];
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };

        rotate(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

// row -> 1
// 0,0 -> 0,2
// 0,1 -> 1,2
// 0,2 -> 2,2
// row -> 2
// 1,0 -> 0,1
// 1,1 -> 1,1
// 1,2 -> 2,1
// row -> 3
// 2,0 -> 0,0
// 2,1 -> 1,0
// 2,2 -> 2,0


public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {5, 6, 7},
                {2, 4, 6},
        };

        for (int[] row : array) {
            int rowSum = 0;
            for (var entry : row) {
                rowSum += entry;
            }
            System.out.println(rowSum);
        }

        for (int col = 0; col < array[0].length; col++) {
            int colSum = 0;
            for (int row = 0; row < array.length; row++) {
                colSum += array[row][col];
            }
            System.out.println(colSum);
        }
    }
}
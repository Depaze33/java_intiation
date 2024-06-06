
public class Diagonal {
    public static void main(String[] args) {
        int[][] array2D = {
                { 10, 6, 5, 4, 5 },
                { 7, 10, 34, 7, 5 },
                { 28, 6, 10, 9, 14 },
                { 1, 2, 3, 10, 21 },
                { 4, 3, 10, 1, 10 }
        };
        int width = 5;
        int height = 5;
        int diagonalType = 1;
        int result = sumDiagonal(array2D, width, height, diagonalType);

        System.out.println("La somme des nombre est" + result);
    }

    public static int sumDiagonal(int[][] array2D, int width, int height, int diagonalType) {
        int sum = 0;
        if (diagonalType == 1) {
            for (int i = 0; i < height; i++) {

                sum = sum+ array2D[i][i];
            }
        } else if (diagonalType == 2) {
            for (int i = 0; i < height; i++) {
                sum += array2D[i][width - 1 - i];

            }
        } else {
            System.out.println("Diagonal non valide");
        }
        return sum;
    }
}

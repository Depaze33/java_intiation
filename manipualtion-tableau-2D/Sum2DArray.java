
public class Sum2DArray {

    public static void main(String[] args) {
        int[][] array2D = {
                { 4, 6, 5 },
                { 7, 11, 34 },
                { 28, 6, 2 },
                { 1, 2, 3 },
                { 4, 3, 10 }
        };
        int width = 5;
        int height = 5;
        int result = sumArray2D(array2D, width, height);
        System.out.println("La somme des nombre est"+ result);
    }

    public static int sumArray2D(int[][] array2D, int width, int height) {
        int sum = 0; 
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                sum = array2D[i][j];
            }
        }
        return sum;
    }
}

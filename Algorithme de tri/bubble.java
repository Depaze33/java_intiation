public class bubble {
    public static void main(String[] args) {
        int[] array = { 10, 70, 4, 1, 50, 85 };
        System.out.println("Le tableau avant l'algorithme de tri a bulle" + array);
        triABulle(array);
        displayResult(array);
    }

    public static void triABulle(int[] tableau) {
        int n = tableau.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (tableau[j] > tableau[j + 1]) {
                    // Échanger tableau[j] et tableau[j + 1]
                    int temp = tableau[j];
                    tableau[j] = tableau[j + 1];
                    tableau[j + 1] = temp;
                }
            }
        }
    }
    public static void displayResult(int[] tableau) {
        for (int j = 0; j < tableau.length; j++) {
            System.out.println(" Le tableau après l'algorithme de tri a bulle" + tableau);
        }
    }
}

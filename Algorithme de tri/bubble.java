public class bubble {
    public static void main(String[] args) {
        int[] array = { 10, 70, 4, 1, 50, 85, 45, 70, 50, 4, 9, 6};
        displayArray(array);
        triABulle(array);
        displayArray(array);
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
    public static void displayArray(int[] tableau) {
        System.out.println();
        for (int j = 0; j < tableau.length; j++) {
            System.out.print(tableau[j] + " "  );
        }
    }
}

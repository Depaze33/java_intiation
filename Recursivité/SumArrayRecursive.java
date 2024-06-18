public class SumArrayRecursive {
    
    // Méthode principale pour tester la fonction récursive
    public static void main(String[] args) {
        int[] array = {10,20};
        int sum = sumArray(array, array.length);
        System.out.println("La somme des éléments du tableau est : " + sum);
    }

    // Méthode récursive pour calculer la somme des éléments d'un tableau
    public static int sumArray(int[] array, int n) {
        // Condition de base : si la taille du tableau est 0, la somme est 0
        if (n <= 0) {
            return 0;
        } else {
            // Appel récursif en ajoutant le dernier élément à la somme des n-1 premiers éléments
            return array[n - 1] + sumArray(array, n - 1);
        }
    }
}

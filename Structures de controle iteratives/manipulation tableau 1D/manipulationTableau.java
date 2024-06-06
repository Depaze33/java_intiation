import java.util.Scanner;

public class manipulationTableau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Phase 1: Demander à l'utilisateur d'entrer le nombre d'entiers
        System.out.print("Entrez le nombre d'entiers que vous voulez saisir: ");
        int n = scanner.nextInt();
        
        // Initialiser le tableau pour stocker les nombres
        int[] nombres = new int[n];
        
        // Phase 2: Effectuer la saisie par l'utilisateur des nombres
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez le nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextInt();
        }
        
        // Phase 3: Calculer la moyenne, la valeur minimale et la valeur maximale
        int somme = 0;
        int min = nombres[0];
        int max = nombres[0];
        
        for (int i = 0; i < n; i++) {
            somme += nombres[i];
            if (nombres[i] < min) {
                min = nombres[i];
            }
            if (nombres[i] > max) {
                max = nombres[i];
            }
        }
        
        double moyenne = (double) somme / n;
        
        // Phase 4: Afficher tous les résultats obtenus
        System.out.println("Moyenne: " + moyenne);
        System.out.println("Valeur minimale: " + min);
        System.out.println("Valeur maximale: " + max);
        
        // Phase 5: Retourner un tableau de 3 éléments comprenant les résultats
        double[] resultats = {moyenne, min, max};
        
        // Afficher le tableau des résultats
        System.out.println("Tableau des résultats: [" + resultats[0] + ", " + resultats[1] + ", " + resultats[2] + "]");
        
        scanner.close();
    }
}

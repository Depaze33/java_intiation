import java.util.Scanner;

public class Factorielle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un entier n: ");
        int n = scanner.nextInt();
        long factorial = 1;

        // Vérifiez si n est négatif
        if (n < 0) {
            System.out.println("La factorielle n'est pas définie pour les entiers négatifs.");
        } else {
            // Calcul de la factorielle
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("La factorielle de " + n + " est : " + factorial);
        }
        scanner.close();
    }
}

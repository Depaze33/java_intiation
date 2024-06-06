import java.util.Scanner;
import java.util.Random;

public class JeuPlusMoins {
    public static void main(String[] args) {
        // Definir entre quels valeurs le chiffre est compris
        Random random = new Random();
        int nombreSecret = random.nextInt(100) + 1;
        // scanner
        Scanner scanner = new Scanner(System.in);
        // Declaration des variables
        int tentative = 1;
        int essaieMax = 3;
        
        
        // message utilisateur
        System.out.println("Bienvenue dans le jeu ");
        System.out.println("Saisissez un nombre entre 1 et 100");
       
        // boucle while pour trouver le nombre
        while (tentative <= essaieMax) { 
            int nombreUtilisateur= scanner.nextInt();
            if (nombreSecret == nombreUtilisateur) {
                System.out.println("Bravo vous avez trouvé le nombre");
            } else if (nombreSecret > nombreUtilisateur) {
                System.out.println("C'est plus grand");
            } else if (nombreSecret <  nombreUtilisateur) {
                System.out.println("Cest plus petit");
            }else{
                System.out.println("vous avez perdu");
            }

        }
        scanner.close();
    }
}

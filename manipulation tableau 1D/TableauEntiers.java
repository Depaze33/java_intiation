import java.util.Scanner;

public class TableauEntiers {
    public static void main(String[] args) {
        // Initialisation du scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer le nombre d'entiers qu'il veut saisir
        System.out.print("Entrez le nombre d'entiers que vous voulez saisir : ");
        int nombreDeValeurs = scanner.nextInt();

        // Création du tableau pour stocker les valeurs
        int[] valeurs = new int[nombreDeValeurs];


        // Saisie des valeurs par l'utilisateur
        for (int i = 0; i < nombreDeValeurs; i++) {
            System.out.print("Entrez l'entier " + (i + 1) + " : ");
            valeurs[i] = scanner.nextInt();
        }

        // Calculer la moyenne des valeurs
        double moyenne = calculerMoyenne(valeurs);

        // Retrouver les valeurs minimum et maximum
        int minimum = trouverMinimum(valeurs);
        int maximum = trouverMaximum(valeurs);

        // Afficher les résultats obtenus
        System.out.println("Moyenne : " + moyenne);
        System.out.println("Valeur minimum : " + minimum);
        System.out.println("Valeur maximum : " + maximum);

        // Fermeture du scanner
        scanner.close();
    }

    // Fonction pour calculer la moyenne
    public static double calculerMoyenne(int[] valeurs) {
        int somme = 0;
        for (int valeur : valeurs) {
            somme += valeur;
        }
        return (double) somme / valeurs.length;
    }

    // Fonction pour trouver la valeur minimum
    public static int trouverMinimum(int[] valeurs) {
        int min = valeurs[0];
        for (int valeur : valeurs) {
            if (valeur < min) {
                min = valeur;
            }
        }
        return min;
    }

    // Fonction pour trouver la valeur maximum
    public static int trouverMaximum(int[] valeurs) {
        int max = valeurs[0];
        for (int valeur : valeurs) {
            if (valeur > max) {
                max = valeur;
            }
        }
        return max;
    }
}

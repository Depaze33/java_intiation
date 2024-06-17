import java.time.Year;
import java.util.Scanner;

class MainEx1Nv1 {
    // LES CLASSES PRENNENT UNE MAJUSCULE
    public static void main(String[] args) {

        System.out.println("\nHello World!"); // Display the string.
        System.out.println("ce programme est cool");


        Scanner scanner1 = new Scanner(System.in);
        int birthYear = scanner1.nextInt();
        displayLegalStatus(birthYear);

      scanner1.close(); 
    }

    /**
     * fonction qui affiche en console si la personne est majeur
     * 
     * parametre d'entree : l'année de naissance de la personne
     * pas de type de retour
     */
    public static void displayLegalStatus(int birthYear) {

        // recuperer l'année actuelle
        int currentYear = Year.now().getValue();

        // faire soustraction et année annuel et parametre
        int age = currentYear - birthYear;
        // faire un if pour afficher le bon message
        if (age > 17) {
            System.out.println("Vous êtes majeur");
        } else {
            System.out.println("Vous êtes mineur");
        }
      }
}
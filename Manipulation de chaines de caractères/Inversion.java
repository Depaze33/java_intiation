import java.util.Scanner;

public class Inversion {
    public static void main(String[] args) {
        String userInput = askUser();
        String inverted = inverseString(userInput);
        System.out.println("La chaîne inversée est: " + inverted);
    }

    // appel du scanner
    public static Scanner scanner = new Scanner(System.in);

    // Fonction qui demande a l'utilisateur d'entrer une chaine de caractères
    public static String askUser() {

        System.out.println("Entrez une phrase");
        String userInput = scanner.nextLine();
        return userInput;
    }

    // fonction pour inverser les lettre de la chaine de caractères
    public static String inverseString(String str) {

       
        String newStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            newStr = newStr + str.charAt(i);
        }
        System.out.println(newStr);
        return newStr;
    }

}

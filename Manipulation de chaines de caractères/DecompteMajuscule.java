import java.util.Scanner;

public class DecompteMajuscule {
    public static void main(String[] args) {
        String userInput = askUser();
        int foundUppercase = findUppercase(userInput);
        System.out.println("Le nombre de majuscule est " + foundUppercase);

    }

    public static Scanner scanner = new Scanner(System.in);

    // fonction saisie utilisatuer
    public static String askUser() {

        System.out.println("Entrez une phrase");
        String userInput = scanner.nextLine();
        return userInput;
    }

    // Fonction decompte de majuscule
    public static int findUppercase(String inputToCheck) {
        int uppercase = 0;
        for (int i = 0; i < inputToCheck.length(); i++) {

            char val = inputToCheck.charAt(i);
            if (Character.isUpperCase(val)) {
                uppercase++;
            }
        }

        return uppercase;
    }
}
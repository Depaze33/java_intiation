import java.util.Scanner;

public class DecompteVoyelle {
    public static void main(String[] args) {

        String userInput = askUser();
        int foundVowel = findVowel(userInput);
        System.out.println("le nombre de voyelle est " + foundVowel);

    }

    public static Scanner scanner = new Scanner(System.in);

    // fonction saisie utilisatuer
    public static String askUser() {

        System.out.println("Entrez une phrase");
        String userInput = scanner.nextLine();
        return userInput;
    }

    // fonction qui donne le nombre de voyelle
    public static int findVowel(String inputToCheck) {

        int vowelNumber = 0;

        for (int i = 0; i < inputToCheck.length(); i++) {
            if (inputToCheck.charAt(i) == 'a' || inputToCheck.charAt(i) == 'e' || inputToCheck.charAt(i) == 'i'
                    || inputToCheck.charAt(i) == 'o' ||
                    inputToCheck.charAt(i) == 'u' || inputToCheck.charAt(i) == 'y') {
                vowelNumber++;

            }
        }

        return vowelNumber;

    }

}

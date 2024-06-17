package luhn;

public class LuhnAlgorithm {

    public static void main(String[] args) {
        String cardNumber = "12345678123456"; // Exemple de numéro de carte
        boolean isValid = validateLuhn(cardNumber);
        System.out.println("Le numéro de carte " + cardNumber + " est " + (isValid ? "valide" : "invalide"));
    }

    public static boolean validateLuhn(String cardNumber) {
        int sum = 0;
        boolean alternate = false;

        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int number = Integer.parseInt(cardNumber.substring(i, i + 1));
            if (alternate) {
                number *= 2;
                if (number > 9) {
                    number = (number % 10) + 1;
                }
            }
            sum += number;
            alternate = !alternate;
        }

        return (sum % 10 == 0);
    }
}


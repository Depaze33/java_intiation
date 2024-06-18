public class algoGlouton {
    public static void main(String[] args) {
        // Defnir les pieces a utiliser
        int change = 464;
        int[] money = { 200, 100, 50, 20, 10, 5, 2, 1 };
        int[] result = moneyCheck(money, change);
        displayResult(result, money);

       
    }

    // fonction pour le rendu de monaies
    public static int[] moneyCheck(int[] money, int change) {
        int[] result = new int[money.length];

        // boucle pour rendre la monaies
        for (int i = 0; i < money.length; i++) {
            // definir le rendu de monnaies
            result[i] = (change / money[i]);
            change = change % money[i];

        }
        return result;
    }

    // affiche resultat
    public static void displayResult(int[] result, int[] money) {
        for (int j = 0; j < result.length; j++) {
System.err.println("Le nombre de pieces de " + money[j] + " est " + result[j]);

        }
    }

}
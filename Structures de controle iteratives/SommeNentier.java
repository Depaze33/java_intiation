import java.util.Scanner;

public class SommeNentier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un entier n: ");
        int n = scanner.nextInt();

        int somme = 0;
        int i = 0;
        do {
            somme += 1;
            i++;
        } while (i <= n);

        System.out.println("La somme des entiers de " + n + " est: " + somme);

        scanner.close();
    }
}

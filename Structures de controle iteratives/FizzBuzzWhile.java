import java.util.Scanner;


public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int n = scanner.nextInt();
        int i = 0;

        while (i <= n) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else if (i % 5 == 0) {
                System.out.println("Fizz");
            }
            return;
        }
        scanner.close();

    }
}

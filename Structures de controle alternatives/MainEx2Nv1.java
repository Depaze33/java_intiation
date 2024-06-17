import java.util.Scanner;

public class MainEx2Nv1

{
	public static void main(String[] args) {
		System.out.println("Entrez 2 chiffres");

		Scanner scanner1 = new Scanner(System.in);
		
		int number1 = scanner1.nextInt();
		int number2 = scanner1.nextInt();
		int sum = number1 + number2;
		if (sum >= 100) {
			System.out.println("Le resultat est : " + (sum));
		} else  {
			System.out.println("Le resultat est : " + number1 * number2);

		}
		scanner1.close();
	}
}

////

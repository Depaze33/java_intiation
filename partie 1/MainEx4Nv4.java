import java.util.Scanner;

public class MainEx4Nv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une lettre : ");
        String input = scanner.nextLine();
        char letter = input.charAt(0);

        ChoiceLetter(letter);
        scanner.close();
    }

    public static void ChoiceLetter(char letter) {
        
        if (letter=='a' ||letter=='e' ||letter=='i' ||letter=='o' ||letter=='u' ||letter=='y' ||letter=='A' ||letter=='E' ||letter=='I' ||letter=='O' 
        ||letter=='U' ||letter=='Y' ){
            System.out.println("C'est une voyelle");
        }else{
            System.out.println("C'est une consonne");
        
    }
}
}

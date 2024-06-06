import java.util.Scanner;

class MainEx6Nv1 {

    public static void main(String[] args) {

        // Début de la suite de saisie utilisateur

        // 1 - afficahge de la question sur l'état matrimonial

        System.out.println("Quel est votre état matrimonial ?(C pour célibataire, A pour autre situation)");
        // 2 - saisie (avec un scanner) de l'état matrimonial
        Scanner scanner1 = new Scanner(System.in);
        String matrialStatuts = scanner1.nextLine();

        char scanner = matrialStatuts.charAt(0);
        int part = 0;

        if (scanner == 'c' || scanner == 'C') {
            part = 20;
            System.out.println("votre taux est majoré de 20%");
        } else if (scanner == 'a' || scanner == 'A') {
            part = 25;
            System.out.println("votre part est majoré de 25%");

        }
        // 3 - afficahge de la question portant sur le nombre d'enfatns
        System.out.println("Quel est votre nombre d'enfant ?");
        // 4 - saisie (avec un scanner) du nombre d'enfants
       
        int numberChildren = scanner1.nextInt();

        part = part + numberChildren * 15;

        ;
        // 5 - afficahge de la question sur le salaire mensuel
        System.out.println("Quel est votre salaire ?");

        // 6 - saisie (avec un scanner) du salaire mensuel
      
        int salaire = scanner1.nextInt();

        if (salaire <= 1800) {
            part = part + 10;

        }

        if (part >= 50) {
            part = 50;
            System.out.println("Votre taux est de" + part + "%");

        } else {
            System.out.println("Votre taux est de" + part + "%");
        }

        scanner1.close();
        
    }
}

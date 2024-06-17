import java.util.Scanner;

class MainEx3Nv1 {
    public static void main(String[] args) {
        System.out.println("Nombre max");

        // faire une saisie utilisateur en ligne de commande
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Entrez le premier nombre : ");

        float x = sc1.nextFloat();

        System.out.println("Saisir le deuxieme nombre : ");
        
        float y = sc1.nextFloat();
        if (x <= y) {
            System.out.println("le maximum des deux nombre  : " + x + "et" + y + "est egal a " + y);

        } else {
            System.out.println("le maximum des deux nombre  : " + x + "et" + y + "est egal a " + x);
        }

        sc1.close();
        
    }

}

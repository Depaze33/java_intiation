public class EstimationAbonnesFor {
    public static void main(String[] args) {
        // Nombre initial d'abonnés
        int abonnes = 2500;
        
        // Taux de croissance mensuel
        double tauxCroissance = 0.05;
        
        // Nombre de mois
        int mois = 24;
        
        // Utilisation d'une boucle for pour calculer la croissance mois par mois
        for (int i = 1; i <= mois; i++) {
            abonnes *= (1 + tauxCroissance);
        }
        
        // Affichage du résultat
        System.out.printf("Le nombre estimé d'abonnés après %d mois est : %d%n", mois, abonnes);
    }
}



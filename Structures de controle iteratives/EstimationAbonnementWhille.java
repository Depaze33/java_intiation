public class EstimationAbonnementWhille {

    public class EstimationAbonnesWhile {
        public static void main(String[] args) {
            // Nombre initial d'abonnés
            int abonnes = 2500;

            // Taux de croissance mensuel
            double tauxCroissance = 0.05;

            // Nombre de mois
            int mois = 24;
            int compteur = 0;

            // Utilisation d'une boucle while pour calculer la croissance mois par mois
            while (compteur < mois) {
                abonnes *= (1 + tauxCroissance);
                compteur++;
            }

            // Affichage du résultat
            System.out.printf("Le nombre estimé d'abonnés après %d mois est : %d%n", mois, abonnes);
        }
    }

}

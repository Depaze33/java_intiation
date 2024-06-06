import java.util.Arrays;

public class TableauInverse {
    public static void main (String[]args){
        int [] invertedTable = {54, 1, 4, 6, 8};
        for(int i = 0; i < invertedTable.length; i++) {

            int[] tableauInverse = invert(invertedTable);
        System.out.println(Arrays.toString(tableauInverse));
        }
    }
    public static int[] invert(int[] tableau) {
        int[] tableauInverse = new int[tableau.length];

        for (int i = 0; i < tableau.length; i++) {
            tableauInverse[i] = tableau[tableau.length - 1 - i];
        }

        return tableauInverse;
    }
}


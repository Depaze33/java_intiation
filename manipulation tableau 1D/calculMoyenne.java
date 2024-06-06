
public class calculMoyenne {
    public static void main(String[] args) {
        // tableau d'entiers
        int[] array = { 1, 2, 5, 4 };
        int total = 0;
        for (int i = 0; i < array.length; i++) {
total = total + array[i];}
double moyenne = total/array.length;
   System.out.println("La moyenne est :" + moyenne); }
}

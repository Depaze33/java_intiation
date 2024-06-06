

public class calculMoyenne {
    public static void main (String [] args){
        //tableau d'entiers
 double [] number = {2 ,2 ,2 ,2 };
double total =0;
//calcul de la moyenne 
for (int i=0; i < number.length; i++){
    total= total+number[i];

}
double moyenne = total / number.length;
System.out.println("La moyenne est" + moyenne);
 // moyenne des nombres du tableau
}}

public class averaging {
public static void main (String[]args){

    int [] array = {2, 5, 7, 1};
    int total = 0;

    for (int i=0; i<array.length; i++){
       total = total + array[i];
    }
double moyenne=  total/array.length;
System.out.println("La moyenne est " + moyenne);
}
}


public class indexRecherch {
    public static void main(String[] args) {
      int[] intArray = {24, 2, 0, 34, 12, 110, 2};
  
      int maxNum = intArray[0];
      int minNum = intArray[1];
  
      for (int max: intArray) {
        if (max > maxNum)
          maxNum = max;
      System.out.println("Le plus grand nombre est = " + maxNum);
    }
      for (int min: intArray) {
        if (min < minNum)
          minNum = min;
          System.out.println("Le plus petit nombre est = " + minNum);

    }
  }}
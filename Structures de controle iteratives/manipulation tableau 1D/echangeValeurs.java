public class echangeValeurs {
    public static void main(String[] args) {
        int[] array = { 4, 6, 2, 155 };
        int index1 = 2;
        int index2 = 3;
        swap(array, index1, index2);
    }

    public static void swap(int[] intArray, int firstIndex, int secondIndex) {
        int values = intArray[firstIndex];
        intArray[firstIndex] = intArray[secondIndex];
        intArray[secondIndex] = values;
    }

}

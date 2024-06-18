public class insertionSort {
    public static void main (String[] args){
        int[] tab = {1,12,4,5,93,21,8,11};  
        
        System.out.println("Avant le tri par insertion");    
        displayTab(tab);
          
        //trie un tableau en utilisant le tri par insertion
        insertion(tab); 
         
        System.out.println("Apres le tri par insertion");  
        displayTab(tab);   
    }
    public static void insertion(int []array){
        for (int i=0; i<array.length; i++){
            int index = array[i];  
            int j = i-1;  
         
            while(j >= 0 && array[j] > index)  
            {
                 array[j+1] = array[j];  
                 j--;  
            }  
            array[j+1] = index; 
     }  
  }
  static void displayTab(int[] tab)
  {      
       for(int i=0; i < tab.length; i++)
       {  
            System.out.print(tab[i] + " ");  
       } 
       System.out.println();
  }
    }


//Kaylea Stewart
//CMPS 390
public class SortingArray
{
   public static void main(String[] args)
   {
      int[] array1 = {31,13,7,28,14,86,55,79,20,89,95,27,73,88,47,76,43,47,60,28,19,27,57,36,22,4,39,97,20,19,48,93,5,54,61,91,91,37,75
                   ,83,98,7,77,37,29,18,85,10,6,66,69,35,74,44,98,23,80,19,21,88,22,82,56,2,25,1,65,29,25,32,48,44,65,28,3,23,75,65,86,
                   10,79,44,79,51,57,67,19,67,3,87,66,19,87,77,49,20,76,61,67,63,40,25,31,64,8,74,43,75,11,77,79,93,79,90,92,60,63,64,32,
                   63,87,46,75,99,20,32};
      bubbleSort(array1);
   }

   public static void bubbleSort(int[] array2)
   {      
      
      System.out.println("Original order: ");
      for (int element : array2)
         System.out.print(element + " ");

      
      int index;       
      int temp;        
      int count = 0;
      int count2 = 0;
      boolean swapped = true;


      while (swapped == true)
      {
         swapped = false;
         
         for (index = 0; index < array2.length - 1; index++)
         {
            count2++;
            
            if (array2[index] > array2[index + 1])
            {
               count++;
               
               temp = array2[index];
               array2[index] = array2[index + 1];
               array2[index + 1] = temp;
               swapped = true;
            }

         }
      }
      
      System.out.println("\nSorted order: ");
      for (int element : array2)
         System.out.print(element + " ");

      System.out.print("\n Swaps:" + count);
      System.out.print("\n Comparisons:" + count2);


   }

}
public class BubbleSort {

   public void sortArray(int[] x) {
    boolean swapped = true;
    while (swapped) {
       swapped = false;
       for(int i=1; i<x.length; i++) {
           int temp=0;
           if(x[i-1] > x[i]) {
               temp = x[i-1];
                x[i-1] = x[i];
                x[i] = temp;
                swapped = true;
            }
        }
    }
}

   public void printArray(int[] x) {
      for(int i=0; i<x.length; i++)
        System.out.print(x[i] + " ");
   }

   public static void main(String[] args) {
      
      BubbleSort b = new BubbleSort();
      int[] num = {31,13,7,28,14,86,55,79,20,89,95,27,73,88,47,76,43,47,60,28,19,27,57,36,22,4,39,97,20,19,48,93,5,54,61,91,91,37,75
                   ,83,98,7,77,37,29,18,85,10,6,66,69,35,74,44,98,23,80,19,21,88,22,82,56,2,25,1,65,29,25,32,48,44,65,28,3,23,75,65,86,
                   10,79,44,79,51,57,67,19,67,3,87,66,19,87,77,49,20,76,61,67,63,40,25,31,64,8,74,43,75,11,77,79,93,79,90,92,60,63,64,32,
                   63,87,46,75,99,20,32};
      b.sortArray(num);
      b.printArray(num);   
   }
 
}
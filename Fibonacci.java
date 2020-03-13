import java.util.Scanner;
public class Fibonacci {
 public static void main(String args[]) {
   System.out.print("Enter an positive integer to calculate Fibonacci number: ");
   Scanner input = new Scanner(System.in);
   long n = input.nextLong();
   if ( n <= 0 )
     System.out.println("Number should be positive integer.");
   else {
     long start = System.currentTimeMillis();
     System.out.println("Iterative: Fibonacci number F(" + n + ") = " +
     fibonacciIterative(n));
     long end = System.currentTimeMillis();
     System.out.println("Iterative: execution time = " + (end - start));
     start = System.currentTimeMillis();
     System.out.println("Recursive: Fibonacci number F(" + n + ") = " +
     fibonacciRecursive(n));
     end = System.currentTimeMillis();
     System.out.println("Recursive: execution time = " + (end - start));
   }
 }

 public static long fibonacciIterative(long n) {
   if(n <= 1) {
			return n;
		}
		long fib = 1;
		long prevFib = 1;
		
		for(int i=2; i<n; i++) {
			long temp = fib;
			fib+= prevFib;
			prevFib = temp;
		}
		return fib;
 }

 public static long fibonacciRecursive(long n) {
   if(n <= 1) {
			return n;
		}
		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
 }
}

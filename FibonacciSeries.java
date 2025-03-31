package Assignments;

public class FibonacciSeries {
    public static void printFibonacci(int n) {
        int first = 0, second = 1;

        // Print the first term
        System.out.print(first + " ");
        
        // If n is 1, only the first term is printed
        if (n == 1) {
            return;
        }
        
        // Print the second term
        System.out.print(second + " ");
        
        // Print the Fibonacci sequence
        for (int i = 3; i <= n; i++) {
            int nextTerm = first + second;
            System.out.print(nextTerm + " ");
            first = second;
            second = nextTerm;
        }
    }

    public static void main(String[] args) {
        int n = 10;  // Set the number of terms you want to print
        
        System.out.println("Fibonacci series up to " + n + " terms:");
        printFibonacci(n);
    }

}

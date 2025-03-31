//29. Write a Program for the following Mathematics.



package Assignments;

public class FactorialSeries {
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    
    public static double calculateSeries(int a, int n) {
        double sum = 1; 
        
       
        for (int i = 2; i <= n; i++) {
            sum += (double) a / factorial(i); 
        }
        
        return sum; // Return the final sum
    }

    public static void main(String[] args) {
        
        int a = 1; 
        int n = 4; 

        
        double result = calculateSeries(a, n);
        System.out.println("The sum of the series is: " + result);
    }


}

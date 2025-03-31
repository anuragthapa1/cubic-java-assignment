package Assignments; 

public class NumberPattern {

    
    public static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5; 
        printPattern(rows);
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class MatrixMultiplication {
    public static void main(String[] args) {
        
        // Initialize the first 3x3 matrix 'm'
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Initialize the second 3x3 matrix 'm2'
        int[][] m2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        // Create an empty 3x3 matrix 'm3' to store the result
        int[][] m3 = new int[3][3];

        // Iterate through each element of the matrices m and m2
        // Multiply the corresponding elements and store the result in m3
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m2.length; j++) {
                // Perform element-wise multiplication and accumulate the result in m3
                m3[i][j] += m[i][j] * m2[i][j];
            }
        }

        // Print the elements of the result matrix 'm3' using nested loops
        // This is the first method to print the matrix
        for(int r = 0; r < m3.length; r++) {
            for(int k = 0; k < m3.length; k++) {
                // Print each element of the matrix followed by a space
                System.out.print(m3[r][k] + " ");
            }
            // Print a new line after each row
            System.out.println();
        }
        
        // Print the elements of 'm3' again using a different set of nested loops
        // This is the second method to print the matrix
        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[i].length; j++) {
                // Print each element of the matrix followed by a space
                System.out.print(m3[i][j] + " ");
            }
            // Print a new line after each row
            System.out.println();
        }

    }
}

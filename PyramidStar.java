// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class PyramidStar {
    public static void main(String[] args) {
        
        int n = 10; // Total number of rows (height of the pyramid)
        
        // Outer loop: controls the number of rows (from 0 to n-1)
        for(int i = 0; i < n; i++) {
            
            // Inner loop 1: prints leading spaces before stars
            // The number of spaces decreases as 'i' increases
            // So the pyramid shifts from top to bottom
            for(int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            
            // Inner loop 2: prints the left half of stars including the middle one
            // On each new line, the number of stars increases by 1
            for(int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            
            // Inner loop 3: prints the right half of stars (mirroring the left)
            // Starts from 1 to avoid printing the middle star twice
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            // Moves to the next line after printing each row
            System.out.println();
        }
    }
}

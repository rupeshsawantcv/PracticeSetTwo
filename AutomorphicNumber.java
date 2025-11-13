// Program to check whether a given number is an Automorphic number or not

class AutomorphicNumber  {
    public static void main(String[] args) {
        
        int n = 125; // Input number to be checked
        
        int square = n * n; // Calculate the square of the number
        
        // Extract the last digit of the number
        int n_last = n % 10;
        
        // Extract the last digit of the square
        int square_last = square % 10;
        
        // Uncommenting below lines can help in debugging (optional)
        // System.out.println(n_last);       
        // System.out.println(square_last);
        
        // Compare the last digits of the number and its square
        // If they are the same, the number is Automorphic (at least for single-digit check)
        if (n_last == square_last) {
            System.out.println("The Number " + n + " is Automorphic because the square of " + n + " is: " + square + ".");
        } else {
            System.out.println("The Number " + n + " is NOT Automorphic because the square of " + n + " is: " + square + ".");
        }
    }
}

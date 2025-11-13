// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ConsecutiveSum {
    public static void main(String[] args) {
        
        int n = 10;  // Define the upper limit (N) up to which consecutive pairs are considered
        
        int sum = 0;       // Variable to store the sum of each consecutive pair
        int totalSum = 0;  // Variable to store the cumulative total of something (currently sums 'i', not pairs)
        
        // Loop through numbers from 1 to n
        // The loop runs n times, but logically, for consecutive pairs, it should go only up to (n-1)
        for(int i = 1; i <= n; i++) {
            
            // Calculate the sum of the current number and the next number (consecutive pair)
            sum = i + (i + 1);
            
            // Print the pair and their sum in a readable format
            System.out.println(i + " + " + (i + 1) + " = " + sum);
            
            // Add the current number 'i' to totalSum
            // (Note: if your goal is to get the sum of all *pair sums*, 
            // you should add 'sum' instead of 'i' here)
            totalSum += i;
        } 
        
        // Print the final total sum after the loop ends
        System.out.println("Total Sum is: " + totalSum);
    }
}

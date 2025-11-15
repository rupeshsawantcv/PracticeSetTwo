// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class VowelCounter { // Class name updated to reflect the functionality
    public static void main(String[] args) {
        String input = "rupesh suresh sawant"; // Input string to count vowels
        int vowelCount = countVowel(input); // Call the countVowel method and store the result
        System.out.println("The Vowel Count is: " + vowelCount); // Print the result to the console
    }
    
    // Method to count the vowels in the input string
    public static int countVowel(String str) {
        // Convert the input string to lowercase to handle both uppercase and lowercase vowels
        String lowstr = str.toLowerCase();
        
        int count = 0; // Initialize a counter for the vowels

        // Iterate through each character of the string
        for (int i = 0; i < lowstr.length(); i++) {
            char ch = lowstr.charAt(i); // Get the character at the current position
            
            // Check if the character is a vowel (a, e, i, o, or u)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++; // Increment the count if the character is a vowel
            }
        }
        
        return count; // Return the total number of vowels
    }
}

// Program to check whether a number is Disarium, Harshad, or Spy

public class NumberTypeChecker {

    // Method to check if a number is a Harshad number
    // A Harshad number is divisible by the sum of its digits
    public static boolean isHarshad(int num) {
        int temp = num, sum = 0;

        // Calculate sum of digits
        while (temp > 0) {
            sum += temp % 10;   // Add last digit
            temp /= 10;         // Remove last digit
        }

        // Check if num is divisible by the sum of its digits
        return num % sum == 0;
    }

    // Method to check if a number is a Spy number
    // A Spy number has sum of digits equal to product of digits
    public static boolean isSpy(int num) {
        int temp = num;
        int temp1 = num;
        int sum = 0;
        int mul = 1;

        // Calculate sum of digits
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Calculate product of digits
        while (temp1 > 0) {
            mul *= temp1 % 10;
            temp1 /= 10;
        }

        // Compare sum and product
        return sum == mul;
    }

    // Method to check if a number is a Disarium number
    // A Disarium number = sum of its digits raised to their respective positions
    public static boolean isDisarium(int num) {
        int sum = 0;
        String s = Integer.toString(num); // Convert number to string to find digit positions easily

        // Loop through each digit
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';  // Convert character to integer
            int position = i + 1;           // Position starts from 1
            sum += Math.pow(digit, position); // Add digit^position
        }

        // Compare calculated sum to the original number
        return sum == num;
    }

    // Main method to test the functions
    public static void main(String[] args) {
        int n = 135;  // You can change this number to test other values

        System.out.println("Number: " + n);
        System.out.println("Is Disarium? " + isDisarium(n));
        System.out.println("Is Harshad? " + isHarshad(n));
        System.out.println("Is Spy? " + isSpy(n));
    }
}

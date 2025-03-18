import java.util.Scanner;

public class EvenOddChecker {
    
    // Method to get an integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                number = Integer.parseInt(scanner.nextLine());
                break; // Exit loop if input is valid
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        
        return number;
    }
    
    // Method to check if a number is even or odd
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
    
    public static void main(String[] args) {
        // Get user input
        int userInput = getIntegerInput();
        
        // Check if the number is even or odd
        String result = checkEvenOrOdd(userInput);
        
        // Display the result
        System.out.println(result);
    }
}
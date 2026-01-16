import java.util.Scanner; // Used to take input from the user

public class calculator { 

    static int version = 1; // Static variable shared by all objects
    String appName = "Calculator"; // Instance variable


    public static void main(String[] args) { 

        calculator sca = new calculator(); // Object creation
        Scanner sc = new Scanner(System.in); // Scanner object for input

        int a = 10; // Integer data type
        double b = 5.5; // Decimal number
        char grade = 'A'; // Single character
        boolean pass = true; // True or false value

        System.out.print("Enter first number: "); // Ask user for first number
        int n1 = sc.nextInt(); // Read first number

        System.out.print("Enter second number: "); // Ask user for second number
        int n2 = sc.nextInt(); // Read second number

        System.out.println("1. Add  2. Subtract  3. Multiply  4. Divide");
        int choice = sc.nextInt(); // User gie their choice

        int result = 0; // Variable to store result

        if (choice == 1)
            result = n1 + n2; // Addition
        else if (choice == 2)
            result = n1 - n2; // Subtraction
        else if (choice == 3)
            result = n1 * n2; // Multiplication
        else if (choice == 4 && n2 != 0)
            result = n1 / n2; // Division
        else
            System.out.println("Invalid choice"); // Wrong input

        System.out.printf("Result = %d%n", result); // Print result


        int x = 5; // Integer value
        double y = x; // Widening type casting(small to big)

        double p = 8.9; // Decimal value
        int q = (int) p; // Narrowing type casting(big to small)

        System.out.println("Widening type casting: " + y); // Display widening result
        System.out.println("Narrowing type casting: " + q); // Display narrowing result

        sc.close(); // Close the Scanner
    }
}
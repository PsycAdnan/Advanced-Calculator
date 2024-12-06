import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        System.out.println("Welcome to the Advanced Calculator by ScriptedByAdnan!");

        while (continueCalculation) {
            try {
                // Input two numbers (except for square root operation)
                System.out.println("\nSelect an operation:");
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (*)");
                System.out.println("4. Division (/)");
                System.out.println("5. Power (^)");
                System.out.println("6. Square Root (√)");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(scanner.nextLine());

                if (choice == 0) {
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                }

                double num1 = 0, num2 = 0;

                if (choice >= 1 && choice <= 5) {
                    System.out.print("Enter the first number: ");
                    num1 = Double.parseDouble(scanner.nextLine());

                    System.out.print("Enter the second number: ");
                    num2 = Double.parseDouble(scanner.nextLine());
                } else if (choice == 6) {
                    System.out.print("Enter the number: ");
                    num1 = Double.parseDouble(scanner.nextLine());
                } else {
                    System.out.println("Invalid choice. Please try again.");
                    continue;
                }

                // Perform the selected operation
                double result;
                switch (choice) {
                    case 1: // Addition
                        result = num1 + num2;
                        System.out.printf("Result: %.2f + %.2f = %.2f\n", num1, num2, result);
                        break;
                    case 2: // Subtraction
                        result = num1 - num2;
                        System.out.printf("Result: %.2f - %.2f = %.2f\n", num1, num2, result);
                        break;
                    case 3: // Multiplication
                        result = num1 * num2;
                        System.out.printf("Result: %.2f * %.2f = %.2f\n", num1, num2, result);
                        break;
                    case 4: // Division
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            result = num1 / num2;
                            System.out.printf("Result: %.2f / %.2f = %.2f\n", num1, num2, result);
                        }
                        break;
                    case 5: // Power
                        result = Math.pow(num1, num2);
                        System.out.printf("Result: %.2f ^ %.2f = %.2f\n", num1, num2, result);
                        break;
                    case 6: // Square Root
                        if (num1 < 0) {
                            System.out.println("Error: Cannot calculate square root of a negative number.");
                        } else {
                            result = Math.sqrt(num1);
                            System.out.printf("Result: √%.2f = %.2f\n", num1, result);
                        }
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

                // Ask the user if they want to perform another calculation
                System.out.print("\nWould you like to perform another calculation? (yes/no): ");
                String continueResponse = scanner.nextLine().trim().toLowerCase();
                if (!continueResponse.equals("yes")) {
                    continueCalculation = false;
                    System.out.println("Thank you for using the Advanced Calculator. Goodbye!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numeric values.");
            }
        }

        scanner.close();
    }
}

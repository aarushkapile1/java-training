import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, choice;
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        System.out.println("Enter your choice (1-4): ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Addition: " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction: " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Division: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

}

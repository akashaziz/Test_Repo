 import java.util.Scanner;

public class calcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        if (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            System.out.println("Enter second number:");
            if (sc.hasNextDouble()) {
                double b = sc.nextDouble();
                System.out.println("Enter operator (+, -, *, /):");
                char operator = sc.next().charAt(0);

                performCalculation(a, b, operator);
            } else {
                System.out.println("Invalid input for the second number");
            }
        } else {
            System.out.println("Invalid input for the first number");
        }

        sc.close();
    }

    public static void performCalculation(double a, double b, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = a + b;
                System.out.println("Result of Addition: " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Result of Subtraction: " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Result of Multiplication: " + result);
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result of Division: " + result);
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}

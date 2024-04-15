mport java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operator;
        boolean quit = false;

        while (!quit) {
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /, ^) or 'q' to quit: ");
            operator = scanner.next().charAt(0);

            if (operator == 'q') {
                quit = true;
                continue;
            }

            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            switch (operator) {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;
                case '^':
                    System.out.println("Result: " + Math.pow(num1, num2));
                    break;
                default:
                    System.out.println("Invalid operator");
            }
        }

        System.out.println("Calculator program has ended.");
        scanner.close();
    }
}
import java.util.Scanner;

public class SimpleCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String choice = "yes";
        
        while (choice.equalsIgnoreCase("yes"))
        {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            
            System.out.print("Enter operation (+, -, *, /): ");
            char op = sc.next().charAt(0);
            
            double result = 0;
            
            if (op == '+')
            {
                result = num1 + num2;
            }
            else if (op == '-')
            {
                result = num1 - num2;
            }
            else if (op == '*')
            {
                result = num1 * num2;
            }
            else if (op == '/')
            {
                result = num1 / num2;
            }
            else
            {
                System.out.println("Invalid operation!");
                continue;
            }
            
            System.out.println("Result: " + result);
            
            System.out.print("Continue? (yes/no): ");
            choice = sc.next();
        }
        
        System.out.println("Calculator stopped.");
    }
}
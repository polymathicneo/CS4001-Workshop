import java.util.Scanner;

public class FixedDepositNIB
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String choice = "yes";
        
        while (choice.equalsIgnoreCase("yes"))
        {
            System.out.print("Enter deposit amount (Min Rs.1000): ");
            double principal = sc.nextDouble();
            
            if (principal < 1000)
            {
                System.out.println("Minimum deposit is Rs.1000!");
                continue;
            }
            
            System.out.print("Enter annual interest rate (8-12%): ");
            double annualRate = sc.nextDouble();
            
            if (annualRate < 8 || annualRate > 12)
            {
                System.out.println("Interest rate must be between 8-12%!");
                continue;
            }
            
            System.out.print("Enter duration in years (Max 5): ");
            int years = sc.nextInt();
            
            if (years < 1 || years > 5)
            {
                System.out.println("Duration must be between 1-5 years!");
                continue;
            }
            
            double monthlyRate = annualRate / 12 / 100;
            int months = years * 12;
            
            double amount = principal * Math.pow(1 + monthlyRate, months);
            
            double processingFee = principal * 0.005;
            double finalAmount = amount - processingFee;
            double interest = finalAmount - principal;
            
            System.out.println("\n--- FD Calculation Result ---");
            System.out.println("Principal Amount: Rs." + principal);
            System.out.println("Interest Rate: " + annualRate + "%");
            System.out.println("Duration: " + years + " years");
            System.out.println("Processing Fee (0.5%): Rs." + processingFee);
            System.out.println("Maturity Amount: Rs." + finalAmount);
            System.out.println("Total Interest Earned: Rs." + interest);
            System.out.println("-----------------------------\n");
            
            System.out.print("Calculate another FD? (yes/no): ");
            choice = sc.next();
        }
        
        System.out.println("Thank you for using NIB FD Calculator!");
    }
}
import java.util.Scanner;

public class SellingPriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input marked price
        System.out.print("Enter the marked price: ");
        double markedPrice = sc.nextDouble();
        
        // Input category
        System.out.print("Enter the category (A/B/C/D): ");
        char category = sc.next().toUpperCase().charAt(0);
        
        double discountPercent = 0;
        double discountAmount = 0;
        double sellingPrice = 0;
        
        // Calculate discount based on category using switch
        switch(category) {
            case 'A':
                discountPercent = 60;
                break;
                
            case 'B':
                discountPercent = 40;
                break;
                
            case 'C':
                discountPercent = 20;
                break;
                
            case 'D':
                discountPercent = 10;
                break;
                
            default:
                System.out.println("Invalid category! Please enter A, B, C, or D.");
                sc.close();
                return;
        }
        
        // Calculate discount amount and selling price
        discountAmount = (markedPrice * discountPercent) / 100;
        sellingPrice = markedPrice - discountAmount;
        
        // Display results
        System.out.println("\n--- Price Details ---");
        System.out.println("Marked Price: Rs. " + markedPrice);
        System.out.println("Category: " + category);
        System.out.println("Discount: " + discountPercent + "%");
        System.out.println("Discount Amount: Rs. " + discountAmount);
        System.out.println("Selling Price: Rs. " + sellingPrice);
        
        sc.close();
    }
}
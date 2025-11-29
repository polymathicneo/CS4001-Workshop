import java.util.Scanner;

public class ScholarshipChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input student details
        System.out.println("=== Scholarship Eligibility Checker ===");
        System.out.println();
        
        System.out.print("Enter GPA (0.0 - 4.0): ");
        double gpa = sc.nextDouble();
        
        System.out.print("Enter Attendance Percentage (0 - 100): ");
        double attendance = sc.nextDouble();
        
        System.out.print("Enter Attitude Score (1 - 10): ");
        int attitudeScore = sc.nextInt();
        
        System.out.println();
        System.out.println("--- Eligibility Check ---");
        
        // Nested if to check scholarship eligibility
        if (gpa >= 3.2) {
            System.out.println("GPA requirement met (>= 3.2)");
            
            if (attendance > 80) {
                System.out.println("Attendance requirement met (> 80%)");
                
                if (attitudeScore < 5) {
                    System.out.println("Attitude score does not meet requirement (must be >= 5)");
                    System.out.println();
                    System.out.println("Result: NOT ELIGIBLE for scholarship");
                    System.out.println("Reason: Poor attitude score");
                } else {
                    System.out.println("Attitude score requirement met (>= 5)");
                    System.out.println();
                    System.out.println("Result: ELIGIBLE for scholarship!");
                    System.out.println("Congratulations! You meet all requirements.");
                }
            } else {
                System.out.println("Attendance requirement not met (must be > 80%)");
                System.out.println();
                System.out.println("Result: NOT ELIGIBLE for scholarship");
                System.out.println("Reason: Insufficient attendance");
            }
        } else {
            System.out.println("GPA requirement not met (must be >= 3.2)");
            System.out.println();
            System.out.println("Result: NOT ELIGIBLE for scholarship");
            System.out.println("Reason: Low GPA");
        }
        
        sc.close();
    }
}
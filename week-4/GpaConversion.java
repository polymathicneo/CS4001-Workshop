import java.util.Scanner;
public class GpaConversion{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the gpa");
        double gpa= sc.nextDouble();


        //Input validation
        if(gpa<0.0 || gpa>4.0){
            System.out.println("Error: invalid GPA!,please enter between 0.0 and 4.0");
        }else{
            //Grade conversion
            String grade;
            if (gpa >= 4.0) {
            grade = "A+";
        } else if (gpa >= 3.6) {
            grade = "A";
        } else if (gpa >= 3.2) {
            grade = "B+";
        } else if (gpa >= 2.8) {
            grade = "B";
        } else if (gpa >= 2.4) { 
            grade = "C+";
        } else if (gpa >= 2.0) { 
            grade = "C";
        } else if(gpa >= 1.6) {
            grade = "D+";
        } else if (gpa >= 1.0) {
            grade = "D";
        } else {
            grade = "FAIL"; 
        }
            
    System.out.println("your grade:" + grade);
         }
           }
               }

   
        
        
            
        
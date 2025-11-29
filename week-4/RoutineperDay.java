import java.util.Scanner;
public class RoutineperDay{
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your day");
    String day = sc.nextLine();
    
    switch(day) {
        case "sunday":
            System.out.print("sunday : math,science");
            break;
        case "monday":
            System.out.print("monday : Nepali,English");
            break;
            
        case "tuesday":
            System.out.print("tuesday : physics,chemistry");
            break;
        case "wednesday":
            System.out.print("wednesday : biology,opt math");
            break;
        case "thursday":
            System.out.print("thursday : math,chemistry");
            break;
        case "friday":
            System.out.print("friday : politicalscience,biology");
            break;
        case "saturday":
            System.out.print("saturday : napaad hai bhai");
            break;
            default:
                System.out.print("Invalid day");
    }
    
}}
    

    
    



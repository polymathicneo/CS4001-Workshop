import java.util.Scanner;
public class EvenorOdd{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Even or odd");
        
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.print(num+ "is even");
        }else{ 
            System.out.print(num+ "is odd");
        }
        
    }
    
}

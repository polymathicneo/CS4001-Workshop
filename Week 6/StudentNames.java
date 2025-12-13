import java.util.Scanner;

public class StudentNames {
    public static void main(String[] args) {

        String[] students = {"Asha", "Ramesh", "Sita", "Binod", "Sabita"};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("\nName at index 2: " + students[2]);

        students[4] = "Anita";
        System.out.println("Updated name at index 4: " + students[4]);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a new name: ");
        students[1] = sc.nextLine();

        System.out.println("\nUpdated Student List:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}

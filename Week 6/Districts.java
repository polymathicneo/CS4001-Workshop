import java.util.Scanner;

public class Districts {
    public static void main(String[] args) {

        // initial array
        String[] districts = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};

        System.out.println("Initial Districts:");
        for (int i = 0; i < districts.length; i++) {
            System.out.println((i + 1) + ". " + districts[i]);
        }

        //scanner input
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter number of districts: ");
        int n = sc.nextInt();
        sc.nextLine();  // to clear newline

        String[] newDistricts = new String[n];

        System.out.println("Enter district names:");
        for (int i = 0; i < n; i++) {
            System.out.print("District " + (i + 1) + ": ");
            newDistricts[i] = sc.nextLine();
        }

        //printing updated array
        System.out.println("\nUpdated District List:");
        for (int i = 0; i < newDistricts.length; i++) {
            System.out.println((i + 1) + ". " + newDistricts[i]);
        }
    }
}

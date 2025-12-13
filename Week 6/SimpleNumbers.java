import java.util.Scanner;

public class SimpleNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // ----- Dynamic Input -----
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        // score read garna
        System.out.println("Enter the scores:");
        for (int i = 0; i < n; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }

        // array print gareko
        System.out.println("\nScores entered:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();

        // calculation gareko
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println("Sum = " + sum);

        // average likalna
        double average = (double) sum / n;
        System.out.println("Average = " + average);

        // Highest ra lowest nikalna 
        int highest = scores[0];
        int lowest = scores[0];

        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }

        System.out.println("Highest Score = " + highest);
        System.out.println("Lowest Score = " + lowest);
    }
}

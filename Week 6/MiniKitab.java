public class MiniKitab {
    public static void main(String[] args) {

        // Categories
        String[] categories = {"Fiction", "Nepali"};

        // One book title and price for each category
        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];

        // Assign titles and prices
        titles[0][0] = "Asahamati - 5";
        prices[0][0] = 750.0;

        titles[1][0] = "Muna Madan";
        prices[1][0] = 500.0;

        double total = 0.0;

        // Print details
        System.out.println("Mini Kitab Corner\n");

        for (int i = 0; i < categories.length; i++) {
            System.out.println("Category: " + categories[i]);
            System.out.println("Title: " + titles[i][0]);
            System.out.printf("Price: %.2f\n\n", prices[i][0]);
            total += prices[i][0];
        }

        // Print total value
        System.out.printf("Total Value: %.2f\n", total);
    }
}

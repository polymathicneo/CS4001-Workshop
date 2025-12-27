public class GymMemberNepal {
    private String memberName;
    private String membershipType;
    private double monthlyFee;
    private String joinDate;
    private int monthsSinceJoined;

      //constructor 
    public GymMemberNepal(String name, String type, double fee, String date, int months) {
        this.memberName = name;
        this.membershipType = type;
        this.monthlyFee = fee;
        this.joinDate = date;
        this.monthsSinceJoined = months;
    }
    //method to calculate Annual fee ho
    public double calculateAnnualFee() {
        double yearly = monthlyFee * 12;
        return yearly + (yearly * 0.13);
    }
    //get discount vanne method banako
    public double getDiscountedFee(double discountPercent) {
        return monthlyFee - (monthlyFee * discountPercent / 100);
    }
    //boolean datatype/return type layera method banako
    public boolean isEligibleForDiscount() {
        return monthsSinceJoined > 6;
    }

    public void displayMemberInfo() {
        System.out.println("--- Fitness Nepal Gym ---");
        System.out.println("Member: " + memberName);
        System.out.println("Type: " + membershipType);
        System.out.println("Joined: " + joinDate);
        System.out.println("Monthly Fee: Rs. " + monthlyFee);
        System.out.println("Eligible for Discount: " + isEligibleForDiscount());
        System.out.println("Annual Fee (with VAT): Rs. " + calculateAnnualFee());
        System.out.println();
    }
    //main method suru gareko
    public static void main(String[] neo) {
        GymMemberNepal m1 = new GymMemberNepal("Ram Thapa", "Basic", 1500, "2023-10-10", 2);         //object banako value rakhna   
        GymMemberNepal m2 = new GymMemberNepal("Sita Rai", "Premium", 2500, "2022-05-12", 18);
        GymMemberNepal m3 = new GymMemberNepal("Hari Gurung", "VIP", 4000, "2023-01-20", 11);          
         //call gareko method lai references variable layera m1.method ko naam ();
        m1.displayMemberInfo();
        m2.displayMemberInfo();
        m3.displayMemberInfo();
    }
}
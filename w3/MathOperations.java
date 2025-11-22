public class MathOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational
        System.out.println("a == b: " + (a == b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));

        // Logical
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Assignment
        int c = 20;
        c += 5;
        System.out.println("c += 5: " + c);

        // Ternary
        int num = 7;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is: " + result);
    }
}

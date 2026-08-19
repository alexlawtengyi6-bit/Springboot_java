public class main {
    public static void main(String[] args) {
        int age = 30; // Integer (whole number)
        double price = 99.99; // Double (floating-point number)
        String name = "John Doe"; // String (text)
        boolean isEmployed = true; // Boolean (true or false)

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Employed: " + isEmployed);

         int x = 10;
        int y = 5;

        int sum = x + y; // Addition
        int difference = x - y; // Subtraction
        int product = x * y; // Multiplication
        double quotient = (double)x / y; // Division (cast to double for decimal result)

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        boolean isEqual = (x == y); // Comparison
        System.out.println("Is x equal to y? " + isEqual);
          int score = 85;

        if (score >= 90) {
            System.out.println("Excellent!");
        } else if (score >= 70) {
            System.out.println("Good job!");
        } else {
            System.out.println("Keep trying!");
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}
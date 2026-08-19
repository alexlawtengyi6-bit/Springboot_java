package OOP_Basic;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

// User class
class User {
    private String username;
    private String email;
    private String password;

    // Constructor
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    // Check password
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    // Display user information
    public void displayUser() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }
}

// Account management class
class AccountManager {
    private ArrayList<User> users = new ArrayList<>();

    // Sign up
    public boolean signUp(String username, String email, String password) {

        // Check if username already exists
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return false;
            }
        }

        // Create new user
        User newUser = new User(username, email, password);
        users.add(newUser);

        return true;
    }

    // Login
    public User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)
                    && user.checkPassword(password)) {
                return user;
            }
        }

        return null;
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        AccountManager accountManager = new AccountManager();

        while (true) {
            System.out.println("\n===== ACCOUNT SYSTEM =====");
            System.out.println("1. Sign Up");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {

                System.out.println("\n===== SIGN UP =====");

                System.out.print("Enter username: ");
                String username = input.nextLine();

                System.out.print("Enter email: ");
                String email = input.nextLine();

                System.out.print("Enter password: ");
                String password = input.nextLine();

                boolean success = accountManager.signUp(
                        username,
                        email,
                        password
                );

                if (success) {
                    System.out.println("Account created successfully!");
                } else {
                    System.out.println("Username already exists!");
                }

            } else if (choice == 2) {

                System.out.println("\n===== LOGIN =====");

                System.out.print("Enter username: ");
                String username = input.nextLine();

                System.out.print("Enter password: ");
                String password = input.nextLine();

                User user = accountManager.login(username, password);

                if (user != null) {
                    System.out.println("\nLogin successful!");
                    user.displayUser();
                } else {
                    System.out.println("Invalid username or password!");
                }

            } else if (choice == 3) {

                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        input.close();
    }
}

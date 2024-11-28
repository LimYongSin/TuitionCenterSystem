import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Tuition Center Management System");
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (AdminManager.verifyCredentials(username, password)) {
            Admin admin = new Admin(username);
            admin.manageOperations();
        } else {
            System.out.println("Invalid username or password. Access denied.");
        }

        scanner.close();
    }
}
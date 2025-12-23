import java.util.Scanner;
public class RegistrationController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Bus Ticket Booking System ===");

        System.out.println("\n--- User Registration ---");
        System.out.print("Create Username: ");
        String regUsername = sc.nextLine();

        System.out.print("Create Password: ");
        String regPassword = sc.nextLine();

        if (loginUsername.equals(regUsername) && SloginPassword.equals(regPassword)) {
            System.out.println("\nLogin Successful!");
            System.out.println("Welcome to Bus Ticket Booking System");
        } else {
            System.out.println("\nLogin Failed!");
            System.out.println("Invalid Username or Password");
        }

        sc.close();
    }
}















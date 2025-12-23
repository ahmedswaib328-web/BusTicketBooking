import java.util.Scanner;
public class LoginController {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Bus Ticket Booking System ===");
        System.out.println("\n--- User Login ---");
        System.out.print("Enter Username: ");
        String loginUsername = sc.nextLine();

        System.out.print("Enter Password: ");
        String loginPassword = sc.nextLine();

        if (loginUsername.equals(regUsername) && loginPassword.equals(regPassword)) {
            System.out.println("\nLogin Successful!");
            System.out.println("Welcome to Bus Ticket Booking System");
        } else {
            System.out.println("\nLogin Failed!");
            System.out.println("Invalid Username or Password");
        }

        sc.close();
    }
}




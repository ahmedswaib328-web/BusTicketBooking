package Controller;

import java.util.Scanner;
public class RegistrationController {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String[] username = new String[3];
            String[] password = new String[3];
            int count = 0;
            int choice;

            do {
                System.out.println("\n--- Shohoj.bd E-Bus System ---");
                System.out.println("1. Register");
                System.out.println("2. View Users");
                System.out.println("3. Exit");
                System.out.print("Choose: ");
                choice = sc.nextInt();
                sc.nextLine();

                if (choice == 1) {
                    if (count < 3) {
                        System.out.print("Enter Username: ");
                        username[count] = sc.nextLine();

                        System.out.print("Enter Password: ");
                        password[count] = sc.nextLine();

                        System.out.println("✅ Registration Successful!");
                        count++;
                    } else {
                        System.out.println("❌ User limit reached!");
                    }

                } else if (choice == 2) {
                    System.out.println("\nRegistered Users:");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + username[i]);
                    }

                } else if (choice == 3) {
                    System.out.println("Thank you!");
                } else {
                    System.out.println("Invalid choice!");
                }

            } while (choice != 3);

            sc.close();
        }
    }















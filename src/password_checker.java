import java.util.Scanner;

public class password_checker {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int maxAttempts = 5;
        String correctPassword = "fish";

        for (int attemptNumber = 1; attemptNumber <= maxAttempts; attemptNumber++) {
            System.out.print("Enter password (Attempt " + attemptNumber + "): ");
            String userPassword = inputScanner.nextLine();

            if (userPassword.equals(correctPassword)) {
                System.out.println("Access granted!");
                break;
            } else {
                System.out.println("Try again.");
            }
        }

        if (maxAttempts == 5) {
            System.out.println("Access denied.");
        }

        inputScanner.close();
    }
}

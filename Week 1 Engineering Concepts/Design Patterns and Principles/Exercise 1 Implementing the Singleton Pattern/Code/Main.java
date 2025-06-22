import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger1 = Logger.getInstance();

        System.out.println("Enter two log messages:");

        System.out.print("Message 1: ");
        String msg1 = scanner.nextLine();
        logger1.log(msg1);

        Logger logger2 = Logger.getInstance();

        System.out.print("Message 2: ");
        String msg2 = scanner.nextLine();
        logger2.log(msg2);

        // Verify Singleton
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton verified).");
        } else {
            System.out.println("Different logger instances exist (Singleton failed).");
        }

        
    }
}

package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: " );
        int userSelected = scanner.nextInt();
        System.out.println("Welcome to the Brain Games!");
        switch (userSelected) {
            case 0:
                System.out.println("Game over");
                scanner.close();
                break;
            case 1:
                System.out.print("May I have your name? ");
                String userName = scanner.next();
                System.out.println("Hello, " + userName + "!");
                scanner.close();
                break;
            case 2:
                Even.start();
                scanner.close();
                break;
            default:
                System.out.println("Something was broke in App");
                scanner.close();
                break;
        }
    }
}

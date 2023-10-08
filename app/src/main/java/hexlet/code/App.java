package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Greet;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("4 - GCD");
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
                Greet.newUser();
                scanner.close();
                break;
            case 2:
                Engine.start(new Even());
                scanner.close();
                break;
            case 3:
                Engine.start(new Calculator());
                scanner.close();
                break;
            case 4:
                Engine.start(new Gcd());
                scanner.close();
                break;
            default:
                System.out.println("Something was broke in App");
                scanner.close();
                break;
        }
    }
}

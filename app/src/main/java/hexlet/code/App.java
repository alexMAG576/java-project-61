package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Greet;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static final int EXIT = 0;
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
    private static int userSelected;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        userSelected = scanner.nextInt();
        System.out.println("Welcome to the Brain Games!");
        App.games();
        scanner.close();
    }
    public static void games() {
        if (userSelected == EXIT) {
            System.out.println("Game over");
        } else if (userSelected == GREET) {
            Greet.newUser();
        } else if (userSelected == EVEN) {
            Engine.start(new Even());
        } else if (userSelected == CALC) {
            Engine.start(new Calculator());
        } else if (userSelected == GCD) {
            Engine.start(new Gcd());
        } else if (userSelected == PROGRESSION) {
            Engine.start(new Progression());
        } else if (userSelected == PRIME) {
            Engine.start(new Prime());
        } else {
            System.out.println("Something was broke in App");
        }
    }
}

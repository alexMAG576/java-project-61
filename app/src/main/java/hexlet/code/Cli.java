package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String greetGamer() {
        Scanner gamerInput = new Scanner(System.in);
        System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
        String gamerName = gamerInput.next();
        System.out.println("Hello, " + gamerName + "!");
        return gamerName;
    }
}

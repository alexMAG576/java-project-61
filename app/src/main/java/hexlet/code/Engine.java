package hexlet.code;

import hexlet.code.games.Game;
import java.util.Scanner;

public class Engine {
    public static final int gameRound = 3;

    public static void start(Game game) {
        int countI = 0;
        String answer = "";
        Scanner scanner = new Scanner(System.in);
        String[] gameDate = new String[2];

        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(game.getRules());

        while (countI < gameRound) {
            gameDate = game.getGameData();
            System.out.println("Question: " + gameDate[0]);
            System.out.print("Your answer: ");
            answer = scanner.next();
            if (answer.equals(gameDate[1])) {
                System.out.println("Correct!");
                countI++;
            } else {
                break;
            }
        }
        if (countI == gameRound) {
            System.out.println("Congratulations, " + userName + "!");
            scanner.close();
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + gameDate[1]
                    + "'" + "." + "\n Let's try again, " + userName + "!");
        }
    }
}

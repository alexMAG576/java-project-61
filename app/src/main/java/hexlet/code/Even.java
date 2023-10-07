package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void start() {
        int gameRound = 3;
        int countI = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (countI < gameRound) {

            double questionDouble = (Math.random() * 20) + countI;
            int question = (int) questionDouble;
            String rightAnswer = Even.getIsEven(question);
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
                countI++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + rightAnswer
                        + "'" + "." + "\n Let's try again, " + userName + "!");
                break;
            }
        }
        if (countI == gameRound) {
            System.out.println("Congratulations, " + userName + "!");
            scanner.close();
        }

        }

    public static String getIsEven ( int question){
        if (((question % 2) < 1)) {
            return "yes";
        } else {
            return "no";
        }
    }
}

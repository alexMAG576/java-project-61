package hexlet.code.games;

import hexlet.code.Utils;

public class Prime implements Game {
    public final String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    public final String[] getGameData() {

        String[] gameData = new String[2];
        int num1 = Utils.questionRandom();
        gameData[0] = Integer.toString(num1);
        boolean isPrimeQuestion = isPrime(num1);
        if (isPrimeQuestion) {
            gameData[1] = "yes";
        } else {
            gameData[1] = "no";
        }
        return gameData;
    }
    public static boolean isPrime(int num1) {
        if (num1 < 2) {
            return false;
        }
        if (num1 == 2) {
            return true;
        }
        for (int i = 2; i < num1; i++) {
            if (num1 % i == 0) {
                return false;
            }
        }
        return true;
    }
}

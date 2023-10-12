package hexlet.code.games;

import hexlet.code.Utils;

public class Even implements Game {

    public final String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public final String[] getGameData() {
        String[] gameData = new String[2];
        int question = Utils.questionRandom();
        gameData[0] = Integer.toString(question);
        boolean isEvenQuestion = isEven(question);
        if (isEvenQuestion) {
            gameData[1] = "yes";
        } else {
            gameData[1] = "no";
        }
        return gameData;
    }
    public static boolean isEven(int question) {
        return (question % 2) < 1;
    }

}

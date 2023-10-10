package hexlet.code.games;

public class Even implements Game {

    public final String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public final String[] getGameData() {
        String[] gameData = new String[2];
        int question = Even.questionRandom();
        gameData[0] = Integer.toString(question);
        gameData[1] = Even.getIsEven(question);
        return gameData;
    }
    public static String getIsEven(int question) {
        if (((question % 2) < 1)) {
            return "yes";
        } else {
            return "no";
        }
    }
    public static int getRandomNumber(int lowRangeValue, int highRangeValue) {
        double questionDouble = (Math.random() * highRangeValue) + lowRangeValue;
        return (int) questionDouble;
    }
    public static int questionRandom() {
        int lowRangeValue = 1;
        final int highRangeValue = 20;

        return Even.getRandomNumber(lowRangeValue, highRangeValue);
    }
}

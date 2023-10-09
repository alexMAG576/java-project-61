package hexlet.code.games;

public class Prime implements Game {
    int lowRangeValue = 1;
    int highRangeValue = 20;
    public final String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    public final String[] getGameData() {
        String[] gameData = new String[2];
        int num1 = Even.getRandomNumber(lowRangeValue, highRangeValue);
        gameData[0] = Integer.toString(num1);
        gameData[1] = Prime.getIsPrime(num1);
        return gameData;
    }
    public static String getIsPrime(int num1) {
        if (((num1 % 2) != 0)) {
            return "yes";
        } else {
            return "no";
        }
    }
}

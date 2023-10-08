package hexlet.code.games;

public class Gcd implements Game {
    int lowRangeValue = 1;
    int highRangeValue = 20;
    public final String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }
    public final String[] getGameData() {
        String[] gameData = new String[2];
        int num1 = Even.getRandomNumber(lowRangeValue, highRangeValue);
        int num2 = Even.getRandomNumber(lowRangeValue, highRangeValue);
        gameData[0] = num1 + " " + num2;
        gameData[1] = lookingGcd(num1, num2);
        return gameData;
    }
    public static String lookingGcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return Integer.toString(num1);
    }
}

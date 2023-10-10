package hexlet.code.games;

public class Prime implements Game {
    public final String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    public final String[] getGameData() {
        int lowRangeValue = 1;
        final int highRangeValue = 20;
        String[] gameData = new String[2];
        int num1 = Even.getRandomNumber(lowRangeValue, highRangeValue);
        gameData[0] = Integer.toString(num1);
        gameData[1] = Prime.getIsPrime(num1);
        return gameData;
    }
    public static String getIsPrime(int num1) {
        String answer = "";

        if (num1 < 2) {
            answer = "no";
        }
        if (num1 == 2) {
            answer = "yes";
        }
        for (int i = 2; i < num1; i++) {
            if (num1 % i == 0) {
                answer = "no";
                break;
            } else {
                answer = "yes";
            }
        }
        return answer;
    }
}

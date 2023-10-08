package hexlet.code.games;


public class Calculator implements Game {
    int lowRangeValue = 1;
    int highRangeValue = 20;
    int lowRangeOperators = 1;
    int highRangeOperators = 3;
    String[] arithmeticOperators = {"/", "+", "-", "*"};
    public final String getRules() {
        return "What is the result of the expression?calc";
    }
    public final String[] getGameData() {
        String[] gameData = new String[2];
        int result = 0;
        int num1 = Even.getRandomNumber(lowRangeValue, highRangeValue);
        int num2 = Even.getRandomNumber(lowRangeValue, highRangeValue);
        int random = Even.getRandomNumber(lowRangeOperators, highRangeOperators);
        String operator = arithmeticOperators[random];

        gameData[0] = num1 + " " + operator + " " + num2;

        switch (operator) {
            case "+":
                result  = num1 + num2;
                break;
            case "-":
                result  = num1 - num2;
                break;
            case "*":
                result  = num1 * num2;
                break;
            default:
                System.out.println("wrong operator");
                break;
        }
        gameData[1] = Integer.toString(result);
        return gameData;
    }
}
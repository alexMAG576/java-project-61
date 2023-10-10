package hexlet.code.games;

public class Calculator implements Game {
    public final String getRules() {
        return "What is the result of the expression?";
    }
    public final String[] getGameData() {

        String[] arithmeticOperators = {"/", "+", "-", "*"};
        String[] gameData = new String[2];
        int result = 0;
        int num1 = Even.questionRandom();
        int num2 = Even.questionRandom();
        int random = Calculator.operatorRandom();
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
    public static int operatorRandom() {
        int lowRangeOperator = 1;
        final int highRangeOperators = 3;
        return Even.getRandomNumber(lowRangeOperator, highRangeOperators);
    }
}

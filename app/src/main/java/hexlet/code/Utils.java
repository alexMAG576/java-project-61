package hexlet.code;

public class Utils {
    public static int getRandomNumber(int lowRangeValue, int highRangeValue) {
        double questionDouble = (Math.random() * highRangeValue) + lowRangeValue;
        return (int) questionDouble;
    }
    public static int questionRandom() {
        int lowRangeValue = 1;
        final int highRangeValue = 20;

        return Utils.getRandomNumber(lowRangeValue, highRangeValue);
    }
}

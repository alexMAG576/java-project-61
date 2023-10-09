package hexlet.code.games;

public class Progression implements Game {
    int lowRangeValue = 1;
    int highRangeValue = 20;
    int numberOfElements = 10;

    public final String getRules() {
        return "What number is missing in the progression?";
    }

    public final String[] getGameData() {
        String[] gameData;
        int firstElement = Even.getRandomNumber(lowRangeValue, highRangeValue);
        int progressionStep = Even.getRandomNumber(lowRangeValue, highRangeValue);
        int randomIntNumber = Even.getRandomNumber(0, 9);
        gameData = arithmeticProgression(firstElement, progressionStep, randomIntNumber) ;
        return gameData;
    }
    public String[] arithmeticProgression(int firstElement, int progressionStep, int randomIntNumber) {
        String[] progressionData = new String[2];
        int progression = firstElement;
        StringBuilder progressionString =  new StringBuilder();
        for (int i = 0; i < numberOfElements; i++) {
            progression =  progression + progressionStep;
            if (i == randomIntNumber) {
                progressionData[1] = String.valueOf(progression);
                progressionString.append("..");
                progressionString.append(" ");
            } else {
                progressionString.append(progression);
                progressionString.append(" ");
            }

        }
        progressionData[0] = progressionString.toString();
        return progressionData;
    }

}

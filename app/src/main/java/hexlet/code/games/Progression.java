package hexlet.code.games;

import hexlet.code.Utils;

public class Progression implements Game {
    public final String getRules() {
        return "What number is missing in the progression?";
    }

    public final String[] getGameData() {

        int firstElementProgression = 0;
        final int endElementProgression = 9;
        String[] gameData;
        int firstElement = Utils.questionRandom();
        int progressionStep = Utils.questionRandom();
        int randomIntNumber = Utils.getRandomNumber(firstElementProgression, endElementProgression);
        gameData = arithmeticProgression(firstElement, progressionStep, randomIntNumber);
        return gameData;
    }
    public static String[] arithmeticProgression(int firstElement, int progressionStep, int randomIntNumber) {
        final int numberOfElements = 10;
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

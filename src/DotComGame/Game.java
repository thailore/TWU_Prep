package DotComGame;
import java.util.ArrayList;
/**
 * Created by tborgeso on 07/02/2017.
 */
public class Game {
    public static void main(String[] args) {
        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();

        DotCom theDotCom = new DotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] loc = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(loc);

        boolean isAlive = true;

        while(isAlive){

            String guess = helper.getUserInput("enter a number: ");

            String result = theDotCom.checkYourself(guess);

            numOfGuesses++;

            if (result.equals("kill")){

                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}

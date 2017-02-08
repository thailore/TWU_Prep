package DotComGame;
import java.util.*;
/**
 * Created by tborgeso on 07/02/2017.
 */


public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame(){
        //first make some dot coms and give them locations
        DotCom one = new DotCom();
        one.setName("One.com");
        DotCom two = new DotCom();
        two.setName("Two.com");
        DotCom three = new DotCom();
        three.setName("Three.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink all three dot coms");
        System.out.println("One.com, Two.com, Three.com");
        System.out.println("Sink them in the fewest number of guesses");
        System.out.println(dotComsList);

        for (DotCom dotComToSet : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            System.out.println(newLocation);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
        while(!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess){
        numOfGuesses++;

        String result = "miss";

        for(DotCom dotComToTest : dotComsList){
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")){
                break;
            }
            if (result.equals("kill")){
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("All Dot Coms are dead!");
        if(numOfGuesses <=18){
            System.out.println("It only took you " + numOfGuesses + ", nice job");
        }else{
            System.out.println("Took you long enough!");
        }
    }

    public static void main(String[] args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

}

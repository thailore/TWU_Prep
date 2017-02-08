package DotComGame;
import java.util.*;
/**
 * Created by tborgeso on 07/02/2017.
 */
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
        System.out.println(locationCells);
    }

    public void setName(String n){
        name = n;
    }

    public String checkYourself(String userInput) {

        String result = "miss";

        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("You sunk " + name);
            } else {
                result = "hit";
            }
        }
        return result;
    }
}

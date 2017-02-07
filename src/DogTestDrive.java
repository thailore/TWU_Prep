/**
 * Created by tborgeso on 07/02/2017.
 */
public class DogTestDrive {
    public static void main (String[] args){
        Dog [] myDogs = new Dog[3];
        myDogs[0] = new Dog(120, "Ben", "Mastif");
        myDogs[1] = new Dog(54, "Mandy", "Rotweiler");
        myDogs[2] = new Dog(10, "Zoe", "Chihuahua");
        int i;
        for (i=0; i<3; i++){
            System.out.println(myDogs[i].getPetName() + " says " + myDogs[i].bark());
        }
    }
}



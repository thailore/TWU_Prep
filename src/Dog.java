/**
 * Created by tborgeso on 07/02/2017.
 */
public class Dog {

    private int weight;
    private String breed;
    private String petName;

    public Dog (int size, String name, String type){
        weight = size;
        petName = name;
        breed = type;
    }

    String bark() {
        if (weight > 60) {
            return("WOOOOF");
        } else if (weight > 15) {
            return("Ruff Ruff");
        } else {
            return("Yip");
        }
    }

    public void setWeight(int newWeight) {
        if (weight > 5) {
            weight = newWeight;
        }
    }

    public void setPetName(String newPetName){
        petName = newPetName;
    }

    public String getPetName(){
        return this.petName;
    }

}

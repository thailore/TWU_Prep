/**
 * Created by tborgeso on 08/02/2017.
 */
public class FizzBuzz {
    public static void main(String[] args){
        int num = 1;

        while (num <= 100){
            String line = "";
            if(num % 3 == 0){
                line += "Fizz";
            }
            if(num % 5 == 0){
                line += "Buzz";
            }
            if(line.length() == 0){
                System.out.println(num);
            }else {
                System.out.println(line);
            }
            num+=1;
        }

    }
}

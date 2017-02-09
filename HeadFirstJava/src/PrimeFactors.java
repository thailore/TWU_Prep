import java.util.*;
/**
 * Created by tborgeso on 09/02/2017.
 */
public class PrimeFactors {
    public static void main(String[] args){

        ArrayList<Integer> factors = getPrimeFactors(30);
        for (int number : factors){
            System.out.print(number + " ");
        }
    }

    public static ArrayList getPrimeFactors(int x){

        ArrayList<Integer> primeFactors= new ArrayList<Integer>();
        int number = x;
        // Print the number of 2s that divide x
        while (x%2==0)
        {
            if (!primeFactors.contains(2)){
                primeFactors.add(2);
            }
            x /= 2;
        }

        // x must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(x); i+= 2)
        {
            // While i divides n, print i and divide x
            while (x%i == 0)
            {
                primeFactors.add(i);
                x /= i;
            }
        }

        // This condition is to handle the case when
        // x is a prime number greater than 2
        if (x > 2) {
            primeFactors.add(x);
        }

        return primeFactors;
    }

}

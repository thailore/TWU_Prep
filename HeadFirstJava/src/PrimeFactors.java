import java.util.*;
/**
 * Created by tborgeso on 09/02/2017.
 */
public class PrimeFactors {
    public static void main(String[] args){

        getPrimeFactors(1);
    }

    public static void getPrimeFactors(int x){

        int number = x;
        boolean twoPrinted = false;
        // Print the number of 2s that divide n
        while (x%2==0)
        {
            if (!twoPrinted){
                System.out.print(2 + " ");
                twoPrinted = true;
            }
            x /= 2;
        }

        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(x); i+= 2)
        {
            // While i divides n, print i and divide n
            while (x%i == 0)
            {
                System.out.print(i + " ");
                x /= i;
            }
        }

        // This condition is to handle the case whien
        // n is a prime number greater than 2
        if (x > 2)
            System.out.print(x);

    }

}

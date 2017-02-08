import java.io.*;
import java.util.*;
/**
 * Created by tborgeso on 08/02/2017.
 */
public class Triangle_Exercises {
    public static void main(String[] args){

        drawEasiestExEver();
        drawHorizontalLine();
        drawVerticalLine();
        drawRightTriangle();

    }

    //Easiest exercise ever
    public static void drawEasiestExEver(){
        System.out.println("Easiest Exercise Ever");
        System.out.println("*\n");
    }

    //Horizontal line
    public static void drawHorizontalLine(){
        System.out.println("Draw a horizontal line");
        String userIn = getUserInput("Enter how many asterisks you want for the Horizontal line: ");
        int num = Integer.parseInt(userIn);
        while (num > 0){
            System.out.print("*");
            num--;
        }
        System.out.println("\n");
    }

    //Vertical line
    public static void drawVerticalLine(){
        System.out.println("Draw a vertical line");
        String userIn = getUserInput("Enter how many asterisks you want for the Vertical line: ");
        int num = Integer.parseInt(userIn);
        while (num > 0){
            System.out.println("*");
            num--;
        }
        System.out.println("\n");
    }


    public static void drawRightTriangle(){
        System.out.println("Draw right triangle");
        String userIn = getUserInput("Enter how many lines you want in the right triangle: ");
        int num = Integer.parseInt(userIn);
        for (int i=1; i<=num; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static String getUserInput(String prompt){
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e){
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }
}

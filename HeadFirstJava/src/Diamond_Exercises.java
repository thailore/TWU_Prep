import java.io.*;
import java.util.*;
/**
 * Created by tborgeso on 08/02/2017.
 */
public class Diamond_Exercises {
    public static void main(String[] args){

        drawIsoscelesTriangle(3);
        drawDiamond(3);
        drawDiamondWithName(3, "Tylor");

    }

    public static void drawIsoscelesTriangle(int n){
        System.out.println("Draw Isosceles Triangle");
        int numLines = n;
        int maxLength = (numLines * 2) - 1; //determine length of bottom of triangle
        for(int i=1; i<=maxLength; i+=2){
            int spaces = (maxLength - i) / 2; //determine number of spaces needed on either side of asterisk(s)
            for (int k = 0; k<spaces; k++){ //add spaces to left of asterisk(s)
                System.out.print(" ");
            }
            for (int j=0; j<i; j++){ //draw asterisks
                System.out.print("*");
            }
            for (int k = 0; k<spaces; k++){ //add spaces to right of asterisks
                System.out.print(" ");
            }
            System.out.println(); //next line in triangle
        }
        System.out.println("\n");
    }


    public static void drawDiamond(int n){
        System.out.println("Draw Diamond");
        int numLines = n;
        int maxLength = (numLines * 2) - 1; //determine length of bottom of triangle

        //draw top half of diamond
        for(int i=1; i<=maxLength; i+=2) {
            int spaces = (maxLength - i) / 2; //determine number of spaces needed on either side of asterisk(s)
            for (int k = 0; k < spaces; k++) { //add spaces to left of asterisk(s)
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) { //draw asterisks
                System.out.print("*");
            }
            for (int k = 0; k < spaces; k++) { //add spaces to right of asterisks
                System.out.print(" ");
            }
            System.out.println(); //next line
        }
        //draw bottom half of diamond
        for(int i=maxLength-2; i>=1; i-=2){
            int spaces = (maxLength - i) / 2; //determine number of spaces needed on either side of asterisk(s)
            for (int k = 0; k < spaces; k++) { //add spaces to left of asterisk(s)
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) { //draw asterisks
                System.out.print("*");
            }
            for (int k = 0; k < spaces; k++) { //add spaces to right of asterisks
                System.out.print(" ");
            }
            System.out.println(); //next line
        }
        System.out.println("\n");
    }


    public static void drawDiamondWithName(int n, String name){
        System.out.println("Draw Diamond with Name");
        int numLines = n;
        int maxLength = (numLines * 2) - 1; //determine length of bottom of triangle

        //draw top half of diamond
        for(int i=1; i<=maxLength; i+=2) {
            int spaces = (maxLength - i) / 2; //determine number of spaces needed on either side of asterisk(s)

            for (int k = 0; k < spaces; k++) { //add spaces to left of asterisk(s)
                System.out.print(" ");
            }
            if (i == maxLength){
                System.out.print(name);
            }else {
                for (int j = 0; j < i; j++) { //draw asterisks
                    System.out.print("*");
                }
                for (int k = 0; k < spaces; k++) { //add spaces to right of asterisks
                    System.out.print(" ");
                }
            }
            System.out.println(); //next line

        }
        //draw bottom half of diamond
        for(int i=maxLength-2; i>=1; i-=2){
            int spaces = (maxLength - i) / 2; //determine number of spaces needed on either side of asterisk(s)
            for (int k = 0; k < spaces; k++) { //add spaces to left of asterisk(s)
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) { //draw asterisks
                System.out.print("*");
            }
            for (int k = 0; k < spaces; k++) { //add spaces to right of asterisks
                System.out.print(" ");
            }
            System.out.println(); //next line
        }


    }

}

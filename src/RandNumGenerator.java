
import java.util.*;
import java.util.Random;

public class RandNumGenerator {
    public static void main (String[] args) {

        Scanner mrScanner = new Scanner(System.in);
        Random rand = new Random();

        //welcome message
        System.out.println("Welcome to Ruth's Simple Random Number Generator!");

        //getting lower bound of range
        System.out.println("Please input the lower bound of your range (i.e. 3)");
        int lowerNum = mrScanner.nextInt();
        System.out.println("The lower bound is: " + lowerNum);

        //getting upper bound of range
        int invalNum = 1;
        int upperNum;
        while (invalNum != 0) {
            System.out.println("Please input the upper bound of your range (i.e. 10)");
            upperNum = mrScanner.nextInt();
            if (upperNum < lowerNum) {
                System.out.print("Your upper bound is less than your lower bound. Please input a valid integer.");
            }
            else {
                invalNum = 0;
                System.out.println("The upper bound is: " + upperNum);
                //getting amount of numbers
                System.out.println("How many random numbers would you like?");
                int amtNum = mrScanner.nextInt();
                System.out.println("Generating " + amtNum + " number(s):");

                int i = amtNum;
                while (i > 0) {
                    int randNum = lowerNum + rand.nextInt(upperNum - lowerNum);
                    System.out.println(randNum);
                    i--;
            }
        }




        }
    }
}

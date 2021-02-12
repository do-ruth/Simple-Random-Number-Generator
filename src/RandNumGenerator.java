
import java.util.*;
import java.util.Random;

public class RandNumGenerator {
    public static void main (String[] args) {

        Scanner mrScanner = new Scanner(System.in);
        Random rand = new Random();

        //welcome message
        System.out.println("Welcome to Ruth's Simple Random Number Generator!");
        System.out.println("Note, your bounds will be included in the range");

        //getting lower bound of range

        boolean neg = true;
        int lowerNum;
        while (neg == true) {
            System.out.println("Please input the lower bound of your range (i.e. 3)");
            lowerNum = mrScanner.nextInt();
            if (lowerNum < 0) {
                System.out.println("You entered a negative number, please input a valid lower bound.");
            }
            else {
                neg = false;
                System.out.println("The lower bound is: " + lowerNum);

                //getting upper bound of range
                boolean invalNum = true;
                int upperNum;
                while (invalNum == true) {
                    System.out.println("Please input the upper bound of your range (i.e. 10)");
                    upperNum = mrScanner.nextInt();
                    if (upperNum < lowerNum || upperNum == lowerNum) {
                        System.out.print("Your upper bound is less than or equal to your lower bound. Please input a valid integer.");
                    }
                    else {
                        invalNum = false;
                        System.out.println("The upper bound is: " + upperNum);

                        //getting amount of numbers
                        System.out.println("How many random numbers would you like?");

                        int amtNum = mrScanner.nextInt();
                        System.out.println("Generating " + amtNum + " number(s):");
                        int counter = amtNum;
                        while (counter > 0) {
                            int randNum = lowerNum + rand.nextInt(upperNum - lowerNum + 1);
                            System.out.println(randNum);
                            counter--;
                        }
                    }




                }
            }


        }

    }
}

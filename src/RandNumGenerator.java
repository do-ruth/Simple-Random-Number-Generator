
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

        int neg = 1;
        int lowerNum;
        while (neg != 0) {
            System.out.println("Please input the lower bound of your range (i.e. 3)");
            lowerNum = mrScanner.nextInt();
            if (lowerNum < 0) {
                System.out.println("You entered a negative number, please input a valid lower bound.");
            }
            else {
                neg = 0;
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
                    else if (upperNum == lowerNum) {
                        System.out.print("Your upper bound is equal to your lower bound. Please input a valid integer.");
                    }
                    else {
                        invalNum = 0;
                        System.out.println("The upper bound is: " + upperNum);


                        //getting amount of numbers
                        System.out.println("How many random numbers would you like?");
                        int j = 1;
                        while (j != 0) {
                            int amtNum = mrScanner.nextInt();

                            int range = upperNum - lowerNum + 1;
                            if (amtNum > range) {
                                System.out.println("Your range does not fit the range. Enter in an amount smaller than the range.");
                            }
                            else {
                                System.out.println("Generating " + amtNum + " number(s):");
                                j = 0;
                                int i = amtNum;
                                while (i > 0) {
                                    int randNum = lowerNum + rand.nextInt(upperNum - lowerNum + 1);
                                    System.out.println(randNum);
                                    i--;
                                }

                            }

                        }
                    }




                }
            }


        }

    }
}

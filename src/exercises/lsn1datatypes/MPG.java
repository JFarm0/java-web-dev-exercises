package exercises.lsn1datatypes;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        float milesDriven;
        float gasConsumed;
        float mpg;

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        milesDriven = input.nextFloat();

        System.out.println("How much gas have you used? ");
        gasConsumed = input.nextFloat();
        input.close();

        mpg = milesDriven / gasConsumed;
        System.out.println("Your miles-per-gallon is " + mpg + ".");
    }
}

package exercises.lsn1datatypes;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        int length;
        int width;
        int area;

        Scanner input = new Scanner(System.in);
        System.out.println("What is the rectangle's length? ");
        length = input.nextInt();

        System.out.println("What is the rectangle's width? ");
        width = input.nextInt();
        input.close();

        area = length * width;
        System.out.println("The area of the rectangle is: " + area + ".");
    }
}

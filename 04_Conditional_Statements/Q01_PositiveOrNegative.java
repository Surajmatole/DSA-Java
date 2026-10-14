//Question1:
// Writea Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;
public class Q01_PositiveOrNegative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number =sc.nextInt();

        if (number>0) {
            System.out.println("The number is positive ");
        }
        else if (number < 0)
        {
            System.out.println("The number is negative ");
        }
        else
        {
            System.out.println("The number is zero..");
        }

    }
    
}

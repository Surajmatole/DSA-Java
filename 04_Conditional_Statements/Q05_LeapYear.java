import java.util.*;
public class Q05_LeapYear {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any year..");
    int year = sc.nextInt();
    if ((year % 400 ==0) || (year % 4 == 0 && year % 100 != 0))
    {
    System.out.println("Entered year is leap year");
    }
    else {
    System.out.println("Enterd year is not leap year..");
    }


    }
}

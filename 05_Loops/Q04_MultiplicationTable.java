// Write a program to print the multiplication table of a number N, entered by the
// user.
import java.util.*;
public class Q04_MultiplicationTable {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i,num;

    System.out.println("Enter the number :");
    num = sc.nextInt();
    for(i=1;i<=10;i++){
    System.out.println(num+"*"+i+"="+num*i);
    }

    }
}

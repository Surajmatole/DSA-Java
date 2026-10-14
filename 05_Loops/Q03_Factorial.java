// Write a program to find the factorial of any number entered by the user.
import java.util.*;
public class Q03_Factorial {

  
public static void main(String args[]){
int i;
int fact = 1;    
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :");
int num = sc.nextInt();

for (i=1;i<=num;i++)
{
fact = fact*i;
}
System.out.println("Factorial is :"+fact
);

}
}

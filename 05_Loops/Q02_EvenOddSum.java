// Question 2 : Write a program that reads a set of integers, and then prints the sum of the
// even and odd integers.

import java.util.*;
public class Q02_EvenOddSum {
public static void main (String args[]) { 
Scanner sc = new Scanner(System.in); 
int i;
int number;
int Evensum = 0;
int Oddsum = 0; 

for(i=1;i<=5;i++){
System.out.println("Enter number:");
number = sc.nextInt();
if (number %2== 0) { 
    Evensum += number;    
}
else {
    Oddsum += number;
}
}

System.out.println("Sum of Even Numbers :" + Evensum);
System.out.println("Sum of Odd Numbers :" + Oddsum);

}
}

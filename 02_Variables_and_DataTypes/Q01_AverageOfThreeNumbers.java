import java.util.Scanner;
public class Q01_AverageOfThreeNumbers {
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int n = 3;
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    float average = (a+b+c) /(float) n;
  
    System.out.println(average);

    }
}

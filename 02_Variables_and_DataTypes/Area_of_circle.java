import java.util.Scanner;
public class Area_of_circle {
    public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    float radius =sc.nextFloat();
    float area_of_circle = 3.14f*radius*radius;   
    System.out.println(area_of_circle);
    }
}

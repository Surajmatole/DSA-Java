import java.util.Scanner;
public class Q03_TotalCostWithGST {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter price of pencil:");
    float pencil = sc.nextFloat();
    System.out.println("Enter price of pen:");
    float pen = sc.nextFloat();
    System.out.println("Enter price of Eraser:");
    float Eraser = sc.nextFloat();
    float total = (pencil + pen + Eraser);
    float GST = (total * 18 / 100);
    Float Final_Bill = total + GST;
    System.out.println("Total :"+total);
    System.out.println("GST :" + GST);
    System.out.println("The Final Amount :"+ Final_Bill);
    
    }
}

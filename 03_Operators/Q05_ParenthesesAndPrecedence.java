public class Q05_ParenthesesAndPrecedence {
    public static void main(String[] args){
int x = 10, y = 5;
int exp1 = (y * (x / y + x / y));
int exp2 = (y * x / y + y * x / y);
System.out.println(exp1);
System.out.println(exp2);
}
} 

// (5 * (10 / 5 + 10 / 5)); = 20
    
// (5 * 10 / 5 + 5 * 10 / 5); = 20 
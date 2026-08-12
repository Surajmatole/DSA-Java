
public class Q01_OperatorPrecedence {

    public static void main(String[] args){
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.print(exp1 + " , ");
        System.out.print(exp2);
    }
    
}

// in this Question in expression 1 there is same precedence
// for *,/,% so we need follow order left to right 

// in the expression 2 there is paranthesis in expression so 
// first we need to solve parenthesis after that rest all

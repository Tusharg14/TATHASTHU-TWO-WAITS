import java.util.Scanner;
public class Calculator {
    public static void main(String args[]) {
        double n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        System.out.println("Enter the operator (+,-,*,/)");
        char ch;
        ch = sc.next().charAt(0);
        double o = 0;
        switch(ch){
            case '+' : o = n1 + n2;
                       break;
            case '-' : o = n1 - n2;
                       break;
            case '*' : o = n1 * n2;
                       break;
            case '/' : o = n1 / n2;
                       break;
            default : System.out.println("You entered wrong input!!");
        }
        System.out.println("Final result :");
        System.out.println(n1 + " " + ch + " " + n2 + " = " + o);
    }
}

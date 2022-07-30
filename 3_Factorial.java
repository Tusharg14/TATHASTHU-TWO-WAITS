import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        int n, x=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        n = sc.nextInt();
        System.out.println("Factorial of " + n + " is :");
        for(int i=n;i>0;i--)
            x *= i;
        System.out.print(x + " ");
    }
}

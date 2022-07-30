import java.util.Scanner;

public class Fibonacci{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms ");
        n = sc.nextInt();
        int a=0, b=1;
        System.out.print(a + " " + b);
        for(int i=3; i<=n; i++)
        {
            int tmp = a;
            a = b;
            b = tmp+b;
            System.out.print(" " + b);
        }
        return;
    }
}
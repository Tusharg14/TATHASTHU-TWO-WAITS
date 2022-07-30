import java.util.Scanner;

public class PermutationandCombination {
    public static int fact(int n)
    {
        int x=1;
        for(int i=n;i>0;i--)
            x *= i;
        return x;
    }
    public static void main(String[] args) {
        int n,r;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        n = in.nextInt();
        System.out.println("Enter the value of r : ");
        r = in.nextInt();
        int per = fact(n)/fact(n-r);
        int com = fact(n)/(fact(r)*fact(n-r));
        System.out.println("Permutation  = " + per);
        System.out.println("Combination  = " + com);
    }
}
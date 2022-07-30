import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        char ch = '*';
        int i,j,n,space =1;
        System.out.println("Enter the no of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        space = n-1;
        for(j=1;j<=n;j++)
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print(ch);                
            }
            System.out.println("");
        }
        space = 1;
        for(j=n-1;j>=1;j--)
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print(ch);                
            }
            System.out.println("");
        }
        return;
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int n,m;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows in matrix : ");
        n = in.nextInt();
        System.out.println("Enter the number of columns in matrix : ");
        m = in.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>(n);
        int i,j;
        System.out.println("Enter the elements of the matrix : ");
        for(i=0;i<n;i++)
        {
            ArrayList<Integer> list = new ArrayList<Integer>(m);
            for(j=0;j<m;j++)
            {
                list.add(in.nextInt());
            }
            arr.add(list);
        }
        System.out.println("Original matrix is :");
        for(i=0;i<arr.size();i++)
        {
            for(j=0;j<arr.get(i).size();j++)
            {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println("");
        }
        System.out.println("Transpose matrix is :");
        for(i=0;i<arr.size();i++)
        {
            for(j=0;j<arr.get(i).size();j++)
            {
                System.out.print(arr.get(j).get(i) + " ");
            }
            System.out.println("");
        }
    }
}

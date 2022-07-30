import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the no of elements :");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int i;
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        System.out.println("Enter the elements of array :");
        for(i=0;i<n;i++)
            arr.add(in.nextInt());
        System.out.println("Enter the element you want to delete : ");
        int x = in.nextInt();
        int index = arr.indexOf(x);
        if(index == -1)
            System.out.println("Element not present !");
        else
        {
            arr.remove(index);
            System.out.println(arr);
        }
        return;
    }
}

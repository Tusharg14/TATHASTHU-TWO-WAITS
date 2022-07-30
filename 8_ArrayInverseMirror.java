import java.util.Scanner;

public class ArrayInverseMirror {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of the array : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int i, arr[] = new int[n];
        System.out.println("Enter the elements of array : ");
        for(i=0; i<n; i++)
            arr[i] = in.nextInt();
        for(i=0; i<n; i++)
        {
            if(arr[arr[i]] != i)
            {
                System.out.println("Array is not mirror-inverse");
                return;
            }
        }
        System.out.println("Array is mirror-inverse");
        return;
    }
}

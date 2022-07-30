import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int num, temp, sum = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        temp = num;
        while(temp != 0)
        {
            int r = temp%10;
            sum = (sum * 10) + r;
            temp /= 10;
        }
        if(num == sum)
            System.out.println("Palindrome !!");
        else
            System.out.println("Not a palindrome !!");
        return;
    }
}

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        String str1, str2 = "";
        System.out.println("Enter the string = ");
        Scanner in = new Scanner(System.in);
        str1 = in.nextLine();
        int i;
        for(i=0; i<str1.length();i++)
        {
            str2 = str1.charAt(i) + str2;
        }
        System.out.println(str2);
    }
}

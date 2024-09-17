import java.util.Scanner;
public class pallindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();


        if(Ispallindrome(num))
            System.out.println("yes, It is a Pallindrome.");
        else
            System.out.println("No, It is not a pallindrome");
    }

    public static boolean Ispallindrome(int num) {
        int originalnum = num;
        int reversednum = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            reversednum = reversednum * 10 + rem;

        }
        return originalnum == reversednum;
    }
}
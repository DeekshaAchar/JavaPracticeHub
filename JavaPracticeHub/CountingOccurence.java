import java.util.Scanner;
public class CountingOccurence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        System.out.println("Enter a number of which u want to check the occurence: ");
        int m = scan.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == m) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("The count is: " + count);
    }
}

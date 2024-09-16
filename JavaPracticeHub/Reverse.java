import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        int ans = 0;
        while(n>0){
            int rem = n%10;
            n/=10;
            ans=ans*10+rem;

        }
        System.out.println(ans);
    }
}

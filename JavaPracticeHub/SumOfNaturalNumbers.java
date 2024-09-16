import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=scan.nextInt();
        Sum sum = new Sum();
        System.out.println("Sum of Natural numbers of " + n + " is " +  sum.NaturalNumbers(n));
    }
}
class Sum{
    int NaturalNumbers(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
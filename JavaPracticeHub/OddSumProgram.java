import java.util.Scanner;

public class OddSumProgram {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number: ");
    NumOdd odd = new NumOdd();
    int n = scan.nextInt();
    System.out.println("The sum of odd numbers: " + odd.num(n));
    }
}
class NumOdd{
    int num(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
}
import java.util.Scanner;
public class InrToUSD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a currency: ");
        int inr = scan.nextInt();

        double usd = ConvertedValue(inr);
        System.out.println("The USD value is " + usd);


    }


    public static double ConvertedValue(double inr) {
        double exchangerate = 0.012;
        return inr * exchangerate;
    }
}
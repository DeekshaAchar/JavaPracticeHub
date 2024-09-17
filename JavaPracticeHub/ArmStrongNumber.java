import java.util.Scanner;
public class ArmStrongNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = scan.nextInt();

        if (IsArmStrong(num))
            System.out.println("yes");
        else
            System.out.println("No");
    }




    public static boolean IsArmStrong(int num){
        int originalnumber = num;


        //count digits
        int n = 0;
        while(originalnumber!=0){
          originalnumber /= 10;
           n++;
        }

        originalnumber = num;   //assigning original number back because loop got updated

        int ans = 0;
        while(originalnumber!=0){
            int rem = originalnumber % 10;
            ans += (int)Math.pow(rem,n);
            originalnumber/=10;
        }
        return ans == num;
    }
}





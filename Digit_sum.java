import java.util.Scanner;

public class Digit_sum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=scan.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println("sum="+ sum);
        scan.close();
    }
}

import java.util.Scanner;

public class Count_digit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=scan.nextInt();
        int count=1;
        for(int i=0;i<n;i++)
        {
            n=n/10;
            count++;
            i++;
            
        }
        System.out.println("The digit of number=:"+count);
        scan.close();
    }
}

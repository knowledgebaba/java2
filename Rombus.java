import java.util.Scanner;

public class Rombus {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<5-i;k++)
            {
                System.out.print("*");
            }
            for(int l=0;l<i-1;l++)
            {
                System.out.print("*");
            }
            for(int h=0;h<4-i;h++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Invert_roh {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<4-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print("*");
            }
            for(int l=0;l<4-i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

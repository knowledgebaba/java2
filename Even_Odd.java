import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the range number:");
            int n=scan.nextInt();
            int i;
            for(i=1;i<=n;i++)
            {
                if(i%2==0)
                {
                    System.out.println(i+" is Even Number");
                }
                else{
                    System.out.println(i+" is odd Number");
                }
            }   
            scan.close();
        }
    }
}

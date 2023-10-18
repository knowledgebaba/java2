import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        System.out.println((a%2==0)?("Number is even"):("Number is odd"));
    }
    }


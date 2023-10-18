import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        System.out.println("Enter the tempreture in celcius:");
        Scanner scan = new Scanner(System.in);
        float cel = scan.nextFloat();
        float fr = cel*(9/5)+32;
        System.out.println("temp in fr is:" + fr);
        scan.close();

    }
}

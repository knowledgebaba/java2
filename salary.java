import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        System.out.println("Enter the basic salary:");
        Scanner scan=new Scanner(System.in);
        float s = scan.nextFloat();
        float hra = s*30/100;
        float ta = s*20/100;
        float da = s*10/100;
        int pf = 1500;
        float net_sal=s+hra+ta+da+pf;
        System.out.println("your hra is:" + hra);
        System.out.println("your ta is:" + ta);
        System.out.println("your da is:" + da);
        System.out.println("your pf is" + pf);
        System.out.println("your net salary is: " + net_sal);
        scan.close();

    }
}

import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        System.out.println("Enter the student name:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Enter your class:");
        int cl = scan.nextInt();
        System.out.println("Enter the phy number:");
        int phy = scan.nextInt();
        System.out.println("Enter the chem number:");
        int chem = scan.nextInt();
        System.out.println("Enter the math number:");
        int math = scan.nextInt();
        System.out.println("Enter the bio  number:");
        int bio = scan.nextInt();
        System.out.println("Enter the eng number:");
        int eng = scan.nextInt();
        int tot_mark = phy+chem+math+bio+eng;
        System.out.println("Total obtain marks:" + tot_mark);
        float per = (tot_mark*100)/500;
        System.out.println("Total presentage is:" + per);
        scan.close();
    }
}

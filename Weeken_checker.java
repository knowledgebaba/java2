import java.util.Scanner;

public class Weeken_checker {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name of day:");
        String a=scan.nextLine();
        String n=a.toLowerCase();
        switch(n){
            case "monday":{
                System.out.println("this is not weekend day:");
                break;
            }
            
            case "tuesday":{
                System.out.println("this is not weekend day:");
                break;
            }
            
            case "wednesday":{
                System.out.println("this is not weekend day:");
                break;
            }
            
            case "thursday":{
                System.out.println("this is not weekend day:");
                break;
            }
            
            case "friday":{
                System.out.println("this is not weekend day:");
            }
            
            case "saturday":{
                System.out.println("this is weekend day:");
                break;
            }
            
            case "sunday":{
                System.out.println("this is weekend day:");
                break;
            }
            default:
            {
                System.out.println("invalid day....\nplease enter right day");
            }
        }
        scan.close();

    }
}

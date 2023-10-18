import java.util.Scanner;

public class Season_determiner {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the name of month:");
      String n=scan.nextLine();
      String a=n.toLowerCase();
      switch(a){
        case "january":{
            System.out.println("this is winter season");
            break;
        }
        case "february":{
            System.out.println("this is winter season");
            break;
        } 
        case "march":{
            System.out.println("this is winter season");
            break;
        }      
        case "april":{
            System.out.println("this is winter season");
            break;
        }    
        case "may":{
            System.out.println("this is winter season");
            break;
        }    
        case "june":{
            System.out.println("this is summer season");
            break;       
        }
        case "july":{
            System.out.println("this is summer season");
            break;
        }
        case "august":{
            System.out.println("this is spring season");
            break;
        }   
        case "september":{
            System.out.println("this is spring season");
            break;
        }   
        case "october":{
            System.out.println("this is winter season");
            break;
        }  
        case "november":{
            System.out.println("this is winter season");
            break;
        }   
        case "december":{
            System.out.println("this is winter season");
            break;
        }        
        default:
        {
            System.out.println("Please Enter Right month:::::");
        }
    }   
    scan.close();
}
}
import java.util.Scanner;
public class Ticket_Price {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int week_days=sc.nextInt();
        switch  (week_days){
            case 1:
            case 2:
            case 3:
            case 4:  
            case 5:
                System.out.println("Low price");
                break;
            case 6:
            case 7:
                System.out.println("High price");
                break;
            default:
                System.out.println("Invalid Input");
        }sc.close();
    }
}

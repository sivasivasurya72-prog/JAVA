import java.util.Scanner;
public class Traffic_Signal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter traffic signal color: ");
        String traffic =sc.next();
        switch (traffic) {
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("Ready");
                break;
            case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Signal");
                break;
        }
        sc.close();
    }
    
}

import java.util.Scanner;
public class Mobile_Battery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int battery = sc.nextInt();
        if (battery <=20) {
            System.out.println("low battery");
        } else if(battery<=75) {
            System.out.println("modreate");
        }
        else{
            System.out.println("full battery");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Battery {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int battery=sc.nextInt();
        if (battery== 100) {
            System.out.println("Battery Full");
        } else if (battery>= 50) {
            System.out.println("Battery %"+battery+" consumed");
        } else {
            System.out.println("Battery Low");
        }sc.close();
    }
}

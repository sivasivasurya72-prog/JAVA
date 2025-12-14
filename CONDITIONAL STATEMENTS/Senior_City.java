import java.util.Scanner;

public class Senior_City {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        if (age >= 65) {
            System.out.println("Senior Citizen");
        } else {
            System.out.println("Not a Senior Citizen");
        }
          sc.close(); 
    }
}

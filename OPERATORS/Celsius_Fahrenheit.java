import java.util.Scanner;

public class Celsius_Fahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cel=sc.nextInt();
        double far=(cel*9.0/5)+32;
        System.out.println(far);
        sc.close();
    }
}

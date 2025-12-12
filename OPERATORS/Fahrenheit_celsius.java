import java.util.Scanner;

public class Fahrenheit_celsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int far=sc.nextInt();
        double cel=(far-32)*5.0/9;    
        System.out.println(cel);    
        sc.close();
    }
}

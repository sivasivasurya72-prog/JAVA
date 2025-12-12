import java.util.Scanner;

public class Digit3Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=a/100;
        int c=a%10;
        System.out.println(b + c);
        sc.close();}
    }

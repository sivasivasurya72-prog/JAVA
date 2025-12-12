import java.util.Scanner;
public class POsitive_orNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a >= 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }
        sc.close();
    }
}

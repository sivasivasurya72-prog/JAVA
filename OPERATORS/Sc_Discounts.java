import java.util.Scanner;
public class Sc_Discounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double disamt=(b/100)*a;
        double finalamt=a-disamt;
        System.out.println("The dicount amount is: "+disamt);
        System.out.println("The final price is: "+finalamt);


        sc.close();
    }
}   
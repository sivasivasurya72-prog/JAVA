import java.util.Scanner;

public class Apply_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double billAmount = sc.nextDouble();
        double discount1;
        if (billAmount < 500) { 
            discount1 = billAmount * 0.05;
        } else if (billAmount>2000) {
            discount1= billAmount * 0.10;
        } else {
            discount1= billAmount * 0.15;
        }
        double finalBill = billAmount - discount1;
        System.out.println("Final Bill Amount: " + finalBill);
        sc.close();
    }
}

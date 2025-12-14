import java.util.Scanner;
public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        double discount;
        if (bill < 1000) {
            discount = bill * 0.05;
        }
        else if (bill < 5000) {
            discount = bill * 0.10;
        }
        else {
            discount = bill * 0.20;
        }
        double finalAmount = bill - discount;
        System.out.println("Discount Amount: " + discount);
        System.out.println("Final Amt: " + finalAmount);
        sc.close();
    }
}

import java.util.Scanner;

public class Withdrawal_Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 123456;
        System.out.print("withdrawal amount: ");
        int amount = sc.nextInt();
        if (amount <= balance && amount % 100 == 0) {
            System.out.println("Multiple of 100");
            balance = balance - amount;
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Not multiple of 100");
        }
        sc.close();
    }
}


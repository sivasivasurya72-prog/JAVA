import java.util.Scanner;

public class ATMPinCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int storedPin = 2244;
        int balance =123456;
        System.out.print("Enter ATM PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == storedPin) {
            System.out.print("withdrawal amount: ");
        }else {
            System.out.println("Invalid PIN");}
            int withdraw = sc.nextInt();
            if (withdraw <= balance) {
                balance = balance - withdraw;
                System.out.println("Balance "+ balance);
            } else {
                System.out.println("Insufficient Balance");
            }
            sc.close();
        } 
        }




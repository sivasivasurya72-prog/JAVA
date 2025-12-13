import java.util.Scanner;

public class MangoOffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price per mango: ");
        int price = sc.nextInt();

        System.out.print("Enter total mangoes purchased: ");
        int purchased = sc.nextInt();
        int free = purchased / 3;  // For every 3 mangoes → 1 free
        int totalMangoes = purchased + free;
        int amount = purchased * price;
        System.out.println("Free mangoes: " + free);
        System.out.println("Total mangoes received: " + totalMangoes);
        System.out.println("Amount to pay: " + amount);
        sc.close();
        
    }
}


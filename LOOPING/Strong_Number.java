import java.util.Scanner;

public class Strong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int originalNum = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            num /= 10;
        }
        if (sum == originalNum) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }
        sc.close();
    }
}

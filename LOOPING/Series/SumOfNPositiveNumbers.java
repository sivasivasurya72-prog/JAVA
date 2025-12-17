// public class Sumpos_N {
    
// }
import java.util.Scanner;
public class SumOfNPositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter how many positive numbers (N): ");
        int N = sc.nextInt();
        int sum = 0;
        int count = 0;
         System.out.println("Enter numbers:");
        while (count < N) {
            int num = sc.nextInt();
            if (num < 0) {
                // negative number skip
                continue;
            }
            sum = sum + num;
            count++;
        }
        System.out.println("Sum of " + N + " positive numbers = " + sum);
        sc.close();
    }
}


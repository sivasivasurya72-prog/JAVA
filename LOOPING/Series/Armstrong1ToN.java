import java.util.Scanner;

public class Armstrong1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int num = 1; num <= N; num++) {
            int temp = num, sum = 0;
            while (temp > 0) {
                int d = temp % 10;
                sum += d * d * d;
                temp /= 10;
            }
            if (sum == num)
                System.out.print(num + " ");
        }sc.close();
    }
}


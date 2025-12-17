import java.util.Scanner;

public class Perfect1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int num = 1; num <= N; num++) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0)
                    sum += i;
            }
            if (sum == num)
                System.out.print(num + " ");
        }sc.close();
    }
}


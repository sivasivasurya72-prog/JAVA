import java.util.Scanner;

public class Prime1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int num = 2; num <= N; num++) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    count++;
            }
            if (count == 2)
                System.out.print(num + " ");
        }
    sc.close();}
}

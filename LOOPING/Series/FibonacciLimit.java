import java.util.Scanner;

public class FibonacciLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");

        while (true) {
            int c = a + b;
            if (c > limit)
                break;
            System.out.print(c + " ");
            a = b;
            b = c;
        }sc.close();
    }
}

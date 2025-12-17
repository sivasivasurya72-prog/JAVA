import java.util.Scanner;

public class PerfectSquare1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i * i <= N; i++)
            System.out.print(i * i + " ");
    sc.close();}
}


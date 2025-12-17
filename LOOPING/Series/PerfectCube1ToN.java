import java.util.Scanner;

public class PerfectCube1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i * i * i <= N; i++){
            System.out.print(i * i * i + " ");}
   sc.close(); }
}


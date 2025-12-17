import java.util.Scanner;
class SwapFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n, count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int power = (int)Math.pow(10, count - 1);
        int first = n / power;
        int last = n % 10;
        int middle = (n % power) / 10;

        int result = last * power + middle * 10 + first;
        System.out.println(result);
   sc.close(); }
}


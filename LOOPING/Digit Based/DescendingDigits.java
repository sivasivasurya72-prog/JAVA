import java.util.Scanner;
class DescendingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prev = -1;
        boolean desc = true;

        while (n > 0) {
            int cur = n % 10;
            if (cur < prev) {
                desc = false;
                break;
            }
            prev = cur;
            n /= 10;
        }
        System.out.println(desc ? "Descending" : "Not Descending");
   sc.close(); }
}

import java.util.Scanner;
class AscendingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prev = 10;
        boolean asc = true;

        while (n > 0) {
            int cur = n % 10;
            if (cur > prev) {
                asc = false;
                break;
            }
            prev = cur;
            n /= 10;
        }
        System.out.println(asc ? "Ascending" : "Not Ascending");
    sc.close();}
}

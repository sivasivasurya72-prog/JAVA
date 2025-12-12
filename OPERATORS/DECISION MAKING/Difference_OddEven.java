import java.util.Scanner;

public class Difference_OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int diff = (num1 - num2);
        if(diff % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }sc.close();
    }
}

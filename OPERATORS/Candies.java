import java.util.Scanner;

public class Candies {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total_Candies = sc.nextInt();
        int total_Students = sc.nextInt();
        System.out.println(total_Candies / total_Students);
        System.out.println(total_Candies % total_Students);
        sc.close();
    }
}

import java.util.Scanner;
public class Weather_Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        switch (temp / 10) {//temp/10 idu kudutha kedaikira single value keadikum adhu case laa vandhu join agum 
            case 1:
                System.out.println("Cold");
                break;
            case 2:
                System.out.println("Pleasant");
                break;
            case 3:
                System.out.println("Hot");
                break;
            default:
                System.out.println("Heatwave");
        }
        sc.close();
    }
}

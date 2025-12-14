import java.util.Scanner;
public class Vehicle_Speed {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int speed=sc.nextInt();
        if(speed>100){
            System.out.println("Speed exceeds");
        } else {
            System.out.println("Limited Speed");
        }
        sc.close();
    }
}
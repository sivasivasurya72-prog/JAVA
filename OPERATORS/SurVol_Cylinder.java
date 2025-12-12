import java.util.Scanner;

public class SurVol_Cylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        int height=sc.nextInt();
        System.out.println(2*3.14*radius*(radius+height));
        System.out.println(3.14*radius*radius*height);
        sc.close();
    }
}

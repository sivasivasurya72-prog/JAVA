import java.util.Scanner;

public class SurVol_Sphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();    
        double surface_area=4*3.14*radius*radius;
        double volume=(4.0/3.0)*3.14*radius*radius*radius;
        System.out.println(surface_area);
        System.out.println(volume);
        sc.close();
    }
}

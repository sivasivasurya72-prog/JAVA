import java.util.Scanner;

public class SurVolPer_Cube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        System.out.println("Surface Area:" + 6*side*side);
        System.out.println("Volume:" + side*side*side); 
        System.out.println("Perimeter:" +4*side);
        sc.close();
    }
    
}

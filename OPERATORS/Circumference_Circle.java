import java.util.Scanner;

public class Circumference_Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();    
        double circumference=2*3.14*radius;
        System.out.println(circumference);
        sc.close();
    }
}

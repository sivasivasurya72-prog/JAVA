import java.util.Scanner;

public class SurVol_Cuboid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int bred=sc.nextInt();
        int height=sc.nextInt();    
        System.out.println(2*(len*bred + bred*height + height*len));
        System.out.println(len*bred*height);    
        sc.close();
    }
    
}

import java.util.Scanner;

public class Perimete_Rectangle{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int len=sc.nextInt();   
    int bred=sc.nextInt();
    System.out.println(2*(len+bred));
    sc.close();
}
}

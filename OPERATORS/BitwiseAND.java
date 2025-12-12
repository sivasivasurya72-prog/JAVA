import java.util.Scanner;
public class BitwiseAND {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0 && (a & (a - 1)) == 0){
            System.out.println("It is power of Two");}
            else{
                System.out.println("It is not power of Two");}
        sc.close();}
        }

    


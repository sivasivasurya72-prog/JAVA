import java.util.Scanner;
public class Even_num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i=i+2){
            System.out.print(i+" ");
        }sc.close();
    }
}

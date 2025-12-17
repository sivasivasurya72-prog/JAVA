import java.util.Scanner;
public class Even_N {
    public  static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<=n;i=i+2){
                count++;   
         } System.out.print(count);
        
        sc.close();
    }}
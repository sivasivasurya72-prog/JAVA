import java.util.Scanner;
public class Sum_OdEv {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int odd=0;
        int even=0;
        for(int i=0;i<=n;i++){
           if(i%2==0){
            even=even+i;
           }else{
            odd=odd+i;
            
              // System.out.print();
        //    for(int j=1;j>=n;j=j+2){
        //     System.out.println(j);}}
        sc.close();
    }
            System.out.println(even);
            System.out.println(odd);
           }

}}
    


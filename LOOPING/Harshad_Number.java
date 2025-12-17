import java.util.Scanner;
public class Harshad_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();//18
         
        int ori=n;//18
        int sum=0;//0
        while(n>0){
         sum=sum+(ori%10);
         ori=ori/10;
      }
         //int digit=n%10;//18%10   8//
           // sum=sum+n%10;//0+8  8//
            //n=n/10;//    1//
          // System.out.println(sum);
           //System.out.println(digit);
           //int last=n%10;
           //int first=n/10;
           //int sum=last+first;
           //System.out.println(sum);
           //System.out.println(last);
           //System.out.println(first);
            
         //}
         if(n%sum==0){
            System.out.println("Harshad Number");
         }
         else{
            System.out.println("Not a Harshad Number");
         }
         sc.close();
    }
}

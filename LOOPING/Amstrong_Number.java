import java.util.Scanner;
public class Amstrong_Number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();//153
        int originalNum=num;//153
        int sum=0;//0//3//
        while(num!=0){
            int digit=num%10;//153/10=3//
            sum=sum+digit*digit*digit;//0//0+3=3//
            num/=10;//153/10=15//
        }
       if (sum==originalNum){
            System.out.println("Amstrong Number");
        }else{
            System.out.println("Not an Amstrong Number");
        }
        sc.close();
    }   
       
}
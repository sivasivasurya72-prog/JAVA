import java.util.Scanner;
public class Mobile_Number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int mobile_number=sc.nextInt();
        if(mobile_number>=10){
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");  
        }sc.close();
    }

}

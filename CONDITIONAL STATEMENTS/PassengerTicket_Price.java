import java.util.Scanner;
public class PassengerTicket_Price {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<=5){
            System.out.println("Children");
        }
      else if(age>=18 && age<=40){
            System.out.println("Adult");
        }
      else {
            System.out.println("Senior");
        }sc.close();
    }
}

import java.util.Scanner;
public class Marks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>=35){
            System.out.println("pass");
        }
      else {
            System.out.println("fail");
        }sc.close();
    }
    
}

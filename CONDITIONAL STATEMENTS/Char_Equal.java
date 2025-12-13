import java.util.Scanner;
public class Char_Equal {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
            char ch1=sc.next().charAt(0);
            char ch2=sc.next().charAt(0);
            if(ch1==ch2){
                System.out.println("Equal");
            } else {
                System.out.println("Not Equal");
            }
            sc.close();
}
}

// import java.util.Scanner;
// public class Sum_MulPos {
//  public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     int n;
//     int sum=0;
//     while(true){
//         n=sc.nextInt();
//         if(n<0){
//             break;}
//             sum=sum+n;
//             System.out.println(sum);
//           }
    
//    sc.close();}
// }
import java.util.Scanner;
public class SumOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        //System.out.println("Enter positive numbers (enter negative number to stop):");
        while (true) {
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("Stop");
                break;   // stop when negative number entered
            }
            sum = sum + num;
        }
        System.out.println( sum);
        sc.close();
    }
}

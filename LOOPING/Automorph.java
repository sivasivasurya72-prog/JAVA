import java.util.Scanner;

public class Automorph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sq = num * num;
        int las=sq%100;
        System.out.println(sq);
        //int first=num%10;
        //first=first*first;
        if(num==las){
            System.out.println("Automorph Number");
    }
       else{
            System.out.println("Not an Automorph Number");
        }
        sc.close();
    }
}

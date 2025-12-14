import java.util.Scanner;
public class Water_Bill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int water_units= sc.nextInt();
    double bill = 0;
        if (water_units<= 1000) {
            bill = 0;
        }
        else if (water_units<= 3000) {
            bill = ((water_units- 1000) / 1000.0) * 5;
        }
        else {
            bill = (2000 / 1000.0) * 5
                 + ((water_units - 3000) / 1000.0) * 10;
        }
        System.out.println("Water Bill: " + bill);
    }
}


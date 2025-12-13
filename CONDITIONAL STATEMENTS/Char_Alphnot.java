import java.util.Scanner;
 Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        char ch = sc.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Alphabet");
        } else {
            System.out.println("Not Alphabet");
        }
        sc.close();
    }


import java.util.Scanner;

public class q9_multiply{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        System.out.println("Multiplication = " + (x * y));
        sc.close();
    }
}
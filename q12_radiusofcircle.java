
import java.util.Scanner;

public class q12_radiusofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println("Area = " + (Math.PI * r * r));
        sc.close();
    }
}
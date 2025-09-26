
import java.util.Scanner;
public class q10_ascii_value {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println("ASCII value = " + (int) ch);
        sc.close();
    }
}

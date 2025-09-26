import java.util.Scanner;

public class q11_boolean_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean val = sc.nextBoolean();
        System.out.println(val ? "You entered true" : "You entered false");
        sc.close();
    }
}



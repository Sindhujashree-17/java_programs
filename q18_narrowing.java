public class q18_narrowing {
        public static void main(String[] args) {
        double a = 8.765;
        int b = (int) a;  // narrowing
        System.out.println("Double: " + a);
        System.out.println("Int: " + b);
    }
}

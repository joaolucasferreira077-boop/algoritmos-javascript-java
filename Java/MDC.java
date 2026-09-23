public class MDC {

    static int mdc(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(mdc(48, 18)); // 6
    }
}

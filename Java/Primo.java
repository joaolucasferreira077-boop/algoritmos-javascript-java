public class Primo {

    static boolean ehPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ehPrimo(17)); // true
        System.out.println(ehPrimo(18)); // false
    }
}

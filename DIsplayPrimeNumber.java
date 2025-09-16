public class DIsplayPrimeNumber {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else
            return gcd(b, a % b);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (gcd(n, i) > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
                if (count % 8 == 0)
                    System.out.println();
            }
        }
    }
}

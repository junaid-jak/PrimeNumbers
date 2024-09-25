public class Primes {
    public static void main(String[] args) {
        int nValues = 50;
        outerLoop:
        for (int i = 2; i <= nValues; i++) {
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    continue outerLoop; // Continue with the next number if divisible
                }
            }
            System.out.println(i); // Only print if no divisors found (i is prime)
        }
    }
}

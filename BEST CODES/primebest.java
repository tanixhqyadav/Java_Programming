public class primebest {
    public static void sieveOfEratosthenes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        // Initialize all numbers as prime
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        // Mark multiples of each prime as non-prime
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        // Print the prime numbers
        System.out.println("Prime numbers up to " + limit + " are:");
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int limit = 7;
        sieveOfEratosthenes(limit);
    }
}

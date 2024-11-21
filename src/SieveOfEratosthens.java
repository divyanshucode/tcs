import java.util.Scanner;
import java.util.ArrayList;
public class SieveOfEratosthens {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number:");
            int n = sc.nextInt();

            ArrayList<Integer> primes = sieveOfEratosthenes(n);

            System.out.println("Prime numbers up to " + n + ": " + primes);

            sc.close();
        }

        // Sieve of Eratosthenes to find all primes up to n
        public static ArrayList<Integer> sieveOfEratosthenes(int n) {
            boolean[] isPrime = new boolean[n + 1];
            ArrayList<Integer> primes = new ArrayList<>();

            // Initialize all entries as true. A value in isPrime[i] will
            // finally be false if i is Not a prime, true otherwise.
            for (int i = 2; i <= n; i++) {
                isPrime[i] = true;
            }

            // Mark non-prime numbers as false
            for (int p = 2; p * p <= n; p++) {
                if (isPrime[p]) {
                    // Mark all multiples of p as false
                    for (int i = p * p; i <= n; i += p) {
                        isPrime[i] = false;
                    }
                }
            }

            // Collect all prime numbers
            for (int i = 2; i <= n; i++) {
                if (isPrime[i]) {
                    primes.add(i);
                }
            }

            return primes;
        }
    }



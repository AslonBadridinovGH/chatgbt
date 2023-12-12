package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {
    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int num = 2; // Start checking from 2
        while (primes.size() < n) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        return primes;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 10; // Generate the first 10 prime numbers
        List<Integer> primeNumbers = generatePrimes(n);
        System.out.println("The first " + n + " prime numbers are:");
        for (int prime : primeNumbers) {
            System.out.print(prime + " ");
        }
    }
}


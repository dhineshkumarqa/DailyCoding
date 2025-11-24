package JavaCoding;

import java.util.Scanner;

public class Day3PrimeNumberInRange {

	public static void main(String[] args) {
		int min, max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the minimum value: ");
		min = sc.nextInt();
		System.out.println("Enter the maximum value: ");
		max = sc.nextInt();

		for (int n = min; n <= max; n++) {
			if (n <= 1) {
				System.out.println("it is not prime number");
			}
			boolean isprime = true;

			for (int i = 2; i < n / 2; i++) {
				if (n % i == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime) {
				System.out.print(n + " ");
			}
		}

	}

}

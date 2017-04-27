
import java.util.Scanner;

public class KKK {

	public static void main(String[] args) {
		// new PrimeCheck1().start();
		new Prime().run();
	}
}

class PrimeCheck1 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter any number to check it is prime or not");
			int number = scanner.nextInt();

			int flag = 0;

			// checking the condition of prime

			for (int x = 2; x <= number / 2; x++) {
				if (number % x == 0) {
					System.out.println("Your entered number is not prime please enter another number");
					flag = 1;
					break;

				}
			}

			if (flag == 0) {
				System.out.println("The number is prime");

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

class Prime implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter any number to check it is prime or not");
			int number = scanner.nextInt();

			int flag = 0;

			// checking the condition of prime

			for (int x = 2; x <= number / 2; x++) {
				if (number % x == 0) {
					System.out.println("Your entered number is not prime please enter another number");
					flag = 1;
					break;

				}
			}

			if (flag == 0) {
				System.out.println("The number is prime");

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

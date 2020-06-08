import java.util.Scanner;
import java.util.Random;

class GuessTheNumber {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		do {
			int count = 0;
			int guess = -1;
			int number = random.nextInt(10);

			while (count < 3 && guess != number) {
				System.out.print("Guess the number (0..9): ");
				guess = scanner.nextInt();
				if (number != guess) {
					System.out.println("Your number is " + ((guess > number) ? "greater" : "less"));
					count++;
				}
			}

			System.out.println("You " + ((guess == number) ? "WIN!" : "Lose: " + number));
			System.out.println("Repeat game? Yes - 1, No - 0");

			} while (scanner.nextInt() == 1);
	}
}

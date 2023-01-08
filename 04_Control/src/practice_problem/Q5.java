package practice_problem;

public class Q5 {

	public static void main(String[] args) {

		int line = 0;
		int star = 0;
		int leftSpace = 0;

		for (line = 0; line < 4; line++) {

			for (leftSpace = 1; leftSpace < 4 - line; leftSpace++) {

				System.out.print(" ");
			}
			for (star = 0; star < line * 2 + 1; star++) {

				System.out.print("*");
			}

			System.out.println();

		}

		for (line = 3; line > 0; line--) {

			for (leftSpace = 4 - line; leftSpace > 0; leftSpace--) {

				System.out.print(" ");
			}
			for (star = line * 2; star > 1; star--) {

				System.out.print("*");

			}
			System.out.println();

		}
	}
}

package practice_problem;

public class Q4 {

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

	}
}

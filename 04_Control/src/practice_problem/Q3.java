package practice_problem;

public class Q3 {

	public static void main(String[] args) {

		int dan = 0, su = 0;

		for (dan = 2; dan < 10; dan++) { // 구구단에서의 단

			System.out.println("*** " + dan + "단 ***");

			for (su = 1; su < 10; su++) {

				if (dan + 1 <= su) {
					break;
				}

				System.out.println(dan + " * " + su + " = " + (dan * su));

			} // 안쪽 for문 end

			System.out.println();

		} // 바깥쪽 for 문 end

	}

}

package practice_problem;

public class Q2 {

	public static void main(String[] args) {

		for (int dan = 2; dan < 10; dan++) { // 구구단에서의 단

			if ((dan % 2) != 0) {
				continue;
			}
			System.out.println("*** " + dan + "단 ***");

			for (int su = 1; su < 10; su++) {

				System.out.println(dan + " * " + su + " = " + (dan * su));

			} // 안쪽 for문 end

			System.out.println();

		} // 바깥쪽 for 문 end

	}

}

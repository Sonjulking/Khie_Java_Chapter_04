package khie;

//다중 for문 예 => 구구단을 만들어 보자!

public class ForExam_34 {

	public static void main(String[] args) {

		for (int dan = 2; dan < 10; dan++) { // 구구단에서의 단

			System.out.println("*** " + dan + "단 ***");

			for (int su = 1; su < 10; su++) {

				System.out.println(dan + " * " + su + " = " + (dan * su));

			} // 안쪽 for문 end

			System.out.println();

		} // 바깥쪽 for 문 end

		System.out.println();
		System.out.println();

		// 가로로 출력해볼게요

		for (int k = 2; k <= 9; k++) {
			System.out.print("***" + k + " 단 ***\t");
		}

		for (int su1 = 1; su1 <= 9; su1++) { // 구구단에서의 수

			for (int dan1 = 2; dan1 <= 9; dan1++) {

				System.out.print(dan1 + " * " + su1 + " = " + (dan1 * su1) + "\t");

			}

			System.out.println();

		}

	}

}

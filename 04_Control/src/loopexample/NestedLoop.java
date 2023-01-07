package loopexample;

public class NestedLoop {

	public static void main(String[] args) {

		for (int dan = 3; dan < 8; dan++) { // 구구단에서의 단 //3단부터 7단출력

			System.out.println("*** " + dan + "단 ***");

			for (int su = 1; su < 10; su++) {

				System.out.println(dan + " * " + su + " = " + (dan * su));

			} // 안쪽 for문 end

			System.out.println();

		} // 바깥쪽 for 문 end

	}

}

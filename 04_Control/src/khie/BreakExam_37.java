package khie;

/*
 *  1 ~ 100까지의 합을 구하는데 합이 200이 되는 순간까지만의 합을 구하여 화면에 보여주세요.
 */

public class BreakExam_37 {

	public static void main(String[] args) {

		int sum = 0; // 합을 구하는 변수

		int i = 0;

		for (i = 1; i <= 100; ++i) { // Q, ++i, i ++ 이랑 값차이?

			sum += i; // sum = sum + 1;

			if (sum >= 200) {

				break;

			}

		}

		System.out.println("sum >>> " + sum);
		System.out.println("su >>> " + i);

	}

}

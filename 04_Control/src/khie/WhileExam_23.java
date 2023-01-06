package khie;

/*
 * [문제] 1 ~ 100까지의 홀수의 합과 짝수의 합을 구하여 화면에 보여주세요.
 */

public class WhileExam_23 {

	public static void main(String[] args) {
		int number = 1;
//		int odd = 0;
//		int even = 0;
		int oddSum = 0, evenSum = 0;

		while (number <= 100) {

			if ((number % 2) == 0) { // 짝수일때 실행

				evenSum += number; // evenSum = evenSum + number;

			} else { // 짝수가 아니면(홀수이면) 실행
				oddSum += number; // oddSum = oddSum + number;
			}

			number++;

		}

		System.out.println("1 ~ 100의 홀수의 합은 " + oddSum + "입니다.");
		System.out.println("1 ~ 100의 짝수의 합은 " + evenSum + "입니다.");

	}

}

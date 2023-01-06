package khie;
/*
 * [문제] for 반복문을 이용하여 1 ~ 100 까지의 홀수의 합과 짝수의 합을 구하여 화면에 보여주세요.
 * 
 */

public class ForExam_31 {

	public static void main(String[] args) {

		int oddSum = 0, evenSum = 0;

		for (int i = 1; i <= 100; i++) {

			if ((i % 2) == 0) { // 짝수일때
				evenSum += i;
			} else { // 홀수 일때
				oddSum += i;
			}

		} // for문 end

		System.out.println("홀수의 합은 " + oddSum + " 입니다.");
		System.out.println("짝수의 합은 " + evenSum + " 입니다.");

	}

}

package khie;

import java.util.Scanner;

/*
 * 	[문제2] 키보드로 입력 받은 정수가 홀수인지 짝수인지 판별하여 화면에 출력해보세요.
 */

public class IfElseExam_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력해주세요. >>> ");

		int jungsu = sc.nextInt();

		if ((jungsu % 2) == 0) { // %2 == 1 일때는 홀수입니다.
			// 짝수인 경우 출력문
			System.out.println("입력받은 정수는 " + jungsu + " 은(는) 짝수입니다.");
		} else {
			// 홀수인 경우 출력문
			System.out.println("입력받은 정수는 " + jungsu + " 은(는) 홀수입니다.");
		}

		sc.close();

	}

}

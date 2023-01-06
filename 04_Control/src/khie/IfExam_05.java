package khie;
/*
 * [문제] 키보드로부터 입력받은 정수가 60점 이상이면 "합격입니다." 라는 메세지를 화면에 출력해보세요.
 */

import java.util.Scanner;

public class IfExam_05 {

	public static void main(String[] args) {

		// 1.키보드로 입력받기.

		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요. >>> ");

		int num1 = sc.nextInt();

		// 2.입력받은 점수가 60점인지 판별하기

		if (num1 > 60) {
			System.out.println("합격입니다.");
		}

		System.out.print("프로그램이 종료 되었습니다. ");

		sc.close(); // 스캐너 클래스 종료해주기
	}

}

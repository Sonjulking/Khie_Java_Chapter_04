package khie;

import java.util.Scanner;

/*
 * [문제3] 키보드로부터 입력받은 정수가 5의 배수이면 " 이 정수는 5의 배수입니다." 라고 화면에 출력을 하고, 그렇지 않으면
 * "이 정수는 5의 배수가 아닙니다." 라고 화면에 출력해 보자. 단, 입력받은 정수가 음수이면 "음수값이 입력되었습니다." 라고 화면에
 * 출력해보세요.
 * 
 */
public class IfElseExam_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력해주세요. >>> ");

		int jungsu = sc.nextInt();

		if (jungsu > 0) { // 0일때는 어떻게 하나요
			if ((jungsu % 5) == 0) {
				System.out.println("이 정수는 5의 배수 입니다.");
			} else {
				System.out.println("이 정수는 5의 배수가 아닙니다.");
			}
		} else {
			System.out.println("음수값이 입력되었습니다.");
		}

		sc.close();

	}

}

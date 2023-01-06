package khie;

import java.util.Scanner;

//성별 확인 문제

public class IfElseExam_11 {

	public static void main(String[] args) {

		// 방법 1

//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("성별입력(M:남성 / F:여성) : ");
//
//		String gender = sc.next();

//		if (gender.equals("F")) { // 문자열을 비교하려면 equals() 메서드를 사용해야된다. 대소문자를 구별해주는 메서드
//			// .equalsIgnoreCase() 메서드를 사용하면 대소문자를 구별해주지 않는다.
//			System.out.println("여성입니다.");
//		} else {
//			System.out.println("남성입니다.");
//		}

		// 방법 2
		Scanner sc = new Scanner(System.in);

		System.out.print("성별입력(M:남성 / F:여성) : ");

		String gender = sc.next();

		gender.charAt(0); // 여러개의 문자중에서 첫번째 문자를 가져와줌.

		char c = gender.charAt(0);

		if (c == 'F') {
			System.out.println("여성입니다.");
		} else {
			System.out.println("남성입니다.");
		}
		sc.close();

	}

}

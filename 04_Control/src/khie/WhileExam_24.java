package khie;

public class WhileExam_24 {

	public static void main(String[] args) {

		// ABCD .... XYZ 까지 문자를 출력해보자.

		char alpha = 'A'; // 반복문에서의 초기식
		// 소문자 a 는 97
		while (alpha <= 'Z') { // 반복문에서의 조건식

			System.out.print(alpha);
			alpha++;

		}

		System.out.println();

		System.out.println();

		// ZYXWV .... CBA 까지 문자를 출력해보자.

		char alpha2 = 'Z';

		while (alpha2 >= 'A') {

			System.out.print(alpha2);

			alpha2--;
		}

	}

}

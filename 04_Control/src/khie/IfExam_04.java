package khie;

import java.util.Scanner; //기본적으로 java.lang 패키지 안에서 작업을 함
//스캐너는 java.lang 패키지안에 없기때문에 따로 불러와야됌.

/*
*키보드로 입력받은 정수값이 음수라면
*"입력받은 정수는 음수입니다." 라는 메세지를 
*콘솔(화면에 출력해보자.) 
*/

public class IfExam_04 {

	public static void main(String[] args) {

		// 키보드로 입력받는 방법
		// 키보드를 입력받기 위한 준비 작업.
		Scanner sc = new Scanner(System.in); // System.in은 표준입력 장치를 뜻함
		System.out.print("정수 하나를 입력하세요. : "); // 입력받을떄는 println보다 print메서드를 더 많이씀

		int su = sc.nextInt(); // 형변환 작업을 안해도 된다.

		// 입력받은 정수가 음수인지 조건식을 이용하여 판별하자.
		if (su < 0) {
			System.out.println("입력받은" + su + "는(은) 음수입니다.");
		}

		// Scanner를 이용하면 반드시 종료를 시키자.
		sc.close(); // 이걸 까먹었네

	}

}

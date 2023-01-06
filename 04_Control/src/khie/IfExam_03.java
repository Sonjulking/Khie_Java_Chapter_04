/*
 * [문제] 키보드로 입력 받은 정수가 5로 나누어 떨어지면 " 이 정수는 5의 배수입니다." 라는 메시지를 콘솔창에
 * 출력해보세요.
 */

package khie;

public class IfExam_03 {

	public static void main(String[] args) {

		// 1.키보드로 정수를 입력을 받아야 된다.

//		System.out.print("정수를 입력해보세요. >>> ");
//
//		Scanner sc = new Scanner(System.in);
//
//		int num = sc.nextInt();
		System.out.println("프로그램 시작");
		int num = Integer.parseInt(args[0]);

		// 2.조건식을 통해서 5의 배수인지 판별을 하자.

		if ((num % 5) == 0) {

			// 3. 화면에 5의 배수이면 출력해주자.
			System.out.println("이 정수는 5의 배수 입니다.");

		}

		System.out.println("프로그램 종료");

		// Scanner를 이용하면 반드시 종료를 시키자.
		// sc.close();

	}

}

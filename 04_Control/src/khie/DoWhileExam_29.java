package khie;

/*
 * do ~ while 반복문 
 * -먼저 반복 실행문을 실행하고 조건식을 비교함.  //do ~ while문은 참이든 거짓이든 무조건 한번은 실행함
 * 
 * 	형식) 
 * 	do{
 * 		반복실행문장;
 * }while(조건식); //조건식뒤에 세미콜론 필수!
 * 
 */

public class DoWhileExam_29 {

	public static void main(String[] args) {

		// 1 ~ 10 까지 화면에 출력해 보자.

		int num = 1; // 반복문 에서의 초기식

		do {

			System.out.println("num >>> " + num);

			num++;

		} while (num <= 10);

		System.out.println();

		int su = 1;

		while (su <= 10) {

			System.out.println("su >>> " + su);

			su++;

		}

		// do ~ while 과 while문에서 가장 큰 차이점.

		int num1 = 1; // 반복문 에서의 초기식

		do {

			System.out.println("num >>> " + num1);

			num1++;

		} while (num1 >= 10);

		System.out.println();

		int su1 = 1;

		while (su1 >= 10) {

			System.out.println("su >>> " + su1);

			su1++;

		}

		// 둘다 똑같이 거짓이지만 do ~ while은 무조건 한번은 실행! 그냥 while은 실행조차 못했음...

	}

}

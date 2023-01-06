package khie;

import java.util.Scanner;

/*
 *  1 ~ 100 사이의 정수 중에서 키보드로 5개의 정수를 입력을 받아서 5개의 정수 중에서 최대값을 화면에 주세요.
 *  
 * 	(예: 43, 17, 64, 97, 11)
 */

//최댓값 변수에는 가장 작은값, 최솟갑 변수에는 가장 큰 값을 넣어둬야 된다.//그래서 맥스변수에 0을 넣음

public class WhileExam_27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int max = 0; // 최대값이 저장될 변수

		int temp = 0, su = 1; // temp 키보드로 입력받은 정수를 저장 , su는 초기값

		while (su <= 5) {

			System.out.print(su + "번째 정수 입력 : ");

			temp = sc.nextInt();

			if (temp > max) {

				max = temp;

			}

			su++;
		}
		System.out.println("최대값 >>> " + max);

		sc.close();

	}

}

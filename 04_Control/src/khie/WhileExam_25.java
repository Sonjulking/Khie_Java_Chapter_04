package khie;
/*
 * [문제] 키보드로 입력 받은 수의 홀수의 합과 짝수를 합을 구하여 화면에 보여주세요.
 * (while 반복문을 이용할 것)
 * 
 */

import java.util.Scanner;

public class WhileExam_25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수를 입력해주세요. >>> ");
		int inputNum = sc.nextInt(); // 입력받는 수
		int i = 1; // 반복문의 초기식
		int oddSum = 0, evenSum = 0; // 짝수합, 홀수합

		while (i <= inputNum) {

			if ((i % 2) == 0) { // 짝수인 경우

				evenSum += i;

			} else { // 거짓인 경우

				oddSum += i;
			}

			i++;

		}

		System.out.println("1부터 " + inputNum + "의 홀수의 합은 " + oddSum);

		System.out.println("1부터 " + inputNum + "의 짝수의 합은 " + evenSum);

		sc.close();

	}

}

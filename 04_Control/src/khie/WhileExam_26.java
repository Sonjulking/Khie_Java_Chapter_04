package khie;

import java.util.Scanner;

//입력 반은 수 만큼 별을 찍어 보자.

public class WhileExam_26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("별의 최대 갯수를 입력하세요 : ");

		int starCount = sc.nextInt();

		int count = 1; // 반복문에서의 초기식

		System.out.println();
		System.out.println();

		while (count <= starCount) {

			System.out.print("*");

			count++;

		}

		sc.close();
	}

}

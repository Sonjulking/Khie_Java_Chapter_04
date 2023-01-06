package khie;

import java.util.Scanner;

public class ForExercise {

	public static void main(String[] args) {

		// String[] subject = new String[4];
		// subject[0] = "자바";....

		String[] subject = { "자바", "수학", "국어", "영어" };

		int[] jumsu = new int[4];

		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력해주세요. >>> ");
		String name = sc.next();

		for (int i = 0; i < jumsu.length; i++) {
			System.out.print(subject[i] + "점수를 입력하세요. >>> ");
			jumsu[i] = sc.nextInt();
		}

		System.out.println();

		System.out.println("이름은 " + name + " 입니다.");

		for (int i = 0; i < jumsu.length; i++) {
			System.out.print(subject[i] + "점수 : ");
			System.out.print(jumsu[i] + "점 입니다.");
			System.out.println();

		}

		int sum = 0;
		for (int i = 0; i < jumsu.length; i++) {

			sum += jumsu[i];

		}

		System.out.println("총점은 " + sum + "점 입니다.");
		double averageScore = (double) sum / (double) jumsu.length;
		System.out.printf("평균 점수 : %.2f점 입니다.\n", averageScore);

		String grade;

		if (averageScore >= 90) {
			grade = "A학점";
		} else if (averageScore >= 80) {
			grade = "B학점";
		} else if (averageScore >= 70) {
			grade = "C학점";
		} else if (60 <= averageScore) {
			grade = "D학점";
		} else {
			grade = "F학점";
		}

		System.out.println("학점 : " + grade);

		sc.close();
	}

}

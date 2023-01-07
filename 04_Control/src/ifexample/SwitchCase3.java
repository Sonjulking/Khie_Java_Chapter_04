package ifexample;

import java.util.Scanner;

public class SwitchCase3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int floor = 0;

		System.out.print("층을 입력해주세요. >>> ");

		floor = sc.nextInt();

		switch (floor) {
		case 1:
			System.out.println("1층 약국입니다.");
			break;
		case 2:
			System.out.println("2층 정형외과입니다.");
			break;
		case 3:
			System.out.println("3층 피부과입니다.");
			break;
		case 4:
			System.out.println("4층 치과입니다.");
			break;
		case 5:
			System.out.println("5층 헬스클럽입니다.");
			break;

		}
		sc.close();

	}

}

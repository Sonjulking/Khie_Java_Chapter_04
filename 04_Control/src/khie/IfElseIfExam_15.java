package khie;

//주사위를 굴려서 임의의 숫자를 하나 받아 보자.

public class IfElseIfExam_15 {

	public static void main(String[] args) {

		Math.random(); // 난수발생 함수의 범위 : 0.0 <= random < 1
		// double 타입으로 되어있음.
		// 1 ~ 100 까지의 숫자를 받고싶다.
		// 0.01 ~ 0.99999999999..... => * 100 => 0 ~ 99.9999999999
		// => 인트형으로 형변환 해준고. 1을 더해줌. (int)(Math.random() * 100) + 1;
		// 범위 정하기
		// (int) Math.random() * (최댓값 - 최소값 + 1) + 최소값

		int random = (int) (Math.random() * 6) + 1;

		if (random == 1) {
			System.out.println("주사위 1번이 나왔습니다.");
		} else if (random == 2) {
			System.out.println("주사위 2번이 나왔습니다.");
		} else if (random == 3) {
			System.out.println("주사위 3번이 나왔습니다.");
		} else if (random == 4) {
			System.out.println("주사위 4번이 나왔습니다.");
		} else if (random == 5) {
			System.out.println("주사위 5번이 나왔습니다.");
		} else {
			System.out.println("주사위 1번이 나왔습니다.");
		}

	}

}

package ifexample;

public class SwitchCase {

	public static void main(String[] args) {

		int ranking = 1;
		char medalColor = 0;

		switch (ranking) {
		case 1:
			medalColor = 'G';
			break;
		case 2:
			medalColor = 'S';
			break;
		case 3:
			medalColor = 'B';
			break;

		case 5:
		case 6:
		case 7:
		case 8:
			break; // 이런식으로도 사용가능함

		default:
			medalColor = 'A';

		}

		System.out.println(ranking + "동 메달의 색깔은 " + medalColor + "입니다.");

	}

}

package khie;

/*
 * 아래와 같이 화면에 출력해 보자
 * 
 * 	*****
 * 	*****
 * 	*****
 * 	*****
 * 
 * 	*
 * 	**
 * 	***
 * 	****
 * 	*****
 * 
 *  //행의 갯수만큼 열의 별이 출력되는중
 * 
 * 
 * 	*****
 * 	****
 * 	***
 * 	**
 * 	*
 * 
 */

public class ForExam_35 {

	public static void main(String[] args) {

		// 첫번째 별찍기

		for (int i = 1; i <= 4; i++) { // 별찍기에서의 행

			for (int j = 1; j <= 5; j++) {// 별찍기에서의 열

				System.out.print("*");

			}

			System.out.println();

		}

		System.out.println();
		System.out.println();

		// 두번째 별찍기

		for (int i = 1; i <= 5; i++) { // 별찍기에서의 행

			for (int j = 1; j <= i; j++) {// 별찍기에서의 열

				System.out.print("*");

			}

			System.out.println();

		}

		System.out.println();
		System.out.println();

		// 세번째 별찍기

		for (int i = 5; i >= 1; i--) { // 별찍기에서의 행

			for (int j = 1; j <= i; j++) {// 별찍기에서의 열

				System.out.print("*");

			}

			System.out.println();

		}

	}

}

package rps;

import java.util.Scanner;

/**
 * 2016. 4. 16. Gamerps.java shinhyundo story : 가위바위보게임
 */
public class GameRPS0 {
	/**
	 * 컴퓨터와 사용자간의 가위바위보 게임을 완성하시오. Math.random()*E+S S는 시작값 E는 마지막 값
	 */
	public static void main(String[] args) {
		int sccisors = 0, rock = 0, paper = 0, rpsValue = 0, comValue = 0;
		System.out.println("=== 가위바위보 게임 ===");
		System.out.println("가위 =1, 바위=2, 보=3");
		Scanner scanner = new Scanner(System.in);
		rpsValue = scanner.nextInt();
		comValue = (int) (Math.random() * 3 + 1);
		switch (rpsValue) {
		case 1:
			if (comValue == 1) {
				System.out.println("비김");
			} else if (comValue == 2) {
				System.out.println("패배");
			} else {
				System.out.println("승리");
			}
			break;
		case 2:
			if (comValue == 1) {
				System.out.println("승리");
			} else if (comValue == 2) {
				System.out.println("비김");
			} else {
				System.out.println("패배");
			}
			break;
		case 3:
			if (comValue == 1) {
				System.out.println("패배");
			} else if (comValue == 2) {
				System.out.println("승리");
			} else {
				System.out.println("비김");
			}
			break;

		default:
			System.out.println("1~3까지 숫자만 입력바랍니다.");
			break;
		}
	}
}

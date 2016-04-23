package kaup;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		KaupBean kaup = new KaupBean();
		KaupService service = new KaupServiceImpl();
		while (true) {
			System.out.println("===카우프 지수 구하기 프로그램===");
			System.out.println("[메뉴] 1.계속 2.종료");
			int key = scanner.nextInt();
			switch (key) {
			case 1:
				System.out.println("이름을 입력몸무게, 키를 입력");
				kaup.setName(scanner.next());
				kaup.setWeight(scanner.nextInt());
				kaup.setHeight(scanner.nextInt());
				System.out.println(kaup.getName() + "의 상태는" + service.getResult(service.getIndex(kaup)) + "이다.");
				break;
			case 2:
				System.out.println("시스템 종료입니다");
				return;

			default:
				System.out.println("1,2번만 선택이 가능합니다");
				break;
			}
		}
	}
}

package lotto;

import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		LottoBean hong = new LottoBean();
		LottoService service = new LottoServiceImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.println("얼마치를 구입하십니까?");
		hong.setMoney(scanner.nextInt());
		// System.out.println("귀하의 로또 장수는 "+service.getCount()+"장입니다.");
		// int num = hong.getNumber();
		// System.out.println("랜덤숫자 결과"+num);
		service.setLottos(hong);
		int[][] lottos = service.getLottos();
		for (int i = 0; i < lottos.length; i++) {
			service.sort(lottos[i]);
			for (int j = 0; j < lottos[i].length; j++) {
				System.out.print(lottos[i][j]+"\t");
			}
			System.out.println();
		}

	}
}

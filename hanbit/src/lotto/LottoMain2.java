package lotto;

import java.util.Scanner;

public class LottoMain2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lotto lotto = new Lotto();
		
		int money = 0;
		
		System.out.println("=== 로또 시작 ===");
		System.out.println("얼마치를 구입합니까?");
		
		lotto.setMoney(scanner.nextInt());
		
		int[][] result = lotto.getLottos();
		
		if(result == null || result.length == 0){
			System.out.println("구매금액을 확인해주세요.");
		}else{
			System.out.println("=== 로또번호 출력===");
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[i].length; j++) {
					System.out.print(result[i][j]+"\t");
				}
				System.out.print("\n");
			}
		}
	}
}

package lotto;

import java.util.Arrays;

public class Lottery {
	private int[] lotto;
	
	public Lottery() { //  생성자 --> 객체 생성 --> 인스턴스 변수(메소드들이 값을 공유하는 변수) 초기화
		//super();
		lotto = new int[6];
		
	}

	public int[] getLotto() {
		this.setLotto();
		return lotto;
	}

	public void setLotto() {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = 0;
			}
		for (int i = 0; i < lotto.length; i++) {
			int num = (int)(Math.random()*45+1);
			System.out.println("로또추첨중.."+num);
			boolean exist = false;
			for (int j = 0; j < lotto.length; j++) {
				//중복체크
				if (num == lotto[j]) {
					exist = true;
					break;
				}
			}
			if (exist) {
				i--;
				continue;
			} else {
				lotto[i] = num;
			}
			
		}
		
		Arrays.sort(lotto);
	}
	
	
	
}

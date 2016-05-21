package lotto;

public class LottoServiceImpl implements LottoService {

	int[][] lottos;
	int[] lotto;
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(LottoBean bean) {
		this.count = bean.getMoney() / 1000;
	}

	@Override
	public void setLottos(LottoBean bean) {
		// 로또 번호 만들기(2, 15, 21, 31, 39, 45) x 입력된 돈 만큼
		setCount(bean);
		this.lottos = new int[count][6];
		this.lotto = new int[6];
		int i = 0;
		if (count < 0) {
			this.lottos = null;
		} else {
			for (count = 0; count < lottos.length; count++) {
				while (true) {
					int num = bean.getNumber();
					if (isDuplication(count, num)) {
						//System.out.println("중복된값" + num);     -> 중복된 값 표기
						continue;
					}
					lottos[count][i] = num;
					i++;
					if (i == lottos[count].length) {
						i = 0;
						break;
					}
				}
			}
			System.out.println();
		}
	}

	@Override
	public int[][] getLottos() {
		// 만들어진 로또 번호 가져오기
		return this.lottos;
	}

	@Override
	public void inputMoney(LottoBean bean) {
		// 입력된 돈을 가지고 몇장을 출력할 지 결정하기

	}

	@Override
	public boolean isDuplication(int count, int num) {
		// 중복된 번호인지 체크 (중복이면 true 리턴)
		for (int i = 0; i < lottos.length; i++) {
			if (lottos[count][i] == num) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void sort(int[] lotto) {
		// 오름차순으로 정렬
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = 0; j < lotto.length - i - 1; j++) {
				if (lotto[j] > lotto[j + 1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;

				}
			}
		}
	}

	// @Override
	// public int getCount() {
	// // TODO Auto-generated method stub
	// return 0;
	// }

	// @Override
	// public int count(LottoBean bean) {
	// 몇 장을 출력할 것인지 결정
	// int count = money/1000; 생략
	// return bean.getMoney() / 1000;
	// }
	// @Override
	// public int count(LottoBean bean) {
	// // TODO Auto-generated method stub
	// return 0;
	// }

}

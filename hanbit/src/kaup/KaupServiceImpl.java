package kaup;

public class KaupServiceImpl implements KaupService {
	/*
	 * 그 인덱스 결과가 
	 * 30 이상이면 비만
	 * 24 이상이면 과체중
	 * 20 이상이면 정상
	 * 15 이상이면 저체중
	 * 13 이상이면 마름
	 * 10 이상이면 영양실조
	 * 그 미만이면 소모증 이랍니다.
	 * */
	@Override
	public int getIndex(KaupBean kaup) {
		int	idx = (int)((kaup.getWeight()/(kaup.getHeight()*kaup.getHeight()))*10000);
		return idx;
	}

	@Override
	public String getResult(int idx) {
		String result = "";
		// 알고리즘 구현
		if (idx >=24) {
			result = "과체중";
		} else if (idx >=20){
			result = "정상";
		} else if (idx >=15){
			result = "저체중";
		} else if (idx >=13){
			result = "마름";
		} else if (idx >=10){
			result = "영양실조";
		} else {
			result = "소모증";
		}
		return result;
	}

}

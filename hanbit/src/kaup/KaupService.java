package kaup;

public interface KaupService {
	public int getIndex(KaupBean kaup);
	public String getResult(int index);
	//카우프 구하는 공식 ind idx = (int)((weight/(height*height))*10000);
	/*
	 * 그 인덱스 결과가 30 이상이면 비만
	 * 24 이상이면 과체중
	 * 20 이상이면 정상
	 * 15 이상이면 저체중
	 * 13 이상이면 마름
	 * 10 이상이면 영양실조
	 * 그 미만이면 소모증 이랍니다.
	 * */
	
	
}

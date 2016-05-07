package lotto;

public class Lotto{
	private int money, balanceMoney;
	private int[][] lottos;
	int[] arr;
	
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return this.money;
	}
	
	public void setLottos(int money) {
		//2중 배열(lottos)에 this.generateRandomNum()을 사용하여
		//랜덤배열에 담는 코드완성
		
		this.arr = new int[6];
		//입력된 금액으로 게임수 추출
		int count = this.count(this.getMoney());
		
		if(count > 0){
			//금액에 맞는 게임을 이중배열로 생성
			this.inputMoney(this.getMoney());
			
			for (int i = 0; i < count; i++) {
				for (int j = 0; j < 6; j++) {
					
					int num = this.generateRandomNum();
					
					while (this.isDuplication(num)) {
						this.arr[j] = num;
						break;
					}
				}
				//정렬
				//Arrays.sort(this.arr);
				this.sort(this.arr);
				
				System.arraycopy(this.arr, 0, this.lottos[i], 0, this.arr.length);
			}
		}
		
		//this.lottos = lottos;
	}
	public int[][] getLottos() {
		//코드완성!
		this.setLottos(this.getMoney());
		return this.lottos;
	}
	
	public void inputMoney(int money) {
		this.money = money;
		lottos = new int[money/1000][6];
	}
	public int generateRandomNum() {
		//로또의 랜덤 숫자 생성
		int randomNum = 0;
		//코드완성!
		randomNum = 1 + (int)(Math.random() * 45);
		
		return randomNum;
	}
	public boolean isDuplication(int num) {
		//로또번호의 중복여부 체크
		boolean result = false;//초기화는 false;
		//코드완성!
		for (int i = 0; i < this.arr.length; i++) {
			if(this.arr[i] != num) result = true;
		}
		return result;
	}
	
	public void sort(int[] arr) {
		//로또번호의 오름차순으로 정렬하기
		//25, 3, 30, 1, 11 --> 1, 3, 11, 25, 30
		//2중 for-loop 사용 + SWAP정렬
		//코드완성!
		
		//Arrays.sort(arr);
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		this.arr = arr;
		
	}
	public int count(int money) {
		int count = 0;
		if(money < 1000){
			return count;
		}
		return (int)Math.ceil(money/1000);//몫만 리턴하는 메소드
	}
	
}
package lotto;

public class LottoBean {
	private int money;
	private int number;
	// alt + shift + s + r
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getNumber() {
		setNumber();
		return number;
	}
	public void setNumber() {
		this.number = (int)(Math.random()*45+1);
	}
	
}

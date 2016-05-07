package bank;

public class UserServiceImpl implements UserService {
	/* 
	 변수의 종류
	 1. 지역변수 : 메소드 안에 선언 + 반드시 초기화
	 2. 인스턴스 변수 : 클래스 안에 선언 + 초기화를 하지 않는다
	 3. 스태틱(전역)변수 : 프로젝트 어디든 호출가능, 단 클래스이름.메소드 이름() Math.random()
		cf. int a; 선언 / int a = 0; 초기화
	 **/
	AccountBean account; // = new AccountBean(); 인스턴스 변수라서 초기화를 하지 않는다.
	
	@Override
	public String openAccount(String name, int password, int money) {
		account = new AccountBean(); // 메소드가 초기화를 해준다.
		// 계좌 개설
		account.setOwnerName(name);
		account.setPassword(password);
		account.setRestMoney(money);
		
		return account.toString();
	}

	@Override
	public String searchRestMoney() {
		// 잔액 조회
		return String.valueOf(account.getRestMoney());  // int 타입 -> String 타입 변경
	}

	@Override
	public String deposit(int money) {
		// 예금
		account.setRestMoney(account.getRestMoney()+money);
		return "입급후 잔액은" +account.getRestMoney();
	}

	@Override
	public String withdraw(int money) {
		// 출금
		String message = ""; // 지역변수는 무조건 초기화
		if (account.getRestMoney()>=money) {
			account.setRestMoney(account.getRestMoney()-money);	
			message = "출금후 잔액은"+account.getRestMoney();
		} else {
			message = "잔액이 부족합니다";
		}
		
		return message;
	}

	@Override
	public String closeAccount() {
		// 계좌 해지
		account = null;
		return "계좌가 해지되었습니다";
	}

}

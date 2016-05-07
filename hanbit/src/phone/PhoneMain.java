package phone;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Phone phone = new Phone();
		CellPhone cellPhone = new CellPhone();
		Iphone iphone = new Iphone();
		AndroidPhone androidPhone = new AndroidPhone();

		while (true) {
			System.out.println("1. 일반전화  2.휴대전화  3.아이폰  4.안드로이드 0.종료");
			switch (scanner.next()) {
			case "1":
				System.out.println("어느 회사 제품 ?");
				phone.setCompany(scanner.next());
				System.out.println("통화내용 ?");
				phone.setCall(scanner.next());
				System.out.println(phone.toString());
				break;
			case "2":
				System.out.println("어느 회사 제품 ?");
				cellPhone.setCompany(scanner.next());
				System.out.println("통화내용 ?");
				cellPhone.setCall(scanner.next());
				cellPhone.setPortable(true);
				System.out.println(cellPhone.toString());
				break;
			case "3":
				System.out.println("To. ?");
				System.out.println("문자내용 ?");
				iphone.setData(scanner.next(),scanner.next());
				System.out.println(iphone.toString());
				break;
			case "4":
				System.out.println("To ?");
				System.out.println("사이즈?");
				System.out.println("카톡 내용?");
				androidPhone.setData(scanner.next(), scanner.next(), scanner.next());
				System.out.println(androidPhone.toString());
				break;
			case "0":
				System.out.println("프로그램이 종료되었습니다.");
				return;
			default:
				System.out.println("0~4까지의 번호만 입력하시오");
				break;
			}

		}
	}

}

package member;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Memberservice service = new MemberserviceImpl();
		
		System.out.println();
		while (true) {
			System.out.println("[메뉴] 1. 회원가입  2. 로그인  3. 마이페이지  4. 수정  5. 탈퇴  6. 조회(ID)  7. 조회(성별)  8.조회(이름)  0.로그아웃");
			switch (s.next()) {
			case "1":
				System.out.println("id 입력, pw 입력, 이름 입력, 성별 입력");
				MemberBean bean = new MemberBean(s.next(),s.next(),s.next(),s.next());
				System.out.println(service.join(bean));
				break;
			case "2":
				System.out.println("id 입력, pw 입력");
				System.out.println(service.login(s.next(), s.next()));
				break;
			case "3":
				System.out.println(service.detail().toString());
				break;
			case "4":
				System.out.println("pw 변경");
				MemberBean bean2 = new MemberBean();
				bean2.setPwd(s.next());
				service.update(bean2);
				break;
			case "5":
				service.delete();
				break;
			case "6":
				System.out.println("조회 ID");
				System.out.println(service.findByID(s.next()).toString());
				break;
			case "7":
				System.out.println("조회 성별 : 남자이면 m, 여자이면 w");
				System.out.println(service.countByGen(s.next())+"명");
				break;
			case "8":
				System.out.println("조회 이름");
				System.out.println(service.findByName(s.next()));
				break;
			case "0":
				System.out.println("로그아웃");
				return;
			default:
				System.out.println("정수만 입력바랍니다.");
				break;
			}
		}
	}
}

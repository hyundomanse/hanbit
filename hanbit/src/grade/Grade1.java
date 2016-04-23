package grade;

public class Grade1 {
	// ==== 멤버 필드영역(스코프) ====
	int total, avg; // 인스턴스 변수는 초기화를 하지 않는다, 메인메소드에서 보기 위한 값이 아니기 때문에 리턴하는 값이 아니라 초기화가 불필요하다.
	
	
	
	
	
	// ==== 멤버 메소드 영역 (스코프) ====
	// 총점 구하기
	public int getTotal(int kor, int eng, int math) {
		int total = 0;
		total = kor + eng + math;
		// int total = kor + eng + math; > 이렇게 써도 가능
		this.total = total; // this 는 "이 클래스 안에 있는" 이라는 의미
		return total;
	}

	// 평균 구하기
	public int getAvg(int total) {
		int avg = total / 3;
		this.avg = avg;
		return avg;
	}

	// 학점 구하기 : get grade
	/*
	 * 평균 점수가 90이상 A 80이상 B 70이상 C 60이상 D 50미만 F 학점입니다.
	 * 
	 */
	public String getGrade(int kor, int eng, int math) {
		int total = this.getTotal(kor, eng, math); // <this 는 생략가능
		int avg = this.getAvg(total);
		String grd = "";
		//알고리즘
		switch (avg/10) {
		case 10:
			grd ="A";		break;
		case 9:
			grd ="A";		break;
		case 8:
			grd ="B";		break;
		case 7:
			grd ="C";		break;
		case 6:
			grd ="D";		break;
		case 5:
			grd ="E";		break;
		default:
			grd ="F";		break;
		}
		return grd;

	}
}

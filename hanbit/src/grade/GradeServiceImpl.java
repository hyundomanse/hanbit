package grade;

public class GradeServiceImpl {
	// ==== 멤버 메소드 영역 (스코프) ====
	// 총점 구하기
	public int getTotal(GradeBean grade) {
		int total = grade.getKor()+grade.getEng()+grade.getMath()+grade.getJava();// this 는 "이 클래스 안에 있는" 이라는 의미
		// int total = kor + eng + math;
		return total;
	}

	// 평균 구하기
	public int getAvg(GradeBean grade) {
		int avg = (this.getTotal(grade))/4; // (grade.getKor()+grade.getEng()+grade.getMath()) / 3;
		return avg;
	}

	// 학점 구하기 : get grade
	/*
	 * 평균 점수가 90이상 A 80이상 B 70이상 C 60이상 D 50미만 F 학점입니다.
	 * 
	 */
	public String getGrade(GradeBean grade) {
		int avg = (getTotal(grade))/4;  //(grade.getKor()+grade.getEng()+grade.getMath()+grade.getJava()) / 4;
		String grd = "";
		// if (avg >= 90) {
		// grd = "A";
		// } else if (avg >= 80) {
		// grd = "B";
		// } else if (avg >= 70) {
		// grd = "C";
		// } else if (avg >= 60) {
		// grd = "D";
		// } else if (avg >= 50) {
		// grd = "E";
		// } else {
		// grd = "F";
		// }
		switch (((getTotal(grade))/4)/10) {
		case 10:		grd ="A";		break;
		case 9:			grd ="A";		break;
		case 8:			grd ="B";		break;
		case 7:			grd ="C";		break;
		case 6:			grd ="D";		break;
		case 5:			grd ="E";		break;
		default:
			grd = "F";			break;
		}
		return grd;

	}
}

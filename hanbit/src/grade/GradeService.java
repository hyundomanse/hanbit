package grade;

public interface GradeService {
		// 총점 구하기
		public int getTotal(GradeBean grade); // 추상메소드
		
		// 평균 구하기
		public int getAvg(GradeBean grade);
		// 학점 구하기 : get grade
		/*
		 * 평균 점수가 90이상 A 80이상 B 70이상 C 60이상 D 50미만 F 학점입니다.
		 * 
		 */
		public String getGrade(GradeBean grade) ;

}

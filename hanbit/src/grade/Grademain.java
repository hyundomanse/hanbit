package grade;

import java.util.Scanner;

/**
 *2016. 4. 16.
 *Grademain.java
 *shinhyundo
 *story : 성적표 프로그램
 */
public class Grademain {
	/**
	 [문제]
	 과목별 점수를 입력받아 총점, 평균, 학점을 구하는 프로그램을 완성하시오
	 (과목은 국,영,수) 
	 * */
	public static void main(String[] args) {
		//----------[1.변수 선언 영역]-----------------
		Scanner scanner = new Scanner(System.in);
		GradeBean grade = new GradeBean();
		GradeServiceImpl service = new GradeServiceImpl();
		int total=0, avg=0; // kor=0, eng=0, math=0, 생략
		String name ="", grd = "";
		//----------[2.파라미터 입력 영역]--------------
		System.out.println("이름 입력");
		//name = scanner.next();
		System.out.println("국어, 영어, 수학 점수 입력");
		//kor = scanner.nextInt();
		//eng = scanner.nextInt();
		//math = scanner.nextInt();
		//int kor = scanner.nextInt(), eng = scanner.nextInt(), math = scanner.nextInt();
		//----------[3.메소드 호출]------------------
		//total = grade.getTotal(kor, eng, math);
		//avg = grade.getAvg(total);
		//grd = grade.getGrade(avg);
		grade.setName(scanner.next());
		grade.setKor(scanner.nextInt());
		grade.setEng(scanner.nextInt());
		grade.setMath(scanner.nextInt());
		//grd = grade.getGrade();
		// int total = grade.gettotal(kor, eng, math); 할 경우 상위에 int에서 total 삭제 가능.
		//----------[4.리턴값 출력 영역]--------
				
		//System.out.println(name+"의 총점은 "+total+"이고, 평균은 "+avg+"이다");

		System.out.println(grade.getName()+" : "+service.getGrade(grade)+"학점");

	}
}

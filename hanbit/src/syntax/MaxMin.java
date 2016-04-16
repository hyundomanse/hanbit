package syntax;

import java.util.Scanner;

/**
 *2016. 4. 16.
 *MaxMin.java
 *shinhyundo
 *story : 배열+forloop
 */
public class MaxMin {
	/**
	[문제]
	한반에 5명의 학생이 시험을 치뤘습니다.
	선생님이 5명의 점수를 입력하자마자 바로 최고점과 최저점이 출력되는
	프로그램을 완성하시오
	 * */
	public static void main(String[] args) {
		System.out.println("=== 점수를 입력하면 최고점, 최저점이 출력됩니다 ===");
		System.out.println("총 3명의 점수만 입력이 가능합니다. 입력해주세요");
		int max=0, score1=0, score2=0, score3=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 점수입력");
		score1 = scanner.nextInt();
		System.out.println("두번째 점수입력");
		score2 = scanner.nextInt();
		System.out.println("세번째 점수입력");
		score3 = scanner.nextInt();
		if ((score1 > score2) && (score1 > score3)) {
			max = score1;
		}else if (score2 > score3) {
			max = score2;
		}else {
			max = score3;
		}
		
		System.out.println("최고점은\n"+max);
		}
					
	}



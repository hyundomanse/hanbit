package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 9. 
 * Calc.java 
 * shinhyundo 
 * story : 브랜치 예제(계산기 프로그램)
 */
public class Calc {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0, op = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("연산자 종류를 입력( 1:+, 2:-, 3:*, 4:/)");
		op = scanner.nextInt();
		if (op == 1) {
			System.out.println("===두 수의 더하기 프로그램===");
			System.out.println("첫번째 정수 입력");
			a = scanner.nextInt();
			System.out.println("두번째 정수 입력");
			b = scanner.nextInt();
			c = a + b;
			System.out.println(a + "+" + b + "=" + c);
		} else if (op == 2) {
			System.out.println("===정수의 빼기 문제===");
			System.out.println("첫번째 정수 입력");
			a = scanner.nextInt();
			System.out.println("두번째 정수 입력");
			b = scanner.nextInt();
			c = a - b;
			System.out.println(a + "-" + b + "=" + c);
		} else if (op == 3) {
			System.out.println("===곱셈 문법===");
			System.out.println("첫번째 수 입력");
			a = scanner.nextInt();
			System.out.println("두번째 수 입력");
			b = scanner.nextInt();
			c = a * b;
			System.out.println(a + "x" + b + "=" + c);
		} else if (op == 4) {
			System.out.println("===나눗셈 문법===");
			System.out.println("첫번째 수 입력");
			a = scanner.nextInt();
			System.out.println("두번째 수 입력");
			b = scanner.nextInt();
			c = a / b;
			d = a % b;
			System.out.println(a + "/" + b + "=" + c + "..." + d);
		} else {
			System.out.println("연산기호를 잘못입력했습니다");
		}

	}
}

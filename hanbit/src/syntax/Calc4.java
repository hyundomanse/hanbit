package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 9. 
 * Calc.java 
 * shinhyundo 
 * story : 브랜치 예제(계산기 프로그램) : Switch case
 */
public class Calc4 {
	public static void main(String[] args) {
		int a = 0, b = 0;
		String op = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 정수 입력");
		a = scanner.nextInt();
		System.out.println("연산자 종류를 입력( +, -, *, / )");
		op = scanner.next();
		System.out.println("두번째 정수 입력");
		b = scanner.nextInt();
		
		switch (op) {
		case "+":
			System.out.println(a + "+" + b + "=" + (a + b));
			break;
		case "-":
			System.out.println(a + "-" + b + "=" + (a - b));
			break;
		case "*":
			System.out.println(a + "x" + b + "=" + (a * b));
			break;
		case "/":
			System.out.println(a + "/" + b + "=" + (a / b) + "..." + (a % b));
			break;
			
			

		default:System.out.println("연산기호를 잘못입력했습니다");
			break;
		}

	}
}

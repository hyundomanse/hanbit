package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 16. 
 * MaxMin2.java 
 * shinhyundo 
 * story :
 */
public class MaxMin2 {
	public static void main(String[] args) {
		System.out.println("3명의 최고점, 최저점을 나타내준다");
		Scanner scanner = new Scanner(System.in);
		int max = 0, min = 0, score1 = 0, score2 = 0, score3 = 0;
		int[] scores = new int[3];
		scores[0] = scanner.nextInt();
		scores[1] = scanner.nextInt();
		scores[2] = scanner.nextInt();
		if ((scores[0] > scores[1]) && (scores[0] > scores[2])) 
		{max = scores[0];} 
		else if ((scores[1] > scores[2])) 
		{max = scores[1];} 
		else 
		{max = scores[2];}
		System.out.println(max);
	}
}
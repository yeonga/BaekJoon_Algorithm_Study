package for_;

import java.util.Scanner;

public class Main_15552_Scanner {		// Scanner를 사용해서 "시간초과" 뜸!!!!!!! 

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt(); // 테스트 횟수 T - 10950과 비슷한 문제

		for (int i = 0; i < T; i++) {

			int A = scanner.nextInt();
			int B = scanner.nextInt();
			System.out.println(A + B);

		}

	}

}

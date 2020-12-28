package for_;

import java.util.Scanner;

public class Main_10950 { // 백준 for문 - 10950

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = Integer.parseInt(sc.nextLine()); // 테스트 횟수

		for (int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			System.out.println(A + B);
		}
	}
}

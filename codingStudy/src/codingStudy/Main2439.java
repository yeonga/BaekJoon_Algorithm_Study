package codingStudy;

import java.util.Scanner;

public class Main2439 { // 별 오른쪽에서부터 출력하기

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {		// i번째만큼 *을 i개 찍어내기
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

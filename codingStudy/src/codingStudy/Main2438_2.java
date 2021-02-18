package codingStudy;

import java.util.Scanner;

public class Main2438_2 { // 별찍기거꾸로 54321 순으로 출력

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int i = N; 1 <= i; i--) {
			for (int j = i; 1 <= j; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

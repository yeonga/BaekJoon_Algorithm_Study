package codingStudy;

import java.util.Scanner;

public class Main2438 {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}

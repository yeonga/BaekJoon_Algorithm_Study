package codingStudy;

import java.util.Scanner;

public class Main10950 {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();

		for (int i = 1; i <= T; i++) {

			int A = scanner.nextInt();
			int B = scanner.nextInt();

			System.out.println(A + B);
		}

		scanner.close();

	}

}

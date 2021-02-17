package codingStudy;

import java.util.Scanner;

public class Main2739 {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int T = 0;

		for (int i = 1; i <= 9; i++) {
			T = N * i;
			System.out.println(N + "*" + i + " = " + T);
		}
	}
}

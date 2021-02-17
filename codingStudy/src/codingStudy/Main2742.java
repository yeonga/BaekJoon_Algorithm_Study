package codingStudy;

import java.util.Scanner;

public class Main2742 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int i = N; 1 <= i; i--) {
			System.out.println(i);
			if (i == 1) {
				break;
			}
		}

	}

}

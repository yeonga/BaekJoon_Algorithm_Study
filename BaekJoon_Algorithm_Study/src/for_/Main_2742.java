package for_;

import java.util.Scanner;

public class Main_2742 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int i = N; 1 <= N; i--) {
			System.out.println(i);
			if (i == 1) {
				break;
			}
		}
	}
}

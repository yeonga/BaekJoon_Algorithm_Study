package codingStudy;

import java.util.Scanner;

public class Main369game {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();

		for (int i = 0; i <= str.length()-1; i++) {
			char ch = str.charAt(i);
			if (ch == '3' || ch == '6' || ch == '9') {
				System.out.print("짝");
			}
		}
		System.out.println();
	}
}

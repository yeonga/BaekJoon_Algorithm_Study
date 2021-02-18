package codingStudy;

import java.util.Scanner;

public class Main_Use_charAt {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		for (int i = str.length()-1; 0 <= i; i--) {
			System.out.print(str.charAt(i));
		}
	}

}

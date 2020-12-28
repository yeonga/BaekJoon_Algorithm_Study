package if_;

import java.util.Scanner;

public class Main_14681 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt(); // x좌표
		int y = sc.nextInt(); // y좌표

		if (x > 0 && y > 0) {
			System.out.println("1"); // 1사분기(+,+)
		} else if (x < 0 & y > 0) {
			System.out.println("2"); // 2사분기(-,+)
		} else if (x < 0 & y < 0) {
			System.out.println("3"); // 3사분기(-,-)
		} else {
			System.out.println("4"); // 4사분기(-,+)
		}

	}
}

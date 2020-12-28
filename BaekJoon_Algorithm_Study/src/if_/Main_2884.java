package if_;

import java.util.Scanner;

public class Main_2884 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();

		if (M >= 45) {
			M = (M - 45);
			System.out.println(H + " " + M);
		} else if (M < 45 & H != 0) {
			M = (M - 45);
			M = (60 + M);
			H = (H - 1);
			System.out.println(H + " " + M);
		} else if (M < 45 & H == 0) {
			M = (M - 45);
			M = (60 + M);
			H = H - 1;
			H = 24 + H;
			System.out.println(H + " " + M);
		}
	}
}

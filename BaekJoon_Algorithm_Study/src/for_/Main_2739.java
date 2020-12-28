package for_;

import java.util.Scanner;

public class Main_2739 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = 0; // 임의로 정한 수 - N*i의 곱셈 결과

		for (int i = 1; i <= 9; i++) {
			M = N * i;
			System.out.println(N + " * " + i + " = " + M);
		}
	}
}

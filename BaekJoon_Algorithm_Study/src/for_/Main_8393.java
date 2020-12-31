package for_;

import java.util.Scanner;

public class Main_8393 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) { // 1에서 n까지  
			sum += i; // sum = 1 + 2 + ... + n-1 + n;
		}
		System.out.println(sum); // for문 안에 넣으면 합이 추출되지 않으므로 밖에 작성
	}

}

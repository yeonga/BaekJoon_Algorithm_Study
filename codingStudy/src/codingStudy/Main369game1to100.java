package codingStudy;

public class Main369game1to100 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			int x = i / 10; // 몫
			int y = i % 10; // 나머지

			if ((x == 3 || x == 6 || x == 9) && (y == 3 || y == 6 || y == 9)) {
				System.out.print("짝 ");
			} else if ((x == 3 || x == 6 || x == 9) || (y == 3 || y == 6 || y == 9)) {
				System.out.print("짝 ");
			} else {
				System.out.print(" ");
			}
			if (y == 9) {
				System.out.println();
			}

		}

	}

}

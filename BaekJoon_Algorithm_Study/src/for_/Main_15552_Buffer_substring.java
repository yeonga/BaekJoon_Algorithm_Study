package for_;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// subString 이용 
public class Main_15552_Buffer_substring {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			int target = str.indexOf(" ");
			int result = Integer.parseInt(str.substring(0, target)) + Integer.parseInt(str.substring(target + 1));
			sb.append(result + "\n");
		}

		br.close();
		System.out.print(sb);
	}
}

package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlternateChars {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		String[] testCases = new String[N];

		for (int i = 0; i < N; i++) {
			testCases[i] = br.readLine();
		}

		for (String testCase : testCases) {
			System.out.println(deleteChars(testCase));
		}

	}

	static int deleteChars(String input) {

		// char first;
		// char second;
		int count = 0;
		for (int i = 0, j = 1; i < input.length() - 1; i++, j++) {

			if (input.charAt(i) == input.charAt(j)) {

				count++;
			}
		}
		return count;
	}
}

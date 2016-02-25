package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagrams {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bis = new BufferedReader(isr);

		int numberOfTestCases = Integer.parseInt(bis.readLine());
		String[] testCases = new String[numberOfTestCases];

		for (int i = 0; i < testCases.length; i++) {
			testCases[i] = bis.readLine();
		}
	}

	private static int findAnagrams(String word) {

		int wordLength = word.length();
		if (wordLength / 2 != 0) {

			return -1;
		} else {
			
//			String firstPart = 

		}

		return 0;
	}
}

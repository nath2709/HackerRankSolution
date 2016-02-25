package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		String[] testCases = new String[N];
		for (int i = 0; i < N; i++) {
			testCases[i] = br.readLine();
		}

		for (String testCase : testCases) {
			generatePalindrome(testCase);
		}

	}

	private static void generatePalindrome(String input) {
		int index = 0;
		int lastIndex = input.length() - 1;
		int counter = 0;

		while (!isPalindrome(input)) {
			char firstChar = input.charAt(index);
			char lastChar = input.charAt(lastIndex);
			char[] inputs = input.toCharArray();

			if (firstChar > lastChar) {
				firstChar = Character.toChars(firstChar - 1)[0];
				inputs[index] = firstChar;
				counter++;
			} else if (lastChar > firstChar) {
				lastChar = Character.toChars(lastChar - 1)[0];
				inputs[lastIndex] = lastChar;
				counter++;
			} else {
				index++;
				lastIndex--;
			}

			String test = "";
			for (char c : inputs) {
				test = test + c;
			}

			input = test;

		}
		System.out.println(counter);
	}

	private static void createPalindrome(String input) {

		int index = input.length() - 1;

		int counter = 0;
		while (!isPalindrome(input)) {
			char[] inputs = input.toCharArray();
			char charToReplace = inputs[index];
			char[] charReplacedBy = Character.toChars(charToReplace - 1);

			if (charToReplace == 'a') {
				index = index - 1;
			} else {
				inputs[index] = charReplacedBy[0];
				counter++;
			}
			String test = "";
			for (char c : inputs) {
				test = test + c;
			}
			input = test;

		}

		System.out.println(counter);
	}

	private static boolean isPalindrome(String input) {

		boolean palindrom = false;
		int index = 0;
		int lastIndex = input.length() - 1;
		int halfLength = input.length() / 2;
		while (index <= halfLength && lastIndex >= halfLength) {

			if (input.charAt(index) == input.charAt(lastIndex)) {

				palindrom = true;
				index++;
				lastIndex--;

			} else {
				palindrom = false;

				return palindrom;
			}
		}

		return palindrom;
	}
}

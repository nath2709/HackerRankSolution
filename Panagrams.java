package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Panagrams {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		isPanagram(line);

	}

	private static void isPanagram(String input) {

		Set<Character> inputChars = new HashSet<Character>();

		input = input.toLowerCase().replaceAll("\\s", "");

		for (int i = 0; i < input.length(); i++) {
			inputChars.add(input.charAt(i));
		}

		Set<Character> alphabet = getAlphabets();
		if (alphabet.equals(inputChars)) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}
	}

	public static Set<Character> getAlphabets() {
		Set<Character> alphabets = new HashSet<Character>();
		alphabets.add('a');
		alphabets.add('b');
		alphabets.add('c');
		alphabets.add('d');
		alphabets.add('e');
		alphabets.add('f');
		alphabets.add('g');
		alphabets.add('h');
		alphabets.add('i');
		alphabets.add('j');
		alphabets.add('k');
		alphabets.add('l');
		alphabets.add('m');
		alphabets.add('n');
		alphabets.add('o');
		alphabets.add('p');
		alphabets.add('q');
		alphabets.add('r');
		alphabets.add('s');
		alphabets.add('t');
		alphabets.add('u');
		alphabets.add('v');
		alphabets.add('w');
		alphabets.add('x');
		alphabets.add('y');
		alphabets.add('z');

		return alphabets;
	}
}

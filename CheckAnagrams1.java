package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckAnagrams1 {

	static String regex = "[^a-zA-Z0-9\\s]";

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader bis = new BufferedReader(isr);

		String line = bis.readLine();

		line = line.replaceAll(regex, " ");

		String[] words = line.toLowerCase().split("\\s+");

		isAnagram(words);
	}

	public static void isAnagram(String[] words) {

		String sortedWord = "";

		Map<String, List<String>> anagrams = new HashMap<>();

		for (int i = 0; i < words.length; i++) {
			List<String> result = new ArrayList<>();
			String word1 = words[i];
			word1 = word1.replaceAll(regex, "");
			sortedWord = sortWord(word1);

			if (word1.length() != 1) {
				if (anagrams.containsKey(sortedWord)) {
					anagrams.get(sortedWord).add(word1);
				} else {
					result.add(word1);
					anagrams.put(sortedWord, result);
				}
			}
		}

		Collection<List<String>> sortedanagrams = anagrams.values();
		for (List<String> list : sortedanagrams) {
			if (list.size() != 1) {
				Collections.sort(list);
				System.out.println(list.toString().replaceAll("\\[","").replaceAll("\\]",""));
			}

		}
	}

	public static String sortWord(String word) {

		char[] chars = word.toCharArray();
		Arrays.sort(chars);
		String newWord = new String(chars);
		return newWord;
	}

}

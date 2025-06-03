package stringRelated;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class p8_CountTheOccurrenceOfCharacters {

	public static void main(String[] args) {

		// 1. count the occurrence of the characters
		// 2. find the unique character

		String str = "aabbbccddddeffgghiiizzz";

		char[] c = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char temp : c) {

			if (map.containsKey(temp)) {

				map.put(temp, map.get(temp) + 1);
			} else {
				map.put(temp, 1);
			}
		}
		System.out.println("Occurence of characters: >>> " + map + "\n");

		// if we need to find a unique character in that case follow the below

		Set<Entry<Character, Integer>> set = map.entrySet();

		for (Entry<Character, Integer> tempSet : set) {

			if (tempSet.getValue() == 1) {

				System.out.println("Unique character is: >>> " + tempSet.getKey() + " " + tempSet.getValue());
			}
		}

	}

}

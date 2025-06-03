package stringRelated;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class p7_CountTheOccurrenceOfString {

public static void main(String[] args) {
		
		String[] str = {"Java", "Selenium", "Java", "java", "Playwright", "java"};
		
		Map<String, Integer> map = new HashMap <>();
		
		for(String temp:str) {
			
			if(map.containsKey(temp)) {
				
				map.put(temp,  map.get(temp)+1);
			}else {
				map.put(temp, 1);
			}
		}
		System.out.println("Occurence of string are: >>> " + map);
		
		// if we want to find the unique string in that case
		
		Set<Entry<String, Integer>> set =	map.entrySet();
		
		for(Entry<String, Integer> tempSet:set) {
			
			if(tempSet.getValue()==1) {
				
				System.out.println("Unique string is: >>> " + tempSet.getKey()+ " " + tempSet.getValue());
			}
		}
	}
}

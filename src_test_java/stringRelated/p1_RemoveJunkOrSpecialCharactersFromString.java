package stringRelated;

public class p1_RemoveJunkOrSpecialCharactersFromString {

public static void main(String[] args) {
		
		// remove the junk from the given String
		
		String str = "!@#%%#@%&#$Akshaj &^&%%$%#%&Tyagi)(()&)*^(";
		
		str =	str.replaceAll("[^a-zA-Z0-9]", "");
			
			System.out.println("After removing the junk from the String: >>> " + str);
		
	}
}

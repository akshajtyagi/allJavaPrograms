package allJavaPrograms.stringRelated;

public class p2_RemoveWhiteSpacesFromAString {

	public static void main(String[] args) {
		
		String s = "java    programming language";
		
		//s=s.replaceAll("\\s", "");	// 1.
		s=s.replaceAll(" ", "");		// 2.
		System.out.println(s);
	}
}

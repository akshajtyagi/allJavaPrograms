package stringRelated;

public class p9_ReverseEachWordInAString {

	public static void main(String[] args) {
		
		String s = "java selenium test autoamtion";
		
		String[] words = s.split(" ");
		String rev_String = "";
		
		for(String w:words) {
			String revWord = "";
			for(int i=w.length()-1; i>=0; i--) {
				revWord = revWord +w.charAt(i);
			}
			rev_String = rev_String + revWord+ " ";
		}
		System.out.println(rev_String);
		
	}
}

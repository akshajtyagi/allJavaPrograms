package allJavaPrograms.stringRelated;

public class p10_CountVowelsAndConsonants {

	public static void main(String[] args) {
		
		String s = "Automation World"; 
		s=s.toLowerCase();
		
		int vowelsCount=0, consonantsCount=0;
		
		for(int i=0; i<=s.length()-1; i++) {
			char ch = s.charAt(i);
			
			//if(ch>='a' && ch<='z') 
			
			if(ch!= ' '){
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					vowelsCount++;
				}else {
					consonantsCount++;
				}
			}
		}
		
		System.out.println("Vowels are: >> " + vowelsCount);
		System.out.println("Consonants are: >> " + consonantsCount);
	}
}

package stringRelated;

public class p6_RemoveApartOfSecondWord {

	public static void main(String[] args) {
					
			// Remove a part of the second word and reverse that and print with other words as it is
			
			String str = "Test Automation Selenium";
			str = str.replaceAll("mation", "");
			
			String[] str1 =	str.split(" ");
			str = str1[1];
			
			String rev = "";
			
			for(int i= str.length()-1; i>=0; i--) {
				
				rev = rev +	str.charAt(i);
			}
			System.out.println("After reversing the second word only: >>> "+ str1[0]+" "+rev+" "+str1[2]);
			
		}
}

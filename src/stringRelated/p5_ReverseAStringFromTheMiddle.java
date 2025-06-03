package stringRelated;

public class p5_ReverseAStringFromTheMiddle {
	
public static void main(String[] args) {
		
		String str = "Test Automation Selenium with Java";
		String rev = "";
		
		String[] str1 =	str.split(" ");
		
		str = str1[2];
		
		for(int i=str.length()-1; i>=0; i--) {
			
			rev = rev +	str.charAt(i);
		}
		
		System.out.println("Value after reversing: >>> "+ str1[0]+" "+str1[1]+ " "+ rev+" "+str1[3]+" "+str1[4]);
	}

}

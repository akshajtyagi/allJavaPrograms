package allJavaPrograms.numbersRelated;

public class p7_FindTheLargestOfGivenNumber {

	public static void main(String[] args) {
		
		int a=100, b=20, c=30;
		
		if(a>b && a>c) {
			System.out.println(a+" >> a is greater");
		}else if(b>a && b>c) {
			System.out.println(b+" >> b is greater");
		}else {
			System.out.println(c+" >> c is greater");
		}
	}
}

package numbersRelated;

public class p1_SwapTwoNumbers {

public static void main(String[] args) {
		
		// 1. by using third variable
		
		/*
		int a=10, b=20, t;
		
		t=a;
		a=b;
		b=t;
		
		System.out.println("Reverse of a is: >> "+ a);
		System.out.println("Reverse of b is: >> "+ b);
		*/
		
		// 2. without using third variable (+ and - only)
		/*
		int a =10, b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Reverse of a is: >> "+ a);
		System.out.println("Reverse of b is: >> "+ b);
		*/
		
		// 3. without using third variable (* and / only)
		/*
		int a=10, b=20;
		a=a*b;	//10*20=200
		b=a/b;	//200/20=10
		a=a/b;	//200/10=20
		System.out.println("Reverse of a is: >> "+ a);
		System.out.println("Reverse of b is: >> "+ b);
		*/
		
		// 4. in single line only
		
		int a =101, b=201;
		a=a+b-(b=a);	
		System.out.println("Reverse of a is: >> "+ a);
		System.out.println("Reverse of b is: >> "+ b);
		
		
	}
}

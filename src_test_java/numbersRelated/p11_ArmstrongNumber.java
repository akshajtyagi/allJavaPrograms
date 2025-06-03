package numbersRelated;

public class p11_ArmstrongNumber {

	public static void main(String[] args) {
		
		// 12=1^2 *2^2=12
		// 0,1,153,370,371,407
		
		int num = 15;
		int t1=num;
		int len =0;
		while(t1!=0) {
			t1=t1/10;
			len++;
		}
		
		int t2=num;
		int arm=0;
		
		while(t2!=0) {
			int mul=1;
			int rem=t2%10;
			for(int i=1; i<=len; i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		System.out.println(arm);
		
		if(arm==num) {
			System.out.println(num+ " is Armstrong number");
		}else {
			System.out.println(num + " is not Armstrong number");
		}
		
	}
}

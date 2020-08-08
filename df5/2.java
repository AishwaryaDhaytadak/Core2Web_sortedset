/*2] write program and print addition of even digit and multiplication of odd digit from number
 * inout-12345
 * output- addition of even digits - 6
 * 	   multiplication of odd digit is- 15
 */


class EvenOdd{
	public static void main(String[] args){
		int num=1234567;
		int sum=0;
		int mul=1;
		while(num>0){
			int rem=num%10;
			if(rem%2==0)
				sum=sum+rem;	
			else
				mul=mul*rem;
			num=num/10;
		}
		System.out.println("addition of even digits ="+sum);	
		System.out.println("multiplication of odd digits ="+mul);	
	}
}

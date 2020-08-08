/*5]write a program that prints the average of the number
 * input- 12345
 * output- the average of digits from number 12345 is 3.
 * */

class Average{
	public static void main(String[] args){
		int num=12345;
		int y=num;
		int avg=0;
		int sum=0;
		int cnt=0;
		while(num>0){
			int rem=num%10;
			sum=sum+rem;
			cnt=cnt+1;
			num=num/10;
		}
		avg=sum/cnt;
		System.out.println("the average of the digits from number " + y + " is " + avg );	
	}
}

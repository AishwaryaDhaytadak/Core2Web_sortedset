/*4]write a program and print maximum digit from the number
 * input-->12357798
 * ouput-->the maximum digit from number 12357798 is 9*/

class Maximum{
	public static void main(String[] args){
		int num=12357798;
		int y=num;
		int max=0;
		while(num>0){
			int rem=num%10;
			if(rem>max)
				max=rem;
			num=num/10;
		}
		System.out.println("the maximum digit from number "+y+" is "+max);
	}
}

/*1] write a program to count number of digits in a number
input-12345
ouput-5
*/

class NumberOfDigits{
	public static void main(String[] args){
		int cnt=0;
		int input=123456789;
		while(input>0){
			int rem=input%10;
			cnt=cnt+1;
			input=input/10;
		}
		System.out.println("the number of the digits is="+cnt);		
	}
}

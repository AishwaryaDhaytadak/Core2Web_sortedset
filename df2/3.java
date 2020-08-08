/*3] write a program to find greatest number among three numbers using if-else ladder.
 * 	input-
 num1=40
 num2=70
 num3=30
	output-
Largest number is 70;
*/


class Greatest{
	public static void main(String[] args){
		int num1=40;
		int num2=70;
		int num3=30;
		
		int ans=(num1>num2)?((num1>num3)?(num1):(num3)):((num2>num3)?(num2):(num3));	
		System.out.println("Largest number is "+ans);
	}
}

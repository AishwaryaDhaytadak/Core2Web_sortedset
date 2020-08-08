/*4]write a java code to take 100 value from user and print the reverse order of the particular number and also check which number is divisible by 5.
 * input- enter the value 100
 * output- 
 * reverse order-100,99,98,97...
 * divisible by 5 is 100,95,90,85,...
 * */

class Reverse{
	public static void main(String [] args){
		int num=100;
		while(num>0){
			System.out.println("reverse order ");
			System.out.print(num +",");
				
			if(num%5==0){
				System.out.println("divisible by 5 is " );
				System.out.print(num + ",");
			}
			System.out.println();
			num--;
		}
	
	}
}

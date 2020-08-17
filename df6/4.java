/*4]write a java program to take a number as inout ans print series of factorial of numbers ranging up to that number from 1.
input-10
output-Factorial of 1:1
       Factorial of 2:2
       Factorial of 3:6
       :
       :
       :
       Factorial of 10:3628800

*/


class Factorial{
	public static void main(String[] args){
		for(int i=1;i<=10;i++){
			int fact=1;
			for(int j=1;j<=i;j++){
				fact=fact*j;
			}
			System.out.println("Factorial of"+ i + "=" + fact);		
		}
	}
}

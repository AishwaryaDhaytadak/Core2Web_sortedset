/*5]write a code in java to check whether a number is odd or even using bitwise operator and not using arithmetic operator
 * CODE FORMAT
 * write a static method isEven:
 * 	integer parmeter :number
 * in main method:
 * take a hardcoded number and inside an if statement call the isEven() method
 * if the method is returning a zero then print Even else print Odd.
 * input=>
 * 100
 * output=>
 * Even
 */


class EvenOdd{
	static int isEven(int number){
		if((number & 1)==0)
			return 0;
		else
			return 1;
	
	}
	
	public static void main(String[] args){
		int n=101;
		if((isEven(n))==0)
			System.out.println("EVEN");
		else
			System.out.println("ODD");
	}
}

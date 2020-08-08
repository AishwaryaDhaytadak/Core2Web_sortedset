/*4] write a code in ava to check divisibility of a number by 2 using bitwise operators..note:do not use arithmetic operators to checke divisibility..
 * FORMAT OF CODE
 * write a static function isDivisible:
 * 	intgere parameters--dividend and divisor
 * 	return type:boolean
 * 	in main method:
 * 	take 2 integer variables dividend and divisor (note: divisor shoud be 2 as we are checking divisibility by 2 ).
 * 	Call isDivisible() method from if statement and print Yes if the method returns true else print No if the method returns false
 *	input=>
 *	dividend=8
 *	divisro=2
 *	output=>
 *	Yes
 */



class Divisibility{
		static boolean isDivisible(int dividend,int divisor){
			if((dividend & 1)==0){
				return true;
			}
			else{
				return false;			
			}
		}
	
		public static void main(String[] args){
		
			int dividend1=8;
			int divisor1=2;
		
			if(Divisibility.isDivisible(dividend1,divisor1)){	//ithe Divisibility.isDivisible() na karta direct isDivisible() la call dila tari chalto karan same class madhe ahe na static method tr class cha name ne access karaychi garaj nahi
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
}

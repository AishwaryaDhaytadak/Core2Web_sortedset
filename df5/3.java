/*3] write a code using while loop to print first 10 numbers which are divisible by 32 and 7(break the loop if any number divisible by 32 an 7 is also divisible by 6)
 * input- 224 448 672 
 * breaking loop
 * 672 is divisible by 6
 */


class Divisible{
	public static void main(String[] args){
		int n=1;
		while(n>0){
			if(n%7==0 && n%32==0){
				if(n%6==0){
					System.out.println("Breaking loop...");
					System.out.println(n+" is divisible by 6");
					break;
				}
				else{
					System.out.println(n);	
				}
			}
		
		n++;
		}
	}
}

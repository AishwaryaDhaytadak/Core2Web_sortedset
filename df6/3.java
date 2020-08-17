/*3] write a java code to take a number as input and print series of prime numbers ranging up to that number from 1.
 * input- 20
 * output- 2 3 5 7 11 13 17 19
   */


class PrimeNumber{
	public static void main(String[] args){
		for(int i=2;i<=20;i++){
			int flag=0;
			for(int j=2;j<i;j++){
				if (i%j==0){
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.print(i+" ");
		}	
	}
}

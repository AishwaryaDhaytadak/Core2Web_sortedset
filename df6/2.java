/*2] write a java code to print addition od 1 to 10 with 10 to 1
 output-
 1+10=11
 9+2=11
 8+3=11
 7+4=11
 :
 :
 10+1=11
 
*/


class Addition{
	public static void main(String[] args){
		int j=10;
		for(int i=1;i<=10;i++){
			if(j>=1)
			System.out.println(i+"+"+j+"="+(i+j));
			j--;
		}
	}
}

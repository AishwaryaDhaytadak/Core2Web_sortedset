/*
 3] write a program to toggle a single character i.e. if a ladder is in upper case convert it to lower case and if it is in lower case then convert it to uppercase
  input-A
  output-a
 
 */



class LowerUpper{
	public static void main(String[] args){
		char ch='A';
		if((ch>=65) && (ch<=90)){
			System.out.println((char)(ch+32));
		}
		else if((ch>=97) && (ch<=122)){
			System.out.println((char)(ch-32));
		}	
	}
}

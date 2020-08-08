class EvenOdd{
	static public void main(String [] args){
		EvenOdd obj1=new EvenOdd();
		obj1.evenOdd(10,15);
		

	}
		int evenOdd(int a,int b){
			
		
			
			if(a%2==0){
				System.out.println("a is even number");
			}
			else{
				System.out.println("a is odd number");
			}		

			if(b%2==0){
				System.out.println("b is even number");
			}
			else{
				System.out.println("b is odd number");
			}		
			
			return 0;
		}

}

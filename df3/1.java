class Operator{
	public static void main(String[] args){
		int a=30,b=10;
		int x=6;
		switch(x){
			case 1:{
				System.out.println("a+b= "+(a+b));
				break;
			}
			
			case 2:{
				System.out.println("a-b= "+(a-b));
				break;
			}

			case 3:{
				System.out.println("a*b= "+(a*b));
				break;
			}
		
			case 4:{
				System.out.println("a/b= "+(a/b));
				break;
			}
		
			case 5:{
				System.out.println("a%b= "+(a%b));
				break;
			}
			default:
			       System.out.println("Please enter valid input ");
		}
		
	}
}	

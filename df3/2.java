class Language{
	public static void main(String [] args){
		char ch='S';
		switch(ch){
			case 'J':
				System.out.println("Java programming");
				break;
		
			case 'P':
				System.out.println("Python programming");
				break;
		
			case 'c':{
				System.out.println("c programming");
				break;
				}
			case 'D':
				System.out.println("Data structures");
				break;
		
			case 'S':
				System.out.println("Swift programming");
				break;
		
			default:
				System.out.println("Please enter valid input");
				break;
		}
	}
}

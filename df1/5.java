class MaxMarks{
	public static void main(String[] args){
		MaxMarks obj1=new MaxMarks();		
		obj1.isEligible(60);
		obj1.isEligible(80);
	}
	
	boolean isEligible(int attendance){
		if (attendance>=75){
			
			System.out.println("The students attendance is "+attendance+"%");
			System.out.println("Processing...");
			System.out.println("The student is ELIGIBLE for the exam");
		}
		else{
			System.out.println("The students attendance is "+attendance+"%");
			System.out.println("Processing...");
			System.out.println("The student is NOT ELIGIBLE for the exam");
		}
		return true;
	}
}

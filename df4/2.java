/*2]write a java code which accepts the student year and marks and using that student year and student marks it will check student is eligible or not for scholarship by hwlp of nested switch case.
 * condition is 1st switch cse take parameter as student year and other inner/nested switch case take parameter as student marks .2st and 2nd year are not eligible for education scholarship.only 3rd year students are eligible for education scholarship.
 * inut-
 * student year -3 
 * student marks-80
 * output-
 * Student eligible for education scholarship.
 */

class Eligible{
	public static void main(String[] args){
		int year=3;
		switch(year){
			case 1:
				System.out.println("Student NOT eligible for scholarship");
				break;
		
			case 2:
				System.out.println("Student NOT eligible for scholarship");
				break;

			case 3:
				int marks=75;
				switch(marks){
					case 75:	
						System.out.println("Student eligible for scholarship");
						break;
					case 55:
						System.out.println("Student NOT eligible for scholarship");
						break;
					default:
						System.out.println("Please enter marks out of 100");
						break;
				}
				break;
			
			case 4:
				System.out.println("Student NOT eligible for scholarship");
				break;
		
			default:
				System.out.println("please enter year from 1 to 4");
				break;
		}
	
	}
}


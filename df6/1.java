/*1] write a java cod to print cubes of odd numbers
 * output-
  cube of 1:1
  cube of 3:27
  cube of 5:125
  :
  :
  cube of 49:117649
*/

class Cube{
	public static void main(String[] args){
		for(int i=1;i<=50;i++){
			if(i%2!=0)
				System.out.println("Cube of "+i+"="+i*i*i);
		}
	}
}

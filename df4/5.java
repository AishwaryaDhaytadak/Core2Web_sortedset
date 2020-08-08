/*5] write a java program to print the table of 3 and also check which numbers are even in that table (write dry run)
 * input- enter the number-3
 * output-
 * table of 3 is=3,6,9,12,15,18..
 * even numbers present in tabl are= 6,12...
 * */

class Table{
	public static void main(String [] args){
		int n=3;
		int i=1,j=1;
		System.out.print("table of 3=");
		while(i<=10){
			System.out.print(n*i + ",");
		i++;
		}

		System.out.println();
		System.out.print("even numbers preseent in table are:");
		while(j<=10){
			if((n*j)%2==0){
				System.out.print(n*j + ",");
			}
		j++;
		}
		System.out.println();
	}
}

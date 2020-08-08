//4]copy the code below and write explanation of output of program.if there is error you have to resolve it.

class Human{
	public static void main(String[] args){
		Human lion=null;
		Human tiger=null;
		Human puma=null;
		Human monkey=new Human();
		boolean isLionHuman=lion instanceof Human;
		System.out.println("Are lion and human of same species-->"+isLionHuman);
	
		boolean isTigerHuman=tiger instanceof Human;
		System.out.println("Are tiger and human of same species-->"+isTigerHuman);


		boolean isPumaHuman=puma instanceof Human;
		System.out.println("Are puma and human of same species-->"+isPumaHuman);

		boolean isMonkeyHuman=monkey instanceof Human;
		System.out.println("Are monkey and human of same species-->"+isMonkeyHuman);
	}
}
/*OUTPUT-->
 false
 false
 false
 true

 because apn monkey cha obje banavla ahe ani tyacha gola banel but bakiche object banle nahiet karan tyanna apn fakt null ha reference dila ahe ani gola bannar nahi tyancha..mhnun fakt monkey la true yeil bakichanna false yeil*/
 
 

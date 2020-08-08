//5]write one real time example in which instanceof operator is used,draw JVM architecture of it.


class Tree{
	public static void main(String[] args){
		Tree leaves=new Tree();
		Tree stems=new Tree();

		boolean result;
		result=leaves instanceof Tree;
		System.out.println(result);
		System.out.println(stems instanceof Tree);
		Tree wind=null; 
		System.out.println(wind instanceof Tree);
	}
}


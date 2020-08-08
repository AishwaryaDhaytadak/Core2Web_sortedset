class Instagram{
	int likes=250;
	
	
	void story(Instagram obj1){
		//String insta=obj1 instanceof Instagram?"YES":"NO";
		System.out.println((obj1 instanceof Instagram)?"Object belongs to instagram":"Object does not belong to instagram");
		//System.out.println(insta);
		System.out.println(obj1.likes);
	}
	
	static void post(){
		Instagram obj1=new Instagram();
		obj1.story(obj1);
		}
}

class Facebook{
	public static void main(String[] args){
		Instagram obj2=new Instagram();
	//	obj2.story();
		Instagram.post();	
	}
}

/* ya code varun aplyala fakt he dakhvaychay ki eka class madhun dusrya class cha instanceof checke karu shakto with the help of parameterised method*/

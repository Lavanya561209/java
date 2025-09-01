class Trees{
	public static void main(String []args){
		String []types={"Mango tree","Banana tree","Apple tree","Papaya tree","Guava tree","Pineapple tree"};
		System.out.println("The different trees are:");
		for(int i=0;i<types.length;i++){
			System.out.println("The variety of fruit trees are:"+types[i]);
		}
		System.out.println("========================");
		for(String c:types){
			System.out.println("The tasty fruit trees are:"+c);
		}
	}
}
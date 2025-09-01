class Home{
	public static void main(String[] args){
		String [] materials={"Chair","Table","Sofa","Study table","Wooden Stick","Hanger"};
		System.out.println("Available materials are");
		for(int i=0;i<materials.length;i++){
			System.out.println("The diifferent household products are:"+materials[i]);
		}
		System.out.println("===================");
		for(String y:materials){
			System.out.println("The high material products are:"+y);
		}
	}
}
class Wires{
	public static void main(String args[]){
		String [] useful={"Iron wire","Copper wire","Steel wire","Cobalt","Nickel","Plastic wire"};
		System.out.println("The different wires are");
		for(int i=0;i<useful.length;i++){
		System.out.println("The wiring products are:"+useful[i]);	
		}
		System.out.println("================================");
		for(String z:useful){
			System.out.println("The materials used are:"+z);
		}
	}
}
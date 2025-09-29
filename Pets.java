class Pets{
	public Pets(){
		
	}
	public Pets(String name,int price){
		System.out.println("The pet name is:" + name + "the price of each pet is:"+ price);
	}
	public static void main(String[] args){
		new Pets("Johny",3000);
		new Pets();
	}
}
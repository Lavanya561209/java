class BedSheet{
	public BedSheet(){
		
	}
	public BedSheet(String name,int price){
		System.out.println("The company name is:" +name+ " the price of each bed cover is:"+ price);
	}
	public static void main(String[] args){
		new BedSheet("Woah Single",228);
		new BedSheet();
	}
}
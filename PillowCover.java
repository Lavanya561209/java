class PillowCover{
	public PillowCover(){
		
	}
	public PillowCover(String name,int price){
		System.out.println("The pillow name is:" +name+ " the price of each pillow cover is:"+ price);
	}
	public static void main(String[] args){
		new PillowCover("Elegant Weavers",159);
		new PillowCover();
	}
}
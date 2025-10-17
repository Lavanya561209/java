class GroceryShop extends Shops {
	@Override
	public void price(){
		System.out.println("Each item price");
	}
	@Override
	public void discount(){
		System.out.println("Wholesale dicount price is...");
	}
	@Override
	public void rows(){
		System.out.println("The items has less rows");
	}
}

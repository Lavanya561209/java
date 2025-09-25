class HyperMarket{
	public static void products(int price){
		System.out.println("The product price is:"+price);
	}
	public static void chips(byte gram){
		System.out.println("It contains packet chips is:"+gram);
	}
	public static void sodium(short contains){
		System.out.println("It sodium contains in this product is:"+contains);
	}
	public static void number(long barcode){
		System.out.println("The product contains a barcode number is:"+barcode);
	}
	public static void available(boolean vegeration){
		System.out.println("The product is veg or non-veg:"+vegeration);
	}
	public static void percent(char rdpaServe){
		System.out.println("The product contains its energy is:"+rdpaServe);
	}
	public static void nutrients(float protein){
		System.out.println("The protein contains in this product is:"+protein);
	}
	public static void list(double fat){
		System.out.println("The fat contains in this product is:"+fat);
	}
	public static void potato(String lays){
		System.out.println("The product name is:"+lays);
	}
	public static void ingredients(String[] used){
		System.out.println("The used product in this is:"+used[0]);
	}
	public static void main(String[] args){
		products(100);
		chips((byte)130);
		sodium((short)636);
		number(8901491101820L);
		available(true);
		percent('5');
		nutrients(6.4f);
		list(32.2);
		potato("Hot 'n' Sweet Chilli");
		ingredients(String[]=new{"Potato","Iodised Salt","Wheat Flour","Tomato Powder"});
		
		
		
	}
}
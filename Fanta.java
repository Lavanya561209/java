class Fanta{
	public static byte years(){
		return 2;
	}
	public static short litere(){
		return 250;
	}
	public static int price(){
		return 160;
	}
	public static long contactNumber(){
		return 8453762773L;
	}
	public static boolean diet(){
		return true;
	}
	public static char flavour(){
		return 'O';
	}
	public static float gst(){
		return 56.78f;
	}
	public static double rating(){
		return 4.6d;
	}
	public static String getStringValue(){
		return "Aritifical Flavours";
	}
	public static void sweetness(){
		System.out.println("The sweetness included is");
	}
    static public void main(String [] args){
		byte months=years();
		System.out.println("The fanta has been started till from:"+months);
		short ml=litere();
		System.out.println("The capacity of juice is:"+ml);
		int amount=price();
		System.out.println("The cost of product is:"+amount);
		long phoneNumber=contactNumber();
		System.out.println("Any emercency number is:"+phoneNumber);
        boolean weightLoss=diet();
        System.out.println("The products used in this fanta:"+weightLoss);
        char used=flavour();
        System.out.println("The flavour used in this product is:"+used);
        float tax=gst();
        System.out.println("The gst of the product is:"+tax);
        double reviews=rating();
        System.out.println("The rating of the product is:"+reviews);
		String myString=getStringValue();
		System.out.println("The flavours is used:"+myString);
        sweetness();  		
	}
}
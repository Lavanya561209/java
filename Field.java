class Field{
	static String name="good";
	static int id=100;
	static long number=6785493452l;
	static float gst=345.67f;
	static boolean isAvailable=true;
	public static void itCompany(){
		System.out.println("The availabilty of seat is:"+id);
	    business();
	}
	public static void business(){
		System.out.println("The idea of different person:"+name);
		shop();
	}
	public static void shop(){
		System.out.println("The product of gst is:"+gst);
		railway();
	}
	public static void railway(){
		System.out.println("The reference number is:"+number);
		aerospace();
	}
	public static void aerospace(){
		System.out.println("The eligibilty of each person is:"+isAvailable);
	}
	public static void main(String[] args){
		itCompany();
	} 
}
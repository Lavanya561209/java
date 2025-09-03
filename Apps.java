class Apps{
	static String name="good";
	static int id=105;
	static long number=9285493452l;
	static float gst=835.67f;
	static boolean isAvailable=true;
	public static void whatsapp(){
		System.out.println("It is useful for sending files :"+id);
	    instagram();
	}
	public static void instagram(){
		System.out.println("It can make and publish the video:"+name);
		facebook();
	}
	public static void facebook(){
		System.out.println("It is useful for family puropse:"+gst);
		twitter();
	}
	public static void twitter(){
		System.out.println("It will use for large number of people:"+number);
		linkedin();
	}
	public static void linkedin(){
		System.out.println("It is helpful for job availablity :"+isAvailable);
	}
	public static void main(String[] args){
		whatsapp();
	} 
}
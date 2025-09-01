class Window{
		static String name="Wooden";
		static char capacity='M';
		static byte width=35;
		static long numbers=9786543291l;
		static int price=5000;
        static float gst=1.3456f;
        static short weight=600;
        static boolean isAvailable=false;
        static double reviews=25d;
        static String[] names={"Wooden","Glass","Metal","Iron"};
	    public static void main(String [] args){
        name="Metal";
        capacity='L';
        width=30;
        numbers=8743521734l;
        price=6000;
        gst=2.345f;
        weight=500;
        isAvailable=true;
        reviews=30d;
        names[2]="Stick";
        System.out.println("The name of the product is:"+name);
        System.out.println("The capacity of the product is:"+capacity);
        System.out.println("The different number is:"+numbers);
        System.out.println("The price of the product is:"+price);
        System.out.println("The gst is:"+gst);
        System.out.println("The weight of the product is:"+weight);
        System.out.println("The product of the stock is:"+isAvailable);
        System.out.println("The reviews of the product is:"+reviews);
        System.out.println("The materials used:"+names[2]); 		
	    }
}